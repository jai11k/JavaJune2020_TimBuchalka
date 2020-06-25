package Constructors;

public class VIPcoustmer
{
    private String name;
    private double creditLimit;
    private  String Email;


    public VIPcoustmer()
    {
        this("katam",2658990.12,"karan@gmail.com");
    }

    public VIPcoustmer(String name, double creditLimit)
    {
        this(name,creditLimit,"karan1@gmail.com");
    }

    public VIPcoustmer(String name, double creditLimit, String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        Email = email;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return Email;
    }
}
