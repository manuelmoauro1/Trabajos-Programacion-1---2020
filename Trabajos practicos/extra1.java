/*
Hacer un programa que dada la matriz de secuencias de caracteres definida y 
precargada elimine todas las secuencias que tienen orden descendente entre sus elementos.

*/
public class extra1 {
    public static final int nFilas = 2;
    public static final int nColumnas = 10;
    public static void main(String[] args) {
        char [][] caracteres = {{' ', 'a', 'b', 'c', ' ', 'z', 'y', 'x', ' ', ' '},
        {' ', 'a', 'b', 'c', ' ', 'z', 'y', 'z', ' ', ' '}};

        try {
            unirTodo(caracteres);
            imprimirMatriz(caracteres);
            
        }
        catch (Exception e) {
            System.out.println(e);
        } 
    }
    public static void unirTodo (char [][] caracteres) {
        for (int i = 0; i < nFilas; i++) {
            recorrerSecuencias(caracteres, i);
        }
    }
    public static int obtenerInicioSecuencia (char [][] caracteres, int fila, int desde) {
        while (desde < nColumnas && caracteres[fila][desde] == ' ') {
            desde++;
        }
        return desde;
    }
    public static int obtenerFInalSecuencia (char [][] caracteres, int fila, int desde) {
        while (desde < nColumnas && caracteres[fila][desde] != ' ') {
            desde++;
        }
        return desde - 1;
    }
    public static void recorrerSecuencias (char [][] caracteres, int fila) {
        int inicio, fin;
        inicio = 0;
        fin = -1;
        while (inicio < nColumnas) {
            inicio = obtenerInicioSecuencia(caracteres, fila, fin + 1);
            if (inicio < nColumnas) {
                fin = obtenerFInalSecuencia(caracteres, fila, inicio);
                if (verificarOrdenElementos(caracteres, fila, inicio, fin)) {
                    eliminarSecuencia(caracteres, fila, inicio, fin);
                }
            }
        }
    }
    public static boolean verificarOrdenElementos (char [][] caracteres, int fila, int inicio, int fin) {
        while (inicio < fin && caracteres[fila][inicio] >= caracteres[fila][inicio + 1]) {
            inicio++;

        }
        if (inicio >= fin) {
            return true;
        }
        return false;
    }
    public static void eliminarSecuencia (char [][] caracteres, int fila, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            caracteres[fila][i] = caracteres[fila][i-1];
        }
    }
    public static void imprimirMatriz (char [][] caracteres) {
        for (int i = 0; i < nFilas; i++) {
            System.out.print("|");
            for (int columna = 0; columna < nColumnas; columna++) {
                System.out.print(caracteres[i][columna] + "|");
            }
            System.out.println("");
        }
    }
}