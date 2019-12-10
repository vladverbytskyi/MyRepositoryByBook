package ThirdHomework;

public class Circle {
    double areaOfCircle;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void circleArea() {
        areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle " + areaOfCircle);
    }
}