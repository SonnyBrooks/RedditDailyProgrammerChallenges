import java.util.*;

/**
 * Created by Andrew on 12/5/15.
 *
 * Typoglycemia is a relatively new word given to a purported recent discovery about how people read written text.
 * As wikipedia puts it:
 * The legend, propagated by email and message boards, purportedly demonstrates that readers can understand the meaning
 * of words in a sentence even when the interior letters of each word are scrambled. As long as all the necessary letters
 * are present, and the first and last letters remain the same, readers appear to have little trouble reading the text.
 *
 * Or as Urban Dictionary puts it:
 * Typoglycemia
 * The mind's ability to decipher a mis-spelled word if the first and last letters of the word are correct.
 * The word Typoglycemia describes Teh mdin's atbiliy to dpeihecr a msi-selpeld wrod if the fsirt and lsat lteetrs
 * of the wrod are cerorct.
 */
public class Challenge240Typoglycemia {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        SBUtil util = new SBUtil();
        String sText;

        util.printl("Reddit Daily Programmer: Challenge #240\nTypoglycemia\n-----------------------");
        while(true){
            util.printl("Enter some text(-1 to quit): ");
            sText = stdIn.nextLine();
            if(sText.equals("-1")){
                break;
            }
            List<String> lsParsedText = Arrays.asList(sText.split(" "));
            List<String> lsFinalText = new ArrayList<String>();
            for(String s : lsParsedText){
                long seed = System.nanoTime();
                String sFirstLetter = Character.toString(s.charAt(0));
                String sLastLetter = Character.toString(s.charAt(s.length()-1));
                List<Character> lsCurrentWord = new ArrayList<Character>();
                for(char c : s.substring(1, s.length()-1).toCharArray()){
                    lsCurrentWord.add(c);
                }
                Collections.shuffle(lsCurrentWord, new Random(seed));
                s = sFirstLetter;
                for(char c : lsCurrentWord){
                    s += c;
                }
                s += sLastLetter;
                lsFinalText.add(s);
            }
            String sFinal = "";
            for(String s : lsFinalText){
                sFinal += s + " ";
            }
            util.printl(sFinal);
        }

        util.printl("Goodbye!");
    }
}
