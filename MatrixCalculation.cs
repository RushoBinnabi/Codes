/*
* Name: Rusho Binnabi
* Date: 07/18/2022
* Project: Matrix Calculation
* Code File Updated: 07/18/2022 at 7:05 PM
* Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
*/

using System; // The system library gets used in this program.

namespace Matrix { /* creates a namepspace called Matrix and it has all the methods and classes that's needed for the program to run. */

    class MatrixCalculation { /* this class MatrixCalculation calculates matrix values based on what the user enters for the row and column values for two matrices. */
        
        public static int matrix1Column; // creates a public static int variable called matrix1Column.
        public static int matrix1Row; // creates a public static int variable called matrix1Row.
        public static int matrix2Column; // creates a public static int variable called matrix2Column.
        public static int matrix2Row; // creates a public static int variable called matrix2Row.
        public static int newMatrixValue; // creates a public static int variable called newMatrixValue.

        /**
        * this public static boolean method checkMatrix() checks to see if the value inside matrix1Row and matrix2Column are the same which means the two matrices can be multiplied together.
        * this method returns a true if the values inside matrix1Row and matrix2Column are the same and it returns a false if the values are not the same.
        */

        public static bool checkMatrix(int matrix1Column, int matrix1Row, int matrix2Column, int matrix2Row) {
            if (matrix1Row == matrix2Column) { // the code inside the if statement gets run if the values inside matrix1Row and matrix2Column are the same.
                return true; // returns true if the values are the same.
            } // the end of the if statement.
            else { // otherwise, the code inside the else statement gets run.
                return false; // returns false if the values are not the same.
            } // the end of the else statement.
        } // the end of the checkMatrix() method.

        /**
        * this public static int method matrixCalculation() calculates the value of the new matrix by multiplying together the values inside matrix1Row and matrix2Column and saves that value inside newMatrixValue.
        * this method returns an integer number stored inside newMatrixValue which is the value of the new matrix value.
        */

        public static int matrixCalculation(int matrix1Column, int matrix1Row, int matrix2Column, int matrix2Row) {
            newMatrixValue = matrix1Row * matrix2Column; // the value of newMatrixValue is the multiplied values of matrix1Row and matrix2Column.
            return newMatrixValue; // returns newMatrixValue.
        } // the end of the matrixCalculation() method.

        /*
        * this public static void method resetValues() resets all the values of the variables back to 0.
        * this method is void because it doesn't return anything.
        */

        public static void resetValues() {
            matrix1Column = 0; // resets matrix1Column to 0.
            matrix1Row = 0; // resets matrix1Row to 0.
            matrix2Column = 0; // resets matrix2Column to 0.
            matrix2Row = 0; // resets matrix2Row to 0.
            newMatrixValue = 0; // resets newMatrixValue to 0.
        } // the end of the resetValues() method.

        /*
        * this static public void Main(String args) method has all the code that's needed for the program to run.
        */

        static public void Main(String[] args) {
            Console.Write("Enter the number for the column of the 1st matrix: "); // prompts the user to enter a value for the column of the 1st matrix.
            matrix1Column = int.Parse(Console.ReadLine()); // matrix1Column gets the value from the user input as an integer.
            Console.Write("Enter the number for the row of the 1st matrix: "); // prompts the user to enter a value for the row of the 1st matrix.
            matrix1Row = int.Parse(Console.ReadLine()); // matrix1Row gets the value from the user input as an integer.
            Console.Write("Enter the number for the column of the 2nd Matrix: "); // prompts the user to enter a value for the column of the 2nd matrix.
            matrix2Column = int.Parse(Console.ReadLine()); // matrix2Column gets the value from the user input as an integer.
            Console.Write("Enter the number for the row of the 2nd Matrix: "); // prompts the user to enter a value for the row of the 2nd matrix.
            matrix2Row = int.Parse(Console.ReadLine()); // matrix2Row gets the value from the user input as an integer.
            Console.WriteLine(""); // creates some line spacing.

            if (checkMatrix(matrix1Column, matrix1Row, matrix2Column, matrix2Row)) { // the code inside the if statement gets run if the checkMatrix() method with matrix1Column, matrix1Row, matrix2Column, and matrix2Row as it's arguments returns a true.
                Console.WriteLine("The new matrix value is " + matrixCalculation(matrix1Column, matrix1Row, matrix2Column, matrix2Row)); // shows the user what the value of the new matrix is by calling the matrixCalculation() method and matrix1Column, matrix1Row, matrix2Column, and matrix2Row as it's arguments.
            } // the end of the if statement.
            else { // otherwise, the code inside the else statement gets run.
                Console.WriteLine("Error. The numbers for the row of the 1st matrix and the column of the 2nd matrix do not match \nand so the new matrix value cannot be determined because those values are not the same value."); // tells the user that the value of the new matrix value couldn't be determined because the value for the row of the 1st matrix and the value for the column of the 2nd matrix were not the same.
            } // the end of the else statement.
            resetValues(); // calls the resetValues() method.
            Console.WriteLine(""); // creates some line spacing.
            Console.ReadKey(); // calls the ReadKey() method using Console so that the program doesn't stop immediately after running.
        } // the end of the main() method.

    } // the end of the MatrixCalculation class. 

} // the end of the Matrix namespace. 