package Interfaces.TimBuchalka;

public class DeskPhone implements ITtelephone
{
    private int myNumber;
    private boolean isRinging;

    @Override
            public void powerOn()
    {
        System.out.println("No action taken, DeskPhone doesnt have a power button " );

    }

    @Override
    public void dial(int phoneNumber)
    {
        System.out.println("Now ringing " +phoneNumber +" on the DeskPhone");

    }

    @Override
    public void answer() {
        if (isRinging)
        {
            System.out.println("Phone is Ringing");

        }
        isRinging=false;

    }

    @Override
    public boolean callPhone(int PhoneNUmber) {
        if (PhoneNUmber== myNumber){
        isRinging=true;
            System.out.println("Ring Ring");
        }else
        {
            isRinging=false;

        }

        return isRinging;
    }

    @Override
    public boolean isRinging()
    {
        return isRinging;
    }
}
