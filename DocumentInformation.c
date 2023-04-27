/**
 * @file DocumentInformation.c
 * @author Rusho Binnabi
 * @date 2022-05-27
 * Code File Updated: 4/27/2023 at 5:51 PM
 * Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#define MAX_FILE_NAME_LENGTH 256

/**
 * this program will calculate the number of punctuation marks in a file.
 */

FILE *filePointer;
time_t clockStart, clockEnd;
double executionTime;
int lines;
int characters;
int whiteSpaceCharacters; 
int character;
int periods;
int paragraph;
int commas;
int exclamationPoints;
int colons;
int hyphens;
int semiColons;
int quotationMarks;
int parenthesis;
int squareBraces;
int squareBrackets;
//int words; // has a bug, sort of, where it doesn't properly count the number of words if I remember correctly.
int apostropheMarks;
char fileName[MAX_FILE_NAME_LENGTH];

/**
 * this void fileInformation() function calculates the number of characters, white space characters, lines, and paragraphs in a file.
 * @param file this parameter called file is a char array with a size of MAX_FILE_NAME_LENGTH which will have the name of the file.
 */

void fileInformation(char file[MAX_FILE_NAME_LENGTH]) {
    filePointer = fopen(file, "r");
    if (filePointer == NULL) { 
        printf("\nError. The file %s is empty or doesn't exist. Please try again.\n\n", file);
        exit(1);
    }
    else {
        while ((character = fgetc(filePointer)) != EOF) {
            characters++;
            if (character == ' ') {
                characters--;
                whiteSpaceCharacters++;
            }
            else if (character == '\n') {
                lines++;
                characters = characters - 2;
                if (lines >= 2) {
                    paragraph++;
                    whiteSpaceCharacters++; 
                    lines = 0;
                }
            }
            else if (character == '.') {
                characters--;
                periods++;
            }
            else if (character == ',') {
                characters--;
                commas++;
            }
            else if (character == '!') { 
                characters--;
                exclamationPoints++; 
            }
            else if (character == ':') {
                characters--;
                colons++;
            }
            else if (character == '-') {
                characters--;
                hyphens++;
            }
            else if (character == ';') {
                characters--; 
                semiColons++;
            }
            else if (character == '"' || character == '"') {
                characters--;
                quotationMarks++;
            }
            else if (character == '(' || character == ')') {
                characters--;
                parenthesis++; 
            } 
            else if (character == '{' || character == '}') { 
                characters--; 
                squareBraces++; 
            }
            else if (character == '[' || character == ']') { 
                characters--;
                squareBrackets++; 
            } 
            //else if (character == ' ' || character == '\n') { // or if the value of the current character inside character is equal to either not a new line character or a new line character, then it runs the code inside the else if statement.
                //characters--; // the value of characters gets decreased by 1 since it's counting actual words.
                //words++; // the value of words gets increased by 1.
            //} // the end of the else if statement.
            else if (character == '\'') { 
                characters--;
                apostropheMarks++;
            }
        }
    }
    fclose(filePointer); 
    printf("\nFile %s information: ", file); 
    printf("\n\nNumber of Characters: %d", characters); 
    printf("\nNumber of White Space Characters: %d", whiteSpaceCharacters); 
    printf("\nNumber of Lines: %d", lines);
    printf("\nNumber of Paragraphs: %d", paragraph); 
    printf("\nNumber of Periods: %d", periods);
    printf("\nNumber of Commas: %d", commas);
    printf("\nNumber of Exclamation Points: %d", exclamationPoints);
    printf("\nNumber of Colons: %d", colons); 
    printf("\nNumber of Hyphens: %d", hyphens);
    printf("\nNumber of Semi Colons: %d", semiColons); 
    printf("\nNumber of Quotation Marks: %d", quotationMarks);
    printf("\nNumber of Parenthesis: %d", parenthesis);
    printf("\nNumber of Square Braces: %d", squareBraces);
    printf("\nNumber of Square Brackets: %d", squareBrackets); 
    printf("\nNumber of Apostrophes: %d\n\n", apostropheMarks); 
    //printf("\nNumber of Words: %d\n\n", words); // shows the user the number of words inside the file from file.
    memset(file, 0, sizeof file);
}

/**
 * this integer main() function has the code needed for my program to run. 
 * @return int returns a 0 which means the program ran successfully.
 */

int main() {

    printf("\nEnter the file name: ");
    scanf("%s", fileName); 

    fileInformation(fileName);
    
    memset(fileName, 0, sizeof fileName); 

    return 0; 

}
