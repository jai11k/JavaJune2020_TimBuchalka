package NamingConventionAndPackages.TimBhuchalka.Scope.Example2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Number");

        X x=new X(scanner.nextInt());
        scanner.nextLine();
        x.x();
    }
}
