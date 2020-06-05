import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario un numero entero y elimine todas las ocurrencia de numero
en la matriz si existe. Mientras exista (en cada iteración tiene que buscar la posición fila y
columna) tendrá que usar dicha posición para realizar un corrimiento a izquierda.
*/

public class p8e6 {
    public static void main(String[] args) {
        int[][] numbers = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, };
        int enteroUser;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entero");
            enteroUser = Integer.valueOf(entrada.readLine());

            eliminarTodos(numbers, enteroUser);


        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void eliminarTodos (int [][] numbers, int enteroUser) {
        int j = 0;
        int pos;
        for (int i = 0; i < numbers.length; i ++)  {
            while (numbers[i][j] != enteroUser) {
                j++;
            }
            if (numbers[i][j] == enteroUser) {
                int indice = 0;
                pos = numbers[i][j];
                while (indice < pos) {
                    numbers[i][indice] = numbers[i][indice + 1];
                    indice++;
                }
            }

        }
        for (int fila = 0; fila < 5; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < 10; columna++) {
                System.out.print(numbers[fila][columna] + "|");
            }
            System.out.println("");
        }


    }
        
}
    