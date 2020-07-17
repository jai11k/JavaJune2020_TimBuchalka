package _Basic.Array.BasicTonAgge;

import java.util.Arrays;

public class LearningArray2 {
    public static void main(String[] args)
    {
        Student [] arr = {new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur")};

        System.out.println("Unsorted");
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);

        Arrays.sort(arr, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}
