import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras que el usuario ingrese un caracter dígito
o caracter letra minúscula, imprima si es caracter dígito o caracter letra
minúscula, y si es letra minúscula imprimir si es vocal o consonante. */

public class p5e5 {
    public static void main(String[] args) {
        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);

            while (Character.isUpperCase(caracter) == false) {
                if (Character.isDigit(caracter) == true) {
                    System.out.println("El caracter ingresado es un numero.");
                }
                else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                    System.out.println("El caracter ingresado es una letra minuscula vocal");
                }
                else {
                    System.out.println("El caracter ingresado es una vocal consonante.");
                }
                System.out.println("Ingrese un caracter: ");
                caracter = entrada.readLine().charAt(0);
            }
            

        }

        catch(Exception exc) {
            System.out.println(exc);
        }

        
    }

}