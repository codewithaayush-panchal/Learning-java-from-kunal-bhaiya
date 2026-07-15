package polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        shapes circle = new circle();
        shapes square = new square();

        circle.area();
    }
}
