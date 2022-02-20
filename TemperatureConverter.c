/*
* Name: Rusho Binnabi
* Date: 2/20/2022
* Project: TemperatureConverter
* Code Updated: 2/20/2022 at 10:07 AM
* Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
*/

#include <stdio.h>

int main() { /* the main() function has the "main" code that's needed for my program to run.*/

    float converttoCelsius(float c); /* creates a function called converttoCelsius() of a float type that will be used for calculating the conversion of a given temperature into it's celsius equivalent. It has a float arguement c which is the celsius input temperature. */

    float converttoFahrenheit(float f); /* creates a function called converttoFahrenheit() of a float type that will be used for calculating the conversion of a given temperature into it's fahrenheit equivalent. It has a float argument f which is the fahrenheit input temperature. */

    float inputTemperature = 0; //  creates a float variable called inputTemperature that is initialized to 0 and will store the input temperature as a float.

    printf("\nEnter a temperature: "); // using the printf() function, it prompts the user to enter a temperature.
    scanf("%f", &inputTemperature); // using the scanf() function, it scans the input temperature from the user and stores it inside inputTemperature as a float.

    printf("\nThe celsius conversion is %0.2f degrees celsius\n", converttoCelsius(inputTemperature)); // using the printf() function, it shows the converted celsius equivalent of the temperature formatted to 2 decimal places from inputTemperature using the convertToCelsius() function and inputTemperature as it's argument.
    printf("\nThe fahrenheit conversion is %0.2f degrees fahrenheit\n\n", converttoFahrenheit(inputTemperature)); // using the printf() function, it shows the converted fahrenheit equivalent of the temperature formatted to 2 decimal places from inputTemperature using the convertToFahrenheit() function and inputTemperature as it's argument.

    system("pause"); // this makes sure the program doesn't suddenly end after running.
    return 0; // the program returns a 0 which means that the program was successful.

} /* the end of the main() function. */

float converttoCelsius(float c) { /* the converttoCelsius() function has the code that's needed to convert a given temperature which is the float c argument into it's celsius equivalent. */
    float celsius = 0; // creates a float variable called celsius that is initialized to 0 and will store the converted celsius temperature as a float.
    celsius = (c - 32) / 1.8; // celsius will calculate the celsius conversion of the given temperature from c and store it inside celsius.
    return celsius; // the function returns the value of celsius which is the converted celsius temperature of inputTemperature.
} /* the end of the converttoCelsius() function. */

float converttoFahrenheit(float f) { /* the converttoFahrenheit() function has the code that's needed to convert a given temperature which is the float f argument into it's fahrenheit equivalent. */
    float fahrenheit = 0; // creates a float variable called fahrenheit that is initialized to 0 and will store the converted fahrenheit temperature as a float.
    fahrenheit = (f * 1.8) + 32; // fahrenheit will calculate the fahrenheit conversion of the given temperature from c and store it inside fahrenheit.
    return fahrenheit; // the function returns the value of fahrenheit which is the converted fahrenheit temperature of inputTemperature.
} /* the end of the converttoFahrenheit() function. */