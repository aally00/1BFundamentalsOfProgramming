import   javax.swing.JOptionPane;
public class JOptionPane2 {
     public  static void main (String[] args){

         String output = "";
         for (int i = 2; i <=  100; i++){

             output += i + "";

             if (i % 20 == 0) {
                 output += "\n";
             }
         }
         JOptionPane.showMessageDialog(null,output);
    }
}
