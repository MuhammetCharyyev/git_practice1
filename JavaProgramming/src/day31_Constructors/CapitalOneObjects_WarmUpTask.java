package day31_Constructors;

public class CapitalOneObjects_WarmUpTask {

    public static void main(String[] args) {

        BankAccount_WarmUpTask account1 = new BankAccount_WarmUpTask();
        account1.setInfo("Ahmet", 123456789);

        account1.deposit(1000); // how much we deposit on balance
        account1.checkBalance();
        account1.withdraw(1900); //how much we spent
        account1.checkBalance();

        System.out.println(account1);

        System.out.println("________________________________________________________");

        BankAccount_WarmUpTask account2 = new BankAccount_WarmUpTask();
        account1.setInfo("Aygun", 987654321);

        account2.deposit(10000);
        account2.checkBalance();

    }

}
