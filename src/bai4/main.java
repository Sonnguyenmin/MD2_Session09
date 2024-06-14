package bai4;

public class main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Red", 5, 10);
        rectangle.display();

        Shape circle = new Circle("Blue", 7);
        circle.display();
    }
}
