import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la
menor posición del arreglo.
*/


public class p7e3 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese una posicion del arreglo: ");
            pos = Integer.valueOf(entrada.readLine());
            corrimiento(numbers, pos);

        }
        catch(Exception exc) {
            System.out.println(exc);
        }
    }
    public static void corrimiento(int [] numbers, int pos) {
        for (int i = 0; i <= pos; i++) {
            numbers[i] = numbers[i+1];
        }
        for (int i : numbers) {
            System.out.println(i);
        }

    }
    
}