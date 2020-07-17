package Maps.TimBhucchalka;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapProgram
{
    public static void main(String[] args)
    {
        Map<String,String> languages=new HashMap<>();


//        if (languages.containsKey("Java"))
//        {
//            System.out.println("Java is already in the map...");
//
//
//        }else
//            languages.put("Java","Its all about Java...");
        System.out.println("Java Key added sucessfully...!");
        languages.put("Java","Java is platform independent,object oriented...");
        languages.put("Python","Phython is also object oriened language");
        languages.put("Java1","This code willl be overwritten..!!!!!!!");


       System.out.println(languages.get("Python"));


        System.out.println("===================================================================================");

        if (languages.containsKey("Java"))
        {
            System.out.println("Java is already in the map...");

        }else
            languages.put("Java","Its all about Java...");



        Set<String> name= languages.keySet();
        for (String names: name )
        {
            System.out.println(  languages.get(names));

        }
    }
}
