package Testing.JUnit_TimBhuchalka;

//region
/*
JUnit is a  Testing Framework used by developers to implement unit testing in Java,
and accelerate programming speed and increase the quality of code.

 */
//endregion

public class BankingAccount {
    private String firstName;
    private String lastName;
    private double balance;
    private int accountType;

    public static final int CHECKING=1;
    public static final int SAVING=2;

    public BankingAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType=typeOfAccount;
    }
     //The branch argument is true if the coustmer is performing the transaction
     //     in the branch with a teller.
     //    It is false if he is performing the transaction at the ATM.
      public double deposit(double amount,boolean branch)
    {
        balance+=amount;
        return balance;
    }
    //The branch argument is true if the coustmer is performing the transaction
//     in the branch with a teller.
//    It is false if he is performing the transaction at the ATM.


    public double withdrawal(double amount,boolean branch)
    {
        if ((amount>500.00)&& !branch)
        {
            throw new IllegalArgumentException();
        }
        balance-=amount;
        return balance;
    }

    public double getBalance() {

        return balance;
    }
    public boolean isChecking()
    {
        return accountType==CHECKING;

    }
}
