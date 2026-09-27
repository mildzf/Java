/*
A Guessing game created in Java programming language. 
*/

import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        System.out.println("****************************************");
        System.out.println("            Guessing Game");
        System.out.println("****************************************");
        System.out.println("I am thinking of a number between 1 and 10. Guess what it is?");
        String message = "Correct! You have guessed correctly.";
       
        int number = random.nextInt(10)+ 1;
        
     
        while (true){
            System.out.print("Enter your guess: ");
            if (keyboard.hasNextInt()){
                int guessNumber = keyboard.nextInt();
                if (guessNumber==number){
                    System.out.println(message);
                    break;
                }else {
                    System.out.println("Sorry! Try again!");
                }
            } else {
                String input = keyboard.next();
                if (input.equalsIgnoreCase("exit")){
                    System.out.println("Sorry to see you go. Ending the game. ");
                    break;
                    } 
                System.out.println("Please enter a number");
            }
           
                
           
        }
    }
}
