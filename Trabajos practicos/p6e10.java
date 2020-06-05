import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10, pida ingresar un caracter, y por cada caracter ingresado
imprima:
– “letra minúscula” si el caracter es una letra del abecedario en minúscula;
– “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
– “dígito” si el caracter corresponde a un carácter número;
– “otro” para los restantes casos de caracteres.
*/

public class p6e10 {
	public static void main(String[] args) {
		int entero;
		char caracter;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese un numero entero: ");
			entero = Integer.valueOf(entrada.readLine());

			while(entero >= 1 && entero <=10) {
				System.out.println("Ingrese un caracter: ");
				caracter = entrada.readLine().charAt(0);
				problema(caracter);
			}
			
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	public static void problema(char caracter) {
		if(Character.isLetter(caracter) && Character.isLowerCase(caracter)) {
			System.out.println("Letra minuscula.");
		}
		else if(Character.isLetter(caracter) && Character.isUpperCase(caracter)) {
			System.out.println("Letra mayuscula.");
		}
		else if(Character.isDigit(caracter)) {
			System.out.println("Es un numero");
		}
		else {
			System.out.println("Otro");
		}

	}
}


