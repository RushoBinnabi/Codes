/**
 * Name: Rusho Binnabi
 * Date: 6/10/2023
 * Project: Text to LeetSpeak Converter
 * Code File Updated: 6/10/2023 at 9:02 am
 * Contact Information: RushoBinnabi123@yahoo.com
 */

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class TextToLeetSpeakConverter {
    
    // this TextToLeetSpeakConverter converts text entered by the user to its LeetSpeak equivalent and vice versa.

    HashMap<Character, String> leets;
    File f;
    File n;
    String content;
    FileWriter write;

    /**
     * this TextToLeetSpeakConverter() constructor initializes all the objects, variables, and data structures. 
     */

    public TextToLeetSpeakConverter() {
        leets = new HashMap<>();
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
        content = "";
    }

    /**
     * this public void translate() method takes text from files and converts them into leetspeak and writes them into another file.
     * @param fileName the argument is the file name.
     */

    public void translate(String fileName) {
        f = new File(fileName);
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                content += scan.nextLine();
            }
            scan.close();
            content = content.toLowerCase(); // the text inside the content string variable is turned into lower case letters since the hash map uses lowercase.
            n = new File("LeetSpeak Conversion of " + fileName + " file " + ".txt");
            write = new FileWriter(n);
            for (char c : content.toCharArray()) {
                write.write(leets.get(c));
            }
            write.close();
            System.out.println("Conversion Completed!");
        } 
        catch (Exception e) {
            e.getMessage();
        }

    }

    /**
     * this main() method runs the code.
     * @param args the argument is the code being run.
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter File Name: ");
        String name = s.nextLine();
        s.close();
        TextToLeetSpeakConverter t = new TextToLeetSpeakConverter();
        t.translate(name);
    }

}
