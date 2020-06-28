package VMMAssignments.Ass1.Loops;

public class TableUpto20
{
    public static void main(String[] args)
    {
        int  table,num=20;
        System.out.println("Table of 20 is : ");
        for (int i=1;i<=20;i++)
        {
            table = num * i;

            System.out.println(num + " * " + i + " = " + table);
        }
    }
}
