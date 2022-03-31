/**
 * Name: Rusho Binnabi
 * Date: 03/28/2022
 * Project: WhiteSpaceCharactersStringFiles
 * Code File Updated: 03/30/2022 at 7:58 PM
 * Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
 */

import java.io.*; // imports the java input/output library for use in this program.
import java.util.*; // imports the java utility library for use in this program.

@SuppressWarnings("UnusedAssignment") // supresses a warning because there was nothing actually wrong with the program.

public class WhiteSpaceCharactersStringFiles {

    // this program will calculate the number of white space characters and characters from either a file or string text.

    /**
     * this WhiteSpaceCountFiles() method calculates the number of white space characters in a file.
     * @param s2 // the File parameter s2 is a file object that will have the file from where the number of white space characters will be calculated.
     * @return // returns the number of white space characters that were calculated from the file.
     * @throws FileNotFoundException // throws a FileNotFoundException exception because the file might not exist.
     */

    public int WhiteSpaceCountFiles(File s2) throws FileNotFoundException {
        Scanner input = new Scanner(s2); // creates a Scanner object called input that takes an argument which is s2 and scans the data from the file of the s2 file object argument,
        int counter = 0; // creates an integer variable called counter which is initialized to 0.
        String string1 = ""; // creates a string variable called string1 which is initialized to an empty string.
        while (input.hasNextLine()) { // the code in the while loop will run as long as input has a line of data to read.
            string1 = string1.concat(input.nextLine()); // string1 will have the concatenated string from the next line from input.
        } // the end of the while loop.
        input.close(); // using the close() method, it closes input.
        for (int i = 0; i < string1.length(); i++) { // the code in the for loop will run as long as the value of the integer variable i, that was created which was initialized to 0, is less than the length of the string, the value of i gets increased by 1.
            if (string1.charAt(i) == ' ') { // the code in the if statement will run if the character at, using the charAt() nethod of string1, index position i is equal to a white space character.
                counter++; // the value of counter gets increased by 1 each time.
            } // the end of the if statement.
        } // the end of the for loop.
        return counter; // returns counter which is the number of white space characters that were calculated from the file.
    } // the end of the WhiteSpaceCountFile() method.

    /**
     * this CharacterCountFiles() method calculates the number of characters in a file.
     * @param s1 // the file parameter s2 is a file object that will have the file from where the number of characters will be calculated.
     * @return // returns the number of characters that were calculated from the file.
     * @throws FileNotFoundException // throws a FileNotFoundException exception because the file might not exist.
     */

    public int CharacterCountFiles(File s1) throws FileNotFoundException {
        int counter = 0; // creates an integer variable called counter which is initialized to 0.
        String string2 = ""; // creates a string variable called string2 which is initialized to an empty string.
        Scanner input2 = new Scanner(s1); // creates a Scanner object called input2 takes an argument which is s1 and scans the data from the file of the s1 file object.
        while (input2.hasNextLine()) { // the code in the while loop will run as long as input2 has a line of data to read,
            string2 = string2.concat(input2.nextLine()); // string2 will have the concatenated string from the next line from input2.
        } // the end of the while loop.
        input2.close(); // using the close() method, it closes input2.
        for (int i = 0; i < string2.length(); i++) {  // the code in the for loop will run as long as the value of the integer variable i, that was created which was initialized to 0, is less than the length of the string, and each time, the value of i gets increased by one.
            if (string2.charAt(i) != ' ') { // the code in the if statement will run if the characters at, using the charAt() method of string2, index position i is not equal to a white space character.
                counter++; // the value of counter gets increased by one.
            } // the end of the if statement.
        } // the end of the for loop.
        return counter; // returns counter which is the number of characters that were calculated from the file.
    } // the end of the CharacterCountFile() method.

    /**
     * this CharacterCountString() method calculates the number of characters in a string.
     * @param s3 // the string parameter s3 is a string argument that will have the string from where the number of characters will be calculated.
     * @return // returns the number of characters in a string.
     */

    public int CharacterCountString(String s3) {
        int counter = 0; // creates an integer variable called counter which is initialized to 0.
        for (int i = 0; i < s3.length(); i++) { // the code in the for loop will run as long as the value of the integer variable i, that was created which was initialized to 0, is less than the length of the string, and each time, the value of i will be increased by one.
            if (s3.charAt(i) != ' ') { // the code in the if statement will run if the characters at, using the charAt() method of s3, index position i is not equal to a white space character.
                counter++; // the value of counter gets increased by one.
            } // the end of the if statement.
        } // the end of the for loop.
        return counter; // returns counter which is the number of characters that were calculated from the string.
    } // the end of the CharacterCountString() method.

    /**
     * this WhiteSpaceCountString() method calculates the number of white space characters in a string.
     * @param s4 // the string parameter s4 is a string argument that will have the string from where the number of white space characters will be calculated.
     * @return // returns the number of white space characters in a string.
     */

    public int WhiteSpaceCountString(String s4) {
        int counter = 0; // creates an integer variable called counter which is initialized to 0.
        for (int i = 0; i < s4.length(); i++) {  // the code in the for loop will run as long as the value of the integer variable i, that was created which was initialized to 0, is less than the length of the string, and each time, the value of i will be increased by one.
            if (s4.charAt(i) == ' ') { // the code in the if statement will run if the characters at, using the charAt() method of s4, index position i is equal to a white space character.
                counter++; // the value of counter gets increased by one.
            } // the end of the if statement.
        } // the end of the for loop.
        return counter; // returns counter which is the number of white space characters that were calculated from the string.
    } // the end of the WhiteSpaceCountString() method.

    /**
     * the main() method runs the code/program.
     * @param args // the code being run.
     * @throws FileNotFoundException // the program might throw a FileNotFoundException because the file might not exist.
     */

    public static void main(String[] args) throws FileNotFoundException {

        /**
         * this main() method will have the code that will be used to run the program. 
         */

        String string = ""; // creates a empty string variable called string that will have either the name of a file to be read or some string text depending on what the user wants.
        Scanner input = new Scanner(System.in); // creates a new Scanner object called input that will be used to get input from the user using the keyboard.
        WhiteSpaceCharactersStringFiles testClass = new WhiteSpaceCharactersStringFiles(); // creates a new WhiteSpaceCharactersStringFiles() class object called testClass.
        System.out.println(""); // creates some line spacing.
        System.out.print("Do you want to check the characters and white space characters of a file or some text (f/t): "); // prompts the user and asks them if they want to calculate the white space characters and charactcers from either a file or some string text.
        String choice = input.nextLine(); // creates a string variable called choice that stores the next line of input from the user using input and it's nextLine() method.
        if (choice.contains("f")) { // if choice contains a string value of a f, then the code in the if statement will be run.
            try { // the try block will try to run the code.
            System.out.println(""); // creates some line spacing.
            System.out.print("Enter the name of the file: "); // prompts the user to enter the name of the file.
            string = input.nextLine(); // string will have the next line from input using the nextLine() method.
            File file = new File(string);
            System.out.println(""); // creates some line spacing.
            System.out.println("There are " + testClass.CharacterCountFiles(file) + " characters from the file."); // shows how many characters there are from the file using the CharacterCountFiles() method from the testClass class object.
            System.out.println("There are " + testClass.WhiteSpaceCountFiles(file) + " white space characters from the file."); // shows how many white characters there are from the file using the WhiteSpaceCountFiles() method from the testClass class object.
            } // the end of the try block.
            catch (FileNotFoundException fn) { // if the file doesn't exist, it raises a FileNotFoundException. Then it runs the code inside the catch block.
                System.out.println("Error. The file does not exist."); // tells the user that the file doesn't exist.
            } // the end of the catch statement.
        } // the end of the if statement.
        else if (choice.contains("t")) { // or if the string value inside choice contains a t, the code inside the else if statements gets run.
            System.out.println(""); // creates some line spacing.
            System.out.print("Enter some text: "); // prompts the user to enter some text.
            string = string.concat(input.nextLine()); // string will have the concatenated string value of the next line from input.
            System.out.println(""); // creates some line spacing.
            System.out.println("There are " + testClass.WhiteSpaceCountString(string) + " white space characters from the text."); // shows how many white characters there are from the string text using the WhiteSpaceCountString() method from the testClass class object.
            System.out.println("There are " + testClass.CharacterCountString(string) + " characters from the text."); // shows how many characters there are from the string text using the CharacterCountString() method from the testClass class object.
            System.out.println(""); // creates some line spacing.
        } // the end of the if statement.
        input.close(); // using the close() method, it closes input.
    } // the end of the main() method.
} // the end of the class.