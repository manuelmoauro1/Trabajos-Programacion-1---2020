import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10 realice:
– Si el numero ingresado es múltiplo de 3 pida ingresar un caracter, y para el caracter
ingresado imprima a que tipo de carácter esta asociado:
• “letra minúscula” si el caracter es una letra del abecedario en minúscula;
• “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
• “dígito” si el caracter corresponde a un carácter número;
• “otro” para los restantes casos de caracteres.
– Si el numero ingresado es múltiplo de 5 imprima la tabla de multiplicar del numero
ingresado.
*/

public class p6e11 {
	public static void main(String[] args) {
		int entero;
		char caracterInput;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese un entero: ");
			entero = Integer.valueOf(entrada.readLine());

			while(entero >=1 && entero <=10) {
				if(entero % 3 == 0) {
					System.out.println("Ingrese un caracter: ");
					caracterInput = entrada.readLine().charAt(0);
					caracter(caracterInput);
					System.out.println("Ingrese un entero: ");
					entero = Integer.valueOf(entrada.readLine());
				}
				else if(entero % 5 == 0) {
					tabla5();
					System.out.println("Ingrese un entero: ");
					entero = Integer.valueOf(entrada.readLine());
				}
			}
			
		} catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
	public static void caracter(char caracter) {
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
	public static void tabla5() {
		for(int i = 1; i<= 10; i++) {
			System.out.println(i*5);
		}

		
	}
}


