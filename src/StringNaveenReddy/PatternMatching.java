package StringNaveenReddy;

public class PatternMatching {
    public static void main(String[] args) {
        String text="Navin reddy";
        String pattern="redd";

        boolean result=text.contains(pattern);
        if (result)
        {
            System.out.println("Pattern Found");

        }
        else
            {
                System.out.println("Not FOund");
        }

    }
}
