import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras que el usuario ingrese un número entero
entre 1 y 10 inclusive, lleve la suma de los números ingresados. Finalmente,
cuando sale del ciclo muestre por pantalla el resultado de la suma. */

public class p5e6 {
    public static void main(String[] args) {
        int numeroIngresado;
        int otroNumero;
        int sumaDeNumeros;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entero: ");
            numeroIngresado = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro numero entero: ");
            otroNumero = Integer.valueOf(entrada.readLine());
            sumaDeNumeros = numeroIngresado + otroNumero;
            while (otroNumero > 1 && otroNumero <=10) {
                System.out.println("Ingrese otro numero entero: ");
                otroNumero = Integer.valueOf(entrada.readLine());
                sumaDeNumeros = sumaDeNumeros + otroNumero;    
            }
            System.out.println("La suma de todos los numeros ingresados es: " + sumaDeNumeros);
        }

        catch(Exception exc) {
            System.out.println(exc);
        }
    }

}