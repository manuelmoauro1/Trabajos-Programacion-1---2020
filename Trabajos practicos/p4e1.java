import java.io.BufferedReader;
import java.io.InputStreamReader;


public class p4e1 {
    public static void main(String [] args) {
    	int entero;
    	try {
    		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    		System.out.println("Ingrese un entero: ");
    		entero = Integer.valueOf(entrada.readLine());
    		if (entero >= 0) {
    			System.out.println("El numero que ingresaste es positivo.");
    			if (entero > 100) {
    				System.out.println("Grande.");
    			}
    			else {
    				System.out.println("Chico.");
    			}
    		}
    		else {
    			if (entero % 2 == 0 || entero % 3 == 0){
    				System.out.println("El numero es es negativo, par o multiplo de 3.");
    			}
    			else {
    				System.out.println("El numero es negativo, y no es ni par, ni multiplode 3.");
    			}
    		}





    	}
    	catch(Exception exc) {
    		System.out.println(exc);
    	}
        
    }

}