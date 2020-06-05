import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Se tiene una MAT de enteros de tamano 5 x 20, donde en cada fila se tienen secuencias de numeros distintos de ceros
separados por uno o mas ceros. Realizar un programa que para todas las filas invierta el contenido de las secuencias 
de tamano N y que empiezan y terminan con al menos un 1, siendo N un valor entero cargado por teclado.
*/
public class extra {
    public static final int nFIlas = 5;
    public static final int nColumnas = 20;
    public static void main(String[] args) {
        int [][] numbers = {{0, 3, 4, 7, 0, 1, 4, 2, 8, 1, 0, 5, 6, 3, 1, 0, 7, 2, 4, 0},
        {0, 3, 4, 7, 0, 1, 4, 2, 8, 9, 0, 5, 6, 3, 1, 0, 7, 2, 4, 0},
        {0, 3, 4, 7, 0, 1, 4, 2, 8, 9, 0, 5, 6, 3, 1, 0, 7, 2, 4, 0},
        {0, 3, 4, 7, 0, 1, 4, 2, 8, 9, 0, 5, 6, 3, 1, 0, 7, 2, 4, 0},
        {0, 3, 4, 7, 0, 1, 4, 2, 8, 1, 0, 5, 6, 3, 1, 0, 7, 2, 4, 0}};
        int enteroUser;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un entero: ");
            enteroUser = Integer.valueOf(entrada.readLine());
            
            realizarEjercicio(numbers, enteroUser);
            imprimirMatriz(numbers);

            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void realizarEjercicio (int [][] numbers, int enteroUser) {
        for (int i = 0; i < 5; i++) {
            recorrerTodasLasSecuencias(numbers, i, enteroUser);

        }
    }
    public static int obtenerInicioSecuencias (int [][] numbers, int fila, int desde) {
        while (desde < nColumnas && numbers[fila][desde] == 0) {
            desde++;
        }
        return desde;
    }
    public static int obtenerFinalSecuencias (int [][] numbers, int fila, int desde) {
        while (desde < nColumnas && numbers[fila][desde] != 0) {
            desde++;
        }
        return desde - 1;
    }
    public static void recorrerTodasLasSecuencias (int [][] numbers, int fila, int enteroUser) {
        int inicio = 0;
        int fin = -1;
        while (inicio < nColumnas) {
            inicio = obtenerInicioSecuencias(numbers, fila, fin + 1);
            if (inicio < nColumnas) {
                fin = obtenerFinalSecuencias(numbers, fila, inicio);
                if (verificarSecuencias(numbers, fila, inicio, fin, enteroUser)) {
                    corrimientoAIzquierda(numbers, fila, inicio, fin);
                }

            }

        }
    }
    public static boolean verificarSecuencias (int [][] numbers, int fila, int inicio, int fin, int enteroUser) {
        return ((fin - inicio == enteroUser) && (numbers[fila][inicio] == 1 && numbers[fila][fin] == 1));


    }
    public static void imprimirMatriz (int [][] numbers) {
        for (int i = 0; i < nFIlas; i++) {
            System.out.print("|");
            for (int columna = 0; columna < nColumnas; columna++) {
                System.out.print(numbers[i][columna] + "|");
            }
            System.out.println("");
        }
    }public static void corrimientoAIzquierda (int [][] numbers, int fila, int inicio, int fin) {
        for(int i = inicio; i <= fin; i++) {
            numbers[fila][i] = numbers[fila][i-1];
        }
    }
}