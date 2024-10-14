import javax.swing.*;

public class Gas_Fillup {

    public static void main(String [] args) {


        boolean fillUpGas = true;
        if(fillUpGas){
            System.out.println("Go to gas station.");
            System.out.println("Fill up the tank.");
            System.out.println("Get out of the gas station.");
        }
        System.out.println("On Christmas road trip.");


    int currentGasTankLevel = 2;
    int halfGasTankLevel = 5;

        if(  currentGasTankLevel <= halfGasTankLevel) {
            System.out.println("Go to gas station and get gas.");
        }
        System.out.println("On X-mas road trip.");


    System.out.println("__________ === __________");
    System.out.println(" 10 == 10: " + (10 == 10));
    System.out.println(" 10 == 20: " + (10 == 20));
    System.out.println(" 10 != 20: " + (10 != 20));
    System.out.println(" 20 >  10: " + (20 > 10));
    System.out.println(" 10 >= 20: " + (10 >= 20));
    System.out.println(" 10 < 20: " + (10 < 20));
    System.out.println(" 20 <= 20: " + (20 <= 20));

    int moneyLeftWithToni = 200;

    if(moneyLeftWithToni >= 300) {
        System.out.println("Go to Las Vegas");
    } else {
        System.out.println("Don't go to Las Vegas");
    }

    System.out.println("On trip to parents.");

    int moneyLeftWithJohn = 400;

    if (moneyLeftWithJohn > 300) {
       System.out.println("John Go to Florida");
       System.out.println("Go to the beach");
       System.out.println("Enjoy some sun, sand, and swimming.");
       System.out.println("Enjoy fine dining");
       System.out.println("Go on a helicopter ride.");
       System.out.println("Go shop for some souvenirs.");
    } else {
        System.out.println(" John Do not go to Florida.");
    }
    System.out.println(" John On trip to parents.");
}
}


