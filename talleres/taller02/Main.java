
public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio #1:");
        int a, b, c, d;
        a = euclides(12, 36);
        b = euclides(8, 12);
        c = euclides(72, 108);
        d = euclides(162, 270);
        if (a == 12 && b == 4 && c == 36 && d == 54)
            System.out.println("True");
        else System.out.println("False");
        System.out.println();

        System.out.println("Ejercicio #2:");
        boolean a2, b2, c2, d2;
        int[] elementos = {2, 4, 8};
        int[] elementos2 = {10, 2, 2, 5};
        a2 = peso(elementos, 9, 0, 0);
        b2 = peso(elementos, 8, 0, 0);
        c2 = peso(elementos2, 9, 0, 0);
        d2 = peso(elementos2, 17, 0, 0);
        if (!a2 && b2 && c2 && d2)
            System.out.println("True");
        else System.out.println("False");
        System.out.println();

        System.out.println("Ejercicio #3:");
        grupos(palabra, "", 0);
    }


    public static int euclides(int p, int q) {
        if (q == 0) return p;
        else return euclides(q, p % q);
    }


    public static boolean peso(int[] elementos, int carga, int suma, int p) {
        if (p<elementos.length) {
            suma += elementos[p];
            if (suma == carga) {
                return true;
            } else return peso(elementos, carga, suma, p + 1) || peso(elementos, carga, suma - elementos[p], p + 1);
        } else return false;
    }


    public static void grupos(String palabra, String parte, int index) {
        if (parte.length()==palabra.length()) {
            System.out.println(palabra);
        } else {
            System.out.println(parte);
            for (int i=index; i<palabra.length(); i++) {
                grupos(palabra, parte+palabra.charAt(i), i+1);
            }
        }
    }

}
