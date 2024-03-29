/*
* Name: Rusho Binnabi
* Date: 2/21/2022
* Project: Temperature Converter
* Code File Updated: 2/24/2022 at 9:31 PM
* Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
*/

#include <stdio.h>
#include <string.h>

int main() { /* the main() function has the code that's needed for my program to run. */

    float converttoCelsius(float c); /* creates a float function called converttoCelsius() that has 1 float argument which is c which is the input temperature */
                                     /* which is the temperture that the user enters and wants to have converted to celsius. */

    float converttoFahrenheit(float f); /* creates a float function called converttoFahrenheit() that has 1 float argument which is f which is the input temperature */
                                        /* which is the temperature that the user enters and wants to have converted to fahrenheit. */

    float temperature = 0; // creates a float variable called temperature and is initialized to 0 which is the input temperature that the user enters which will be converted 
                           // into a fahrenheit or celsius depending on what conversion the user wants.
    char *choice; // creates a char pointer called choice that will store the character f or c which will be used to determine what kind of conversion the user wants.

    printf("\nEnter a Temperature: "); fflush(stdout); // prompts the user to enter a temperature. It flushes the buffer at the end.
    scanf("%f", &temperature); // scans that input from the user and stores it inside temperature as a float.

    printf("\nDo you want to convert this temperature to Fahrenheit or Celsius (f/c): "); fflush(stdout); // prompts the user to choose whether they want to convert the temperature that they entered into a celsius or fahrenheit temperature. It flushes the buffer at the end.
    scanf("%s", choice); // scans that input from the user and stores it inside choice as a string.

    if (*choice == 'f') { // deferences choice and checks if the value insie choice was f and if it was, then it runs the code inside the if statement.
        printf("\nThe fahrenheit conversion is %0.2f degrees fahrenheit\n", converttoFahrenheit(temperature)); fflush(stdout); // displays the fahrenheit conversion of the temperature that the user entered as a float rounded to 2 decimmal places. It flushes the buffer at the end.
    } // the end of the if statement.
    else if (*choice == 'c') { // deferences choices and checks if the value inside choice was c and if it was, then it runs the code inside the else if statement.
        printf("\nThe celsius conversion is %0.2f degrees celsius\n\n", converttoCelsius(temperature)); fflush(stdout); // displays the celsius conversion of the temperature that the user entered as a float rounded to 3 decimal places. It flushes the buffer at the end.
    } // the end of the else if statement.

    return 0; // returns a 0 which means the program was successful.
} /* the end of the main() function. */

float converttoCelsius(float c) { /* this converttoCelsius() function converts the given temperature by the user into a celsius temperature. */
                                  /* It has 1 float argument called c which is the input temperature from the user that will be converted into a celsius temperature. */ 
    float celsius = 0; // creates a float variable called celsius and is initialized to 0 which will have the converted celsius temperature from c.
    celsius = (c - 32) / 1.8; // calculates the celsius conversion of c using the formula for celsius and stores the celsius conversion inside celsius.
    return celsius; // returns celsius.
} /* the end of the converttoCelsius() function. */

float converttoFahrenheit(float f) {
    float fahrenheit = 0; // creates a float variable called fahrenheit and is initialized to 0 which will have the converted fahrenheit temperature from f.
    fahrenheit = (f * 1.8) + 32; // calculates the fahrenheit conversion of f using the formula for fahrenheit and stores the fahrenheit conversion inside fahrenheit.
    return fahrenheit; // returns fahrenheit.
} /* the end of the converttoFahrenheit() function. */
