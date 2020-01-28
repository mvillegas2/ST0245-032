

public class Main {

    public static void main(String[] args) {
        Punto p1 = new Punto (10,20);
        System.out.println(p1.x());
        System.out.println(p1.y());
        System.out.println(p1.radioPolar());
        System.out.println(p1.anguloPolar());
        Punto p2 = new Punto (0,0);
        System.out.println(p1.distanciaEuclidiana(p2));
        System.out.println();


        Fecha f1 = new Fecha (15,1,2020);
        System.out.println(f1.dia());
        System.out.println(f1.mes());
        System.out.println(f1.ano());
        System.out.println(f1.obtenerFecha());
        Fecha f2 = new Fecha (15,1,2020);
        System.out.println(f1.igual(f2));
        System.out.println(f1.comparar(f2));
        System.out.println();

        Contador c1 = new Contador ("contador");
        System.out.println(c1.getNombreContador());
        for (int i=0; i<5; i++) {
            c1.incrementar();
        }
        System.out.println(c1.incrementos());
        System.out.println(c1.toString());
    }
}
