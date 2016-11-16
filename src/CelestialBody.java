/**
 * Name: Ana Luiza Fonseca Teixeira
 * Teacher: Mr. Hardman 
 * Assignment #4, Program #1
 * Date Last Modified: 11/15/2016
 */

import java.util.Scanner;

public class CelestialBody {

	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		double userWeight;
		double spaceWeight;
		String celestialBody;
		
		
		
		do{
			System.out.println("Please, enter your weight:");
			userWeight = userInput.nextDouble();
			
			if(userWeight<1){
				System.out.println("Enter a number greater than zero!");
			}
			
		} while(userWeight<1);
		
		System.out.println("Choose one celestial body between: Mercury, Venus, Earth, Moon, Mars, Jupiter, Saturn, Uranus, Neptune, or Pluto!");  
		celestialBody = userInput.next();
		
		do {
			
			if (!celestialBody.equalsIgnoreCase("Mercury") && !celestialBody.equalsIgnoreCase("Venus") && !celestialBody.equalsIgnoreCase("Earth") && !celestialBody.equalsIgnoreCase("Moon") && !celestialBody.equalsIgnoreCase("Mars") && !celestialBody.equalsIgnoreCase("Jupiter") && !celestialBody.equalsIgnoreCase("Saturn") && !celestialBody.equalsIgnoreCase("Uranus") && !celestialBody.equalsIgnoreCase("Neptune") && !celestialBody.equalsIgnoreCase("Pluto")){
				System.out.println("Please, choose one of the options given to you!");
				celestialBody = userInput.next();
			}
			
		} while(!celestialBody.equalsIgnoreCase("Mercury") && !celestialBody.equalsIgnoreCase("Venus") && !celestialBody.equalsIgnoreCase("Earth") && !celestialBody.equalsIgnoreCase("Moon") && !celestialBody.equalsIgnoreCase("Mars") && !celestialBody.equalsIgnoreCase("Jupiter") && !celestialBody.equalsIgnoreCase("Saturn") && !celestialBody.equalsIgnoreCase("Uranus") && !celestialBody.equalsIgnoreCase("Neptune") && !celestialBody.equalsIgnoreCase("Pluto") );

		if (celestialBody.equalsIgnoreCase("Mercury")){
			spaceWeight = userWeight * (0.38);
			System.out.println("Your weight in Mercury would be " + spaceWeight + "!");
		
		}
		
		if (celestialBody.equalsIgnoreCase("Venus")){
			spaceWeight = userWeight * (0.91);
			System.out.println("Your weight in Venus would be " + spaceWeight + "!");
		
		}
		
		if (celestialBody.equalsIgnoreCase("Earth")){
			spaceWeight = userWeight * (1.0);
			System.out.println("Your weight in Earth is " + spaceWeight + "!");
			
		}
		
		if (celestialBody.equalsIgnoreCase("Moon")){
			spaceWeight = userWeight * (0.165);
			System.out.println("Your weight in the Moon would be " + spaceWeight + "!");
			
		}
		
		if (celestialBody.equalsIgnoreCase("Mars")){
			spaceWeight = userWeight * (0.38);
			System.out.println("Your weight in Mars would be " + spaceWeight + "!");
			
		}
		
		if (celestialBody.equalsIgnoreCase("Jupiter")){
			spaceWeight = userWeight * (2.34);
			System.out.println("Your weight in Jupiter would be " + spaceWeight + "!");
			
		}
		
		if (celestialBody.equalsIgnoreCase("Saturn")){
			spaceWeight = userWeight * (1.06);
			System.out.println("Your weight in Saturn would be " + spaceWeight + "!");
			
		}
		
		if (celestialBody.equalsIgnoreCase("Uranus")){
			spaceWeight = userWeight * (0.92);
			System.out.println("Your weight in Uranus would be " + spaceWeight + "!");
			
		}
		
		if (celestialBody.equalsIgnoreCase("Neptune")){
			spaceWeight = userWeight * (1.19);
			System.out.println("Your weight in Neptune would be " + spaceWeight + "!");
			
		}
		
		if (celestialBody.equalsIgnoreCase("Pluto")){
			spaceWeight = userWeight * (0.06);
			System.out.println("Your weight in Pluto would be " + spaceWeight + "!");
			
		}
		
		userInput.close();
		
	}

}
