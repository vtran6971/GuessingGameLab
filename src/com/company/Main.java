package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Setup of variables and scanning for a username and objective #
        int objective = 0;
        String name = "";
        System.out.println("What is your name player?");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Hi "+name+ " what objective would you like to play?");
        objective = input.nextInt();

        //Code for objective 1
        if (objective == 1)
        {
            System.out.println("Alright " +name+ " guess a number from 1-10");
            int number = (int) (Math.random()*10)+1;
            int guess = input.nextInt();
            while (guess != number) {
                System.out.println("That guess was incorrect "+name);
                guess = input.nextInt();
            }
            if (guess == number) {
                System.out.println("That guess was correct! "+name);
            }
        }

        //Code for objective 2
        if (objective == 2) {
            int number2 = (int) (Math.random()*100)+1;   //Start of objective 2
            System.out.println("The Number is "+number2);
            int compGuess = (int) (Math.random()*100)+1;
            System.out.println("The computer has guessed " + compGuess);
            System.out.println(name+ " Should the number be higher, lower, or is it correct?");
                while (compGuess != number2) {
                    Scanner input2 = new Scanner(System.in);
                    String Adjustment = input2.nextLine();
                    System.out.println("Adjustment is "+Adjustment);
                    if (Adjustment.equals("lower")) {
                        compGuess = compGuess - 1;
                        System.out.println("The computer has guessed " + compGuess);
                    }
                    if (Adjustment.equals("higher")) {
                        compGuess = compGuess + 1;
                        System.out.println("The computer has guessed " + compGuess);
                    }
                    if (Adjustment.equals("correct")) {
                        System.out.println("The computer guess is correct! The number is " + compGuess);
                    }
                }

        }
        }
}
