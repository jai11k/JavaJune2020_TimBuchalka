package VMMAssignments.Ass1.Decision_Making;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PrintThreeNumDecendingOrder
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int firstNum, secondNum,thirdNUm ;

        System.out.println("Please Enter 1st Number : ");
        firstNum=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please Enter 2nd Number : ");
        secondNum=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please Enter 3rd Number : ");
        thirdNUm=scanner.nextInt();
        scanner.nextLine();


        //int
        //integer

        //eh 2 kcuh diff chiza hegia

        Integer[] arrray=new Integer[3] ;
        arrray[0]=firstNum;
        arrray[1]=secondNum;
        arrray[2]=thirdNUm;

        Arrays.sort(arrray, Collections.reverseOrder());
        System.out.printf("Modified arr[] : %s", Arrays.toString(arrray));
//        System.out.println(arrray);
        System.out.println("Descendiing order=> "+ arrray[0]+","+arrray[1]+","+arrray[2]);


    }
}
