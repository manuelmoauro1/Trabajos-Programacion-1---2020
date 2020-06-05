import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Hacer un programa que dada la matriz de secuencias de enteros definida y
precargada, y un número entero ingresado por el usuario, elimine de cada fila
las secuencias de tamaño igual al número ingresado.
*/
public class p8e13 {
    public static void main(String[] args) {
        int [][] numbers = {{0, 1, 0, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 2, 0, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 2, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},
        {0, 1, 0, 4, 0, 0, 2, 8, 9, 3, 0, 4, 6, 4, 2, 1, 0, 0, 9, 0},};
        int enteroUser;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese un entero: ");
            enteroUser = Integer.valueOf(entrada.readLine());
            for (int i = 0; i < 4; i++) {
                eliminarSecuencias(numbers, enteroUser, i);
            }
            imprimirMatriz(numbers);
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int obtenerInicioSecuencias (int [][] numbers, int fila, int desde) {
        while (desde < 20 && numbers[fila][desde] == 0) {
            desde++;
        }
        return desde;
    }
    public static int obtenerFinSecuencias (int [][] numbers, int fila, int desde) {
        while (desde < 20 && numbers[fila][desde] != 0) {
            desde++;
        }
        return desde - 1;
    }
    public static int obtenerLongitudSecuencias (int [][] numbers, int fila, int desde, int fin) {
        int cuenta = 0;
        for (int i = desde; i <= fin; i++) {
            cuenta++;
        }
        return cuenta;
    }

    public static void eliminarSecuencias (int [][] numbers, int enteroUser, int fila) {
        int inicio, fin;
        inicio = 0;
        fin = -1;
        int cuenta = 0;
        while (inicio < 20) {
            inicio = obtenerInicioSecuencias(numbers, fila, fin + 1);
            if (inicio < 20) {
                fin = obtenerFinSecuencias(numbers, fila, inicio);
                cuenta = obtenerLongitudSecuencias(numbers, fila, inicio, fin);
                if (cuenta == enteroUser) {
                    for (int j = inicio; j <= fin; j++) {
                        numbers[fila][j] = numbers[fila][j-1];
                    }
                }
            }  
        }
        
    }
    public static void imprimirMatriz (int [][] numbers) {
        for (int i = 0; i < 4; i++) {
            System.out.print("|");
            for (int columna = 0; columna < 20; columna++) {
                System.out.print(numbers[i][columna] + "|");
            }
            System.out.println("");
        }
    } 
}