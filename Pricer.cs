/*
* Name: Rusho Binnabi
* Date: 7/17/2022
* Project: Pricer
* Contact Information: RushoBinnabi123@yahoo.com
* Code File Updated: 7/17/2022 at 6:16 PM
*/

using System; // imports the System namespace for use in this program.

namespace Program { /* this namespace called TestProgram has the class and methods that are needed for my program to run. */

/*
* this program will calculate the tax or discount of an item using a price amount that the user enters and based on if either wants to calculate the tax or discount of an item.
*/

    class Pricer {

        public static double taxUserInput; // creates a public static double variable called taxUserInput.
        public static double discountUserInput; // creates a public static double variable called discountUserInput.
        public static double t; // creates a public static double variable called t.
        public static double d; // creates a public static double variable called d.
        public static double itemPriceAmount; // creates a public static double variable called itemPriceAmount.
        public static double taxRate; // creates a public static double variable called taxRate.
        public static double discountRate; // creates a public static double variable called discountRate.
        public static double taxedMoney; // creates a public static double variable called taxedMoney.
        public static double finalPrice; // creates a public static double variable called finalPrice.
        public static double discountedMoney; // creates a public static double variable called discountedMoney.
        public static string choice; // creates a public static string variable called choice.

        /*
        * this public double tax() method has two arguments, one for the item price amount called money and another for the tax percent called discount.
        * this method return a double which is the final price of the item after applying the tax.
        * this method calculates the tax of an item that was entered by the user.
        */

        public double tax(double money, double tax) {
            itemPriceAmount = money; // itemPriceAmount will have the value from money.
            taxRate = tax / 100; // taxRate will have the value of tax divided by 100.
            taxedMoney = itemPriceAmount * taxRate; // taxedMoney will have the value of itemPriceAmount multiplied by taxRate.
            finalPrice = itemPriceAmount + taxedMoney; // finalPrice will have the value of itemPriceAmount added by taxedMoney.
            double value = Math.Round(finalPrice, 2); // creates a double variable called value which will have the value of finalPrice rounded to 2 decimal places.
            return value; // returns value.
        } // the end of the tax() method.

        /*
        * this public double discount() method has two arguments, one for the item pricve amount called money and another for the discount percentage called discount.
        * this method returns a double which is the final price of the item after applying the discount.
        * this method calculates the discount of an item that was entered by the user.
        */

        public double discount(double money, double discount) {
            itemPriceAmount = money; // itemPriceAmount will have the value from money.
            discountRate = discount / 100; // discountRate will have the value of discount divided by 100.
            discountedMoney = itemPriceAmount * discountRate; // discountedMoney will have the value of itemPriceAmount multiplied by discountRate.
            finalPrice = itemPriceAmount - discountedMoney; // finalPrice will have the value of itemPriceAmount subtracted by discountedMoney.
            double value = Math.Round(finalPrice, 2); // creates a double variable called value which will have the value of finalPrice rounded to 2 decimal places.
            return value; // returns value.
        } // the end of the discount() method.

        /*
        * this main() method runs the code for the program.
        * this method is void because it doesn't return anything.
        */

        static void Main(string[] args) {
            Pricer p = new Pricer(); // creates a new Pricer object called p.
            Console.Write("Would you like to calculate the price of an item with tax or discount? (t/d) "); // prompts the user and asks them if they want to calculate the price of an item with tax or discount.
            choice = Console.ReadLine(); // choice will have the value from the user input.
            if (choice == "t") { // if the value inside choice was a t which means the user wants to calculate the price of an item with tax, then it runs the code inside the if statement.
                Console.WriteLine(""); // creates some line spacing.
                Console.Write("Enter Price: $"); // prompts the user to enter the price of an item.
                taxUserInput = double.Parse(Console.ReadLine()); // taxUserInput will have the value from the user input as a double.
                Console.Write("Enter Tax Rate Percentage: "); // prompts the user to enter the tax rate percentage.
                t = double.Parse(Console.ReadLine()); // t will have the value from the user input as a double.
                Console.WriteLine("The final price of that item is $" + p.tax(taxUserInput, t)); // tells the user what the final price of the item with tax is by calling the tax() method using p and taxUserInput and t as it's two arguments.
                Console.WriteLine(""); // creates some line spacing.
                Console.ReadKey(); // this makes it so the program doesn't immediately stop after running.
            } // the end of the if statement.
            else if (choice == "d") { // if the value inside choice was a d which means the user wants to calculate the price of an item with discount, then it runs the code inside the if statement.
                Console.WriteLine(""); // creates some line spacing.
                Console.Write("Enter Price: $"); // prompts the user to enter the price of an item.
                discountUserInput = double.Parse(Console.ReadLine()); // discountUserInput will have the value from the user input as a double.
                Console.Write("Enter Discount Rate Percentage: "); // prompts the user to enter the discount rate percentage.
                d = double.Parse(Console.ReadLine()); // d will have the value from the user input as a double.
                Console.WriteLine("The final price of that item is $" + p.discount(discountUserInput, d)); // tells the user what the final price of the item with discount is by calling the discount() method using p and discountUserInput and t as it's two arguments.
                Console.WriteLine(""); // creates some line spacing.
                Console.ReadKey(); // this makes it so the program doesn't immediately stop after running.
            } // the end of the else if statement.
        } // the end of the main() method.


    } // the end of the class.

} // the end of the Program namespace.