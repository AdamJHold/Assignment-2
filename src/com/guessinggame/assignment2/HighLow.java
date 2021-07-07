package com.guessinggame.assignment2;

import java.util.Scanner;
import java.util.Random;

public class HighLow {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Adam's Guessing Game!");
		System.out.println("Press the 1 key to Begin...");
	
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int minValue = 1;
		int maxValue = 100;
		int guess = sc.nextInt();
		int theRandomNumber = random.nextInt(maxValue - minValue) + minValue;
		int attempt = 1;
		
		System.out.println("Pick a number between 1 and 100...");
		
	
		  while(guess != theRandomNumber) {
			  
			  try {
				  guess = sc.nextInt();
				
			  } catch(Exception e) {
				 sc.next();
				 System.out.println("Error - please enter a whole number..."); 
				 sc.next();
			  }
			  
			if(attempt == 5) {
				System.out.println("You lose, the number to guess was..." + theRandomNumber);
				break;
			}
			
			if(guess < minValue) {
				System.out.println("Error: Guess is below Range - Try Again!");
			} 
			
			if(guess > maxValue) {
				System.out.println("Error: is above Range - Try Again!");
			}
			
			if(guess > theRandomNumber && guess <= maxValue) {
				System.out.println("Please pick a lower number..."); 
				attempt++;
			}
			
			if(guess < theRandomNumber && guess >= minValue) {
				System.out.println("Please pick higher number...");	
				attempt++;	
			}
			
			if(guess == theRandomNumber) {
				System.out.println("You Win!!!"); 
				break;
			}	
		}
	}
}
