import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un diseño de programa que mientras que el usuario
ingrese un caracter dígito o caracter letra minúscula,
imprima dicho caracter, y si es caracter letra minúscula,
imprima si es vocal o consonante. */

/* Diseno de programa 
public class p6e2 {
    public static void main(String[] args) {
        defino variable de tipo char
        obtengo valor del caracter por teclado
            mientras el caracter sea letra minuscula o numero
                si es letra que imprima si es vocal o consonante
                si es numero que imprima el numero
        
    }  
}
*/
public class p6e2 {
    public static void main(String[] args) {
        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);
            while ((Character.isLetter(caracter)) && (Character.isLowerCase(caracter)) || Character.isDigit(caracter)) {
                if ((Character.isLetter(caracter)) && (Character.isLowerCase(caracter))) {
                    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                        System.out.println("El caracter es una letra vocal.");
                    }
                    else {
                        System.out.println("El caracter es una letra consonante.");
                    }
                }
                else {
                    System.out.println("El caracter es el numero: " + caracter);
                }
                System.out.println("Ingrese un caracter: ");
                caracter = entrada.readLine().charAt(0);

            }   
        
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        
    }
    
}