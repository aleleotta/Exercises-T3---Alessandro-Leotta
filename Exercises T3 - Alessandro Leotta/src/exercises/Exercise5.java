package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		int a, b;
		int highestValue;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce first number: ");
		a = sc.nextInt();
		System.out.println("Introduce second number: ");
		b = sc.nextInt();
		highestValue = a > b ? a : b; //Ternary statement = if statement. Checks for the lower introduced value.
		for (int i = highestValue; true ; i++) {
			if(i % a == 0 && i % b == 0) {
				System.out.println("M.C.M: " + i);
				break;
			}
		}
		sc.close();
	}
}