import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame {
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Choose a number from 1-5");
        int UserGuess = new Scanner(System.in).nextInt();
        int ComputerGuess =new Random().nextInt(5);
        if (ComputerGuess==UserGuess){
            System.out.println("You guessed right");
        }else{
            System.out.println("Wrong guess");
        }
    }
}
