import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2e1 {
    /* Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
con 2, 3, y 4.*/

    public static void main(String[] args) {
        int entero;
        int div2, div3, div4;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese cualquier numero entero: ");
            entero = Integer.valueOf(entrada.readLine());
            div2 = entero / 2;
            div3 = entero / 3;
            div4 = entero / 4;
            System.out.println("El resultado de la divicion del numero que elegiste y 2 es: " + div2);
            System.out.println("El resultado de la divicion del numero que elegiste y 3 es: " + div3);
            System.out.println("El resultado de la divicion del numero que elegiste y 4 es: " + div4);




        }
        catch (Exception exc){
            System.out.println(exc);
        }

        
        


    }


}