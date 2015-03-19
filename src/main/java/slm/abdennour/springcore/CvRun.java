package slm.abdennour.springcore;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Abdennour عبد النور التومي
 *
 * @see http://abdennour-insat.blogspot.com
 * @since 11 nov. 2012
 */
public class CvRun implements Runnable {

    @Autowired
    private static Cv cvChild;

    @Autowired
    private static Cv cvPatent;

    @Autowired
    private static CvRun cvRun;

    @Autowired
    private static Cv cvSimple;

    public CvRun() {
    }

    public final void run() {
        try {
            System.out.println("Cv Thread Child =>" + cvChild.getFullName());
        } finally {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        System.out.println("Cv Thread Parent =>" + cvPatent.getFullName());
        new Thread(cvRun).start();
        for (int j = 0; j < 5; j++) {
            System.out.print("cv Simple " + j + "=>");
            cvSimple.display();
        }
    }

}
