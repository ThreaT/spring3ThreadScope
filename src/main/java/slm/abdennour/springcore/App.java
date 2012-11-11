package slm.abdennour.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ((Cv)new ClassPathXmlApplicationContext("ctx.xml").getBean("tests")).display() ;
    }
}
