import java.util.Scanner;
public class Scanner2{
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);

        String output = "";

        for ( int i = 2;  i <=  100; i++){

            output += i + "";

            if (i % 20 == 0){
                output += "\n";
            }
        }
        System.out.println(output);
    }
}
