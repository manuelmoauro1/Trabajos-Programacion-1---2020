import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y lo inserte en el arreglo manteniendo su orden. Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del arreglo)
y colocar el numero en el arreglo en la posición indicada.
*/

public class p7e7 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int enteroUsuario;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un entero para meterlo dentro del arreglo: ");
            enteroUsuario = Integer.valueOf(entrada.readLine());
            insercion(numbers, enteroUsuario);
            
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
        
    }
    public static void insercion(int [] numbers, int numberUser) {
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[numbers.length - 1] < numberUser) {
                numbers[i] = numberUser;
            }
            else if (numbers[i] > numberUser) {
                numbers[i] = numbers[i-1];
            }
        }
        for (int i : numbers) {
            System.out.println(i);
        }

    }
     
}