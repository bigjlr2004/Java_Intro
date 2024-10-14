import java.util.Scanner;
public class Schedule {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println(" ********** MENU *****************" );
        System.out.println("These are the choices for week of the day.");
        System.out.println("Please enter only values from 1-7:");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");
        System.out.println("Enter your choice of the day(1-7): ");
        int dayOfTheWeek = keyboard.nextInt();

        switch (dayOfTheWeek){
            case 1:
                System.out.println("Monday: Start of the week.");
                System.out.println("******Sub Menu for Monday******");
                System.out.println("******Have you ate yet?***********");
                System.out.println("**********************************");
                System.out.println("1. Yes I had my breakfast.");
                System.out.println("2. No I haven't eaten yet.");
                System.out.println("**********************************");
                System.out.println("Enter your choice of the day(1-2): ");
                int subMenuChoice = keyboard.nextInt();
                switch(subMenuChoice) {
                    case 1:
                        System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                        break;
                    case 2:
                        System.out.println(" Lets us divert on Highway 54 and have a Burger on the drive in");
                        break;
                    default:
                        System.out.println("That option is not available.");
                        break;
                }
                break;
            case 2:
                System.out.println("Tuesday: Week should be moving right along");
                System.out.println("******Sub Menu for Tuesday******");
                System.out.println("******What coding Language are you using?*****");
                System.out.println("1. C++");
                System.out.println("2. Java.");
                System.out.println("**********************************");
                System.out.println("Enter your choice of languages(1-2): ");
                int subTuesdayChoice = keyboard.nextInt();
                switch(subTuesdayChoice) {
                    case 1:
                        System.out.println("Good. C++ Now you should write lots of comments to explain your code.");
                        System.out.println("Think before you code.");
                        System.out.println("Work hard its only Tuesday.");
                        break;
                    case 2:
                        System.out.println("Good. Java Drink lots of coffee.");
                        System.out.println("Don't think before you code.");
                        System.out.println("Java is hard so.......");
                        break;
                    default:
                        System.out.println("That option is not available.");
                        break;
                }
                break;
            case 3:
                System.out.println("Wednesday: Hump Day half way home");
                break;
            case 4:
                System.out.println("Thursday: Final Stretch");
                break;
            case 5:
                System.out.println("Friday: Thank God it's Friday");
                break;
            case 6:
                System.out.println("Saturday is today");
                break;
            case 7:
                System.out.println("Sunday: This is the day that the Lord has made.");
                break;
            default:
                System.out.println("You didn't choose a number from 1-7");
                break;
        }

        System.out.println(dayOfTheWeek);


    }
}
