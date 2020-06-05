import java.io.BufferedReader;
import java.io.InputStreamReader;
public class p1e5e6 {
    /*Escribir un programa que pida que se ingresen datos necesarios para emitir una
factura por la compra de dos artículos de librería (tipo factura, número, nombre
cliente, producto 1, importe 1, producto 2, importe 2, importe total).

Como salida debe imprimir por pantalla la factura en un formato similar al
siguiente (utilizar literales):




*/
    public static void main(String[] args) {
        String tipo_factura;
        int numero_factura;
        String nombre_cliente, producto1, producto2;
        float importe1, importe2, importe_total;
        try {
            BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el tipo de factura: ");
            tipo_factura = entrada.readLine();
            System.out.println("Ingrese el numero de factura: ");
            numero_factura = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese su nombre completo: ");
            nombre_cliente = entrada.readLine();
            System.out.println("Ingrese el producto 1: ");
            producto1 = entrada.readLine();
            System.out.println("Ingrese el importe del producto 1: ");
            importe1 = Float.valueOf(entrada.readLine());
            System.out.println("Ingrese el producto 2: ");
            producto2 = entrada.readLine();
            System.out.println("Ingrese el importe del producto 2: ");
            importe2 = Float.valueOf(entrada.readLine());
            importe_total = importe1 + importe2;
            // ---------------------------------------------------------------------
            System.out.println("Factura \t" + tipo_factura + "\n" + "Numero de factura \t" + numero_factura + "\n" + "Nombre y Apellido" + "\t" + nombre_cliente + "\n" + producto1 + "\t \t" + importe1 + "\n" + producto2 + "\t \t" + importe2 + "\n" + "Importe total" + "\t" + importe_total );
        
        }
        catch(Exception exc){
            System.out.println(exc);
        }


    }

}