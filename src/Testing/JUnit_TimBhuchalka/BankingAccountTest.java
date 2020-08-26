package Testing.JUnit_TimBhuchalka;


import static org.junit.jupiter.api.Assertions.*;

class BankingAccountTest {


    private BankingAccount account;
    private static int count;


    @org.junit.jupiter.api.BeforeAll
            public static void beforeClass()
    {
        System.out.println("This execute without any before case.Count = "+count++);
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp()
    {
        account=new BankingAccount("Ghai","G",1000,BankingAccount.CHECKING);
        System.out.println("Running a Test...");
    }

    @org.junit.jupiter.api.Test
    void deposit()
    {

       double balance= account.deposit(400,true);
       assertEquals(1400,balance,0);
    }

    @org.junit.jupiter.api.Test
    void withdrawal_branch() {
    double balance=account.withdrawal(600.00,true);
    assertEquals(400,balance,0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdrawal_notBranch () {

        account.withdrawal(400,true);
        assertEquals(600,account.getBalance());
    }
    @org.junit.jupiter.api.Test
    public void isChecking_True()
    {

        assertTrue(account.isChecking(),"The account is not the checking account");
    }

    @org.junit.jupiter.api.AfterAll
    public static void AfterClass()
    {
        System.out.println("This execute after any test case.Count= "+ count++);
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown()
    {
        System.out.println("Count= "+ count++);
    }
}


