import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5e4 {
	public static void main(String[] args) {
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese un entero: ");
			numero = Integer.valueOf(entrada.readLine());
			 while (numero != 0) {
			 	System.out.println("Ingrese otro entero.");
			 	numero = Integer.valueOf(entrada.readLine());
			 	System.out.println("el numero es: " + numero);

			 }

		}

		catch(Exception exc) {
			System.out.println(exc);
		}
		
			
		}
		
	}
