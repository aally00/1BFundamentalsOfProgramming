import javax.swing.JOptionPane;
public class Assignment4JOptionPane {
    public static void main (String[] args){

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height in cm: "));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age: "));
        String citizenship = JOptionPane.showInputDialog("Enter Citizenship code (C/N)");
        String recommendee = JOptionPane.showInputDialog("Enter Citizenship code (R/N)");

        String status;

        if (height >= 200 && age >= 21 && age <= 25 && citizenship.equalsIgnoreCase
                ("C") || recommendee.equalsIgnoreCase("R")){
            status = "Accepted";
        }else{
            status = "Rejected";
        }
        JOptionPane.showMessageDialog(null, status);
    }
}