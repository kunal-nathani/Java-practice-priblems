import java.util.Random;
import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int random1 = rand.nextInt(100);
        System.out.println(random1);
        int k = 5;
        int i = 0;
        while (i != k) {
            System.out.println("Guess a Number");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();

            switch (Integer.compare(guess, random1)) {
                case 0:
                    System.out.println("Congo! You guessed it right");
                    break;
                case 1:
                    System.out.println("Sorry, the number is high");
                    break;
                case -1:
                    System.out.println("Sorry, the number is low");
                    break;
            }

            i++;
            if (i == k) {
                System.out.println("You have exhausted " + k + " trials.");
                System.out.println("The number was " + random1);
            }
        }
    }
}
