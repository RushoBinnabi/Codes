/**
 * Name: Rusho Binnabi
 * Date: 10/18/2022
 * Project: CombinationsandPermutations
 * Code File Updated: 10/23/2022 at 9:34 AM
 * Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
 * Reference Link: https://www.mathsisfun.com/combinatorics/combinations-permutations.html
 */

import java.util.*; // imports the java.util library functions for use in this program.

/**
 * this class CombinationsandPermutations calculates the 4 types of combinations and permutations based on n total objects and r objects that are chosen based on what the user enters.
 */

public class CombinationsandPermutations {

    /**
     * this static long factorialNumber() method calculates the factorial of a number.
     * @param number the argument number is the argument that is the number that the user wants to calculate the factorial of which is then used in the program.
     * @return returns number which is the factorial of the number that the user enters.
     */

    static long factorialNumber(long number) {
        for(int i= (int) number - 1; i >= 1; i--){ // the code inside the for loop will run as long as the value of the integer i is equal to the value of number minus 1 as an integer, and whenever the value of i is greater than or equal to 1, the value of i will decrease by 1 each time.
            number = number * i; // number will have the value of number multiplied by whatever the current value of i is.
        } // the end of the for loop.
        return number; // returns number.
    } // the end of the factorialNumber() method.

    /**
     * this static long permutationsWithRepitition() method calculates the number of permutations with repitition of two numbers n and r that the user enters.
     * @param n n is the total number of objects.
     * @param r r is the number of objects to choose from.
     * @return returns the number of permutations with repitition.
     */

    static long permutationsWithRepitition(long n, long r) {
        long pwr = (long) Math.pow(n, r); // declares a long integer variable called pwr which will have the number of permutations with repitition of two numbers n raised to the power of r as a long integer value from the Math.pow library function.
        return pwr; // returns pwr.
    } // the end of the permutationsWithRpeitition() method.

    /**
     * this static long permutationsWithoutRepitition() method calculates the number of permutations without repitition of two numbers n and r that the user enters.
     * @param n n is the total number of objects.
     * @param r r is the number of objects to choose from.
     * @return returns the number of permutations without repitition. 
     */

    static long permutationsWithoutRepitition(long n, long r) {
        long num1 = factorialNumber(n); // declares a long integer variable called num1 which will have the factorial of n using the factorialNumber() method.
        long num2 = n - r; // declares a long integer variable called num2 which will have the subtracted values of n and r.
        long num3 = factorialNumber(num2); // declares a long integer variable called num3 which will have the factorial of num2 using the factorialNumber() method.
        long num4 = num1 / num3; // declares a long integer variable called num4 which will have the divided values of num1 and num3.
        return num4; // returns num4.
    } // the end of the permutatinsWithoutRepitition() method.

    /**
     * this static long combinationsWithoutRepitition() method calculates the number of combinations without repititions of two numbers n and r that the user enters.
     * @param n n is the total number of objects.
     * @param r r is the number of objects to choose from.
     * @return returns the number of combinations without repitition.
     */

    static long combinationsWithoutRepititions(long n, long r) {
        long num1 = factorialNumber(n); // declares a long integer variable called num1 which will have the factorial of n using the factorialNumber() method.
        long num2 = factorialNumber(r); // declares a long integer variable called num2 which will have the factorial of r using the factorialNumber() method.
        long num3 = n - r; // declares a long integer variable called num3 which will have the subtracted values of n and r.
        long num4 = factorialNumber(num3); // declares a long integer variable called num4 which will have the factorial of num3 using the factorialNumber() method.
        long num5 = num2 * num4; // declares a long integer variable called num5 which will have the multiplied values of num2 and num4.
        long num6 = num1 / num5; // declares a long integer variable called num6 which will have the divided values of num1 and num5.
        return num6; // returns num6.
    } // the end of the combinationsWithRepitition() method.

    /**
     * this static long combinationsWithRepitition() method calculates the number of combinations with repititions of two numbers n and r that the user enters.
     * @param n n is the total number of objects.
     * @param r r is the number of objects to choose from.
     * @return returns the number of combinations with repitition.
     */

    static long combinationsWithRepititions(long n, long r) {
        long num1 = factorialNumber((r + n) - 1); // declares a long integer variable called num1 which will have the factorial of (r + n) - 1 using the factorialNumber() method.
        long num2 = factorialNumber(n - 1); // declares a long integer variable called num2 which will have the factorial of n - 1 using the factorialNumber() method.
        long num3 = num2 * factorialNumber(r); // declares a long integer variable called num3 which will have the multiplied values of num2 and the factorial of r using the factorialNumber() method.
        return num1 / num3; // returns num1 divided by num3.
    } // the end of the combinationsWithRepitition() method.

    /**
     * the main() method runs the code.
     * @param args the argument is the code being run. 
     */

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // creates a Scanner object called userInput which gets the user input.
        long n; // creates a long integer variable called n.
        long r; // creates a long integer variable called r.
        char choice1; // creates a char variable called choice1.
        char choice2; // creates a char variable called choice2.
        char condition; // creates a char variable called condition.
        System.out.print("Do you want to use the program? (y/n): "); // prompts the user to enter either a y or n which indicates if they want to use the program.
        condition = userInput.next().charAt(0); // character gets the character value from the user input.
        while (condition == 'y') { // the code inside the while loop will run as long as the value of condition is a y which means the user wants to use the program.
            System.out.println("\n"); // creates some line spacing.
            System.out.print("Does the order matter in the calculation? (y/n): "); // prompts the user to enter either a y or n which indicates if the order in the calculation matters.
            choice1 = userInput.next().charAt(0); // choice1 gets the character value from the user input.
            System.out.print("Does the calculation have any repitition? (y/n): "); // prompts the user to enter either a y or n which indicates if the calculation has any repitition or not.
            choice2 = userInput.next().charAt(0); // choice2 gets the character value from the user input.
            if (choice1 == 'y' && choice2 == 'y') { // the code inside the if statement will run if the value inside choice1 is a y which means the order matters in the calculation and if the value inside choice2 is a y which means that there is repitition in the calculation.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("Enter the total number of objects: "); // prompts the user to enter the total amount of objects.
                n = userInput.nextLong(); // n will have the total amount of objects that will be used for the calculation as a long integer number.
                System.out.print("Enter the number of objects that will be chosen: "); // prompts the user to enter the number of objects that will be chosen.
                r = userInput.nextLong(); // r will have the number of objects that will used for the calculation as a long integer number.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("The number of permutations of " + n + " total objects with " + r + " chosen objects with repitition is about " + permutationsWithRepitition(n, r) + " permutations with repitition."); // shows the user how many permutations with repitition can be made with n total objects from n with r chosen objects from r by calling the permutationsWithRepitition() method with n and r as its arguments.
                System.out.println("\n"); // creates some line spacing.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("Do you want to use the program again? (y/n): "); // prompts the user to enter either a y or n which indicates if they want to use the program again.
                condition = userInput.next().charAt(0); // condition gets the character value from the user input.
                if (condition == 'n') { // the code inside the if statement will run if the value inside condition is an n which means that that user doesn't want to use the program again.
                    userInput.close(); // closes userInput by using the close() method.
                    r = 0; // the value of r gets reset to 0.
                    n = 0; // the value of n gets reset to 0.
                    choice1 = ' '; // the value of choice1 gets reset to an empty character.
                    choice2 = ' '; // the value of choice2 gets reset to an empty character.
                    condition = ' '; // the value of condition gets reset to an empty character.
                    System.exit(0); // exits the program with a value of 0 which means the program ran successfully.
                } // the end of the if statement.
            } // the end of the if statement.
            else if (choice1 == 'y' && choice2 == 'n') { // the code inside the if statement will run if the value inside choice1 is a y which means the order matters in the calculation and if the value inside choice2 is a n which that there is no repitition in the calculation.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("Enter the total number of objects: "); // prompts the user to enter the total amount of objects.
                n = userInput.nextLong(); // n will have the total amount of objects that will be used for the calculation as a long integer number.
                System.out.print("Enter the number of objects that will be chosen: "); // prompts the user to enter the number of objects that will be chosen.
                r = userInput.nextLong(); // r will have the total amount of objects that will be used for the calculation as a long integer number.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("The number of permutations of " + n + " total objects with " + r + " chosen objects without repitition is about " + permutationsWithoutRepitition(n, r) + " permutations without repitition."); // shows the user how many permutations without repitition can be made with n total objects from n with r chosen objects from r by calling the permutationsWithoutRepitition() method with n and r as its arguments.
                System.out.println("\n"); // creates some line spacing.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("Do you want to use the program again? (y/n): "); // prompts the user to enter either a y or n which indicates if they want to use the program again.
                condition = userInput.next().charAt(0); // condition gets the character value from the user input.
                if (condition == 'n') { // the code inside the if statement will run if the value inside condition is an n which means that that user doesn't want to use the program again.
                    userInput.close(); // closes userInput by using the close() method.
                    r = 0; // the value of r gets reset to 0.
                    n = 0; // the value of n gets reset to 0.
                    choice1 = ' '; // the value of choice1 gets reset to an empty character.
                    choice2 = ' '; // the value of choice2 gets reset to an empty character.
                    condition = ' '; // the value of condition gets reset to an empty character.
                    System.exit(0); // exits the program with a value of 0 which means the program ran successfully.
                } // the end of the if statement.
            } // the end of the if statement.
            else if (choice1 == 'n' && choice2 == 'y') { // the code inside the if statement will run if the value inside choice1 is a n which means the order doesn't matter in the calculation and if the value inside choice2 is a y which that there is repitition in the calculation.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("Enter the total number of objects: "); // prompts the user to enter the total amount of objects.
                n = userInput.nextLong(); // n will have the total amount of objects that will be used for the calculation as a long integer number.
                System.out.print("Enter the number of objects that will be chosen: "); // prompts the user to enter the number of objects that will be chosen.
                r = userInput.nextLong(); // r will have the total amount of objects that will be used for the calculation as a long integer number.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("The number of combinations of " + n + " total objects with " + r + " chosen objects with repitition is about " + combinationsWithRepititions(n, r) + " combinations with repitition."); // shows the user how many combinations with repitition can be made with n total objects from n with r chosen objects from r by calling the combinationsWithRepitition() method with n and r as its arguments.
                System.out.println("\n"); // creates some line spacing.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("Do you want to use the program again? (y/n): "); // prompts the user to enter either a y or n which indicates if they want to use the program again.
                condition = userInput.next().charAt(0); // condition gets the character value from the user input.
                if (condition == 'n') { // the code inside the if statement will run if the value inside condition is an n which means that that user doesn't want to use the program again.
                    userInput.close(); // closes userInput by using the close() method.
                    r = 0; // the value of r gets reset to 0.
                    n = 0; // the value of n gets reset to 0.
                    choice1 = ' '; // the value of choice1 gets reset to an empty character.
                    choice2 = ' '; // the value of choice2 gets reset to an empty character.
                    condition = ' '; // the value of condition gets reset to an empty character.
                    System.exit(0); // exits the program with a value of 0 which means the program ran successfully.
                } // the end of the if statement.
            } // the end of the if statement.
            else if (choice1 == 'n' && choice2 == 'n') { // the code inside the if statement will run if the value inside choice1 is a n which means the order doesn't matter in the calculation and if the value inside choice2 is a n which that there is no repitition in the calculation.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("Enter the total number of objects: "); // prompts the user to enter the total amount of objects.
                n = userInput.nextLong(); // n will have the total amount of objects that will be used for the calculation as a long integer number.
                System.out.print("Enter the number of objects that will be chosen: "); // prompts the user to enter the number of objects that will be chosen.
                r = userInput.nextLong(); // r will have the total amount of objects that will be used for the calculation as a long integer number.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("The number of combinations of " + n + " total objects with " + r + " chosen objects without repitition is about " + combinationsWithoutRepititions(n, r) + " combinations without repitition."); // shows the user how many combinations without repitition can be made with n total objects from n with r chosen objects from r by calling the combinationsWithoutRepitition() method with n and r as its arguments.
                System.out.println("\n"); // creates some line spacing.
                System.out.println("\n"); // creates some line spacing.
                System.out.print("Do you want to use the program again? (y/n): "); // prompts the user to enter either a y or n which indicates if they want to use the program again.
                condition = userInput.next().charAt(0); // condition gets the character value from the user input.
                if (condition == 'n') { // the code inside the if statement will run if the value inside condition is an n which means that that user doesn't want to use the program again.
                    userInput.close(); // closes userInput by using the close() method.
                    r = 0; // the value of r gets reset to 0.
                    n = 0; // the value of n gets reset to 0.
                    choice1 = ' '; // the value of choice1 gets reset to an empty character.
                    choice2 = ' '; // the value of choice2 gets reset to an empty character.
                    condition = ' '; // the value of condition gets reset to an empty character.
                    System.exit(0); // exits the program with a value of 0 which means the program ran successfully.
                } // the end of the if statement.
            } // the end of the if statement.
        } // the end of the while loop.
    } // the end of the main method().
} // the end of the CombinationsandPermutations class.