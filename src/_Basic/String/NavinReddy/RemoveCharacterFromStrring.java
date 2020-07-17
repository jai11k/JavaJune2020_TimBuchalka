package _Basic.String.NavinReddy;

public class RemoveCharacterFromStrring
{
    public static void main(String[] args)
    {
        String me = "9586as5s4";
           me=removeCharacter(me);
        System.out.println(me);
    }



    public  static String removeCharacter(String me)
    {

        StringBuffer sb = new StringBuffer(me);
        for (int i = 0; i < sb.length(); i++)
        {
            if (sb.charAt(i) < 48 || sb.charAt(i) > 57)
            {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();

    }

}