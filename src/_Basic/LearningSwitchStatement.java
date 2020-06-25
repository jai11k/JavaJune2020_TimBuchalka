package _Basic;

public class LearningSwitchStatement
{

    public static void main(String[] args) {
        int value = 12;
        switch (value)
        {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2 :
                System.out.println("Value is 2");
                break;
            case 3:case 4: case 5:
            System.out.println("Value is 3 or 4 or 5");
            System.out.println("Actual Value is = " +value);
            break;
            default:
                System.out.println("None of these Might be some wrong value feeded");
                break;
        }
        char charSwitch = 'C';
        switch (charSwitch)
        {
            case 'A' : case 'B': case'C': case 'D' : case 'E' :
            System.out.println("Any of A or B or C or D or E is found");
            System.out.println("Actual char found is = " +charSwitch);
            break;
            default:
                System.out.println("Any of the A or B or C or D or E is not Found");
                break;
        }
        String month= "January";
        switch (month.toLowerCase())
        {
            case "JANUARY" :
                System.out.println("January is the right answer");
                break;
            case "July" :
                System.out.println("June is the right answer");
                break;
            default:
                System.out.println(" Sorry !!! Some Error");
                break;
        }
    }

}
