import java.util.Scanner;

/**
 * Created by Andrew on 12/7/15.
 *
 * Back in middle school, I had a peculiar way of dealing with super boring classes. I would take my handy pocket
 * calculator and play a "Game of Threes". Here's how you play it:
 * First, you mash in a random large number to start with. Then, repeatedly do the following:
 * If the number is divisible by 3, divide it by 3.
 * If it's not, either add 1 or subtract 1 (to make it divisible by 3), then divide it by 3.
 * The game stops when you reach "1".
 * While the game was originally a race against myself in order to hone quick math reflexes,
 * it also poses an opportunity for some interesting programming challenges.
 * Today, the challenge is to create a program that "plays" the Game of Threes.
 *
 * The input is a single number: the number at which the game starts.
 * Write a program that plays the Threes game, and outputs a valid sequence of steps you need to take to get to 1.
 * Each step should be output as the number you start at,
 * followed by either -1 or 1 (if you are adding/subtracting 1 before dividing), or 0 (if you are just dividing).
 * The last line should simply be 1.
 *
 */
public class Challenge239GameOfThrees {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        SBUtil util = new SBUtil();

        util.printl("----------------------------------------------------------\n" +
                    "|Reddit Daily Programmer Challenge #239: A Game of Threes|\n" +
                    "----------------------------------------------------------\n");

        while(true){
            util.printl("Enter a number(-1 to quit): ");
            int i = stdIn.nextInt();
            if(i < 0)
                break;

            //Play game with input
            while(i != 1) {
                int remainder = i % 3;
                if (remainder == 2) {
                    util.printl(i + " +1");
                    i += 1;
                } else if (remainder == 1) {
                    util.printl(i + " -1");
                    i -= 1;
                }else{
                    util.printl(i + " 0");
                }
                i = i/3;
            }

            util.printl(i);
        }

        util.goodbye();

    }
}
