import javax.swing.JOptionPane;
public class Main {
    public static void main (String[] args){

        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year:"));

        String result;

        if (year % 400 == 0){
            result = (year + " is a lepa year.");
        }else if (year % 100 == 0){
            result = (year + " is not a leap year.");
        }else if (year % 4 == 0){
            result = (year + " is a leap year.");
        }else{
            result = (year + " is not a leap year.");
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
