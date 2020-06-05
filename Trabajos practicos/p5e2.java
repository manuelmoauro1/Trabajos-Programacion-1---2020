import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5e2 {

	public static void main(String[] args) {
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese un entero mayor a 0.");
			numero = Integer.valueOf(entrada.readLine());

			while (numero >= 0) {
				System.out.println(numero);
				numero--;
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}
}

	
		

