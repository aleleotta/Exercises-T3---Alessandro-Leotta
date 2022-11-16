package exercises;
import java.util.*;

public class Exercise6 {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a number between 0 and 20: ");
		N = sc.nextInt();
		if(N >= 0 && N <= 20) {
			for (int i = 0; i <= N; i++) {
				System.out.println();
				for (int j = 1; j <= i; j++) {
					System.out.print(i);
				}
			}
		}
		sc.close();
	}
}
/*Realiza un programa que pida un número entero N entre 0 y 20 
 * y luego muestre por pantalla los números desde 1 hasta N,
 * uno en cada línea, repitiendo cada número tantas veces como su valor.
 */
