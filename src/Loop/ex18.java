package Loop;

import java.util.Random;
import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        //Guess a number between 1 and 100
        Random random =new Random();
        int numbertoGuess = random.nextInt(100)+1;
        System.out.println(numbertoGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts=0;
        while (true){
            if(!scanner.hasNextInt()){
                System.out.println("Invalid input");
                scanner.next();//consume invalid token
                continue;
            }
            guess=scanner.nextInt();
            attempts++;

            if(guess<1 || guess>100){
                System.out.println("Please enter 1 to 100");
                continue;
            }
            if(guess<numbertoGuess){
                System.out.println("Too low,try again");
            } else if (guess>numbertoGuess) {
                System.out.println("too hign,try again");
                
            }
            else {
                System.out.println("Correct! you guessed it right"+attempts+"attempts");
                break;

            }
        }
    }
}
