/*
Voy a hacer un programa que dada un patron, lo busque en una matriz de caracteres. Elimine la secuencia y la copie en un arreglo de caracteres vacio
*/
public class pruebaRecu {
    public static final int nFIlas = 2;
    public static final int nColumnas = 10;
    public static final int  nElementos = nFIlas * nColumnas;
    public static void main(String[] args) {
        char [][] matChar = {{' ', 'b', 'z', 'r', ' ', 'w', 'y', 'w', 'd', ' '},{' ', 'b', 'z', 'r', ' ', ' ', 'y', 'w', 'd', ' '}};
        char [] arrChar = new char [nElementos];
        char [] patron = {'a', 'z','r'};
        try {
            cargarArreglo(arrChar);
            
            for (int i = 0; i < nFIlas; i++) {
                recorrerSecuencias(matChar, arrChar, patron, i);
            }
            imprimirArreglo(arrChar);
            imprimirMatriz(matChar);
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static void cargarArreglo (char [] arrChar) {
        for (int i = 0; i < nElementos; i++) {
            arrChar[i] = 'A';
        }
    }
    public static int obtenerInicioSecuencia (char [][] matChar, int fila, int desde) {
        while (desde < nColumnas && matChar[fila][desde] == ' ') {
            desde++;
        }
        return desde;
    }
    public static int obtenerFInalSecuencia (char[][] matChar, int fila, int desde) {
        while (desde < nColumnas && matChar[fila][desde] != ' ') {
            desde++;
        }
        return desde - 1;
    }
    public static void recorrerSecuencias (char [][] matChar, char [] arrChar, char [] patron, int fila) {
        int inicio = 0;
        int fin = -1;
        while (inicio < nColumnas) {
            inicio = obtenerInicioSecuencia(matChar, fila, fin + 1);
            if(inicio < nColumnas) {
                fin = obtenerFInalSecuencia(matChar, fila, inicio);
                boolean esIgual = secuenciasEsIgualAPatron(matChar, patron, fila, inicio, fin);
                if (esIgual) {
                    int posArreglo = posArrego(arrChar);
                    llenarArreglo(matChar, arrChar, fila, inicio, fin, posArreglo);
                    corrimientoIzquierda(matChar, fila, inicio, fin);
                }
            }
        }
    }
    public static boolean secuenciasEsIgualAPatron (char [][] matChar, char [] patron, int fila, int inicio, int fin) {
        int i = 0;
        boolean esIgual = false;
        if ((fin - inicio) + 1== patron.length) {
            while (inicio <= fin && matChar[fila][inicio] == patron[i]) {
                i++;
                inicio++;
            }
            if (inicio >= fin) {
                esIgual = true;
            }
        }
        return esIgual;
    }
    public static void llenarArreglo (char [][] matChar, char [] arrChar, int fila, int inicio, int fin, int posArreglo) {
        while (inicio <= fin) {
            arrChar[posArreglo] = matChar[fila][inicio];
            inicio++;
            posArreglo++;
        }
    }
    public static void corrimientoIzquierda (char [][] matChar, int fila, int desde, int fin) {
        while (fin >= desde) {
            matChar[fila][fin] = matChar[fila][fin + 1];
            fin--;

        }
    }
    public static int posArrego (char [] arrChar) {
        int i = 0;
        while (arrChar[i] != 'A') {
            i++;
        }
        return i;
    }
    public static void imprimirArreglo (char [] arrChar) {
        for (char c : arrChar) {
            System.out.println(c);
        }
    }
    public static void imprimirMatriz (char [][] matChar) {
        for (int i = 0; i < nFIlas; i++) {
            System.out.print("|");
            for (int columna = 0; columna < nColumnas; columna++) {
                System.out.print(matChar[i][columna] + "|");
            }
            System.out.println("");
        }

    }
}