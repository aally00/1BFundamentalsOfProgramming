import java.io.*;
public class Assignment4BufferedReader {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Height in cm: ");
        double height = Double.parseDouble(br.readLine());
        System.out.print("Enter Age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter Citizenship code (C/N): ");
        String citizenship = (br.readLine());
        System.out.print("Enter Citizenship code (R/N): ");
        String recommendee = (br.readLine());

        if((height >= 200 && age >= 21 && age <= 25 && citizenship.equalsIgnoreCase
                ("C")) || recommendee.equalsIgnoreCase("R")){
            System.out.println("Accepted");
        }else{
            System.out.println("Rejected");
        }
    }
}