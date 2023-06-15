/**
 * Name: Rusho Binnabi
 * Date: 6/14/2023
 * Project: Quiz
 * Code File Updated: 6/14/2023 at 10:36 PM
 * Contact Information: RushoBinnabi123@yahoo.com
 */

import java.util.Scanner;

public class Quiz {

    // this Quiz class simulates a simple 10 question quiz about the MCU.

    private int score;
    String name;
    static String answer;

    /**
     * this public Quiz() constructor initializes the variables.
     * @param n the argument is the name of the person taking the quiz.
     */

    public Quiz(String n) {
        name = n;
        score = 0;
        answer = "";
    }

    /**
     * this public getName() method returns the value of name.
     * @return the value of name.
     */

    public String getName() {
        return name;
    }

    /**
     * this public void clearScreen() method clears the screen.
     */

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * this public int getScore() method returns the value of score.
     * @return the value of score.
     */

    public int getScore() {
        return score;
    }

    /**
     * this public void setScore() method adjusts the score based on how many correct answers the person taking the quiz got.
     * @param i the argument is the numbers of points for each question.
     */

    public void setScore(int i) {
        score = score += i;
    }

    /**
     * this public void resetValues() method resets the values of the variables.
     */

    public void resetValues() {
        name = "";
        score = 0;
        answer = "";
    }

    /**
     * this public void pause() method pauses the execution of the code by 2 seconds (2000 milliseconds).
     */

    public void pause() {
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * this public void question1() method shows the first question. 
     */

    public void question1() {
        System.out.println("Question 1: How many Infinity Stones are there?");
        System.out.println("");
        System.out.println("A: 6");
        System.out.println("B: 2");
        System.out.println("C: 1");
        System.out.println("D: 3");
    }

    /**
     * this public void question2() method shows the second question. 
     */

    public void question2() {
        System.out.println("Question 2: What year did Avengers Endgame come out?");
        System.out.println("");
        System.out.println("A: 2019");
        System.out.println("B: 2018");
        System.out.println("C: 2017");
        System.out.println("D: 2015");
    }

    /**
     * this public void question3() method shows the third question. 
     */
    
    public void question3() {
        System.out.println("Question 3: What's the name of Spider-Man's greatest nemesis?");
        System.out.println("");
        System.out.println("A: Doc Ock");
        System.out.println("B: Green Goblin");
        System.out.println("C: The Lizard");
        System.out.println("D: Electro");
    }

    /**
     * this public void question4() method shows the fourth question. 
     */

    public void question4() {
        System.out.println("Question 4: What is the worst comic book run of Spider-Man to date?");
        System.out.println("");
        System.out.println("A: One More Day");
        System.out.println("B: Amazing Spider-Man 2022");
        System.out.println("C: Superior Spider-Man");
        System.out.println("D: Civil War");
    }

    /**
     * this public void question5() method shows the fifth question. 
     */

    public void question5() {
        System.out.println("Question 5: What year did Captain America Civil War come out?");
        System.out.println("");
        System.out.println("A: 2016");
        System.out.println("B: 2017");
        System.out.println("C: 2015");
        System.out.println("D: 2012");
    }

    /**
     * this public void question6() method shows the sixth question. 
     */

    public void question6() {
        System.out.println("Question 6: What year did Avengers Infinity War come out?");
        System.out.println("");
        System.out.println("A: 2019");
        System.out.println("B: 2018");
        System.out.println("C: 2017");
        System.out.println("D: 2015");
    }

    /**
     * this public void question7() method shows the seventh question. 
     */

    public void question7() {
        System.out.println("Question 7: What was Iron Man's final suit designation in the MCU?");
        System.out.println("");
        System.out.println("A: Mark 2");
        System.out.println("B: Mark 85");
        System.out.println("C: Mark 42");
        System.out.println("D: Mark 3");
    }

    /**
     * this public void question8() method shows the eighth question. 
     */

    public void question8() {
        System.out.println("Question 8: Who tortured Rocket Raccoon in the MCU?");
        System.out.println("");
        System.out.println("A: The High Evolutionary");
        System.out.println("B: Ronan");
        System.out.println("C: Thanos");
        System.out.println("D: Yondu");
    }

    /**
     * this public void question9() method shows the ninth question. 
     */

    public void question9() {
        System.out.println("Question 9: Who came in to help Spider-Man in Spider-Man No Way Home?");
        System.out.println("");
        System.out.println("A: Iron Man");
        System.out.println("B: Doctor Strange");
        System.out.println("C: Tobey and Andrew");
        System.out.println("D: Captain America");
    }

    /**
     * this public void question10() method shows the tenth question. 
     */

    public void question10() {
        System.out.println("Question 10: What year did Spider-Man No Way Home come out?");
        System.out.println("");
        System.out.println("A: 2019");
        System.out.println("B: 2018");
        System.out.println("C: 2022");
        System.out.println("D: 2021");
    }

    /**
     * the main() method runs the code.
     * @param args the argument is the code being run.
     */

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Name: ");
        Quiz q = new Quiz(userInput.nextLine());
        System.out.println("");
        System.out.println("Welcome, " + q.getName() + ". The quiz will begin shortly.");
        q.pause();
        q.clearScreen();
        q.question1(); // start of question 1.
        System.out.println("");
        System.out.print("Answer: ");
        answer = userInput.nextLine();
        q.pause();
        q.clearScreen();
        if (answer.equals("A")) {
            q.setScore(10);
            System.out.print("You got " + q.getScore() + " points.");
        }
        else {
            q.setScore(0);
            System.out.print("You got " + q.getScore() + " points.");
        }
        q.pause();
        q.clearScreen(); // end of question 1.
        q.question2(); // start of question 2.
        System.out.println("");
        System.out.print("Answer: ");
        answer = userInput.nextLine();
        q.pause();
        q.clearScreen();
        if (answer.equals("A")) {
            q.setScore(10);
            System.out.print("You got " + q.getScore() + " points.");
        }
        else {
            q.setScore(0);
            System.out.print("You got " + q.getScore() + " points.");
        }
        q.pause();
        q.clearScreen(); // end of question 2.
        q.question3(); // start of question 3.
        System.out.println("");
        System.out.print("Answer: ");
        answer = userInput.nextLine();
        q.pause();
        q.clearScreen();
        if (answer.equals("B")) {
            q.setScore(10);
            System.out.print("You got " + q.getScore() + " points.");
        }
        else {
            q.setScore(0);
            System.out.print("You got " + q.getScore() + " points.");
        }
        q.pause();
        q.clearScreen(); // end of question 3.
        q.question4(); // start of question 4.
        System.out.println("");
        System.out.print("Answer: ");
        answer = userInput.nextLine();
        q.pause();
        q.clearScreen();
        if (answer.equals("A")) {
            q.setScore(10);
            System.out.print("You got " + q.getScore() + " points.");
        }
        else {
            q.setScore(0);
            System.out.print("You got " + q.getScore() + " points.");
        }
        q.pause();
        q.clearScreen(); // end of question 4.
        q.question5(); // start of question 5.
        System.out.println("");
        System.out.print("Answer: ");
        answer = userInput.nextLine();
        q.pause();
        q.clearScreen();
        if (answer.equals("A")) {
            q.setScore(10);
            System.out.print("You got " + q.getScore() + " points.");
        }
        else {
            q.setScore(0);
            System.out.print("You got " + q.getScore() + " points.");
        }
        q.pause();
        q.clearScreen(); // end of question 5.
        q.question6(); // start of question 6.
        System.out.println("");
        System.out.print("Answer: ");
        answer = userInput.nextLine();
        q.pause();
        q.clearScreen();
        if (answer.equals("B")) {
            q.setScore(10);
            System.out.print("You got " + q.getScore() + " points.");
        }
        else {
            q.setScore(0);
            System.out.print("You got " + q.getScore() + " points.");
        }
        q.pause();
        q.clearScreen(); // end of question 6.
        q.question7(); // start of question 7.
        System.out.println("");
        System.out.print("Answer: ");
        answer = userInput.nextLine();
        q.pause();
        q.clearScreen();
        if (answer.equals("B")) {
            q.setScore(10);
            System.out.print("You got " + q.getScore() + " points.");
        }
        else {
            q.setScore(0);
            System.out.print("You got " + q.getScore() + " points.");
        }
        q.pause();
        q.clearScreen(); // end of question 7.
        q.question8(); // start of question 8.
        System.out.println("");
        System.out.print("Answer: ");
        answer = userInput.nextLine();
        q.pause();
        q.clearScreen();
        if (answer.equals("A")) {
            q.setScore(10);
            System.out.print("You got " + q.getScore() + " points.");
        }
        else {
            q.setScore(0);
            System.out.print("You got " + q.getScore() + " points.");
        }
        q.pause();
        q.clearScreen(); // end of question 8.
        q.question9(); // start of question 9.
        System.out.println("");
        System.out.print("Answer: ");
        answer = userInput.nextLine();
        q.pause();
        q.clearScreen();
        if (answer.equals("C")) {
            q.setScore(10);
            System.out.print("You got " + q.getScore() + " points.");
        }
        else {
            q.setScore(0);
            System.out.print("You got " + q.getScore() + " points.");
        }
        q.pause();
        q.clearScreen(); // end of question 9.
        q.question10(); // start of question 10.
        System.out.println("");
        System.out.print("Answer: ");
        answer = userInput.nextLine();
        q.pause();
        q.clearScreen();
        if (answer.equals("D")) {
            q.setScore(10);
            System.out.print("You got " + q.getScore() + " points.");
        }
        else {
            q.setScore(0);
            System.out.print("You got " + q.getScore() + " points.");
        }
        q.pause();
        q.clearScreen(); // end of question 10.
        System.out.print("You got " + q.getScore() + " points in total.");
        q.pause();
        System.out.println("");
        System.out.print("Press any key to exit.");
        answer = userInput.nextLine();
        q.resetValues();
        userInput.close();
    }

}