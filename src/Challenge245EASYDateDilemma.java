/**
 * Created by Andrew on 12/15/15.
 * https://www.reddit.com/r/dailyprogrammer/comments/3wshp7/20151214_challenge_245_easy_date_dilemma/
 *
 * Yesterday, Devon the developer made an awesome webform, which the sales team would use to record the results from
 * today's big new marketing campaign, but now he realised he forgot to add a validator to the "delivery_date" field!
 * He proceeds to open the generated spreadsheet but, as he expected, the dates are all but normalized... Some of them
 * use M D Y and others Y M D, and even arbitrary separators are used! Can you help him parse all the messy text into
 * properly ISO 8601 (YYYY-MM-DD) formatted dates before beer o'clock?
 * Assume only dates starting with 4 digits use Y M D, and others use M D Y.
 */
public class Challenge245EASYDateDilemma {
    public static SBUtil util = new SBUtil();

    public static void main(String[] args){
        while(true){
            try{
                promptForDate();
            }catch(Exception e){
                util.printl("Invalid input! Let's try again.");
            }
        }
    }

    public static void promptForDate() {
        String year = "";
        String month = "";
        String day = "";
        String[] formatContainer;

        String unformattedDate = util.promptString("Enter date(-1 to quit): ");

        if(unformattedDate.trim().equals("-1"))
            System.exit(0);
        unformattedDate = unformattedDate.replace("-", " ").replace("/", " ").trim();
        formatContainer = unformattedDate.split(" ");

        if (formatContainer[0].length() == 4) {
            year = formatContainer[0];
            month = formatContainer[1];
            day = formatContainer[2];
        } else {
            month = formatContainer[0];
            day = formatContainer[1];
            year = formatContainer[2];
        }
        if (year.length() == 2) {
            year = "20" + year;
        }
        if (day.length() == 1) {
            day = "0" + day;
        }
        if (month.length() == 1) {
            month = "0" + month;
        }
        util.printl(year + "-" + month + "-" + day);
    }
}
