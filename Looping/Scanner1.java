import java.util.Scanner;
public class  Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num = sc.nextInt();

        int highest = num;
        int lowest = num;

        for (int i = 2; i <= 10; i++){
            System.out.print("Enter Number " + i + ": ");
            num = sc.nextInt();

            if (num > highest){
                highest = num;
            }
            if (num < lowest){
                lowest = num;
            }
        }
        System.out.println("Highest Number: " + highest);
        System.out.println("Lowest Number: "  + lowest);
    }
}