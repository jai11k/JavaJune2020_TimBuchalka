package ReferenceValueType;

import java.util.Arrays;

public class ReferenceValueType
{
    public ReferenceValueType()
    {
        int myintValue=10;
        int AnotherIntvalue=myintValue;
        System.out.println("My int value = " +myintValue );
        System.out.println("Another int value = " +AnotherIntvalue);

        AnotherIntvalue++ ;

        System.out.println("My int value = " +myintValue );
        System.out.println("Another int value = " +AnotherIntvalue);


        int[]  myIntArray = new int[5] ;
        int[] AnotherArray =  myIntArray;

        System.out.println("My int Array  = " + Arrays.toString(myIntArray) );
        System.out.println("Another Array  = " +Arrays.toString(AnotherArray));

        AnotherArray[0]= 1;


        System.out.println("My changing  Array  = " + Arrays.toString(myIntArray) );
        System.out.println("Another Array  = " +Arrays.toString(AnotherArray));

        modifyArray(myIntArray);
        System.out.println("My modify Array  = " + Arrays.toString(myIntArray) );
        System.out.println("Another Array  = " +Arrays.toString(myIntArray));
    }

    public static void modifyArray( int[] array )
    {
        array[0] = 5;

    }

}



