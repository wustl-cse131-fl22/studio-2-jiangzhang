package studio2;

import java.util.Scanner;

public class Ruin {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int startAmount;
		double winChance;
		int winLimit;
		int totalSimulations;
		double compare;
		int simulation = 1;
		int falseCount =0 ;
		
		startAmount = scan.nextInt();
		System.out.println("Amount:  " +startAmount );
		int initialAmount = startAmount;
		winLimit = scan.nextInt();
		System.out.println("winLimit  " +winLimit );
		winChance = scan.nextDouble();
		System.out.println("winChance " +winChance);
		totalSimulations = scan.nextInt();
		
		

		while(startAmount>=0 && simulation<=totalSimulations) {
			
			compare = Math.random();
			if(winChance >= compare) {
				startAmount+=1;
				}

		
			else{

				startAmount-=1;
			}
			
			if(startAmount == winLimit) {
				
				System.out.println("simulation "+simulation+":  " +winLimit +"   "+ "WIN");
				simulation+=1;
				startAmount = initialAmount;
			}
			
			else if(startAmount ==0) {
				
				System.out.println("simulation "+simulation+":   " + initialAmount +"   "+ "LOSE");
				simulation+=1;
				falseCount++;
				startAmount = initialAmount;
				
				
				
			}
			
			
		}
		
		System.out.println("Losses: " + falseCount + "Simulations:  "+  totalSimulations);
		System.out.print("Ruin Rate from Simulation: "+ (falseCount/totalSimulations));
	}

  }

