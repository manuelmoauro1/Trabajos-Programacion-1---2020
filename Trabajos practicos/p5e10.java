import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras el usuario ingresa un numero de mes
(entero) entre 1 y 12 inclusive, muestre por pantalla la cantidad de días del
mes ingresado (suponer febrero de 28 días). */

public class p5e10 {
	public static void main(String[] args) {
		int numeroMes;
		int mesesCon31 = 0;
		int mesesCon30 = 0;
		int mesesCon28 = 0;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero de mes: ");
			numeroMes = Integer.valueOf(entrada.readLine());

			while (numeroMes >= 1 && numeroMes <= 12) {
				System.out.println("Ingrese un numero de mes: ");
				numeroMes = Integer.valueOf(entrada.readLine());

				if (numeroMes == 1 || numeroMes == 3 || numeroMes == 5 ||  numeroMes == 7 || numeroMes == 8 ||  numeroMes == 10 || numeroMes == 12 ) {
					mesesCon31 ++;

				}
				else if (numeroMes == 2) {
					mesesCon28 ++;
				}
				else {
					mesesCon30 ++;
				}
		
			}
			System.out.println("Ingresaste " + mesesCon31 + " Meses con 31, " + mesesCon28 + " meses con 28, y " + mesesCon30 + " meses con 30." );

		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	
}
