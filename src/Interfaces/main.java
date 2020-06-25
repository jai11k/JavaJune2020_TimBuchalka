package Interfaces;

public class main
{
    public static void main(String[] args)
    {

        ITtelephone myphone =new DeskPhone(1226545);
        myphone.powerOn();
        myphone.dial(1226545);
        myphone.callPhone(1226545);

        myphone.isRinging();
    }
}

