import java.util.*;
public class theSpeedOfSound{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the Frequency of the tuning fork: ");
		double frequency = console.nextDouble();
		System.out.println("Enter the length of the tube (average of the three trials): ");
		double avglength = console.nextDouble();
		System.out.println("Enter the diameter of the tube: ");
		double diameter = console.nextDouble();
		System.out.println("Enter the current temperature: ");
		double temperature = console.nextDouble();
		double wavelength = 4*(avglength+0.3*diameter);
		System.out.println("Wavelength = "+wavelength);
		double experimentalspeedofsound = frequency*wavelength;
		System.out.println("Experimental speed of sound = "+experimentalspeedofsound);
		double actualspeedofsound;
		if (temperature>20){
			actualspeedofsound = (343+(0.6*(temperature-20)))*100;
		}
		else if(temperature<20){
			actualspeedofsound = (343-(0.6*(20-temperature)))*100;
		}
		else{
			actualspeedofsound = 20.0*100;
		}
		System.out.println("Actual speed of sound = "+actualspeedofsound);
		double percenterror = (Math.abs(experimentalspeedofsound-actualspeedofsound)/actualspeedofsound)*100;
		System.out.println("Percent error = "+percenterror);
	}
}