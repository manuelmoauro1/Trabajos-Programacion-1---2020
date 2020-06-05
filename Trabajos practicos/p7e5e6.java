import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine la primer ocurrencia de numero (un
número igual) en el arreglo si existe. Para ello tendrá que buscar la posición y si está, realizar un
corrimiento a izquierda (queda una copia de la última posición del arreglo en la anteúltima
posición).
*/

/*
Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine todas las ocurrencia de numero en el
arreglo si existe. Mientras exista (en cada iteración tiene que buscar la posición dentro del
arreglo) tendrá que usar la posición para realizar un corrimiento a izquierda (quedarán tantas
copias de la última posición del arreglo como cantidad de ocurrencias del número).
*/

public class p7e5e6 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 4, 4, 10};
        int enteroUsuario;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Ingrese un numero entero: ");
            enteroUsuario = Integer.valueOf(entrada.readLine());
            verificar(numbers, enteroUsuario);
            
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void verificar(int [] numbers, int pos) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == pos) {
                numbers[i] = 0;
            }
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }
    
}