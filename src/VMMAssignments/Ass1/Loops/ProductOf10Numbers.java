package VMMAssignments.Ass1.Loops;

public class ProductOf10Numbers {

    public static void main(String[] args)
    {
        int x=10;
        int sum=1;

        for (int i = 1; i <=x; i++)
        {
            sum*=i;

        }
        System.out.print("Sum of First " + x + " Numbers is " +sum );

    }

}


