package Maps.NavinReddy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo
{
    public static void main(String[] args)
    {
        Map<Integer,String> bio=new HashMap<>();
        bio.put(01,"karan");
        bio.put(02,"jai");
        bio.put(03,"Ghai");

        System.out.println(bio.get(01));
        System.out.println("======================================================================");
        Set<Integer> name=bio.keySet();

        for (Integer names: name)
        {
            System.out.println(bio.get(names));

        }


    }
}

