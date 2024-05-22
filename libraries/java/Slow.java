/**
 * Name: Rusho Binnabi
 * Date: 5/22/2024
 * Project: libraries - slow
 * Contact Information: RushoBinnabi123@yahoo.com
 */

 // this slow library file has the function for slowing down the execution of programs.

public class Slow {

    /**
     * this slowProgram() method slows down the execution of programs by 2 seconds. 
     */

    public void slowProgram() {
        try {
            Thread.sleep(2000);
        }
        catch (Exception e) {
            System.out.println("Error. The program couldn't be paused.");
        }
    }

}