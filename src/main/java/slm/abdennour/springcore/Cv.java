package slm.abdennour.springcore;

import java.util.Random;

/**
 *
 * @author Abdennour عبد النور التومي
 *
 * @see http://abdennour-insat.blogspot.com
 * @since 10 nov. 2012
 */
public final class Cv {

    private String fullName;

    public Cv() {
        this.fullName = getRandomString();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void display() {

        System.out.println(this.fullName);
    }

    public String getRandomString() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        return output;
    }

}
