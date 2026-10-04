import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NSAT Score: ");
        int nsatScore = sc.nextInt();
        System.out.print("Enter Parents' Salary: ");
        int parentsSalary = sc.nextInt();
        System.out.print("Enter Entrance Examination Score: ");
        int examScore = sc.nextInt();

        double average = (nsatScore*examScore)/2;

        if (parentsSalary >= 10000||nsatScore < 90||examScore < 85) {
            System.out.println("Rejected");
        }else if (parentsSalary <= 3500 && average >= 91){
            System.out.println("Accepted");
        }else{
            System.out.println("For Further Study");
        }
    }
}