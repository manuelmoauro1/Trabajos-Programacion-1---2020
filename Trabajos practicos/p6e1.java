import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un diseño de programa que mientras que el usuario
ingrese un número distinto de 0, pida ingresar otro numero y
lo imprima. */

/* Disenio de programa 
public class p6e1 {
    public static void main(String[] args) {
        defino variable de tipo entero.
        obtengo numero por teclado
            mientras numero no sea cero
                imprimo el numero     
    }
}
*/

public class p6e1 {
    public static void main(String[] args) {
        int entero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            do {
                System.out.println("Ingrese un numero distinto de cero: ");
                entero = Integer.valueOf(entrada.readLine());
                System.out.println(entero);

            }
            while (entero != 0); {
            }
            
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    
}