import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p3e2 {
    public static void main(String[] args) {
        int entero1;
        int entero2;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero: ");
            entero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro entero: ");
            entero2 = Integer.valueOf(entrada.readLine());
            if (entero1 > entero2) {
                System.out.println(entero1);

            }
            else if (entero1 % 2 == 0 && entero2 % 2 ==0) {
                System.out.println(entero2);
            }
            else {
                System.out.println("C");
            }


        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        
    }

}