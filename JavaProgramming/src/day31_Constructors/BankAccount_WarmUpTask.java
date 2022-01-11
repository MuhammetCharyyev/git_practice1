package day31_Constructors;

public class BankAccount_WarmUpTask {

    //make attributes for 'BankAccount' object
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount_WarmUpTask{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance() {
        System.out.println("your available balance is: " +balance);
    }

    public void deposit(double amount){ // show if your deposit has been changed
        if(amount<=0){
            System.err.println("deposit amount cant be zero or negative");
            return; // if negative then exit from execution
        }
        balance+=amount;
    }

    public void withdraw(double amount){ // show your spending
        if(amount>balance){ // if your spent more than balance then you cannot spent
            System.err.println("Insufficient balance");
            return; // if waithdraw more than balance then exit from execution
        }
        if(amount<=0){
            System.err.println("withdrawing amount cant be zero or negative");
            return; // if negative or zero then exit from execution
        }
        balance-=amount;
    }


}
/*
BankAccount Task:
        Attributes:
                1. accountHolder, 2. accountNumber, 3. balance

        Actions:
            1. setInfo(): sets the accountHolder and accountNumber attributes
            2. toString()
                3. checkBalance():displays the available balance
                2. deposit(): increases the balance by the given amount
        3. withdraw(): decreases the balance by the given amount
 */