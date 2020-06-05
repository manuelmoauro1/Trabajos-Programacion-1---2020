import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras el usuario cargue desde
teclado un caracter letra minúscula, llame a un método
que imprime por pantalla la tabla de multiplicar de 9. */

public class p6e3 {
    public static void main(String[] args) {
        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);
            while (Character.isLetter(caracter) && Character.isLowerCase(caracter)) {
                tabla_de_9();
                System.out.println("Ingrese un caracter: ");
                caracter = entrada.readLine().charAt(0);
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        
    }

    public static void tabla_de_9() {
        for (int multi = 0; multi <=10; multi++) {
            System.out.println(9*multi);
        }
    }
    
}