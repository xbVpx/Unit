package org.example;


import org.example.accounts.Account;
import org.example.accounts.CheckingAccount;
import org.example.accounts.CreditAccount;
import org.example.accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount("Aleksandr", 10000, 50000);
        CheckingAccount account2 = new CheckingAccount("Vasiliy", 2000);
        CreditAccount account3 = new CreditAccount("Egor", -1500);
        System.out.println("\nДанные по накопительному счету:");
        print(account1);
        System.out.println("\nДанные по расчетному счету:");
        print(account2);
        System.out.println("\nДанные по кредитному счету:");
        print(account3);
    }

    public static void print(Account account) {
        System.out.println(account);

        System.out.print("Попытка пополнения счета на 1500000");
        System.out.println(account.add(1500000) ? " - ок" : " - неудача");

        System.out.print("Попытка оплаты 2500000");
        System.out.println(account.pay(2500000) ? " - ок" : " - неудача");

        System.out.print("Попытка оплаты 2000000");
        System.out.println(account.pay(2500000) ? " - ок" : " - неудача");
    }
}