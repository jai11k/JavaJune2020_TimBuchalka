package VMMAssignments.Ass1.Decision_Making;

public class ReplaceDigits_0With5
{


    public static void main(String[] args)
    {
        //easy way
        System.out.println(convertFive(1020));

        System.out.println("\n");

       // System.out.print(replace0with5(1020));

    }


    //region another approach

//    static int replace0with5(int number)
//    {
//        return number += calculateAddedValue(number);
//    }
//
//    // returns the number to be added to the
//    // input to replace all zeroes with five
//    private static int calculateAddedValue(int number)
//    {
//
//        // amount to be added
//        int result = 0;
//
//        // unit decimal place
//        int decimalPlace = 1;
//
//        if (number == 0)
//        {
//            result += (5 * decimalPlace);
//        }
//
//        while (number > 0)
//        {
//            if (number % 10 == 0)
//                // a number divisible by 10, then
//                // this is a zero occurrence in the input
//                result += (5 * decimalPlace);
//
//            // move one decimal place
//            number /= 10;
//            decimalPlace *= 10;
//        }
//        return result;
//    }

    //endregion

  public static int convertFive(int n)
    {
        int count = 1,num=0,rem;
//        int res;
        while(n != 0) // checking whether number is not equals to zero
        {
     //       res=n/10; //breaking the last digit
            rem=n%10; // finding the last digit
            if(rem==0) //replacing it with 5
            {
                num=num+count*5; // building the new number
            }

            else
                num = num + rem*count; //if it is not 0, building the new number

            count = count*10; // increasing the place value for next digit.
            n=n/10;
        }
        System.out.println(num);
        return (num);

    }
}
