import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Andrew Budziszek on 12/20/15.
 * Reddit Daily Programmer: Challenge #238
 * Fallout Hacking Game[INTERMEDIATE]
 * https://www.reddit.com/r/dailyprogrammer/comments/3qjnil/20151028_challenge_238_intermediate_fallout/
 */

public class Challenge238FalloutHackingGame {
    public static SBUtil util = new SBUtil("/Users/Andrew/IdeaProjects/RedditDailyProgrammerChallenges/src/Files/enable1.txt");
    private static ArrayList<String> Words = new ArrayList<>();
    private static String secretPhrase = "";
    private static String Board = "";
    private static int triesLeft = -1;

    public static void main(String[] args){

        while(true){
            int difficulty = util.promptInt("Enter Difficulty(1-5): ");
            setupGame(difficulty);
            playGame();
        }
    }

    private static void setupGame(int difficulty){
        Words = null;
        util = new SBUtil("/Users/Andrew/IdeaProjects/RedditDailyProgrammerChallenges/src/Files/enable1.txt");
        int lengthOfWords = -1;
        switch (difficulty){
            case 1:
                lengthOfWords = 4;
                break;
            case 2:
                lengthOfWords = 5;
                break;
            case 3:
                lengthOfWords = 6;
                break;
            case 4:
                lengthOfWords = 7;
                break;
            case 5:
                lengthOfWords = 9;
                break;
            default:
                lengthOfWords = 5;
                break;
        }
        try {
            String word = "";
            Words = new ArrayList<>();
            while ((word = util.br.readLine()) != null) {
                if(word.length() == lengthOfWords)
                    Words.add(word.toUpperCase());
            }
            Collections.shuffle(Words);
            Words = new ArrayList<>(Words.subList(0, 10));
            triesLeft = 4;
            secretPhrase = Words.get(new Random().nextInt(Words.size()));
            Board = makeBoard();
        }catch(Exception e){
            util.err("Error in setupGame()... \n" + e.toString());
        }
    }

    private static void playGame(){
        while(triesLeft != 0){
            util.printl(triesRemaining());
            util.printl(Board);
            String guess = util.promptString("> Enter guess: ").toUpperCase();
            util.printl("> " + guess);
            if(guess.equals(secretPhrase)){
                util.printl("> EXACT MATCH!\nAccess granted!");
                break;
            }
            int numCharsCorrect = 0;
            if(guess.length() == secretPhrase.length()) {
                for (int i = 0; i < secretPhrase.length(); ++i) {
                    if (secretPhrase.charAt(i) == guess.charAt(i))
                        numCharsCorrect++;
                }
            }
            util.printl("> ACCESS DENIED!");
            util.printl("> " + numCharsCorrect + "/" + secretPhrase.length() + " correct...");
            triesLeft--;
        }
        if(triesLeft == 0)
            util.printl("> The secret phrase was " + secretPhrase + "\n");
    }

    private static String makeBoard(){
        String board = "";
        int i = 0;
        while(!Words.isEmpty()){
            //First Column
            board += util.toHexString(i) + " " + formatColumns(Words.remove(0)) + " ";
            //Second Column
            board += " " + util.toHexString(i + 15) + " " + formatColumns(Words.remove(0)) + "\n";
            //Random Char Rows
            board += util.toHexString(i + 30) + " " + formatColumns("") + "  ";
            board += util.toHexString(i + 35) + " " + formatColumns("") + "\n";
            i++;
        }
        return board;
    }

    private static String triesRemaining(){
        String tries = String.format("%d ATTEMPT(S) REMAINING: ", triesLeft);
        for(int i = 0; i < triesLeft; ++i)
            tries += "# ";
        return tries + "\n";
    }

    public static String formatColumns(String board){
        String formatted = "";
        char[] miscChars = {'%', '[', '(', ')','/','@','^',']',';', '>', '<'};
        int firstChar = (15 - board.length())/2;
        for(int i = 0; i < firstChar; i++){
            formatted += miscChars[new Random().nextInt(miscChars.length)];
        }
        formatted += board;
        while(formatted.length() < 15){
            formatted += miscChars[new Random().nextInt(miscChars.length)];
        }

        return formatted;
    }
}
