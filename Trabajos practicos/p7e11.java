/*
	Hacer un programa que dado el arreglo definido y precargado permita
	encontrar la posición de inicio y fin de la secuencia cuya suma de valores sea
	mayor. 
*/

public class p7e11 {
    public static void main(String[] args) {
        int [] numbers = {0, 1, 1, 1, 3, 5, 7, 0, 0, 6, 1, 9, 7, 4, 0, 0, 1, 8, 7, 0};

        try {
            compararSumasTodasLasSecuencias(numbers);

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int obtenerInicioSecuencia (int [] numbers, int desde) {
	    int inicioSecuencia = desde;
	    while (inicioSecuencia < numbers.length && numbers[inicioSecuencia] == 0) {
	        inicioSecuencia++;
	    }
	    return inicioSecuencia;
	}
    public static int obtenerFinSecuencia (int [] numbers, int inicio) {
        int finSecuencia = inicio;
        while (numbers[finSecuencia] != 0) {
            finSecuencia++;
        }
        return finSecuencia - 1;
    }
    public static int obtenerSumas (int [] numbers, int posIni, int posFin) {
        int suma = 0;
        while (posIni <= posFin) {
            suma += numbers[posIni];
            posIni++;
        }
        return suma;
    }
    public static void compararSumasTodasLasSecuencias (int [] numbers) {
        int inicio,fin,suma;
		inicio = 0;
        fin = -1;
        suma = 0;
        int mayorSuma = 0;
        int posInicioMayor = 0;
        int posFinMayor = 0;
		while ((inicio < numbers.length)) {
			inicio = obtenerInicioSecuencia(numbers, fin + 1);
			if (inicio < numbers.length) {
                fin = obtenerFinSecuencia(numbers ,inicio);
                suma = obtenerSumas(numbers, inicio, fin);
                if (suma > mayorSuma) {
                    mayorSuma = suma;
                    posInicioMayor = inicio;
                    posFinMayor = fin;
                }
			}
        }
        System.out.println("La secuencia con mayor suma comienza en: " + posInicioMayor);
        System.out.println("La secuencia con mayor suma termina en: " + posFinMayor);
    }
}