/* Escribir un programa que mientras el usuario ingrese un número entero
menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados deberían
ser constantes?. De a poco habría que definirlos como constantes). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5e1 {

	public static void main(String[] args) {
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			while (numero < 10 && numero > 1) {
				if (numero % 2 == 0) {
					System.out.println(numero + " Es par.");
				}
				else if (numero % 3 == 0) {
					System.out.println(numero + " Es inpar.");
				}
				System.out.println("Ingrese un numero entero: ");
				numero = Integer.valueOf(entrada.readLine());
					
			}


		}
		catch(Exception exc) {
			System.out.println(exc);
		}


	}
}