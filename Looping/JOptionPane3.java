import javax.swing.JOptionPane;
public class JOptionPane3 {
    public static void main(String[] args){

        double balance = 20000;

        JOptionPane.showMessageDialog(null,"Starting Balance:" + balance);
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount(0 to stop):"));

        while (amount != 0) {

            if (amount > 0) {
                balance += amount;
            } else {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                } else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                }
            }
            JOptionPane.showMessageDialog(null,"Outstanding Balance:" + balance);
            amount = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount(0 to stop):"));
        }
        JOptionPane.showMessageDialog(null,"Final Balance:" + balance);
    }
}
