import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter hourly pay rate: ");
        double rate = sc.nextInt();
        System.out.print("Enter hours worked: ");
        double hours = sc.nextInt();

        double grossPay = hours*rate;
        double taxRate;
        if (grossPay <= 2000){
            taxRate = 0.10;
        }else if(grossPay <= 4000){
            taxRate = 0.12;
        }else if (grossPay <= 10000){
            taxRate = 0.15;
        }else{
            taxRate = 0.20;
        }
        double witholdingTax = grossPay*taxRate;
        double netPay = grossPay-witholdingTax;

        System.out.println("Gross Pay: Php" + grossPay);
        System.out.println("Witholding Tax: Php" + witholdingTax);
        System.out.println("Net Pay: Php" + netPay);
    }
}
