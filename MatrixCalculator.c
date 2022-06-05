/**
 * @file MatrixCalculator.c
 * @author Rusho Binnabi
 * @date 2022-06-04
 * Code File Updated: 6/4/2022 at 11:24 PM
 * Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
 */

#include <stdio.h> // includes the stdio library for use in this program.
#include <stdbool.h> // includes the stdbool library for use in this program.
#include <stdlib.h> // includes the stdlib library for use in this program.
#include <string.h> // includes the string library for use in this program.

/**
 * this program will calculate the number of values that a new matrix will have after multiplying the values of the given 1st matrix row and the 2nd matrix column.
 */

int matrix1Column; // creates an integer variable called matrix1Column.
int matrix1Row; // creates an integer variable called matrix1Row.
int matrix2Column; // creates an integer variable called matrix2Column.
int matrix2Row; // creates an integer variable called matrix2Row.
int newMatrixValue; // creates an integer variable called newMatrixValue.

/**
 * this boolean checkMatrix() function checks to see if the two matrices can be multiplied, added, divided, subtracted with each other.
 * @param matrix1Column this parameter argument is for the value of the column of the 1st matrix.
 * @param matrix1Row this parameter argument is for the value of the row of the 1st matrix.
 * @param matrix2Column this parameter argument is for the value of the column of the 2nd matrix. 
 * @param matrix2Row this parameter argument is for the value of the row of the 2nd matrix.
 * @return true returns true if the values of the row of the 1st matrix and the column of the 2nd matrix are the same values.
 * @return false returns false if the values of the row of the 1st matrix and the column of the 2nd matrix are not the same values.
 */

bool checkMatrix(int matrix1Column, int matrix1Row, int matrix2Column, int matrix2Row) {
    if (matrix1Row == matrix2Column) { // if the values of matrix1Row and matrix2Column are the same, then the code inside the if statement gets run.
        return true; // returns true.
    } // the end of the if statement.
    else { // otherwise, it runs the code inside the else statement.
        return false; // returns false.
    } // the end of the else statement.
} // the end of the checkMatrix() function.

/**
 * this integer matrixCalculation() function calculates the value of the new matrix.
 * @param matrix1Column this parameter argument is for the value of the column of the 1st matrix.
 * @param matrix1Row this parameter argument is for the value of the row of the 1st matrix.
 * @param matrix2Column this parameter argument is for the value of the column of the 2nd matrix. 
 * @param matrix2Row this parameter argument is for the value of the row of the 2nd matrix.
 * @return int returns newMatrixValue which is the value of the new matrix.
 */

int matrixCalculation(int matrix1Column, int matrix1Row, int matrix2Column, int matrix2Row) {
    newMatrixValue = matrix1Row * matrix2Column; // newMatrixValue will have the multiplied values of matrix11Row and matrix2Column.
    return newMatrixValue; // returns newMatrixValue.
} // the end of the matrixCalculation() function.

/**
 * this void resetValues() function resets the values of the integer variables.
 * this function is also void because it doesn't return anything. 
 */

void resetValues() {
    matrix1Column = 0; // resets the value of matrix1Column to 0.
    matrix1Row = 0; // resets the value of matrix1Row to 0.
    matrix2Column = 0; // resets the value of matrix2Column to 0.
    matrix2Row = 0; // resets the value of matrix2Row to 0.
    newMatrixValue = 0; // resets the value of newMatrixValue to 0.
} // the end of the resetValues() function.

/**
 * this main() function has the code needed for my program to run.
 * @return int returns a 0 which means the program ran successfully.
 */

int main() {

    printf("\nEnter the number for the column of the 1st matrix: "); fflush(stdout); // prompts the user to enter the number for the column of the 1st matrix. Then it flushes the buffer by calling the fflush() function with stdout as it's argument.
    scanf("%d", &matrix1Column); // using the scanf() function, it stores the user input value for the value of the column of the 1st matrix into matrix1Column as a decimal number.
    printf("Enter the number for the row of the 1st matrix: "); fflush(stdout); // prompts the user to enter the number for the row of the 1st matrix. Then it flushes the buffer by calling the fflush() function with stdout as it's argument.
    scanf("%d", &matrix1Row); // using the scanf() function, it stores the user input value for the value of the row of the 1st matrix into matrix1Row as a decimal number.
    printf("Enter the  number for the column of the 2nd matrix: "); fflush(stdout); // prompts the user to enter the number for the column of the 2nd matrix. Then it flushes the buffer by calling the fflush() function with stdout as it's argument.
    scanf("%d", &matrix2Column); // using the scanf() function, it stores the user input value for the value of the column of the 2nd matrix into matrix1Column as a decimal number.
    printf("Enter the number for the row of the 2nd matrix: "); fflush(stdout); // prompts the user to enter the number for the row of the 2nd matrix. Then it flushes the buffer by calling the fflush() function with stdout as it's argument.
    scanf("%d", &matrix2Row); // using the scanf() function, it stores the user input value for the value of the row of the 2nd matrix into matrix2Row as a decimal number.

    if (checkMatrix(matrix1Column, matrix1Row, matrix2Column, matrix2Row)) { // if the value of the checkMatrix() function with matrix1Column, matrix1Row, matrix2Column, and matrix2Row as it's arguments is true, then it runs the code inside the if statement.
        printf("\n The new matrix value is %d\n\n", matrixCalculation(matrix1Column, matrix1Row, matrix2Column, matrix2Row)); fflush(stdout); // shows the number of values that the new matrix will have using the matrixCalculation() function with matrix1Column, matrix1Row, matrix2Column, and matrix2Row as it's arguments. Then it calls the flushes the buffer by calling the fflush() function with stdout as it's argument.
    } // the end of the if statement.
    else { // otherwise, the code inside the else statement gets run.
        printf("\nError. The numbers for the row of the 1st matrix and the column of the 2nd matrix do not match and so the new matrix value \ncannot be determined because those values are not the same value.\n\n"); // tells the user that the number of value that the new matrix will have couldn't be determined because the values of the row of the 1st and the column of the 2nd matrix are not the same. Then it flushes the buffer by calling the fflush() function with stdout as it's argument.
    } // the end of the else statement.
    resetValues(); // calls the resetValues() function.
    return 0; // returns a 0 which means the program ran successfully.
} // the end of the main() function.