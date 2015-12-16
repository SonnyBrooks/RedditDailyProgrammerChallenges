import java.util.Scanner;

/**
 * Created by Andrew on 12/3/15.
 * Sonny Brooks Utilities
 */
public class SBUtil {

    Scanner stdIn;

    public SBUtil(){
        this.stdIn = new Scanner(System.in);
    }

    public void printl(Object x){
        System.out.println(x.toString());
    }

    public void goodbye(){this.printl("Goodbye!");}

    private String getString(){return stdIn.nextLine();}

    private int getInt(){return stdIn.nextInt();}

    private double getDouble(){return stdIn.nextDouble();}

    public String promptString(String message){
        this.printl(message);
        return this.getString();
    }

    public int promptInt(String message){
        this.printl(message);
        return this.getInt();
    }
    public double promptDouble(String message){
        this.printl(message);
        return this.getDouble();
    }

}
