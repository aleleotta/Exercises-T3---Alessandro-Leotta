package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int hours;
		int minutes;
		int seconds;
		int increment;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce hours: ");
		hours = sc.nextInt();
		System.out.println("Introduce minutes: ");
		minutes = sc.nextInt();
		System.out.println("Introduce seconds: ");
		seconds = sc.nextInt();
		System.out.println("Introduce incrementation in seconds: ");
		increment = sc.nextInt();
		while(increment >= 0) {
			seconds = seconds + increment;
			while (seconds >= 60) {
				seconds = seconds - 60;
				minutes++;
			}
			while(minutes >= 60) {
				minutes = minutes - 60;
				hours++;
			}
			System.out.println("Introduce more seconds or introduce a negative number to see the result: ");
			increment = sc.nextInt();
		}
		System.out.println("Time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
		sc.close();
	}
}
/*Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
Hora
Minutos
Segundos
Cantidad de segundos a incrementar
La aplicación debe mostrar la nueva hora. 
Por ejemplo, si el usuario introduce hora=13, minutos=59 y segundos=51, 
y se desea incrementar en 10 segundos, el resultado a mostrar es 14:00:01.
*/