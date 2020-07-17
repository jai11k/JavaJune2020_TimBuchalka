package _Challenges.VMMAssignments.Ass1.Decision_Making;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateCompoundInterest
{
    public static void main(String[] args)
    {



        Scanner scanner=new Scanner(System.in);
     double  principal;
     float time,rate;

        System.out.println("Please Enter principal : ");
        principal=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Please Enter time : ");
        time=scanner.nextFloat();
        scanner.nextLine();

        if(principal<2000 && time>=2)
        {
            rate=5 ;

        }else if(principal>=2000 && principal<6000 && time>=2 )
        {
            rate=7;

        }else if (principal>=6000 && time>=1 )
        {
            rate=8;

        }else if (time>=5)
        {
            rate=10;
        }else
        {
            rate=3;
        }
         double CompoundInterest;
        double Amount;

        Amount=principal  * Math.pow(1+(rate/100),time);
        CompoundInterest=Amount-principal;
        System.out.println("Compound Interest is :" +CompoundInterest );

        DecimalFormat df2 = new DecimalFormat("#.##");
        // DecimalFormat, default is RoundingMode.HALF_EVEN
        df2.setRoundingMode(RoundingMode.DOWN);
        System.out.println("\ndouble : " + df2.format(CompoundInterest));

    }
}
