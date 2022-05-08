/**
 * Name: Rusho Binnabi
 * Date: 5/7/2022
 * Code File Updated: 5/8/2022 at 7:51 PM
 * Project: Document Information
 * Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
 */

import java.util.*; // imports everything from the java util library for use in this program.
import java.io.*; // imports everything from the java io library for use in this program.

public class DocumentInformation {

    /**
     * this class contains the code that reads a file and shows the information from the file such as how many lines, paragraphs, white spaces, and characters there are.
     */

    int paragraphs; // creates an integer variable called paragraph.
    int characters; // creates an integer variable called characters.
    int whiteSpace; // creates an integer variable called whiteSpace.
    int lines; // creates an integer variable called lines.
    static String fileName; // creates a static string variable called fileName so it can be used anywhere.
    static String text; // creates a static string variable called text so it can be used anywhere.

    /**
     * this public DocumentInformation() constructor initializes the variables.
     */

    public DocumentInformation() {
        paragraphs = 0; // initializes paragraph to 0.
        characters = 0; // initializes characters to 0.
        whiteSpace = 0; // initializes whiteSpace to 0.
        lines = 0; // initializes lines to 0.
        fileName = ""; // initializes fileName to an empty string.
    }

    /**
     * this void method clearData() resets all the values of the variables to their initial values.
     * this method is void because it doesn't return anything.
     */
    
    public void clearData() {
        paragraphs = 0; // resets paragraphs to 0.
        characters = 0; // resets characters to 0.
        whiteSpace = 0; // resets whiteSpace to 0.
        lines = 0; // resets lines to 0.
        fileName = ""; // resets fileName to an empty string.
    }

    /**
     * this public int fileCharacters() method calculates and returns the number of characters in a file.
     * @param file // this argument is the file from the user that will be read.
     * @return // the number of characters in the file as an integer.
     * @throws FileNotFoundException // this method might throw a FileNotFoundException because the file might not exist or the user might have not created the file yet.
     */

    public int fileCharacters(File file) throws FileNotFoundException {
        try { // the try block will try to run my code.
            Scanner readFile = new Scanner(file); // creates a Scanner object called readFile which scans/reads the file from file.
            while (readFile.hasNext()) { // the code in the while loop will run as long as readFile has a next line to read.
                text = readFile.nextLine(); // text will have the data from the next line using readFile.
            } // the end of the while loop.
            readFile.close(); // using the close() method, it closes readFile.
        } // the end of the try block.
        catch (FileNotFoundException f) { // if something goes wrong with the code in the try block, like if the file doesn't exist or the user hasn't created the file,
                                            // then it catches a FileNotFoundException and runs the code inside the catch statement instead.
            System.out.println("Error. That file doesn't exist."); // tells the user that there is an error and that the file doesn't exist.
        } // the end of the catch block.
        for (int i = 0; i < text.length(); i++) { // creates a for loop that checks to see if the value of the integer variable i is less than the length of text and if it is, then it increases the value of i
                                                  // each time and runs the code inside the for loop.
            if (text.charAt(i) != ' ') { // if the character inside text at index position i is not equal to a white space characters, as in an actual character, then the code inside the if statement gets run.
                characters++; // the value of characters gets increased by 1.
                if (text.charAt(i) == '0') { // if the character inside text at index position i is equal to 0, as in it doesn't count 0's since that's the terminating value to end the program afterwards, then
                                             // it runs the code inside the if statement.
                    characters--; // the value of characters gets decreased by 1.
                } // the end of the if statement.
                else if (text.charAt(i) == '.') { // or if the character inside text at index position i is equal to ., as in it doesn't count periods, then the code inside the if statement gets run.
                    characters--; // the value of characters gets decreased by 1.
                } // the end of the else if statement.
            } // the end of the if statement.
        } // the end of the for loop.
        return characters; // returns characters.
    } // the end of the fileCharacters() method.

    /**
     * this public int fileWhiteSpaceCharacters() calculates and returns the number of white space characters in a file.
     * @param file // this argument is the file from the user that will be read.
     * @return the number of white space characters in the file as an integer.
     * @throws FileNotFoundException // this method might throw a FileNotFoundException because the file might not exist or the user might have not created the file yet.
     */

    public int fileWhiteSpaceCharacters(File file) throws FileNotFoundException {
        try { // the try block will try to run my code.
            Scanner readFile = new Scanner(file); // creates a Scanner object called readFile which scans/reads the file from file.
            while (readFile.hasNext()) { // the code in the while loop will run as long as readFile has a next line to read.
                text = readFile.nextLine(); // text will have the data from the next line using readFile.
            } // the end of the while loop.
            readFile.close(); // using the close() method, it closes readFile.
        } // the end of the try block. 
        catch (FileNotFoundException f) { // if something goes wrong with the code in the try block, like if the file doesn't exist or the user hasn't created the file,
                                            // then it catches a FileNotFoundException and runs the code inside the catch statement instead.
            System.out.println("Error. That file doesn't exist."); // tells the user that there is an error and that the file doesn't exist.
            System.exit(1); // exits the program because there was an error in the program.
        } // the end of the catch block.
        for (int i = 0; i < text.length(); i++) { // creates a for loop that checks to see if the value of the integer variable i is less than the length of text and if it is, then it increases the value of i
                                                  // each time and runs the code inside the for loop.
            if (text.charAt(i) == ' ') { // if the character inside text at index position i is equal to a white space character, then the code inside the if statement gets run.
                whiteSpace++; // the value of whiteSpace gets increased by 1.
                if (text.charAt(i) == '0') { // if the character inside text at index position i is equal to 0, as in it doesn't count 0's since that's the terminating value to end the program afterwards, then
                                             // it runs the code inside the if statement.
                    whiteSpace--; // the value of whiteSpace gets decreased by 1.
                } // the end of the if statement.
                else if (text.charAt(i) == '.') { // or if the character inside text at index position i is equal to ., as in it doesn't count periods, then the code inside the if statement gets run.
                    whiteSpace--; // the value of whiteSpace gets decreased by 1.
                } // the end of the else if statement.
            } // the end of the if statement.
        }
        return whiteSpace; // whiteSpace gets returned.
    } // the end of the fileWhiteSpaceCharacters() method.

    /**
     * this public int fileLines() calculates and returns the number of lines in a file.
     * @param file // this argument is the file from the user that will be read.
     * @return the number of lines in the file as an integer.
     * @throws FileNotFoundException // this method might throw a FileNotFoundException because the file might not exist or the user might have not created the file yet.
     */

    public int fileLines(File file) {
        try { // the try block will try to run my code.
            Scanner readFile = new Scanner(file); // creates a Scanner object called readFile which scans/reads the file from file.
            while (readFile.hasNext()) { // the code in the while loop will run as long as readFile has a next line to read.
            text = readFile.nextLine(); // text will have the data from the next line using readFile.
            for (int i = 0; i < text.length(); i++) { // creates a for loop that checks to see if the value of the integer variable i is less than the length of text and if it is, then it increases the value of i
                                                      // each time and runs the code inside the for loop.
                if (text.charAt(i) == '.') { // if the character inside text at index position i is equal to a period, then the code inside the if statement gets run.
                    lines++; // the value of lines gets increased by 1.
                } // the end of the if statement.
            } // the end of the for loop.
        } // the end of the while loop.
        readFile.close(); // using the close() method, it closes readFile. 
        } // the end of the try block.
        catch (FileNotFoundException f) { // if something goes wrong with the code in the try block, like if the file doesn't exist or the user hasn't created the file,
                                          // then it catches a FileNotFoundException and runs the code inside the catch statement instead.
            System.out.println("\nError. That file doesn't exist."); // tells the user that there is an error and that the file doesn't exist.
            System.exit(1); // exits the program because there was an error in the program.
        } // the end of the catch block.
        return lines; // returns lines.
    } // the end of the fileLines() method.

    /**
     * this public int fileLines() calculates and returns the number of paragraphs in a file.
     * @param file // this argument is the file from the user that will be read.
     * @return // the number of paragraphs in the file as an integer.
     * @throws FileNotFoundException // this method might throw a FileNotFoundException because the file might not exist or the user might have not created the file yet.
     */

    public int fileParagraphs(File file) { // this method has a bug where it doesn't count and return the right number of paragraphs.
        try { // the try block will try to run my code.
            Scanner readFile = new Scanner(file); // creates a Scanner object called readFile which scans/reads the file from file.
            while (readFile.hasNext()) { // the code in the while loop will run as long as readFile has a next line to read.
                text = readFile.nextLine(); // text will have the data from the next line using readFile.
            } // the end of the while loop.
            for (int i = 0; i < text.length(); i++) { // creates a for loop that checks to see if the value of the integer variable i is less than the length of text and if it is, then it increases the value of i
                                                       // each time and runs the code inside the for loop.
                if (text.charAt(i) == '.') { // if the character inside text at index position i is equal to a period, then the code inside the if statement gets run.
                    lines++; // the value of lines gets increased by 1.
                } // the end of the if statement.
            } // the end of the for loop.
            for (int i = 0; i <= lines; i++) { // the code in the for loop that checks to see if the value of the integer variable i is less than or equal to lines and if it is, then it increases the value of i by 1 each time
                                               // and runs the code inside the for loop.
                if (i >= 5) { // if the value of i is less than or equal to 5, then the code inside the if statement gets run.
                    paragraphs++; // the value of paragraphs gets increased by 1.
                } // the end of the if statement.
            } // the end of the for loop.
            readFile.close(); // using the close() method, it closes readFile. 
        } // the end of the try block. 
        catch (FileNotFoundException f) { // if something goes wrong with the code in the try block, like if the file doesn't exist or the user hasn't created the file,
                                          // then it catches a FileNotFoundException and runs the code inside the catch statement instead.
            System.out.println("\nError. That file doesn't exist."); // tells the user that there is an error and that the file doesn't exist.
            System.exit(1); // exits the program because there was an error in the program.
        } // the end of the catch block.
        return paragraphs; // returns paragraphs.
    } // the end of the fileParagraphs() method.

    /**
     * the main() method has the code that's needed for my program to run.
     * @param args the argument is the code being run.
     * @throws FileNotFoundException // this method might throw a FileNotFoundException because the file might not exist or the user might have not created the file yet.
     */

    public static void main(String[] args) throws FileNotFoundException {
        DocumentInformation document = new DocumentInformation(); // creates a DocumentInformation object called document.

        Scanner input = new Scanner(System.in); // creates a Scanner object called readFile which reads the input from the user.
        do { // the code in the do block will run as long as the condition in it's while loop isn't met.
            System.out.print("\nEnter the name of the file to calculate the information or 0 to quit: "); // prompts the user to enter the name of the file or 0 to exit the program.
            fileName = input.nextLine(); // fileName will have the have the input from the user inside input using the nextLine() method.
            if (fileName.contains("0")) { // if fileName has a 0 in it, which means the user wants to stop using the program, then the code inside the if statement will be run.
                System.exit(0); // exits the program.
            } // the end of the if statement.
            try { // the try block will try to run my code.
                File file = new File(fileName); // creates a file object called file from the given file name in fileName.
                System.out.println("\nFile " + file.getName() + " Information: "); // shows the information that was gotten from the file as well as the name of the file.
                System.out.println("\nLines: " + document.fileLines(file)); // shows the number of lines that was calculated from the file.
                System.out.println("Characters: " + document.fileCharacters(file)); // shows the number of characters that was calculated from the file.
                System.out.println("Paragraphs: " + document.fileParagraphs(file)); // shows the number of paragraphs that was calculated from the file.
                System.out.println("White Space Characters: " + document.fileWhiteSpaceCharacters(file)); // shows the number of white space characters that was calculated from the file.
                document.clearData(); // using document, it calls the clearData() method.
            } // the end of the try block. 
            catch (FileNotFoundException f) { // if something goes wrong with the code in the try block, like if the file doesn't exist or the user hasn't created the file,
                                                // then it catches a FileNotFoundException and runs the code inside the catch statement instead.
                System.out.println("Error. The file doesn't exist."); // tells the user that there is an error and that the file doesn't exist.
                System.exit(1); // exits the program because there was an error in the program.
            } // the end of the catch block.
            } while (!fileName.contains("0")); // the code in the do block will run as long as fileName doesn't contain a 0.
            input.close(); // using the close() method, it closes input.
    } // the end of the main() method.
} // the end of the DocumentInformation class.