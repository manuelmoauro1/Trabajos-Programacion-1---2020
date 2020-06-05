import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, invoque a un método que imprima si es caracter dígito o
caracter letra minúscula, y si es letra minúscula imprimir si es vocal o
consonante.
*/

public class p6e5 {
    public static void main(String[] args) {
        char caracterIngresado;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter. * para cortar el ciclo: ");
            caracterIngresado = entrada.readLine().charAt(0);
            while (caracterIngresado != '*') {
                detectarCaracter(caracterIngresado);
                System.out.println("Ingrese un caracter. * para cortar el ciclo: ");
                caracterIngresado = entrada.readLine().charAt(0);
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void detectarCaracter(char caracter) {
        if (Character.isLetter(caracter) && Character.isLowerCase(caracter)) {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println("Ingresaste una voval.");
            }
            else {
                System.out.println("Inresaste una letra consonante.");
            }
        }
        else if(Character.isDigit(caracter)) {
            System.out.println("Ingresaste un digito.");
        }
    }
}