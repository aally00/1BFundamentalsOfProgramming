public class CoffeeShopAnalyzer {
    public static void main (String[] args){

        int weeklySales[] = {120,145,130,155,180,210,195}; //Dito nilalagay ang mga benta sa loob ng pitong araw
        String daysOfWeek[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; //Dito nilalagay and pangalan ng bawat araw

        System.out.println("=== Daily Sales ==="); //Pinapakita dito ang pamagat na Daily Sales
        for(int i = 0;i < weeklySales.length;i++) { //Gumamit ng for loop para icheck ang benta sa bawat araw
            System.out.println(daysOfWeek[i] + " sales:" + weeklySales[i] + " cups"); //Pinapakita dito ang pangalan ng araw at kung ilan ang nabentang kape
        };

        int totalSales = 0; //Magsisimula sa 0 ang kabuuang benta

        for (int dailySales : weeklySales) { //Dito naman kinukuha ang bawat halaga ng benta sa array
            totalSales += dailySales; //Dinadagdag dito ang bawat benta sa buong napagbentahan
        };
        double averageSales = (double) totalSales / weeklySales.length; //Dito kinukuha ang average sa pamamagitan ng paghati ng total sales sa 7 dahil may pitong araw sa isang linggo

        System.out.println("\n=== Weekly Summary ==="); //Dito pinapakita ang pamagat na Weekly Summary

        System.out.println("Total Sales: " + totalSales + " cups"); // Dito pinapakita ang kabuuang bilang ng nabentang kape

        System.out.println("Average Daily Sales: " + averageSales + " cups"); //Pinapakita naman dito ang average ng nabentang kape bawat araw

        int maxSales = weeklySales[0]; // Magsisimula sa 0 ang value ng maxSales

        int minSales = weeklySales[0]; // Magsisimula sa 0 ang value ng minSales

        String bestDay = daysOfWeek[0]; //Ang lunes ang magsisilbing unang araw na may pinakamataas na benta

        String worstDay = daysOfWeek[0]; //Ang lunes ang magsisilbing unang araw na may pinakamababang benta

        for (int i = 1; i < weeklySales.length; i++) { //Chinecheck dito ang mga benta simula sa pangalawang araw
            if (weeklySales[i] > maxSales) { //Dito naman chinecheck kung mas mataas ang kasalukuyang napagbentahan.
                maxSales = weeklySales[i]; // Ina-update dito ang pinakamataas na halaga ng benta.
                bestDay = daysOfWeek[i]; // Ina-update dito ang araw na may pinakamataas na benta.
            }
            if (weeklySales[i] < minSales) { //Tingnan kung mas mababa ang kasalukuyang benta
                minSales = weeklySales[i]; //Nilalagay dito ang pinakamababang benta
                worstDay = daysOfWeek[i]; //Nilalagay dito ang araw na may pinakamababang benta
            }
        }
        System.out.println("\n=== Best and Worst Days ===");
//Pinapakita dito ang pamagat para sa pinakamataas at pinakamababang benta.

        System.out.println("Best Day: " + bestDay + " with " + maxSales + " cups.");
//Dito pinapakita ang araw na may pinakamataas na benta.

        System.out.println("Worst Day: " + worstDay + " with " + minSales + " cups.");
// Pinapakita naman dito ang araw na may pinakamababang benta.

    }
}