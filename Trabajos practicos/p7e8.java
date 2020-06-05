import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y elimine la primer ocurrencia de numero (un número igual) en el
arreglo si existe.
*/

public class p7e8 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 4, 7, 8, 9, 10};
        int enteroUsuario;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entero: ");
            enteroUsuario = Integer.valueOf(entrada.readLine());
            eliminar(numbers, enteroUsuario);

            
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void eliminar(int [] numbers, int enteroUser) {
        int i = 0;
        while (numbers[i] != enteroUser) {
            i++;               
        }
        if (numbers[i] == enteroUser) {
            numbers[i] = 0;
        }
        for (int j : numbers) {
            System.out.println(j);
        }
    }
    
}