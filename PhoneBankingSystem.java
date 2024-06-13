import java.util.Scanner;

public class PhoneBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountBalance = 12000;

        System.out.println("Welcome to the Phone Banking System");

        char option;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Inquire about account type");
            System.out.println("2. Inquire about bank's working hours");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.next().charAt(0);

            switch (option) {
                case '1':
                    System.out.print("Enter your account number: ");
                    int accountNumber = scanner.nextInt();
                    String accountType = (accountNumber % 2 != 0) ? "Checking" : "Savings";
                    System.out.println("Your account type is: " + accountType);
                    break;
                case '2':
                    System.out.print("Enter D for weekdays or E for weekends: ");
                    char dayOption = scanner.next().charAt(0);
                    if (dayOption == 'D') {
                        System.out.println("Bank working hours during weekdays are from 9 AM to 5 PM");
                    } else if (dayOption == 'E') {
                        System.out.println("Bank working hours during weekends are from 10 AM to 2 PM");
                    } else {
                        System.out.println("Invalid option!");
                    }
                    break;
                case '3':
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount > accountBalance) {
                        System.out.println("No available funds to perform the transaction.");
                    } else {
                        accountBalance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Available funds: $" + accountBalance);
                    }
                    break;
                case '4':
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    accountBalance += depositAmount;
                    System.out.println("Deposit successful. Available funds: $" + accountBalance);
                    break;
                case '0':
                    System.out.println("Thank you for using the Phone Banking System!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (option != '0');
    }
}
