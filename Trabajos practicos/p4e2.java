import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p4e2 {
	public static void main(String[] args){
		char input;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter: ");
			input = entrada.readLine().charAt(0);
			if (input >= 'a' && input < 'z') {
				System.out.println("Es una letra minuscula.");
				if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
					System.out.println("La letra es una vocal");
				}
				else {
					System.out.println("La letra es una consonante.");
				}
			
			}
			else if (input >= 'A' && input < 'Z') {
					System.out.println("Es una letra mayuscula.");
			}
			else {
				System.out.println("Es un numero.");
			}





		}
		catch(Exception exc){
			System.out.println(exc);
		}
		

	}
}