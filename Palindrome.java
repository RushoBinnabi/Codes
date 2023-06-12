/**
 * Name: Rusho Binnabi
 * Date: 6/12/2023
 * Project: Palindrome
 * Code File Updated: 6/12/2023 at 8:21 am
 * Contact Information: RushoBinnabi123@yahoo.com
 */

import java.util.Scanner;

public class Palindrome {

    // this Palindrome class checks to see if a word(s) or number(s) are a Palindrome which are words or numbers that are the same thing going forward and backward.

    /**
     * this public static void isPalindrome() method checks to see if the number(s) or word(s) are a Palindrome.
     * @param text the argument is the text from the user that is being checked.
     */

    public static void isPalindrome(String text) {
        String string = "";
        boolean palindromeTrue = true;
        boolean palindromeFalse = false;
        String trueString;
        String falseString;
        for (int i = text.length() - 1; i >= 0; i--) {
            string = string + text.charAt(i);
        }
        if (text.toLowerCase().equals(string.toLowerCase())) {
            trueString = String.valueOf(palindromeTrue);
            System.out.println(trueString + ", " + text + " is a palindrome.");
            System.out.println("");
        }
        else {
            falseString = String.valueOf(palindromeFalse);
            System.out.println(falseString + ", " + text + " is not a palindrome.");
            System.out.println("");
        }
    }

    /**
     * the main() method runs the code.
     * @param args the argument is the code being run.
     */

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter Word or Number: ");
        String input = userInput.nextLine();
        userInput.close();
        Palindrome.isPalindrome(input);
    }

}