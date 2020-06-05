import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero.
*/

public class p6e8 {
	public static void main(String[] args) {
		char caracter;
		int entero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese una letra minuscula: ");
			caracter = entrada.readLine().charAt(0);

			while (Character.isLetter(caracter) && Character.isLowerCase(caracter)) {
				System.out.println("Ingrese un entero: ");
				entero = Integer.valueOf(entrada.readLine());
				if (entero >= 1 && entero <= 5) {
					tablaMultiplicar(entero);
				}

			}

		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	public static void tablaMultiplicar(int numero) {
		for(int multiplicar = 0; multiplicar <= 10; multiplicar++) {
			System.out.println(numero * multiplicar);		
		}
		
	}
}