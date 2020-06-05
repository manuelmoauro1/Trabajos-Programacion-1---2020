import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p3e3 {
    public static void main(String[] args) {
        int entero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero: ");
            entero = Integer.valueOf(entrada.readLine());
            if (entero % 6 == 0 && entero % 7 == 0){
                System.out.println("El entero en multiplo de 6 y de 7.");
            }
            else if (entero > 30 && entero % 2 == 0) {
                System.out.println("El entero es mayor a 30 y es multiplo de 2.");
            }
            if (entero / 5 > 10){
                System.out.println("El cociente de la division del entero por 5 es mayor a 10.");
            }

        }
        
        catch(Exception exc) {
            System.out.println(exc);
        }
    }

}