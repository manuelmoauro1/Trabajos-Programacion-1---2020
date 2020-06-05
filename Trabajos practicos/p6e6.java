import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras que el usuario ingrese un número entero
natural, llame a un método que calcule la sumatoria entre 1 y dicho
numero y se lo retorne como resultado. Finalmente, muestre por pantalla el
resultado obtenido. */

public class p6e6 {
    public static void main(String[] args) {
        int enteroIngresado;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entero natural: ");
            enteroIngresado = Integer.valueOf(entrada.readLine());

            while (enteroIngresado > 0) {
                System.out.println(calcularSuma(enteroIngresado));
                System.out.println("Ingrese un numero entero natural: ");
                enteroIngresado = Integer.valueOf(entrada.readLine());

            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static int calcularSuma(int numero) {
        return(numero + 1);

    }
}