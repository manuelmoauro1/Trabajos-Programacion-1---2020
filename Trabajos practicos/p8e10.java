import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dada la matriz de secuencias de enteros definida
y precargada, permita obtener a través de métodos la posición de inicio y
la posición de fin de la secuencia ubicada a partir de una posición entera
y una fila, ambas ingresadas por el usuario. Finalmente, si existen imprima
por pantalla ambas posiciones obtenidas.
*/
public class p8e10 {
    public static final int maxFilas = 4, maxColum = 20;
    public static int filaUser, columnaUser;
    public static void main(String[] args) {
        int [][] numbers = {{0, 1, 2, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 2, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 2, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 2, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},};
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            for (int fila = 0; fila < 4; fila++) {
                System.out.print("|");
                for (int columna = 0; columna < 20; columna++) {
                    System.out.print(numbers[fila][columna] + "|");
                }
                System.out.println("");
            }
            System.out.println("Ingrese una fila: ");
            filaUser = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una fila: ");
            columnaUser = Integer.valueOf(entrada.readLine());
            System.out.println(obtenerInicio(numbers, filaUser, columnaUser));
            System.out.println(obtenerFinal(numbers, filaUser));
        }

        catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public static int obtenerInicio (int [][] numbers, int fila, int columna) {
        while (numbers[fila][columna] != 0) {
            columna--;

        }
        while (numbers[fila][columna] == 0) {
            columna++;
        }
        return columna;
    }
    public static int obtenerFinal (int [][] numbers, int fila) {
        int desde = obtenerInicio(numbers, filaUser, columnaUser);
        while (numbers[fila][desde] != 0) {
            desde++;
        }
        return desde - 1;
    }
    
}