import java.util.Arrays; //iniimport ang Arrays para magamit and deepToString() method
public class ArrayProblem1{ //dito dinideclare ang pangalan ng class na gagamitin
    public static void main (String[] args){ //ito ang main method kung saan nagsisimula ang java program

        String seats[][] = {
                {"Alice","Bob","Charlie"}, //ungang row(index 0) na naglalaman ng tatlong upuan
                {"David","Emma","Frank"} //pangalawang row(index 1) na naglalaman din ng tatlong upuan
        };

        System.out.println(seats[1][2]); //kinukuha dito at piniprint ang pangalan sa pangalawang row(index 1), pangatlong column(index2) na si Frank
        seats[0][1] = "Vacant"; // pinapalitan dito and pangalang Bob na nasa unang row(index 0), pangalawang column(index 1) ng Vacant

        System.out.println(Arrays.deepToString(seats)); //ginagamit ang .deepToString para iprint and buong ayos ng mga upuan sa iisang line lamang
    } //dito natatapos ang main method
} //dito nagtatapos and ArrayProblem1 class