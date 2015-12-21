import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Andrew on 12/3/15.
 * Sonny Brooks Utilities
 */
public class SBUtil <T>{

    Scanner stdIn;
    FileReader fr;
    BufferedReader br;

    public SBUtil(){
        this("");
    }
    public SBUtil(String filePath){
        this.stdIn = new Scanner(System.in);
        if(!filePath.equals(""))
            fr = getFileReader(filePath);
        if(fr != null)
            br = new BufferedReader(fr);
    }

    public void printl(Object x){
        System.out.println(x.toString());
    }

    public void print(Object x){
        System.out.print(x.toString());
    }

    public void err(Object x){System.err.println(x);}

    public void goodbye(){this.printl("Goodbye!");}

    private String getString(){return stdIn.nextLine();}

    private int getInt(){return stdIn.nextInt();}

    private double getDouble(){return stdIn.nextDouble();}

    private FileReader getFileReader(String filePath){
        try {
            return new FileReader(filePath);
        }catch(IOException ioE){
            return null;
        }
    }

    public String promptString(String message){
        this.print(message);
        return this.getString();
    }

    public int promptInt(String message){
        this.print(message);
        return this.getInt();
    }
    public double promptDouble(String message) {
        this.print(message);
        return this.getDouble();
    }

    public ArrayList<T> copyArray(ArrayList<T> arr){
        ArrayList<T> copy = new ArrayList<>();
        for(T o : arr){
            copy.add(o);
        }
        return copy;
    }

    public static String toHexString(int n){
        String sNum = Integer.toHexString(3000 + (int)Math.pow(n, 3));
        while(sNum.length() < 4){
            sNum += "0";
        }
        return "0x" + sNum.toUpperCase();
    }

}
