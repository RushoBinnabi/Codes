/*
* Name: Rusho Binnabi
* Date: 07/20/2022
* Project: TempCalc
* Code File Modified: 7/20/2022 at 6:14 PM
* Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
*/

using System; // this system library gets used in this program.

namespace Temp { /* this namespace called Temp has all the classes and methods and everything else needed for the program. */
    
    /*
    * this class called TempCalc contains the methods, variables, that are needed for the program to run.
    * this class calculates either the fahrenheit or celsius conversion based on if the user wants to convert a temperature into either a fahrenheit or celsius temperature.
    */

    class TempCalc {
        
        public static double userInput; // creates a public static double variable called userInput.
        public static double fahrenheit; // creates a public static double variable called fahrenheit.
        public static double celsius; // creates a public static double variable called celsius.
        public static string choice; // creates a public statuc string variable called choice.

        /*
        * this public static double celsiusConversion() method has one argument which is a double variable called c which is the fahrenheit temperature that the user enters which will be converted.
        * this method converts a user given fahrenheit temperature into a celsius temperature.
        */

        public static double celsiusConversion(double c) {
            celsius = (c - 32) / 1.8; // celsius will have the converted celsius temperature using the formula and the user given fahrenheit temperature from c.
            return celsius; // returns celsius.
        } // the end of the celsiusConversion() method.

        /*
        * this public static double fahrenheitConversion() has one argument which is a double variable called f which is the celsius temperature that the user enters which will be converted.
        * this method converts a user given celsius temperature into a fahrenheit temperature. 
        */

        public static double fahrenheitConversion(double f) {
            fahrenheit = (f * 1.8) + 32; // fahrenheit will have the converted fahrenheit temperature using the formula and the user given celsius temperature from f.
            return fahrenheit; // returns fahrenheit.
        } // the end of the fahrenheitConversion() method.

        /*
        * this public static void resetValues() method resets all the values of the variables.
        * this method is void because it doesn't return anything.
        */

        public static void resetValues() {
            userInput = 0; // userInput gets reset to 0.
            fahrenheit = 0; // fahrenheit gets reset to 0.
            celsius = 0; // celsius gets reset to 0.
            choice = ""; // choice gets reset to an empty string.
        } // the end of the resetValues() method.

        static public void Main(String[] args) {
            Console.Write("Do you want to convert a fahrenheit or celsius temperature? (f/c): "); // prompts the user to enter a f or a c which is either the fahrenheit or celsius conversion.
            choice = Console.ReadLine(); // the user input gets saved into choice.

            if (choice == "f") { // if the value inside choice is a f which means the user wants to convert a celsius temperature into a fahrenheit temperature, then the code inside the if statement gets run.
                Console.WriteLine(""); // creates some line spacing.
                Console.Write("Enter a celsius temperature: "); // prompts the user to enter a celsius temperature.
                userInput = double.Parse(Console.ReadLine()); // userInput gets the number from the userInput saved as a double value.
                Console.WriteLine("The fahrenheit conversion is " + fahrenheitConversion(userInput) + "°F"); // shows what the converted fahrenheit temperature by calling the fahrenheitConversion() method and userInput as it's argument.
            } // the end of the if statement.

            else if (choice == "c") { // if the value inside choice is a c which means the user wants to convert a fahrenheit temperature into a celsius temperature, then the code inside the else if statement gets run.
                Console.WriteLine(""); // creates some line spacing.
                Console.Write("Enter a fahrenheit temperature: "); // prompts the user to enter a celsius temperature.
                userInput = double.Parse(Console.ReadLine()); // userInput gets the number from the userInput saved as a double value.
                Console.WriteLine("The celsius conversion is " + celsiusConversion(userInput) + "°C"); // shows what the converted celsius temperature by calling the celsiusConversion() method and userInput as it's argument.
            } // the end of the else if statement.

            resetValues(); // calls the resetValues() method.
            Console.WriteLine(""); // creates some line spacing.
            Console.ReadKey(); // the ReadKey() method from the console makes it so the program doesn't immediately end after showing the conversion.
        } // the end of the main() method.

    } // the end of the TempCalc class.

} // the end of the Temp namespace.