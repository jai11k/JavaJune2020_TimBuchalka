package _Challenges.VMMAssignments.Ass2.IfElse;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculateAgeinYearsMonths
{
    public static void main(String[] args)
    {
        LocalDate pdate =LocalDate.of(1996,07,06) ;
        LocalDate now=LocalDate.now();


         long  years= ChronoUnit.YEARS.between(pdate,now);

        System.out.println("Agee is = " + years + "years");

        Period periodDiff =Period.between(pdate,now);

        System.out.println("Age in  years,Months and days  are : " +periodDiff.getYears() + " years , " + periodDiff.getMonths() +" monnths , " +periodDiff.getDays() + "days .") ;

    }
}
