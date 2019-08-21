import java.util.Scanner;

/**
 * Reverse integer number, superhero.
 */

public class ReverseInt {
    public static void main(String[] args) {
        int inputInt = new Scanner(System.in).nextInt();
        int reversedInt = 0;
        while (inputInt != 0) {
            // Get digit from right side of input int
            int digit = inputInt % 10;
            // Shift all remembered digits to left and add new digit to result int
            reversedInt = reversedInt * 10 + digit;
            // Cut digit from right side of input int
            inputInt = inputInt / 10;
        }
        System.out.println(reversedInt);
    }
}
