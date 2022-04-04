import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String res = String.format("Hello, " + name + " Lovely to see you");
        return res;
    }
    // public String guestGreeting(String name, String dayPeriod) {
    //     SimpleDateFormat dayTime = new SimpleDateFormat(k);
    //     Date date = dayTime;
    //     if (dayTime > 12) {
    //         dayPeriod = "morning"
    //     }; 
    //     else if (dayTime < 12 && dayTime < 18) 
    //     {
    //         dayPeriod = "afternoon"
    //     };
    //     else {
    //         dayPeriod = "evening"
    //     };
    //     String res = String.format("Good " + dayPeriod +"," + name + ". Lovely to see you");
    //     return res;
    // }
    public String dateAnnouncement() {
        Date date = new Date();
        
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certianly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right, And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

