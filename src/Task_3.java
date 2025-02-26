//ATM INTERFACE

import java.util.Scanner;

interface ATM {
    void Withdraw(double amount);
    void Deposit(double amount);
    void CheckBalance();
}

class Bank_Account implements ATM {
     double Balance =1000;

    public void Deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter a valid deposit amount.");
        } else {
            Balance += amount;
            System.out.println("Amount: " + amount + " deposited successfully!");
        }
    }

    public void Withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter a valid withdrawal amount.");
        } else if (amount > Balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            Balance -= amount;
            System.out.println("Amount: " + amount + " withdrawn successfully!");
        }
    }

    public void CheckBalance() {
        System.out.println("Current Account Balance: " + Balance);
    }
}

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank_Account account = new Bank_Account();

        for(int i=0;;i++) {
            System.out.println("ATM Menu");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();
            if(choice>4 || choice<1)
            {
                System.out.println("Invalid Input! Chose under 1 to 4 only");
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount you want to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.Deposit(depositAmount);
                    account.CheckBalance();
                    break;

                case 2:
                    System.out.print("Enter the amount you want to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.Withdraw(withdrawAmount);
                    account.CheckBalance();
                    break;

                case 3:
                    account.CheckBalance();
                    break;

                case 4 :break;
            }
            if(choice==4){
                System.out.println("Thank You! For Using Our ATM");
                break;
            }
        }
    }
}
