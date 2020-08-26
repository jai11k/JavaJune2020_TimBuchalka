package Debuuging;

public class StringUtilies
{
    private StringBuilder sbuilder=new StringBuilder();
    private int charAdded=0;
    public void addChar(StringBuilder sbuilder,char c)
    {
          sbuilder.append(c);
        charAdded++;
    }

    public String upperAndPrefix(String str)
    {
        String upper= str.toUpperCase();
        return "Prefix_"+upper;
    }
    public String addSuffix(String str)
    {
      return str + "_Suffix";
    }
}

