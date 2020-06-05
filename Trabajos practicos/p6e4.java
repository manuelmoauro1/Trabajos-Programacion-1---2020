import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que mientras el usuario cargue desde
teclado un numero entero distinto de 0, imprima por
pantalla la suma que se obtiene de invocar un método
que calcula la sumatoria de los primeros 200 números
naturales (son números enteros en 1 y 200). */

public class p6e4 {
    public static void main(String[] args) {
        int entero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un entero. Cero para cortar el bucle: ");
            entero = Integer.valueOf(entrada.readLine());
            
            while(entero != 0) {
                suma_200();
                System.out.println("Ingrese un entero. Cero para cortar el bucle: ");
                entero = Integer.valueOf(entrada.readLine());
            }
            
                 
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }

        
        
    }
    public static void suma_200() {
        int i = 0;
        for(int numero = 1; numero <= 200; numero++) {
            i = numero + i;
            System.out.println(i);

        } 
        }
    } 

