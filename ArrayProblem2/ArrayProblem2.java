import java.util.Scanner;
public class ArrayProblem2 { //dito nagsisimula and ating class
    public static void main (String[] args){ //ito ang main method kung saan tatakbo ang buong java program

        double temperatures[] = new double[5]; //gumawa dito ng 1D double array na and pangalan ay temperatures na kayang maglaman ng 5 numbers

        //maglalagay ng mga temperature values sa bawat index mula 0 hanggang 4
        temperatures[0] = 32.5; // unang araw
        temperatures[1] = 34.0; //ikalawang araw
        temperatures[2] = 31.8; //ikatlong araw
        temperatures[3] = 33.2; //ikaapat na araw
        temperatures[4] = 35.1; //ikalimang araw

        for (int i = 0; i < temperatures.length; i++){ // gamitin ang standard for loop at .length para isa-isang iprint and laman ng array
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]); // iprint ang bawat temperature sa console
        }

        temperatures[2] = 32.0; // pinalitan ang temperature sa ikatlong araw(index 2) mula 31.8 magiging 32.0 na ito
        System.out.println("\nUpdated temperature for Day 3: " + temperatures[2]);
    } //dito natatapos ang main method
} //dito nagtatapos and ArrayProblem2 class
