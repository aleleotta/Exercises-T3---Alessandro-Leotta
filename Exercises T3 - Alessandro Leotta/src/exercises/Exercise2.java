package exercises;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		int n; //Number to introduce.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce a number: ");
		n = sc.nextInt();
		System.out.println("Prime numbers between 1 and n: ");
		for (int primes = 2; primes < n; primes++) {
			if (primes % 2 != 0) {
				System.out.print(primes + " ");
			}
		}
		sc.close();
	}
}
/*Realiza un programa que nos pida un número n 
 *y nos diga cuántos números hay entre 1 y n
 *que sean primos.
 */