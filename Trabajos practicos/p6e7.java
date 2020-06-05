import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Escribir un programa que mientras el usuario ingresa un numero de mes
(entero) entre 1 y 12 inclusive, muestre por pantalla la cantidad de días del
mes ingresado (suponer febrero de 28 días) (¿mostrar por pantalla la
cantidad de días del mes debería realizarse con un método? Debería).
*/

public class p6e7 {
	public static void main(String[] args) {
		int numeroMes;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese un numero de mes: ");
			numeroMes = Integer.valueOf(entrada.readLine());

			while (numeroMes > 0 && numeroMes <= 12) {
				System.out.println(calcularMes(numeroMes));
				System.out.println("Ingrese un numero de mes: ");
				numeroMes = Integer.valueOf(entrada.readLine());

			}

		}
		catch(Exception exc) {
			System.out.println(exc);

		}
	}
	public static String calcularMes (int numeroDeMes) {
		if (numeroDeMes == 1 || numeroDeMes == 3 || numeroDeMes == 5 ||  numeroDeMes == 7 || numeroDeMes == 8 ||  numeroDeMes == 10 || numeroDeMes == 12 ) {
				return("El mes que ingresaste tiene 31 dias.");
			}
			else if (numeroDeMes == 2) {			
					return("El mes que ingresastetiene 28 dias.");
			}
			else {
				return("El mes que ingresaste tiene 30 dias.");
			}
	}
			


}


