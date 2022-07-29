/*
* Name: Rusho Binnabi
* Date: 7/27/2022
* Project: Journal System
* Code File Updated: 7/27/2022 at 6:02 PM
* Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101
*/

using System; // the System library gets used in this program.
using System.IO; // the System IO library gets used in this program.
using System.Threading; // the System Threading library gets used in this program.

namespace Journal { /* this Journal namespace contains all the methods, classes, etc needed for the program to run. */

    class JournalSystem { /* this JournalSystem class contains all the methods needed for this program to run. */

    // this program creates, deletes, reads, lists, etc journal entries based on what the user wants.

        public static string fileName; // a public static string variable called fileName gets created and will have the name of the journal entry file.
        public static int choice; // a public static integer variable called choice gets created and will have the integer number that signifies what function of the program that the user wants to use. 
        public static string content; // a public static string variable called content gets created and will have the contents of the journal entry files that will be read.
        public static string exitCondition; // a public static string variable called exitCondition gets created and will have the string value of y or n based on whether the user wants to use the program again or not.

        /*
        * this public static void resetValues() method resets all the values of the variables.
        * this method is void because it doesn't return anything.
        */

        public static void resetValues() {
            fileName = ""; // the value of fileName gets reset to an empty string.
            choice = 0; // the value of choice gets reset to 0.
            content = ""; // the value of content gets reset to an empty string.
            exitCondition = ""; // the value of exitCondition gets reset to an empty string.
        } // the end of the resetValues() method.

        /*
        * this public static void readJournalEntry() method reads a journal entry that the user wants to have read.
        * this method is void because it doesn't return anything.
        */

        public static void readJournalEntry() {
            Console.Write("Enter the name of the journal entry: "); // prompts the user to enter the name of the journal entry that they want to have read.
            fileName = Console.ReadLine(); // fileName gets the user input saved as a string using the Console.ReadLine() method.
            Console.WriteLine(""); // creates some line spacing.
            Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
            Console.WriteLine("Contents of " + fileName + ":"); // shows the user what journal entry file is being read using the name from fileName.
            Console.WriteLine(""); // creates some line spacing.
            content = File.ReadAllText(fileName); // content gets the text read from the file in fileName using the File.ReadAllText() method.
            Console.WriteLine(content); // shows the user what the contents of the journal entry file was from content.
            Console.WriteLine(""); // creates some line spacing.
            Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
            Console.WriteLine("Contents Read. Returning to Main Menu..."); // tells the user that the contents of the journal entry file has been read and the program is returning to the main menu.
            Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
            Console.Clear(); // clears the window by calling the Console.Clear() method.
        } // the end of the readJournalEntry() method.

        /*
        * the public static void exitSystem() method exits the program.
        * this method is void because it doesn't return anything.
        */

        public static void exitSystem() {
            resetValues(); // calls the resetValues() method so the memory for the variables used in this program gets cleared.
            System.Environment.Exit(0); // exits the program with a value of 0 which means the program exited successfully.
        } // the end of the exitSystem() method.
        
        /*
        * this public static void createJournalEntry() method creates/writes a journal entry file.
        * this method is void because it doesn't return anything.
        */

        public static void createJournalEntry() {
            Console.Write("Enter the name of the journal entry: "); // prompts the user to enter the name of the journal entry file.
            fileName = Console.ReadLine(); // fileName gets the user input saved as a string using the Console.ReadLine() method.
            Console.WriteLine(""); // creates some line spacing.
            Console.Write("Enter the contents of the journal entry: "); // prompts the user to enter what the journal entry file will be containing.
            content = Console.ReadLine(); // content gets the text read from the user input as a string using the Console.ReadLine() method.
            File.WriteAllText(fileName, content); // creates/writes the journal entry file using the name of the file that the user entered from fileName and what the user wants to have written from content using the File.WriteAllText() method.
            Console.WriteLine(""); // creates some line spacing.
            Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
            Console.WriteLine("Journal Entry created. Returning to Main Menu..."); // tells the user that the contents of the journal entry file has been written/created and the program is returning to the main menu.
            Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
            Console.Clear(); // clears the window by calling the Console.Clear() method.
        } // the end of the createJournalEntry() method.

        /*
        * this public static void listJournalEntry() method lists all the journal entry files and shows the path to where the main system program is saved.
        * this method is void because it doesn't return anything.
        */

        public static void listJournalEntry() {
            DirectoryInfo di = new DirectoryInfo(Directory.GetCurrentDirectory()); // creates a new DirectoryInfo object called di that gets the path of the current directory using the Directory.GetCurrentDirectory() method as the argument for the DirectoryInfo object.
            FileInfo[] files = di.GetFiles("*.txt"); // creates a new FileInfo array object called files that gets all the files that have the ".txt" file extension which are all the journal entry files using the GetFiles() method of the di object.
            Console.WriteLine(""); // creates some line spacing.
            Console.WriteLine("Here are the saved journal entries: "); // shows the user the listing of all the journal entry files that were saved.
            Console.WriteLine(""); // creates some line spacing.
            foreach (FileInfo file in files) { // the code in this for each loop will run as long there is a file to be listed in the FileInfo object called file with each file from files.
                Console.WriteLine(file.Name); // shows the user what the list of the names of what the saved journal entry files are using file.Name.
            } // the end of the for each loop.
            string path = "JournalSystem.exe"; // creates a string variable called path which is initialized to the name of the program's exe file name.
            FileInfo f = new FileInfo(path); // creates a new FileInfo object called f with path as it's argument.
            Console.WriteLine(""); // creates some line spacing.
            Console.WriteLine("And the main system is saved here: "); // shows the user where the main exe file of the program is saved.
            Console.WriteLine(""); // creates some line spacing.
            Console.WriteLine(f.FullName); // shows the user the path to where the main exe file of the program is saved using f.fullName.
            Console.WriteLine(""); // creates some line spacing.
            Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
            Console.WriteLine(""); // creates some line spacing.
            Console.WriteLine("Listing completed. Returning to Main Menu..."); // tells the user that the listing has been completed and the program is returning to the main menu.
            path = ""; // the value of path gets reset to an empty string.
            Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
            Console.Clear(); // clears the window by calling the Console.Clear() method.
        } // the end of the listJournalEntry() method.

        /*
        * this public static void deleteJournalEntry() file deletes a journal entry file that the user specifies.
        * this method is void because it doesn't return anything.
        */

        public static void deleteJournalEntry() {
            Console.Write("Enter the name of the journal entry: "); // prompts the user to enter the name of the journal entry file that they want to have deleted.
            fileName = Console.ReadLine(); // fileName gets the user input saved as a string using the Console.ReadLine() method.
            Console.WriteLine(""); // creates some line spacing.
            FileInfo fileInfo = new FileInfo(fileName); // creates a new FileInfo object called fileInfo with fileName as it's argument.
            File.Delete(fileInfo.FullName); // deletes the file specified inside the File.Delete() method argument fileInfo.FullName which has the file path from fileInfo.
            Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
            Console.WriteLine("Journal Entry deleted. Returning to Main Menu..."); // tells the user that the file has been deleted and that the program is returning to the main menu.
            Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
            Console.Clear(); // clears the window by calling the Console.Clear() method.
        } // the end of the deleteJournalEntry() file.

        /*
        * this static public void Main() method runs the code for the program.
        * this method is void because it doesn't return anything.
        */

        static public void Main(string[] args) {
            Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
            Console.Clear(); // clears the window by calling the Console.Clear() method.
            Console.WriteLine(""); // clears the window by calling the Console.Clear() method.
            Console.WriteLine("----- Welcome to the Journal System -----"); // shows the heading of the main menu of the program.
            Console.WriteLine(""); // clears the window by calling the Console.Clear() method.
            Console.WriteLine("Please choose from one of the following: "); // prompts the user to choose one of the following options from the list of options for the program.
            Console.WriteLine(""); // clears the window by calling the Console.Clear() method.
            Console.WriteLine("1: Create and Write Journal Entry"); // shows the user that option 1 creates and writes journal entries.
            Console.WriteLine("2: Read Journal Entry"); // shows the user that option 2 reads journal entries.
            Console.WriteLine("3: Exit System"); // shows the user that option 3 exits the system.
            Console.WriteLine("4: List Journal Entries and Folder"); // shows the user that option 4 lists the journal entries and where the program file is saved at.
            Console.WriteLine("5: Delete Journal Entry"); // shows the user that option 5 deletes journal entries.
            Console.WriteLine(""); // clears the window by calling the Console.Clear() method.
            Console.Write("Choice: "); // prompts the user to enter a number that corresponds to one of the 5 choices which are the 5 functions of the program.
            choice = int.Parse(Console.ReadLine()); // choice gets the user input saved as a integer number using the Console.ReadLine() method.
            while (choice != 3) { // the code inside the while loop runs as long as the value inside choice isn't a 3.
                if (choice == 1) { // the code inside the if statement gets run if the value of choice was a 1.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    Console.Clear(); // clears the window by calling the Console.Clear() method.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    createJournalEntry(); // calls the createJournalEntry() method.
                } // the end of the if statement.
                else if (choice == 2) { // the code inside the else if statement gets run if the value of choice was a 2.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    Console.Clear(); // clears the window by calling the Console.Clear() method.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    readJournalEntry(); // calls the readJournalEntry() method.
                } // the end of the else if statement.
                else if (choice == 3) { // the code inside the else if statement gets run if the value of choice was a 3.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    Console.Clear(); // clears the window by calling the Console.Clear() method.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    exitSystem(); // calls the exitSystem() method.
                } // the end of the else if statement.
                else if (choice == 4) { // the code inside the else if statement gets run if the value of choice was a 4.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    Console.Clear(); // clears the window by calling the Console.Clear() method.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    listJournalEntry(); // calls the listJournalEntry() method.
                } // the end of the else if statement.
                else if (choice == 5) { // the code inside the else if statement gets run if the value of choice was a 5.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    Console.Clear(); // clears the window by calling the Console.Clear() method.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    deleteJournalEntry(); // calls the deleteJournalEntry() method.
                } // the end of the else if statement.
                Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                Console.WriteLine(""); // clears the window by calling the Console.Clear() method.
                Console.Write("Do you want to use the Journal System again (y/n)? "); // prompts the user ot enter either a y or n based on whether they want to use the program again or not.
                exitCondition = Console.ReadLine(); // exitCondition gets the user input saved as a string using the Console.ReadLine() method.
                Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                Console.Clear(); // clears the window by calling the Console.Clear() method.
                if (exitCondition == "y") { // the code inside the if statement if the value of exitCondition was a y, which means the user wants to use the program again.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    Console.Clear(); // clears the window by calling the Console.Clear() method.
                    Console.WriteLine("----- Welcome to the Journal System -----"); // shows the heading of the main menu of the program.
                    Console.WriteLine(""); // clears the window by calling the Console.Clear() method.
                    Console.WriteLine("Please choose from one of the following: "); // prompts the user to choose one of the following options from the list of options for the program.
                    Console.WriteLine(""); // clears the window by calling the Console.Clear() method.
                    Console.WriteLine("1: Create and Write Journal Entry"); // shows the user that option 1 creates and writes journal entries.
                    Console.WriteLine("2: Read Journal Entry"); // shows the user that option 2 reads journal entries.
                    Console.WriteLine("3: Exit System"); // shows the user that option 3 exits the system.
                    Console.WriteLine("4: List Journal Entries and Folder"); // shows the user that option 4 lists the journal entries and where the program file is saved at.
                    Console.WriteLine("5: Delete Journal Entry"); // shows the user that option 5 deletes journal entries.
                    Console.WriteLine(""); // clears the window by calling the Console.Clear() method.
                    Console.Write("Choice: "); // prompts the user to enter a number that corresponds to one of the 5 choices which are the 5 functions of the program.
                    choice = int.Parse(Console.ReadLine()); // choice gets the user input saved as a integer number using the Console.ReadLine() method.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    Console.Clear(); // clears the window by calling the Console.Clear() method.
                } // the end of the if statement.
                else if (exitCondition == "n") { // the code inside the else if statement gets run if the value of exitCondition was a n, which means the yser doesn't want to use the program again.
                    Thread.Sleep(2000); // slows down the speed at which the program runs by 2000 milliseconds (2 seconds) so that it looks nice and neat and not too fast and so that the user can actually see and understand what is going on.
                    resetValues(); // calls the resetValues() method.
                    Console.Clear(); // clears the window by calling the Console.Clear() method.
                    exitSystem(); // calls the exitSystem() method.
                } // the end of the else if statement.
            } // the end of the while loop.
        } // the end of the Main() method.
    } // the end of the JournalSystem class.
} // the end of the Journal namespace.