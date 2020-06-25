package StringNaveenReddy;

public class SplitingOfAnArray {
    public static void main(String[] args) {

        String name = "hani,MAni,chani";

        String newName[] = name.split(",");

        System.out.println(newName[2]);


        for (String value : newName) {
            System.out.println(value);
        }
    }
}