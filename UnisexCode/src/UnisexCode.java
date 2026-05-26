/**
 * Name: Rusho Binnabi
 * Date: 5/24/2026
 * Project: UnisexCode
 * Contact: RushoBinnabi123@yahoo.com
 */

import java.util.Scanner;

public class UnisexCode {

    // this UnisexCode class takes a word in plaintext and displays its equivalent value in Unicode
    // and hexadecimal, respectively.

    private String plainText;
    private String uniCodeText;
    private String hexCodeText;

    /**
     * this getPlainText() method gets the plain text that the user entered.
     * @return the user inputted plain text.
     */

    public String getPlainText() {
        return plainText;
    }

    /**
     * this getHexCodeText() method gets the hexcode.
     * @return the hexcode.
     */

    public String getHexCodeText() {
        return hexCodeText;
    }

    /**
     * this getUnicodeText() method gets the Unicode.
     * @return the unicode.
     */

    public String getUniCodeText() {
        return uniCodeText;
    }

    /**
     * this setPlainText() method sets the plain text that the user entered.
     * @param plainText the plain text that the user entered.
     */

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    /**
     * this setHexCodeText() method sets the hexcode.
     * @param hexCodeText the hexcode being set.
     */

    public void setHexCodeText(String hexCodeText) {
        this.hexCodeText = hexCodeText;
    }

    /**
     * this setUniCodeText() method sets the Unicode.
     * @param uniCodeText the Unicode being set.
     */

    public void setUniCodeText(String uniCodeText) {
        this.uniCodeText = uniCodeText;
    }

    /**
     * this UnisexCode() constructor initializes the objects and variables.
     */

    public UnisexCode() {
        setPlainText("");
        setHexCodeText("");
        setUniCodeText("");
    }

    /**
     * this getUnicodeFromPlaintext() method gets the Unicode value of the plain text
     * that the user entered.
     * @return the Unicode value of the plain text that the user entered.
     */

    public String getUnicodeFromPlaintext() {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < getPlainText().length(); i++) {
            word.append(getPlainText().codePointAt(i));
        }
        return word.toString();
    }

    /**
     * this setUnicode() method sets the Unicode from getting it from the plain text.
     */

    public void setUnicode() {
        setUniCodeText(getUnicodeFromPlaintext());
    }

    /**
     * this getUnicodeFromPlaintext() method gets the hexcode value of the Unicode
     * from the plain text that the user entered.
     * @return the hexcode value of the unicode.
     */

    public String getHexcodeFromUnicode() {
        String word = getPlainText();
        StringBuilder hexWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            hexWord.append(Integer.toHexString(i));
        }
        return hexWord.toString();
    }

    /**
     * this setHexcode() method sets the Hexcode from getting it from the Unicode.
     */

    public void setHexcode() {
        setHexCodeText(getHexcodeFromUnicode());
    }

    /**
     * this main() method runs the code.
     * @param args the code being run.
     */

    static void main(String[] args) {
        UnisexCode uc = new UnisexCode();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Word: ");
        uc.setPlainText(input.nextLine());
        input.close();
        System.out.println(" ");
        System.out.println("Plaintext: " + uc.getPlainText());
        uc.setUnicode();
        System.out.println("Unicode: " + uc.getUniCodeText());
        uc.setHexcode();
        System.out.println("Hexcode: " + uc.getHexCodeText());
    }

}
