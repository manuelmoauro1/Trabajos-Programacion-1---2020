import java.io.BufferedReader;
import java.io.InputStreamReader; 

/* Escribir un programa que mientras que el usuario ingrese un número entero
entre 1 y 10 inclusive, lleve la suma de los números ingresados y la cantidad
de sumas que realizó. Finalmente, cuando sale del ciclo muestre por
pantalla el resultado del promedio de todo lo ingresado. */

public class p5e7 {
    public static void main(String[] args) {
        int numero;
        int otroNumero;
        int sumaDeNumeros;
        int cantidadDeSumas = 1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        


        try {
            System.out.println("Ingrese un entero: ");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro numero: ");
            otroNumero = Integer.valueOf(entrada.readLine());
            sumaDeNumeros = numero + otroNumero;
            cantidadDeSumas ++;
            while (otroNumero > 1 && otroNumero <= 10) {
                System.out.println("Ingrese otro numero: ");
                otroNumero = Integer.valueOf(entrada.readLine());
                sumaDeNumeros = sumaDeNumeros + otroNumero;
                cantidadDeSumas ++;
            }
            System.out.println("La suma de todos los numeros ingresados es: " + sumaDeNumeros);
            System.out.println("La cantidad de sumas es: " + cantidadDeSumas);
            System.out.println("El promedio de todo lo ingresado es: "  + sumaDeNumeros / cantidadDeSumas);
            

        }
        catch(Exception exc) {
            System.out.println(exc);
        }
    }

}