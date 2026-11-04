import javax.swing.JOptionPane;
public class JOptionPane1 {
    public  static  void  main(String[] args){

       int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Number 1:" ).trim());

       int highest  = num;
       int  lowest = num;

       for (int i = 2; i  <=  10;  i++){
           num =  Integer.parseInt(JOptionPane.showInputDialog("Enter Number " + i + ":").trim());

           if  (num > highest){
               highest = num;
           }
           if ( num < lowest){
               lowest  =  num;
           }
       }
        JOptionPane.showMessageDialog(null,"Highest Number: "  +
                 highest  + "\nLowest NUmber: " + lowest );
    }
}