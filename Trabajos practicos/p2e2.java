
public class p2e2 {
    public static void main(String[] args) {
        boolean p, q;
        p = true;
        q = false;
        System.out.println("Tablas de verdad para OR:");
        System.out.println(p || q);
        p = false;
        q = true;
        System.out.println(p || q);
        p = true;
        q = true;
        System.out.println(p || q);
        p = false;
        q = false;
        System.out.println(p || q);
        System.out.println("Tablas de verdad para y:");
        p = true;
        q = false;
        System.out.println(p && q);
        p = false;
        q = true;
        System.out.println(p && q);
        p = true;
        q = true;
        System.out.println(p && q);
        p = false;
        q = false;
        System.out.println(p && q);
    }
}