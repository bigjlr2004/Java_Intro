public class Main {

    public static void main(String[] args){
        int moneyLeftWithJohn = 302;

        if(moneyLeftWithJohn >=300) {
            System.out.println("Go to Las Vegas");
            System.out.println("Enjoy some games");
            System.out.println("Enjoy some concerts");
            System.out.println("Enjoy fine dining");
            System.out.println("Go on a helicopter ride");
            System.out.println("Hope you enjoyed Las Vegas");
        } else if(moneyLeftWithJohn >= 200) {
            System.out.println("Go visit the Hoover Dam");
        }else if(moneyLeftWithJohn >= 100) {
           System.out.println("Go visit the Area 51");
        } else if(moneyLeftWithJohn <= 50) {
            System.out.println("Have an ice cream.");
        }else {
            System.out.println("Think about the money spent.");
        }

        System.out.println("On trip to parents. $" + moneyLeftWithJohn);


    }

}
