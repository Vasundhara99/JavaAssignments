package vasundhara.assignment5;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternCheck {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String sentence=scan.nextLine();
        String pattern="[A-Z].*\\.";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(sentence);
        while(m.find())
        {
            System.out.println(sentence.substring(m.start(),m.end()));
            if(m.end()==sentence.length()) {
                System.out.println("Valid Sentence");
                System.exit(0);
            }
        }
        System.out.println("Invalid Sentence");
    }
}