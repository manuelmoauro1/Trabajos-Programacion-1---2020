import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2e3 {
    public static void main(String[] args) {
        int num1, num2;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el primer numero: ");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el segundo numero: ");
            num2 = Integer.valueOf(entrada.readLine());
            System.out.println("El primer numero es mayor al segundo:");
            System.out.println(num1 > num2);
            System.out.println("Son multiplos de 2:");
            System.out.println(num1%2 == 0 && num2%2 == 0);


        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        

    }

}