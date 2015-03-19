package slm.abdennour.springcore;

import org.springframework.beans.factory.annotation.Autowired;

public class App {

    @Autowired
    private static Cv tests;

    public static void main(String[] args) {
        tests.display();
    }
}
