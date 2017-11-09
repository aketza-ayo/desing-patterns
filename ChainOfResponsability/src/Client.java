import java.util.Scanner;

/**
 * This Client class is the where the main method is and the starting point of the application.
 * The idea of this demo is to show the use of the chain of responsability pattern through an example.
 *
 * Depending on the amount requested it will handled by one executive in the branch or another:
 * if amount is between 1 and 20000 it is handled by the Employee
 * if amount is between 20000 and 50000 it is handled by the Team Leader
 * if amount is between 20001 and 100000 it is handled by the Manager
 * Anything higher than 100000 is handled by the director
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££££££££");
        System.out.println("£££££££££££££££££££      BANK APP       £££££££££££££££££");
        System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££££££££");

        Scanner sc = new Scanner(System.in);
        int amount;
        Bank bank = new Bank();
        do{
            System.out.println("\nPlease enter the amount requested (Press 0 to exit):");
            amount = sc.nextInt();
            if(amount > 0){
                bank.requestLoan(amount);
            }
            System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££££££££");

        }while(amount != 0);

        System.out.println("Thanks for using the Bank App");

    }
}
