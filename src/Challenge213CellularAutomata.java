import java.util.Scanner;
/**
 * Created by Andrew on 12/10/15.
 * Reddit Daily Programmer Challenge #213: Cellular Automata: Rule 90
 * https://www.reddit.com/r/dailyprogrammer/comments/3jz8tt/20150907_challenge_213_easy_cellular_automata/
 */
public class Challenge213CellularAutomata {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        SBUtil util = new SBUtil();

        while(true){
            util.printl("Enter a number(-1 to quit): ");
            String input = stdIn.nextLine();
            if(input.contains("-1")) {
                break;
            }
            for(int i = 0; i <= 1000; ++i){
                String converted = "";
                for(int q = 0; q < input.length(); ++q){
                    if(input.charAt(q) == '1')
                        converted += "x";
                    else
                        converted += " ";
                }
                util.printl(converted);
                String nextLine = "";
                for(int j = 0; j < input.length(); ++j){
                    String window;
                    if(j == 0){
                        window = "0" + input.substring(0,2);
                    } else if(j == input.length() - 1){
                        window = input.substring(j - 1) + "0";
                    } else {
                        window = input.substring(j - 1, j + 2);
                    }
                    if((window.charAt(0) == '1' && window.charAt(2) == '0') || (window.charAt(0) == '0' && window.charAt(2) == '1')){
                        nextLine = nextLine + "1";
                    } else {
                        nextLine = nextLine + "0";
                    }
                }
                input = nextLine;
            }
        }
    }
}
