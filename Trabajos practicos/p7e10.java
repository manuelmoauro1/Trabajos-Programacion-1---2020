import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado el arreglo definido y precargado permita
obtener a través de métodos la posición de inicio y la posición de fin de la
secuencia ubicada a partir de una posición entera ingresada por el
usuario. Finalmente, si existen imprima por pantalla ambas posiciones
obtenidas.
 */
public class p7e10 {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 0, 3, 5, 7, 4, 0, 0, 1, 9, 7, 4, 6, 0, 1, 8, 0, 0 };
        int posUser;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese una posicion del arreglo: ");
            posUser = Integer.valueOf(entrada.readLine());

            int posInicio = posInicio(numbers, posUser);
            int posFin = posFin(numbers, posUser);
            System.out.println("La proxima secuencia comienza en la posicion: " + posInicio);
            System.out.println("La proxima secuencia finaliza en la posicion: " + posFin);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static int posInicio(int[] numbers, int posUser) {
        int j = posUser;
        while (numbers[j] != 0) {
            j--;
        }
        while (numbers[j] == 0) {
            j++;
        }
        return j;
    }

    public static int posFinal(int[] numbers, int posUser) {
	    int j = posUser;
	    while (numbers[j] != 0) {
	        j--;
	    }
	    while (numbers[j] == 0) {
	        j++;
	    }
	    return j;
	}

	public static int posFin(int[] numbers, int posUser) {
        int i = posUser;
        while (numbers[i] == 0) {
            i++;
        }
        while (numbers[i] != 0) {
            i++;
        }
        return i - 1;
    }

}