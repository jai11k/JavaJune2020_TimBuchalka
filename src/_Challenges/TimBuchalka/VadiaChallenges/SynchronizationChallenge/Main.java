package _Challenges.TimBuchalka.VadiaChallenges.SynchronizationChallenge;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        final BankAccount account = new BankAccount("12345-678", 1000.00);


        Thread trThread1 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
                System.out.println("Transaction completed for account " + account.getAccountNumber());
            }
        });

        Thread trThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
                System.out.println("Transaction completed for account " + account.getAccountNumber());
            }
        });

        trThread1.start();
        trThread2.start();
    }

    public static class BankAccount {

        private double balance;
        private String accountNumber;

        private Lock lock;

        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
            this.lock = new ReentrantLock();
         }



        public void deposit(double amount) {

            boolean status = false;

            try {
                if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        balance += amount;
                        status = true;
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Could not get the lock");
                }

            } catch(InterruptedException e) {

            }

            System.out.println("Transaction status = " + status);
        }

        public void withdraw(double amount) {

            boolean status = false;
            try {
                if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        balance -= amount;
                        status = true;
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Could not get the lock");
                }

            } catch(InterruptedException e) {

            }

            System.out.println("Transaction status = " + status);
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void printAccountNumber() {
            System.out.println("Account number = " + accountNumber);
        }
    }
}
