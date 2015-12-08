import java.util.Scanner;

/**
 * Created by Andrew on 12/8/15.
 */
public class Challenge235EASYRuthAaronPairs {
    public static void main(String args[]){
        SBUtil util = new SBUtil();
        Scanner stdIn = new Scanner(System.in);

        while(true){
            util.printl("Enter a tuple(type 'quit' to quit): ");
            String s = stdIn.nextLine();
            if(s.contains("quit"))
                break;
            String temp = s.replace(")", "").replace("(", "").replace(" ", "");
            int n1 = Integer.parseInt(temp.split(",")[0]);
            int n2 = Integer.parseInt(temp.split(",")[1]);
            boolean valid = false;
            if(factorSum(n1) == factorSum(n2))
                valid = true;
            if(valid)
                util.printl(s + " VALID");
            else
                util.printl(s + " NOT VALID");
        }
        util.goodbye();
    }

    public static int factorSum(int n){
        int sum = 0;
        for(int i = 2; i <= n; ++i){
            if(n % i == 0){
                sum += i;
                while(n % i == 0)
                    n = n/i;
            }
        }
        return sum;
    }
}
