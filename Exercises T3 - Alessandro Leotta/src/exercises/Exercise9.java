package exercises;
import java.util.*;

public class Exercise9 {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a number: ");
		i = sc.nextInt();
		if (i <= 9) {
			System.out.println("The following number has 1 digit.");
		} else if (i > 9 && i <= 99) {
			System.out.println("The following number has 2 digits.");
		} else if (i > 99 && i <= 999) {
			System.out.println("The following number has 3 digits.");
		} else if (i > 999 && i <= 9999) {
			System.out.println("The following number has 4 digits.");
		} else if (i > 9999 && i <= 99999) {
			System.out.println("The following number has 5 digits.");
		} else if (i > 99999 && i <= 999999) {
			System.out.println("The following number has 6 digits.");
		} else if (i > 999999 && i <= 9999999) {
			System.out.println("The following number has 7 digits.");
		} else if (i > 9999999 && i <= 99999999) {
			System.out.println("The following number has 8 digits.");
		} else if (i > 99999999 && i <= 999999999) {
			System.out.println("The following number has 9 digits.");
		}
		sc.close();
	}
}
/*Realiza un programa que nos diga cuántos dígitos tiene un número 
 * introducido por teclado. El número introducido debe ser mayor que 0.
 */