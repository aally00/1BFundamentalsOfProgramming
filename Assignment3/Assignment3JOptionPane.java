import javax.swing.JOptionPane;
public class Assignment3JOptionPane {
    public static void main(String[] args){
        int nsatScore = Integer.parseInt(JOptionPane.showInputDialog("Enter NSAT Score: "));
        int parentsSalary = Integer.parseInt(JOptionPane.showInputDialog("Enter Parents' Salary: "));
        int examScore = Integer.parseInt(JOptionPane.showInputDialog("Enter Entrance Examination Score: "));

        double average = (nsatScore*examScore)/2;

        String status;
        if (parentsSalary >= 10000||nsatScore < 90||examScore < 85) {
            status = "Rejected";
        }else if (parentsSalary <= 3500 && average >= 91){
            status = "Accepted";
        }else{
            status = "For Further Study";
        }

        JOptionPane.showMessageDialog(null, status);
    }
}