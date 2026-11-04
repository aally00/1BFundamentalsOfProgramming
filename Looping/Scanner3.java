import java.util.Scanner;
public class  Scanner3 {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 20000;

        System.out.println("Starting Balance:" + balance);

        System.out.print("Enter Amount(0 to stop):");
        double amount = sc.nextDouble();

        while (amount != 0) {

            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit Successful!");
            } else {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                    System.out.println("Withdrawal Successful!");
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }
            System.out.println("Outstanding Balance: " + balance);
            System.out.print("Enter Amount( 0 to stop):");
            amount = sc.nextDouble();
        }
            System.out.println("Final Balance: " + balance);
    }
}
