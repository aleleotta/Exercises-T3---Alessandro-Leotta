package exercises;
import java.util.*;

public class Exercise8 {
	public static void main(String[] args) {
		int inputN; //Number that is introduced by the user.
		int secretN; //Secret number of the dice
		int counter; //Amount of times the user introduces a number into the program.
		int fails = 0; //Numbers that are less than the secret number
		Scanner sc = new Scanner(System.in); //Scanner declared
		System.out.println("*Introduce 0 to stop running the program.\nMake sure the number is between 0 and 100.*"); //Instructions to the user.
		System.out.print("Introduce a number: ");
		inputN = sc.nextInt(); //First user input
		if (inputN <= 0 || inputN > 100) { //If the user all of the sudden enters an invalid value as the first value, the program will terminate immediately. This if block will prevent the 0 from being counted as an introduced number.
			System.out.println("ERROR!");
		}
		counter = 1; //Counter increments for the first time.
		for (; inputN > 0; counter++) { //Start of for loop
			if (inputN < 0 || inputN > 100) { //Block that will prevent numbers outside the interval from being counted.
				System.out.println("Values have to be between 0 and 100. This value is invalid.");
				counter--;
				System.out.print("Introduce a number: ");
				inputN = sc.nextInt();
				continue;
			}
			secretN = (int) (Math.random() * 100); //Randomizer
			if(secretN > inputN) { //If the number is less than the secret number then the fails counter will increment.
				System.out.println("This number is less than the secret number on the dice. Fail indicator incremented.\n");
				fails++;
			}
			System.out.print("\nIntroduce a number: ");
			inputN = sc.nextInt();
		}
		System.out.println("Numbers introduced: " + counter); //Final results and termination
		System.out.println("Fails: " + fails);
		sc.close();
	}
}
/*Realiza un programa que lea y acepte únicamente aquellos que sean 
 mayores que el último dado. La introducción de números finaliza con 
 la introducción de un 0. Al final se mostrará:
   El total de números introducidos, excluido el 0.
   El total de números fallados.
*/