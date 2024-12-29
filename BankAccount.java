import java.util.Scanner; 
//This imports the Scanner class from the java.util package, 
//allowing the program to read user input from the console.
public class BankAccount {
	//Defines the BankAccount class. This class encapsulates the balance 
	//and provides methods for deposit, withdrawal, and balance retrieval.
    private double balance; 
    //A private field balance stores the current balance of the account. 
    //Using private ensures that the balance can only be accessed or modified 
    //through the class's methods (encapsulation).

    // A constructor that initializes the account with a given starting balance. 
    //The "this" keyword refers to the instance's balance field.
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method adds a specified amount to the balance.
    // It validates that the deposit amount is positive. If not, an error message is displayed.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. \nCurrent balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    //Withdrawal method deducts a specified amount from the balance if there are sufficient funds.
    //If the amount exceeds the balance, an "Insufficient funds" message is displayed.
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. \nRemaining balance: " + balance);
        } else {
            System.out.println("Withdrawal Unsuccessful. \nInsufficient funds.");
        }
    }
    //Get balance method
    public double getBalance() {
        return balance;
    }
}
//Defines the MAIN CLASS, which contains the main method (the entry point of the program).
class Main {
    //MAIN METHOD is the program's entry point, where execution begins.
	public static void main(String[] args) {
		//Scanner Initialization 
		//Creates a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // BankAccount Initialization with a starting balance
        //Initializes a BankAccount OBJECT with a starting balance of 1000.0.
        //Welcomes the user and displays their current balance.
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Welcome to the bank account system!");
        System.out.println("Your current balance is: \n" + account.getBalance());
        //Exit flag to control the while loop. When exit is true, the program terminates.
        boolean exit = false;
        //Starts a while loop that continues until the user chooses to exit.
        while (!exit) {
        	//Displays the menu options.
        	//Prompts the user to enter their choice and reads it as an integer using scanner.nextInt().
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, 3): ");
            
            int choice = scanner.nextInt();
            //A switch case statement handles the user's choice.
            switch (choice) {
                case 1: // If the user chooses 1, prompts them to enter a withdrawal amount.
                	//Calls the withdraw method of the BankAccount class.
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 2: // If the user chooses 2, prompts them to enter a deposit amount.
                	//Calls the deposit method of the BankAccount class.
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3: // If the user chooses 3, displays a goodbye message and sets exit to true to terminate the loop.
                    System.out.println("Thank you for using the bank account system. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    //Handles invalid input by displaying an error message.
            }
        }

        scanner.close();//Closes the Scanner object to release system resources.
    }
}
