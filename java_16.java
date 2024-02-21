// Create a guessing game with OOPs

package Java;

import java.util.Random;
import java.util.Scanner;

class guessGame{ 
    int user;
    int random;
    int count=0;
    guessGame(){
        Random r = new Random();
        random = r.nextInt(100);
    }
    void userInput(){
        System.out.println("Guess the number:");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
    }
    boolean isCorrect(){
        if(random==user){
            return true;
        }
        else if(user>random){
            System.out.println("Entered number is high");
        }
        else if(user<random){
            System.out.println("Entered number is low");
        }
        return false;
    }
    void setNoOfGuess(){
        count++;
    }
    int getNoOfGuess(){
        return count;
    }
}

public class java_16 {
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game....");
        guessGame game = new guessGame();
        boolean a = false;
        while(!a){
            game.userInput();
            game.setNoOfGuess();
            a = game.isCorrect();
        }
        System.out.println("Number of guesses are " + game.getNoOfGuess());
    }
}
