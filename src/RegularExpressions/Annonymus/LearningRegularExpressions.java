package RegularExpressions.Annonymus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearningRegularExpressions
{
    public static void main(String[] args)
    {
        Pattern pattern=Pattern.compile("W3 Schools",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher("Visist W3 schools");
        Boolean matchFinder=matcher.find();
        if (matchFinder)
        {
            System.out.println("Match found");
        }else {
            System.out.println("Not found....");
        }

    }
}
