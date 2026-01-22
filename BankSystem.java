import java.util.Scanner;
import java.util.Random;
import java.io.Console;

public class BankSystem {

    static void userpin() {
        Random r = new Random();
        int generatedpin = r.nextInt(9000) + 1000; // 1000 to
        System.out.println("Your Generated Pin is: " + generatedpin);
        System.out.println("Enter your Pin to Login:");
        Scanner obj = new Scanner(System.in);
        int userpin = obj.nextInt();
        if (generatedpin == userpin) {

            System.out.println("Login Successful!");
            BankSystem.userAccount();
        } else {
            System.out.println("Invalid Pin! Access Denied.");
        }
    }

    static void userAccount() {
        System.out.println("Welcome to State Bank of India");
        String input = "";
        int choice = 0;
        int balance = 1000; // Initial balance
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("1.Login/Register your Account");
                System.out.println("2.Deposit Amount");
                System.out.println("3.Withdraw Amount");
                // System.out.println("4.Check Balance");
                System.out.println("4.Exit");
                System.out.println("----------------");
                input = sc.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("Invalid Input, Please enter a valid option.");
                    continue;

                }
                choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        System.out.println("1.Login/Register your Account");
                        Console con = System.console();
                        System.out.println("Enter Your Account Holder Name Or Enter to Get to Account Holder Name");
                        String Account_holdername = sc.nextLine();
                        if (Account_holdername.isEmpty()) {
                            System.out.println("Hii Sir/Madam Welcome To SBI");
                            System.out.println("Enter Your Name:");
                            String new_Accountholder_Name = sc.nextLine();
                            System.out.println("Account Holder Name:" + new_Accountholder_Name);
                        } else {
                            System.out.println("Account Holder Name :" + Account_holdername);
                        }
                        String username = con.readLine();
                        if (username.isEmpty()) {
                            System.out.println("You can not use State bank of India services");
                        } else {
                            System.out.println("Welcome to State Bank of India : " + username);
                        }
                        break;
                    case 2:
                        System.out.println("Enter the Amount to Deposit:");
                        int depositAmount = sc.nextInt();

                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.println("Successfully Deposited: " + depositAmount);
                        } else {
                            System.out.println("Deposit amount must be positive.");

                        }
                        System.out.println("Do you Want to Check Balance (y/n)");
                        char Opinion = sc.next().charAt(0);
                        if (Opinion == 'y') {
                            System.out.println("Your Balance is:" + balance);
                        }
                        break;

                    case 3:
                        System.out.println("How Much Amount do you want to Withdraw:");
                        double Withdraw_Amount = sc.nextDouble();
                        if (Withdraw_Amount > 0) {
                            balance -= Withdraw_Amount;
                            System.out.println("Your Withdraw Amount :" + Withdraw_Amount);
                        }
                        System.out.println("Do you Want to Check Balance (y/n)");
                        char Opinion1 = sc.next().charAt(0);
                        if (Opinion1 == 'y') {
                            System.out.println("Your Balance is:" + balance);

                        }
                        break;

                    case 4:
                        System.out.println("Thank you Visit Our Bank ");
                        System.out.println("Stay Tune and Stay Healthy");
                        break;

                    default:
                        System.out.println("Enter Valid Option");
                        break;
                }

            } while (choice != 5);

            // --------------------------------------------------------------------------------------//

        }

    }
}

class mainClass {
    public static void main(String[] args) {
        BankSystem bs = new BankSystem();
        bs.userpin();

    }
}
