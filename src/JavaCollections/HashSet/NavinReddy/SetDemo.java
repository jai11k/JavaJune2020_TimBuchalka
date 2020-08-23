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

//region
/*
A HashSet is a collection of items where every item is unique.
The HashSet class has many useful methods. For example, to add items to it, use the add() method:
To remove an item, use the remove() method:
 */
//endregion
