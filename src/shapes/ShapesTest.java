package shapes;

import javax.swing.*;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimiter());

        Rectangle box2 = new Square(5);
        System.out.println("Box 2 Perimeter" + box2.getPerimiter());
        System.out.println("Box 2 Area" + box2.getArea());
    }
}
