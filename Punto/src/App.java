public class App {
    public static void main(String[] args) throws Exception {
        Punto p1 = new Punto(3, 4);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        Punto p2 = new Punto(5);
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        Punto p3 = new Punto();
        System.out.println(p3.getX());
        System.out.println(p3.getY());

        System.out.println("modulo: ");
        System.out.println(p1.modulo());
        System.out.println(p2.modulo());
        System.out.println(p3.modulo());

        System.out.println("fase: ");
        System.out.println(p1.fase());
        System.out.println(p2.fase());
        System.out.println(p3.fase());
        /*
        Punto punto1, punto2 = new Punto(0, 0), punto3, punto4;
        System.out.println(punto2.getX());
        System.out.println(punto2.getY());
        punto1 = new Punto(3, 4);
        System.out.println(punto1.getX());
        System.out.println(punto1.getY());
        punto4 = punto1;
        System.out.println(punto4.getX());
        System.out.println(punto4.getY());
 
        Punto p1 = new Punto(5, 3);
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        p1.setX(2);
        p1.setY(2);
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        Punto p2 = new Punto(0, 0);
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        */
    }
}
