package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int a, b;
		int lowerValue;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Introduce first number: ");
		a = sc.nextInt();
		System.out.println("Introduce second number: ");
		b = sc.nextInt();
		lowerValue = a < b ? a : b; //Ternary statement = if statement. Checks for the lower introduced value.
		for (int i = lowerValue; true ; i--) {
			if(a % i == 0 && b % i == 0) {
				System.out.println("M.C.D: " + i);
				break;
			}
		}
		sc.close();
	}
}
/*Para dos números dados, a y b, es posible calcular el máximo común divisor 
 * (el número más grande que divide a ambos) 
 * mediante un algoritmo ineficiente per sencillo: desde el menor de a y b,
 * ir buscando, de forma decreciente, 
 * el primer número que divide a ambos simultáneamente. 
 * Teniendo en cuenta lo que se acaba de explicar, realiza un 
 * programa que calcule el máximo común divisor de dos números.
 */