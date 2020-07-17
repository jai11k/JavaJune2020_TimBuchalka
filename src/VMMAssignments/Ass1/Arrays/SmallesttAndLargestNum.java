package VMMAssignments.Ass1.Arrays;

public class SmallesttAndLargestNum
{
    public static void main(String[] args)
    {
        int a[]=new int[] {7, 9, 6, 10, 2, 1, 3, 5, 8, 4};
        int smallest=a[0];
        int largest=a[0];


        for (int i =0;i<a.length;i++)
        {
            if (a[i]>largest)
            {
                largest=a[i];
            }

          if (a[i] <smallest)
            {
                smallest=a[i];
            }

        }

        System.out.println("largest number :"+largest);
        System.out.println("Smallest number :"+smallest);
        }

}
