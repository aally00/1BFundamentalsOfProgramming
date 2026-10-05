import java.io.*;
public class  Assignment3BufferedReader{
    public static void main (String[] args) throws IOException {
        BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT Score: ");
        int nsatScore = Integer.parseInt(br.readLine());
        System.out.print("Enter Parents' Salary: ");
        int parentsSalary = Integer.parseInt(br.readLine());
        System.out.print("Enter Entrance Examination Score: ");
        int examScore = Integer.parseInt(br.readLine());

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