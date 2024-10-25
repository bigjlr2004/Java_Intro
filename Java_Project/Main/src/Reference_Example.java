import java.awt.*;

public class Reference_Example {
    public static void main(String[] args) {
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);

        Point point1 = new Point(1, 2);
        Point point2 = point1;

        System.out.println("Point2 - x: " + point2.x);
        System.out.println("Point1 - x: " + point1.x);

        point1.x = 3;
        System.out.println("Point1 - x: " + point1.x);
        System.out.println("Point2 - x: " + point2.x);





    }

}
