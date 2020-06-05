/*
Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada, elimine de cada fila todas las ocurrencias de una secuencia
patrón dada por un arreglo de caracteres de tamaño igual al tamaño de
columnas de la matriz (solo tiene esa secuencia con separadores al inicio y al
final). Al eliminar en cada fila se pierden los valores haciendo los corrimientos.
*/
public class p8e14 {
    public static final int nFilas = 2;
    public static final int nColumnas = 10;
    public static void main(String[] args) {
        char [][] caracteres = {{' ','a','z','c',' ','g','z','i','s', ' '},{' ','a','b','c',' ','g','z','i','s', ' '}};
        char [] patron = {' ',' ',' ', 'a', 'b', 'c', ' ', ' ', ' ', ' '};

        try {
            for (int i = 0; i < nFilas; i++) {
                eliminarSecuenciasIguales(caracteres, patron, i);
            }
            
            imprimirMatriz(caracteres);
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static int obtenerInicioSecuencias (char [][] matriz, int fila, int desde) {
        while (desde < nColumnas && matriz[fila][desde] == ' ') {
            desde++;
        }
        return desde;
        
    }
    public static int obtenerFinalSecuencias (char [][] matriz, int fila, int desde) {
        while(desde < nColumnas && matriz[fila][desde] != ' ') {
            desde++;
        }
        return desde - 1;
    }
    public static int obtenerInicioArreglo (char [] patron, int desde) {
        while (desde < nColumnas && patron[desde] == ' ') {
            desde++;
        }
        return desde;
    }
    public static int obtenerFinalArreglo (char [] patron, int desde) {
        while(desde < nColumnas && patron[desde] != ' ') {
            desde++;
        }
        return desde - 1;
    }
    public static void eliminarSecuenciasIguales (char [][] caracteres, char [] patron, int fila) {
        int inicio, inicioA, fin, finA;
        inicio = 0;
        inicioA = 0;
        fin = -1;
        finA = -1;
        while ((inicio < nColumnas)) {
            inicio = obtenerInicioSecuencias(caracteres, fila, fin + 1);
            inicioA = obtenerInicioArreglo(patron, finA + 1);
            if (inicio < nColumnas) {
                fin = obtenerFinalSecuencias(caracteres, fila, inicio);
                finA = obtenerFinalArreglo(patron, inicioA);
                if (compararSeecuencias(caracteres, patron, fila, inicio, inicioA, fin, finA)) {
                    for (int i = fin; i >= inicio; i--) {
                        caracteres[fila][i] = caracteres[fila][i + 1];
                    }
                }
            }
        }
    }
    public static boolean compararSeecuencias (char [][] caracteres, char [] patron, int fila, int inicio, int inicioA, int fin, int finA) {
        if (fin - inicio == finA - inicioA) {
            if (caracteres[fila][inicio] == patron[inicioA]) {
                while (inicioA <= finA && caracteres[fila][inicio] == patron[inicioA]) {
                    inicio++;
                    inicioA++;
                }
                if (inicio > fin) {
                    return true;
                } 
            }
        }
        return false;
    }
    
    public static void imprimirMatriz (char [][] numbers) {
        for (int i = 0; i < 2; i++) {
            System.out.print("|");
            for (int columna = 0; columna < 10; columna++) {
                System.out.print(numbers[i][columna] + "|");
            }
            System.out.println("");
        }
    } 
    
}