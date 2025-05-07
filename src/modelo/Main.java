package modelo;

public class Main {
    public static void main(String[] args) {
        Perro p = new Perro("Firulais");
        Gato g = new Gato("Misifu");
        System.out.println(p);
        System.out.println(g);
        p.sonido();
        g.sonido();
    }
}
