package JavaCollections.HashSet.NavinReddy;

import java.util.HashSet;
import java.util.Set;

public class SetDemo

{
    public static void main(String[] args) {

        Set<Integer> demo=new HashSet<>();
         demo.add(5);
        demo.add(4);
        demo.add(9);
        demo.add(4);
         System.out.println("After adding elements --->" +demo);
        demo.remove(9);
 System.out.println("After removing ellements --" +demo);

    }
}

