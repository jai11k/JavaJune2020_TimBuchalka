package _Challenges.TimBuchalka.BasicChallenges.ArrayList;

public class Contact

{
    private String name;
    private String phoneNUmber;

    public Contact(String name, String phoneNUmber)
    {
        this.name = name;
        this.phoneNUmber = phoneNUmber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }
    public static Contact createContact(String name,String phoneNUmber)
    {
        return new Contact(name,phoneNUmber);

    }
}

