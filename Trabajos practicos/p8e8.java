import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Hacer un programa que dado una matriz ordenada creciente por filas de
enteros de tamaño 4*5 que se encuentra precargada, solicite al usuario un
numero entero y una fila, y elimine la primer ocurrencia de numero en la
fila indicada (un número igual) si existe.
*/
public class p8e8 {
    public static void main(String[] args) {
        int[][] numbers = { { 1, 2, 3, 4, 5, }, { 1, 2, 3, 4, 5, }, { 1, 2, 3, 4, 5, }, { 1, 2, 3, 4, 5, }, };
        int enteroUser, filaUser;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entero: ");
            enteroUser = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una fila: ");
            filaUser = Integer.valueOf(entrada.readLine());

            eliminarPrimero(numbers, enteroUser, filaUser);
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void eliminarPrimero(int [][] numbers, int enteroUser, int filaUser) {
        int i = 0;
        while (numbers[filaUser][i] != enteroUser && i < 5) {
            i++;
        }
        if (numbers[filaUser][i] == enteroUser) {
            while (i > 0) {
                numbers[filaUser][i] = numbers[filaUser][i - 1];
                i--;
            }

        }
        for (int fila = 0; fila < 4; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(numbers[fila][columna] + "|");
            }
            System.out.println("");
        }
    }
    
}