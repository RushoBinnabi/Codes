/**
 * @file DocumentInformation.c
 * @author Rusho Binnabi
 * @date 2022-05-27
 * Code File Updated: 5/30/2022 at 10:22 PM
 * Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
 */

#include <stdio.h> // includes the stdio library for use in this program.
#include <stdlib.h> // includes the stdlib libary for use in this program.
#include <string.h> // includes the string library for use in this program.
#include <time.h> // includes the time library for use in this program.
#define MAX_FILE_NAME_LENGTH 256 // this constant called MAX_FILE_NAME_LENGTH is defined with a value of 256.

/**
 * this program will calculate the number of punctuation marks in a file.
 */

FILE *filePointer; // creates a file pointer called filePointer.
time_t clockStart, clockEnd; // creates 2 time_t variables called clockStart and clockEnd.
double executionTime; // creates a double variable called executionTime.
int lines; // creates an integer variable called lines.
int characters; // creates an integer variable called characters.
int whiteSpaceCharacters; // creates an integer variable called whiteSpaceCharacters.
int character; // creates an integer variable called character.
int periods; // creates an integer variable called periods.
int paragraph; // creates an integer variable called paragraphs.
int commas; // creates an integer variable called commas.
int exclamationPoints; // creates an integer variable called exclamationPoints.
int colons; // creates an integer variable called colons.
int hyphens; // creates an integer variable called hyphens.
int semiColons; // creates an integer variable called semiColons.
int quotationMarks; // creates an integer variable called quotationMarks.
int parenthesis; // creates an integer variable called parenthesis.
int squareBraces; // creates an integer variable called squareBraces.
int squareBrackets; // creates an integer variable called squareBrackets.
//int words; // creates an integer variable called words.
int apostropheMarks; // creates an integer variable called apostropheMarks.
char fileName[MAX_FILE_NAME_LENGTH]; // creates a char array called fileName with a size of MAX_FILE_NAME_LENGTH.

/**
 * this void fileInformation() function calculates the number of characters, white space characters, lines, and paragraphs in a file.
 * this function is void because it doesn't return anything.
 * @param file this parameter called file is a char array with a size of MAX_FILE_NAME_LENGTH which will have the name of the file.
 */

void fileInformation(char file[MAX_FILE_NAME_LENGTH]) {
    filePointer = fopen(file, "r"); // filePointer will have the file from file opened in read mode.
    if (filePointer == NULL) { // if the contents of filePointer is NULL/empty, then it runs the code inside the if statement.
        printf("\nError. The file %s is empty or doesn't exist. Please try again.\n\n", file); // tells the user that the file inside file is either empty or doesn't exist and tells the user to try again.
        exit(1); // exits the program with a code of 0 which means something went wrong.
    } // the end of the if statement.
    else { // otherwise, it runs the code inside  the else statement.
        while ((character = fgetc(filePointer)) != EOF) { // the code inside the while loop runs as long as the value of character using the fgetc() function and filePointer as it's argument isn't equal to the end of the file.
            characters++; // the value of characters gets increased by 1.
            if (character == ' ') { // if the value of the current character inside character is equal to a white space character then it runs the code inside the if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the white space characters.
                whiteSpaceCharacters++; // the value of whiteSpaceCharacters gets increased by 1.
            } // the end of the if statement.
            else if (character == '\n') { // or if the value of the current character inside character is equal to a new line character then it runs the code inside the else if statement.
                lines++; // the value of lines gets increased by 1.
                characters = characters - 2; // the value of characters is equal to itself minus 2 since it's not counting the new line characters.
                if (lines >= 2) { // if the value of lines is greater than or equal to 2, then it runs the code inside the if statement.
                    paragraph++; // the value of paragraph gets increased by 1.
                    whiteSpaceCharacters++; // the value of whiteSpaceCharacters gets increased by 1.
                    lines = 0; // the value of lines gets set to 0.
                } // the end of the if statement.
            } // the end of else if statement.
            else if (character == '.') { // or if the value of the current character inside character is equal to a period, then it runs the code inside the else if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the periods.
                periods++; // the value of periods gets increased by 1.
            } // the end of the else if statement.
            else if (character == ',') { // or if the value of the current character inside character is equal to a comma, then it runs the code inside the else if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the commas.
                commas++; // the value of commas gets increased by 1.
            } // the end of the if statement.
            else if (character == '!') { // or if the value of the current character inside character is equal to an exclamation point, then it runs the code inside the else if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the exclamation points.
                exclamationPoints++; // the value of exclamationPoints gets increased by 1.
            } // the end of the else if statement.
            else if (character == ':') { // or if the value of the current character inside character is equal to a colon, then it runs the code inside the else if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the colons. 
                colons++; // the value of colons gets increased by 1.
            } // the end of the else if statement.
            else if (character == '-') { // or if the value of the current character inside character is equal to a hyphen, then it runs the code inside the else if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the hyphens.
                hyphens++; // the value of hyphens gets increased by 1.
            } // the end of the else if statement.
            else if (character == ';') {
                characters--; // the value of characters gets decreased by 1 since it's not counting the semi colons.
                semiColons++; // the value of semiColons gets increased by 1.
            } // the end of the else if statement.
            else if (character == '"' || character == '"') { // or if the value of the current character inside character is equal to a quotation mark, then it runs the code inside the else if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the quotation marks.
                quotationMarks++; // the value of quotationMarks gets increased by 1.
            } // the end of the else if statement.
            else if (character == '(' || character == ')') { // or if the value of the current character inside character is equal to either a left or right parenthesis, then it runs the code inside the else if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the parenthesis.
                parenthesis++; // the value of parenthesis gets increased by 1.
            } // the end of the else if statement.
            else if (character == '{' || character == '}') { // or if the value of the current character inside character is equal to either a left or right square brace, then it runs the code inside the else if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the square braces.
                squareBraces++; // the value of squareBraces gets increased by 1.
            } // the end of the else if statement.
            else if (character == '[' || character == ']') { // or if the value of the current character inside character is equal to either a left or right square bracket, then it runs the code inside the else if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the square brackets.
                squareBrackets++; // the value of squareBrackets gets increased by 1.
            } // the end of the else if statement.
            //else if (character == ' ' || character == '\n') { // or if the value of the current character inside character is equal to either not a new line character or a new line character, then it runs the code inside the else if statement.
                //characters--; // the value of characters gets decreased by 1 since it's counting actual words.
                //words++; // the value of words gets increased by 1.
            //} // the end of the else if statement.
            else if (character == '\'') { // or if the value of the current character inside character is equal to an apostrophe character, then it runs the code inside the else if statement.
                characters--; // the value of characters gets decreased by 1 since it's not counting the apostrophes.
                apostropheMarks++; // the value of apostropheMarks gets decreased by 1.
            } // the end of the else if statement.
        } // the end of the while loop. 
    } // the end of the else statement.
    fclose(filePointer); // using the fclose() function, it closes filePointer.
    printf("\nFile %s information: ", file); // shows the user the information that was obtained from the file inside file.
    printf("\n\nNumber of Characters: %d", characters); // shows the user the number of characters inside the file from file.
    printf("\nNumber of White Space Characters: %d", whiteSpaceCharacters); // shows the user the number of white space characters inside the file from file.
    printf("\nNumber of Lines: %d", lines); // shows the user the number of lines inside the file from file.
    printf("\nNumber of Paragraphs: %d", paragraph); // shows the user the number of paragraphs inside the file from file.
    printf("\nNumber of Periods: %d", periods); // shows the user the number of periods inside the file from file.
    printf("\nNumber of Commas: %d", commas); // shows the user the number of commas inside the file from file.
    printf("\nNumber of Exclamation Points: %d", exclamationPoints); // shows the user the number of exclamation points inside the file from file.
    printf("\nNumber of Colons: %d", colons); // shows the user the number of colons inside the file from file.
    printf("\nNumber of Hyphens: %d", hyphens); // shows the user the number of hyphens inside the file from file.
    printf("\nNumber of Semi Colons: %d", semiColons); // shows the user the number of semi colons inside the file from file. 
    printf("\nNumber of Quotation Marks: %d", quotationMarks); // shows the user the number of quotation marks inside the file from file.
    printf("\nNumber of Parenthesis: %d", parenthesis); // shows the user the number of parenthesis inside the file from file.
    printf("\nNumber of Square Braces: %d", squareBraces); // shows the user the number of square braces inside the file from file.
    printf("\nNumber of Square Brackets: %d", squareBrackets); // shows the user the number of square brackets inside the file from file.
    printf("\nNumber of Apostrophes: %d\n\n", apostropheMarks); // shows the user the number of apostrophes inside the file from file.
    //printf("\nNumber of Words: %d\n\n", words); // shows the user the number of words inside the file from file.
    memset(file, 0, sizeof file); // empties the contents of file by using the 0 character to empty the array using the size of file via the memset() function.
} // the end of the fileInformation() function.

/**
 * this integer main() function has the code needed for my program to run. 
 * @return int returns a 0 which means the program ran successfully.
 */

int main() {

    printf("\nEnter the file name: "); // prompts the user to enter the name of the file.
    scanf("%s", fileName); // stores the user input into fileName as a string using the scanf() function.

    clockStart = clock(); // clockStart will have the time value of the cpu clock before the start of the fileInformation() function using the clock() function.

    fileInformation(fileName); // calls the fileInformation() function using fileName as it's argument.

    clockEnd = clock(); // clockEnd will have the time value of the cpu clock after the end of the fileInformation() function using the clock() function.

    executionTime = ((double) (clockEnd - clockStart)) / CLOCKS_PER_SEC; // executionTime will have the subtracted value of clockEnd and clockStart divided by CLOCKS_PER_SEC as a double.
    
    memset(fileName, 0, sizeof fileName); // empties the contents of fileName by using the 0 character to empty the array and using the size of fileName via the memset() function.

    //printf("Execution Time: %f seconds\n\n", executionTime); // for debugging purposes. shows the time it took for the function to run using executionTime in seconds and as a floating-point number.

    return 0; // returns a 0 which means the program ran successfully.

} // the end of the main() function.