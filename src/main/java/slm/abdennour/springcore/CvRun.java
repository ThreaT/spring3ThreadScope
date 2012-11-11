package slm.abdennour.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Abdennour عبد النور التومي
 * 
 * @see http://abdennour-insat.blogspot.com
 * @since 11 nov. 2012
 */
public class CvRun implements Runnable {
	ApplicationContext ctx;

	public CvRun(ApplicationContext ctx) {
		// TODO Auto-generated constructor stub
		this.ctx = ctx;
	}

	public final void run() {
		// TODO Auto-generated method stub
		try {
			Cv cvChild = ctx.getBean("cvThread", Cv.class);
			System.out.println("Cv Thread Child =>" + cvChild.getFullName());
		} finally {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		ApplicationContext appCtx=new ClassPathXmlApplicationContext("ctx.xml");
		Cv cvPatent = appCtx.getBean("cvThread", Cv.class);
		System.out.println("Cv Thread Parent =>" + cvPatent.getFullName());
		//Cv THread
		CvRun cvrun=new CvRun(appCtx);
		new Thread(cvrun).start();
		//Cv Simple 
		System.out.println("Simple");
		for (int j = 0; j < 5; j++) {
			System.out.print("cv Simple "+j+"=>");
			((Cv)appCtx.getBean("cvSimple", Cv.class)).display();  
		}
		 
	}

}
