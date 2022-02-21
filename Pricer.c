/*
* Name: Rusho Binnabi
* Date: 2/20/2022
* Project: Pricer
* Code File Update: 2/20/2022 at 8:35 PM
* Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
*/

#include <stdio.h>
#include <string.h>
#include <conio.h>

/* this program calculates the price of an item given the initial and the tax or discount rate. */

int main() { /* the main() funtion has all the code that's needed for my program to run. */
    
    float priceDiscount(float d, float rate); /* this priceDiscount() function takes two float arguments: one is d which is the inputted price from the user and the other is the discount rate. */
                                              /* the priceDiscount() function calculates the price of an item after discount. */

    float priceTax(float t, float rate); /* this priceTax() function takes two float arguments: one is t which is the inputted price from the user and the other is the tax rate. */
                                         /* the priceTax() function calculates the price of an item after tax. */ 

    float inputPrice = 0; // creates a float variable called inputPrice which is initialized to 0 and will have the price inputted from the user.
    float rate = 0; // creates a float variable called rate which is initialized to 0 and will have either the tax or discount rate.

    char *choice; // creates a char pointer to a char variable called choice which will be used to output either the taxed or discounted price based on what the user wants.

    printf("\nEnter a price: $"); // prompts the user to enter a price.
    scanf("%f", &inputPrice); // scans the price input from the user as a float and stores it inside inputPrice.

    printf("\nDo you want to calculate tax or discount for this price (t/d): "); // prompts the user to select whether they want to calculate the price of an item after tax.
    scanf("%s", choice); // scans the choice input from the user as a string and stores it inside choice.

    if (*choice == 't') { // deferences the choice pointer to access the value stored inside choice and checks to see if the value is a t. If it is, then it runs the code inside the if statement.
        printf("\nEnter tax rate: "); // prompts the user to enter a tax rate.
        scanf("%f", &rate); // scans the tax rate input from the user as a float and stores it inside rate.
        printf("\nThe final of the item after taxes is $%0.2f\n\n", priceTax(inputPrice, rate)); // using the priceTax() function and inputPrice and rate as it's two float arguments, it displays the final price of an item after tax formatted to 2 decimal places.
    } // the end of the if statement. 

    else if (*choice == 'd') { // deferences the choice pointer to access the value stored inside choice and checks to see if the value is a d. If it is, then it runs the code inside the else if statement.
        printf("\nEnter discount rate: "); // prompts the user to enter a discount rate.
        scanf("%f", &rate); // scans the tax rate input from the user as a float and stores it inside rate.
        printf("\nThe final of the item after discounts is $%0.2f\n\n", priceDiscount(inputPrice, rate)); // using the priceDiscount() function and inputPrice and rate as it's two float arguments, it displays the final price of an item after discount formatted to 2 decimal places.
    } // the end of the else if statement.

    getch(); // calls the getch() function which waits for a key press from the user before exiting the program.
    return 0; // returns a 0 which means there were no errors and the program was successful.
    
} /* the end of the main() function. */

float priceDiscount(float d, float rate) { /* this priceDiscount() function takes two float arguments: one is d which is the inputted price from the user and the other is the discount rate. */
                                           /* the priceDiscount() function calculates the price of an item after discount. */

    float discountRate = 0; // creates a float variable called discountRate which is initialized to 0 and will have the discount rate.
    float discountedMoney = 0; // creates a float variable called discountedMoney which is initialized to 0 and will have the amount of money that will be discounted.
    float finalPrice = 0; // creates a float variable called finalPrice which is initialized to 0 and will have the final price of an item after discount.
    
    discountRate = rate / 100; // discountRate will have the discountRate which is rate divided by 100.
    discountedMoney = d * discountRate; // discountedMoney will have the amount of money that will be discounted which is d multiplied by discountRate.
    finalPrice = d - discountedMoney; // finalPrice will have the final price of an item after discount which is d subtracted by discountedMoney.

    return finalPrice; // returns the final price.

} /* the end of the priceDiscount() function. */

float priceTax(float t, float rate) { /* this priceTax() function takes two float arguments: one is t which is the inputted price from the user and the other is the tax rate. */
                                      /* the priceTax() function calculates the price of an item after tax. */

    float taxRate = 0; // creates a float variable called taxRate which is initialized to 0 and will have the tax rate.
    float taxedMoney = 0; // creates a float variable called taxedMoney which is initialized to 0 and will have the amount of money that will be taxed.
    float finalPrice = 0; // creates a float variable called finalPrice which is initialized to 0 and will have the final price of an item after tax.

    taxRate = rate / 100; // taxRate will have the taxrate which is rate divided by 100.
    taxedMoney = t * taxRate; // taxedMoney will have the amount of money that will be taxed which is t multiplied by taxRate.
    finalPrice = t + taxedMoney; // finalPrice will have the final price of an item after tax which is t added by taxedMoney.

    return finalPrice; // returns the final price.

} /* the end of the priceTax() function. */