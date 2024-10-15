import java.util.Scanner;

public class GuessingGame {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        int userGuess = 0;

        while (userGuess != secretNumber) {
            System.out.println("Guess the number from 1 to 9.: ");
            userGuess = scanner.nextInt();
            if(userGuess != secretNumber) {
                System.out.println("Wrong guess try again!");
            }
        }
        System.out.println("Congratulations! You guessed the correct number.");
    }

}
