/*
Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada elimine todas las secuencias que tienen orden descendente entre
sus elementos.
*/
public class p8e15 {
    public static final int nFIlas = 2;
    public static final int nColumnas = 10;
    public static void main(String[] args) {
        char [][] caracteres = {{' ', 'a', 'b', 'c', ' ', 'c', 'b', 'a', ' ', ' '}, {' ', 'a', 'b', 'c', ' ', 'c', 'b', 'a', ' ', ' '}};
        
        try {
            for (int i = 0; i < 2; i++) {
                obtenerTodasLasSecuencias(caracteres, i);
            }
            imprimirMatriz(caracteres);
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int obtenerInicioSecuencias (char [][] caracteres, int fila, int desde) {
        while (desde < nColumnas && caracteres[fila][desde] == ' ') {
            desde++;
        }
        return desde;
    }
    public static int obtenerFinalSecuencias (char [][] caracteres, int fila, int desde) {
        while (desde < nColumnas && caracteres[fila][desde] != ' ') {
            desde++;
        }
        return desde - 1;
    }
    public static void obtenerTodasLasSecuencias (char [][] caracteres, int fila) {
        int inicio, fin;
        inicio = 0;
        fin = -1;
        boolean verificar = false;
        while (inicio < nColumnas) {
            inicio = obtenerInicioSecuencias(caracteres, fila, fin + 1);
            if (inicio < nColumnas) {
                fin = obtenerFinalSecuencias(caracteres, fila, inicio);
                verificar = verificarOrdenSecuencias(caracteres, fila, inicio, fin);
                if (verificar) {
                    eliminarSecuencias(caracteres, fila, inicio, fin);
                }
                
            }
        }
    }
    public static boolean verificarOrdenSecuencias (char [][] caracteres, int fila, int inicio, int fin) {
        boolean esIgual = true;
        while (inicio < fin) {
            if(caracteres[fila][inicio] > caracteres[fila][inicio + 1]) {
                esIgual = true;
            }
            else {
                esIgual = false;
            }
            inicio++;

        }
        return esIgual;
    }
    public static void eliminarSecuencias (char [][] caracteres, int fila, int inicio, int fin) {
        for (int j = inicio; j <= fin; j++) {
            caracteres[fila][j] = caracteres[fila][j-1];
        }

    }
    public static void imprimirMatriz (char [][] caracteres) {
        for (int i = 0; i < nFIlas; i++) {
            System.out.print("|");
            for (int columna = 0; columna < nColumnas; columna++) {
                System.out.print(caracteres[i][columna] + "|");
            }
            System.out.println("");
        }

    }

}