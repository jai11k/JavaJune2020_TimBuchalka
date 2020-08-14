package _Basic.StaticKeyword.NavinReddy;

class Employee
{
                int EmpID;
                int salary;
         static  String ceoName="Karanbir Singh";

    public Employee(int empID, int salary)
    {
        EmpID = empID;
        this.salary = salary;
    }

    public  void show()
    {
        System.out.println("Employe ID = " + EmpID + "; Salary = " +salary + "; CEO name = " +ceoName);
    }
}

public class NaveenReddyStaticNonStaticDiff
{


    public static void main(String[] args)
    {

        Employee karan = new Employee(001,26532);

            Employee Employe2=new Employee(002,95000);



        karan.show();

  Employe2.show();


    }
}


