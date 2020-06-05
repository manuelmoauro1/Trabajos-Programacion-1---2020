import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Realizar un programa que dado dos números enteros y un
carácter, todos ingresados por el usuario, muestre por
pantalla el resultado de la operación matemática básica
considerando el valor del carácter. Si ingreso el caracter:
– ‘a’ la suma, ‘b’ la resta, ‘c’ la multiplicación y ‘d’ la división
entre ambos números.
*/

public class p6e9 {
	public static void main(String[] args) {
		int entero1;
		int entero2;
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese un entero: ");
			entero1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese otro entero: ");
			entero2 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un caracter: a para sumar, b para restar, c para multiplicar, y d para dividir: ");
			caracter = entrada.readLine().charAt(0);

			operacion(entero1, entero2, caracter);

			
		} catch (Exception exc) {
			System.out.println(exc);
		}
		

	}
	public static void operacion(int numero1, int numero2, char caracter) {
		if (caracter == 'a') {
			System.out.println(numero1 + numero2);
		}
		else if (caracter =='b') {
			System.out.println(numero1 - numero2);
		}
		else if(caracter == 'c') {
			System.out.println(numero1 * numero2);
		}
		else if(caracter == 'd') {
			System.out.println(numero1 / numero2);
		}
	}


}
