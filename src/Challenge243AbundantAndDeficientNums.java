/**
 * Created by Andrew Budziszek on 12/3/15.
 *
 * Reddit Daily Programmer Challenge: #243
 *
 * Abundant and Deficient Numbers
 *
 * In number theory, a deficient or deficient number is a number n for which the sum of divisors sigma(n)<2n, or,
 * equivalently, the sum of proper divisors (or aliquot sum) s(n)<n.
 * The value 2n - sigma(n) (or n - s(n)) is called the number's deficiency.
 * In contrast, an abundant number or excessive number is a number for which the sum of its proper divisors is greater
 * than the number itself. As an example, consider the number 21. Its divisors are 1, 3, 7 and 21, and their sum is 32.
 * Because 32 is less than 2 x 21, the number 21 is deficient. Its deficiency is 2 x 21 - 32 = 10.
 * The integer 12 is the first abundant number. Its divisors are 1, 2, 3, 4, 6, and 12, and their sum is 28.
 * Because 28 is greater than 2 x 12, the number 12 is abundant. It's abundant by is 28 - 24 = 4.
 */

import java.util.*;

public class Challenge243AbundantAndDeficientNums {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int currentNum;
        SBUtil util = new SBUtil();

        util.printl("Reddit Daily Programmer: Challenge #243\nAbundant and Deficient Numbers\n-----------------------");
        while(true){
            util.printl("Enter a number(-1 to quit): ");
            currentNum = stdIn.nextInt();
            if(currentNum == -1)
                break;
            int divisorTot = 1;
            for(int i = 2; i <= currentNum; ++i){
                if(currentNum % i == 0)
                    divisorTot += i;
            }
            if(divisorTot < currentNum * 2){
                util.printl(currentNum + " is deficient.");
            }else if(divisorTot > currentNum * 2){
                util.printl(currentNum + " is abundant by " + (divisorTot - (currentNum*2)));
            }else{
                util.printl(currentNum + " is perfect.");
            }
        }
        util.printl("\nGoodbye!");
    }
}
