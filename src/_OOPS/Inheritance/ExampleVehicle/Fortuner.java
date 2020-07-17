package _OOPS.Inheritance.ExampleVehicle;

public class Fortuner extends Car
{
    private int services;

    public Fortuner(int services)
    {
        super("Fortuner",4*4,5 ,6,5,false);
        this.services = services;
    }

    public void accelerate(int rate )
    {
        int newVelocity= getCurrentvelocity() + rate;
        if (newVelocity==0)
        {
            stop();
        }else if(newVelocity>0 && newVelocity<= 10)
        {
            changeGear(1);
        }
    else if(newVelocity>10 && newVelocity<=30)
        {
            changeGear(2);
        }else if(newVelocity>30 && newVelocity<=50)
        {
            changeGear(3);
        }else if(newVelocity>50 && newVelocity<=70)
        {
            changeGear(4);
        }else if (newVelocity>70 && newVelocity<=90)
        {
            changeGear(5);
        }else if (newVelocity>90 && newVelocity<=150)
        {
            changeGear(6);
        }
}
}
