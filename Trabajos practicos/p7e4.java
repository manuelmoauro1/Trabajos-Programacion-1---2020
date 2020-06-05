import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo (posición
0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor del arreglo) y
colocar el numero en el arreglo en la posición indicada.
*/

public class p7e4 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int enteroUsuario;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese un valor para insertarlo en la posicion 0: ");
            enteroUsuario = Integer.valueOf(entrada.readLine());
            corrimiento(numbers, enteroUsuario);

        }
        catch(Exception exc) {
            System.out.println(exc);
        }
    }
    public static void corrimiento(int [] numbers, int pos) {
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i-1];
        }
        numbers[0] = pos;

        for (int i : numbers) {
            System.out.println(i);
        }
    }
    
}