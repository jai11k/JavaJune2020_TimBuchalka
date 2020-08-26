package Debuuging;

public class Debugger
{
    public static void main(String[] args) {
        StringUtilies utils=new StringUtilies();
        StringBuilder sb=new StringBuilder();
        while(sb.length()<10)
        {
            utils.addChar(sb,'a');
        }
        System.out.println(sb);
        String str="abcdefg";
        String result=utils.upperAndPrefix(utils.addSuffix(str));
    }
}
