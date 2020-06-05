import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5e3 {
	public static void main(String[] args) {
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese un caracter.");
			caracter = entrada.readLine().charAt(0);
			while (caracter != '*') {
				if ((caracter >= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z')) {
					if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
					System.out.println("Es una vocal minuscula.");
				}
			}
				else {
						System.out.println("Es un numero");
					}
				System.out.println("Ingrese un caracter.");
				caracter = entrada.readLine().charAt(0);
		}
				
				

				

		}

		catch(Exception exc) {
			System.out.println(exc);
		}

	}
}