import javax.swing.JOptionPane;
public class Assignment2JOptionPane {
    public static void main(String[] args){
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay rate: "));
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked: "));

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

        JOptionPane.showMessageDialog(null,"Hourly Pay Rate: " +
                rate + "\nHours Worked: " + hours + "\nGross Pay: Php" + grossPay
                + "\nWitholding Tax: Php" + witholdingTax + "\nNet Pay: Php" + netPay);
    }
}