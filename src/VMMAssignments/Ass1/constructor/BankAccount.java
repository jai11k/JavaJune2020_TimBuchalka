package VMMAssignments.Ass1.constructor;
//        Design a class to represent a bank account Include the following members:-
//        Data members. •  • Name of the depositor • Account number • Type of account  • Balance amount in the account
//        Methods
//        • To assign initial values
//        • To deposit an amount
//        • To withdraw an amount after checking balance
//        • Do write proper constructor function

public class BankAccount
{
    private String depositerName;
    private double AcctNumber;
    private String acctType;
    private double Balance;

    public BankAccount(String depositerName, int acctNumber, String acctType, int balance) {
        this.depositerName = depositerName;
        this.AcctNumber = acctNumber;
        this.acctType = acctType;
        this.Balance = balance;
    }
    public void amtDeposit(double amount)
    {
              this.Balance +=amount;
              this.AcctNumber=AcctNumber;
        System.out.println(amount+" is deposited in the account number "+AcctNumber+" Total balance = "+Balance);
    }
    public void withDrawal(double withdrawelAmount)
    {
        if (this.Balance-withdrawelAmount<=0)
        {
            System.out.println("Sufficient balance not available. Withdrawel cant be done");

        }else
            {
            this.Balance -= withdrawelAmount ;


            System.out.println("withdrwaal of " + withdrawelAmount +" is done ."+ " new Balance= "+this.Balance);
            }
    }
}
