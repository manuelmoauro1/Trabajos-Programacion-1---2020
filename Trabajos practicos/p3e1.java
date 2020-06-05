import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p3e1 {
    public static void main(String[] args) {
        char car;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter: ");
            car = entrada.readLine().charAt(0);
            if (car >= 'a' && car <= 'z') {
                System.out.println("El caracter ingresado es una letra");
            } else if (car >= 'A' && car <= 'Z') {
                System.out.println("El caracter ingresado es una letra");

            } else {
                System.out.println(car);
            }
        }

        catch (Exception exc) {
            System.out.println(exc);
        }

    }
}