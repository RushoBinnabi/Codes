/**
 * Name: Rusho Binnabi
 * Date: 3/27/2023
 * Project: LeetSpeak
 * Code File Updated: 3/27/2023 at 6:47 PM
 * Contact Information: RushoBinnabi123@yahoo.com
 */

 // Reference: https://www.gamehouse.com/blog/leet-speak-cheat-sheet/

import java.util.Scanner;

public class LeetSpeak {

    // this LeetSpeak class takes in a string of input from the user and converts it into leetspeak.

    /**
     * this leetSpeak() method will loop through the string of input and it checks every character in the string and replace that character into its leetspeak equivalent.
     * @param newString this argument is the string of input from the user that will be converted into leetspeak.
     */

    public static void leetSpeak(String newString) {
        String oldString = newString; // this oldString String variable will have the string of input before it gets converted into its leetspeak equivalent to show the difference between the two.
        for (int i = 0; i < newString.length(); i++) {
            switch (newString.charAt(i)) {
                case 'a':
                    newString = newString.replace(newString.charAt(i), '4');
                    break;
                case 'A':
                    newString = newString.replace(newString.charAt(i), '4');
                    break;
                case 'b':
                    newString = newString.replace(newString.charAt(i), '3');
                    break;    
                case 'B':
                    newString = newString.replace(newString.charAt(i), '3');
                    break;
                case 'c':
                    newString = newString.replace(newString.charAt(i), '[');
                    break;
                case 'C':
                    newString = newString.replace(newString.charAt(i), '[');
                    break; 
                case 'D':
                    newString = newString.replace(newString.charAt(i), ')');
                    break;
                case 'd':
                    newString = newString.replace(newString.charAt(i), ')');
                    break;      
                case 'e':
                    newString = newString.replace(newString.charAt(i), '&');
                    break; 
                case 'E':
                    newString = newString.replace(newString.charAt(i), '&');
                    break;        
                case 'f':
                    newString = newString.replace(newString.charAt(i), 'v');
                    break;    
                case 'F':
                    newString = newString.replace(newString.charAt(i), 'v');
                    break;    
                case 'G':
                    newString = newString.replace(newString.charAt(i), '6');
                    break;
                case 'g':
                    newString = newString.replace(newString.charAt(i), '6');
                    break; 
                case 'h':
                    newString = newString.replace(newString.charAt(i), '#');
                    break;
                case 'H':
                    newString = newString.replace(newString.charAt(i), '#');
                    break;               
                case 'i':
                    newString = newString.replace(newString.charAt(i), '1');
                    break;
                case 'I':
                    newString = newString.replace(newString.charAt(i), '1');
                    break;    
                case 'j':
                    newString = newString.replace(newString.charAt(i), ';');
                    break;
                case 'J':
                    newString = newString.replace(newString.charAt(i), ';');
                    break;        
                case 'K':
                    newString = newString.replace(newString.charAt(i), '<');
                    break; 
                case 'k':
                    newString = newString.replace(newString.charAt(i), '<');
                    break; 
                case 'L':
                    newString = newString.replace(newString.charAt(i), '7');
                    break;
                case 'l':
                    newString = newString.replace(newString.charAt(i), '7');
                    break; 
                case 'M':
                    newString = newString.replace(newString.charAt(i), '^');
                    break;
                case 'm':
                    newString = newString.replace(newString.charAt(i), '^');
                    break;  
                case 'n':
                    newString = newString.replace(newString.charAt(i), '^');
                    break;  
                case 'N':
                    newString = newString.replace(newString.charAt(i), '^');
                    break;
                case 'o':
                    newString = newString.replace(newString.charAt(i), '0');
                    break;                                    
                case 'O':
                    newString = newString.replace(newString.charAt(i), '0');
                    break;      
                case 'P':
                    newString = newString.replace(newString.charAt(i), '9');
                    break;      
                case 'p':
                    newString = newString.replace(newString.charAt(i), '9');
                    break;      
                case 'Q':
                    newString = newString.replace(newString.charAt(i), '2');
                    break;      
                case 'q':
                    newString = newString.replace(newString.charAt(i), '2');
                    break;      
                case 'R':
                    newString = newString.replace(newString.charAt(i), '2');
                    break;      
                case 'r':
                    newString = newString.replace(newString.charAt(i), '2');
                    break;      
                case 'S':
                    newString = newString.replace(newString.charAt(i), '5');
                    break;      
                case 's':
                    newString = newString.replace(newString.charAt(i), '5');
                    break;      
                case 'T':
                    newString = newString.replace(newString.charAt(i), '+');
                    break;      
                case 't':
                    newString = newString.replace(newString.charAt(i), '+');
                    break;      
                case 'u':
                    newString = newString.replace(newString.charAt(i), 'v');
                    break;      
                case 'U':
                    newString = newString.replace(newString.charAt(i), 'v');
                    break;      
                case 'v':
                    newString = newString.replace(newString.charAt(i), '^');
                    break;      
                case 'V':
                    newString = newString.replace(newString.charAt(i), '^');
                    break;      
                case 'W':
                    newString = newString.replace(newString.charAt(i), 'V');
                    break;      
                case 'w':
                    newString = newString.replace(newString.charAt(i), 'V');
                    break; 
                case 'X':
                    newString = newString.replace(newString.charAt(i), 'x');
                    break;           
                case 'x':
                    newString = newString.replace(newString.charAt(i), 'x');
                    break;      
                case 'y':
                    newString = newString.replace(newString.charAt(i), 'j');
                    break;      
                case 'Y':
                    newString = newString.replace(newString.charAt(i), 'j');
                    break;      
                case 'z':
                    newString = newString.replace(newString.charAt(i), '2');
                    break;      
                case 'Z':
                    newString = newString.replace(newString.charAt(i), '2');
                    break;      
            }
        }
        System.out.println("");
        System.out.println("Old PlainText: " + oldString);
        System.out.println("New LeetText: " + newString);
        System.out.println("");
    }


    /**
     * the main() method runs the code.
     * @param args the argument is the code being run.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter Text: ");
        String text = input.nextLine();
        leetSpeak(text);
        input.close();
    }

}