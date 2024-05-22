/**
 * Name: Rusho Binnabi
 * Date: 5/22/2024
 * Project: libraries - exit
 * Contact Information: RushoBinnabi123@yahoo.com
 */

 // this exit library file has the function for exiting programs.

public class Exit {

    /**
     * this exitProgram() method exits the program.
     */

    public void exitProgram() {
        try {
            System.exit(0);
        }
        catch (Exception e) {
            System.out.println("Error. The program couldn't be stopped.");
        }
    }

}