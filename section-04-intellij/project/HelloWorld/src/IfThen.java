public class IfThen {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of ET");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        // wrap each condition with braces for better readability
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }
    }
}
