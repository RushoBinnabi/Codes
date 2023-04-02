/**
 * Name: Rusho Binnabi
 * Date: 3/27/2023
 * Project: LeetSpeak
 * Code File Updated: 4/2/2023 at 5:52 PM
 * Contact Information: RushoBinnabi123@yahoo.com
 */

 // Reference: https://www.gamehouse.com/blog/leet-speak-cheat-sheet/

import java.util.Scanner;
import java.util.HashMap;

public class LeetSpeak {

    // this LeetSpeak class takes in a string of input from the user and converts it into leetspeak.

    /**
     * this leetSpeak() method will loop through the string of input and it checks every character in the string and replace that character into its leetspeak equivalent using a hashmap.
     * @param newString this argument is the string of input from the user that will be converted into leetspeak.
     */

    public static void leetSpeak(String newString) {
        String oldString = newString; // this oldString String variable will have the string of input before it gets converted into its leetspeak equivalent to show the difference between the two.
        newString = newString.toLowerCase();
        String output = ""; // this output String variable will have the leetspeak equivalent of newString.

        HashMap<Character, String> leets = new HashMap<>();
        leets.put('a', "@");
        leets.put('b', "|3");
        leets.put('c', "(");
        leets.put('d', "|)");
        leets.put('e', "£");
        leets.put('f', "ƒ");
        leets.put('g', "&");
        leets.put('h', "]-[");
        leets.put('i', "|");
        leets.put('j', "_]");
        leets.put('k', "|<");
        leets.put('l', "|_");
        leets.put('m', "^^");
        leets.put('n', "И");
        leets.put('o', "()");
        leets.put('p', "|>");
        leets.put('q', "()_");
        leets.put('r', "|2");
        leets.put('s', "$");
        leets.put('t', "-|-");
        leets.put('u', "|_|");
        leets.put('v', "|/");
        leets.put('w', "VV");
        leets.put('x', "><");
        leets.put('y', "Ч");
        leets.put('z', "7_");
        leets.put(' ', " "); // if the conversion has a space in it.


        for (char c : newString.toCharArray()) {
            output += leets.get(c);
        }

        System.out.println("");
        System.out.println("Old PlainText: " + oldString);
        System.out.println("New LeetText: " + output);
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