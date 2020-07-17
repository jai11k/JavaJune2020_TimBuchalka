package _Basic.ReferenceValueType;

import java.util.Arrays;

public class ReferenceValueType
{
    public static void main(String[] args)
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

        System.out.println("My int _Basic.Array  = " + Arrays.toString(myIntArray) );
        System.out.println("Another _Basic.Array  = " +Arrays.toString(AnotherArray));

        AnotherArray[0]= 1;


        System.out.println("My changing  _Basic.Array  = " + Arrays.toString(myIntArray) );
        System.out.println("Another _Basic.Array  = " +Arrays.toString(AnotherArray));

        modifyArray(myIntArray);
        System.out.println("My modify _Basic.Array  = " + Arrays.toString(myIntArray) );
        System.out.println("Another _Basic.Array  = " +Arrays.toString(myIntArray));

    }
    public static void modifyArray( int[] array )
    {
        array[0] = 5;

    }

}



