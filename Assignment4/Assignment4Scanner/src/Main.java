import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Height in cm: ");
        double height = sc.nextDouble();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Citizenship code (C/N): ");
        String citizenship = sc.next();
        System.out.print("Enter Citizenship code (R/N): ");
        String recommendee = sc.next();

        if((height >= 200 && age >= 21 && age <= 25 && citizenship.equalsIgnoreCase
                ("C")) || recommendee.equalsIgnoreCase("R")){
            System.out.println("Accepted");
        }else{
            System.out.println("Rejected");
        }
    }
}