package _Challenges.TimBuchalka.VadiaChallenges;

public class BankAcct
{
    private int AcctNo;
    private double balance;;
    private String  coustmerName;
    private String Email;
    private int PhoneNo ;

public BankAcct ()
{
    System.out.println("Empty constructor called ");
}
    public BankAcct (int AcctNo,double balance,String coustmerName,String Email,int phoneNo)
    {
       this.AcctNo=AcctNo;
       this.balance=balance;
       this.coustmerName=coustmerName;
       this.Email=Email;
       this.PhoneNo=phoneNo;
        System.out.println("Constructor with parameters are called ");
    }
    public void deposit(double depositAmount)
    {
//        this.balance+=depositAmount;
//        this.AcctNo = AcctNo;
//        System.out.println("Account nO = " +this.AcctNo + ". Depsoit of "+depositAmount + " is made. New balance = " +this.balance );
        this.balance+=depositAmount;
        this.AcctNo= AcctNo;
        System.out.println("Account No = "+this.AcctNo + "Deposit of " +depositAmount +" is made . New balance = " +this.balance );
    }

    public void withdrwal(double withdrawalAmount)
    {
        if(this.balance-withdrawalAmount <= 0)
        {
            System.out.println("Only " +this.balance + " available. Withdrawal not available ");
        }
        else{
            this.balance -= withdrawalAmount;

            System.out.println(" Withdrawal of "+withdrawalAmount + " is made. New balance = " +this.balance);
        }
    }

    public int getAcctNo() {
        return AcctNo;
    }

    public void setAcctNo(int acctNo) {
        AcctNo = acctNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCoustmerName() {
        return coustmerName;
    }

    public void setCoustmerName(String coustmerName) {
        this.coustmerName = coustmerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }
}





