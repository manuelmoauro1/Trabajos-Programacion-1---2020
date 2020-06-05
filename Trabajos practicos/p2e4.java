import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2e4 {
    public static void main(String[] args) {
        int numero;
        boolean multiplo;
        boolean cond2;
        boolean cociente;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresa un numero entero: ");
            numero = Integer.valueOf(entrada.readLine());
            multiplo = numero%6 == 0 && numero%7 == 0;
            cond2 = (numero > 30 && numero%2 == 0) || numero <= 30;
            cociente = numero/5 > 10;
            System.out.println("El numero es múltiplo de 6 y de 7:");
            System.out.println(multiplo);
            System.out.println("El numero es mayor a 30 y múltiplo de 2, o es menor igual a 30:");
            System.out.println(cond2);
            System.out.println("El numero el cociente de la división de dicho número con 5 es mayor a 10:");
            System.out.println(cociente);

    
    
    
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
   

}