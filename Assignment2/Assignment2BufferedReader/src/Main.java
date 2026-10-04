import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate: ");
        double rate = Double.parseDouble(br.readLine());

        System.out.print("Enter hours worked: ");
        double hours = Double.parseDouble(br.readLine());

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