package VMMAssignments.Ass2.IfElse;

import java.time.LocalDate;

public class DayOfWeek
{
    public static void main(String[] args)
    {
        LocalDate localDate=LocalDate.of(1996,07,06);

        java.time.DayOfWeek dayOfWeek=localDate.getDayOfWeek();


        System.out.println("Day on " + localDate + "was :"+dayOfWeek );

    }
}
