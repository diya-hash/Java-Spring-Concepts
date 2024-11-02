
import java.lang.Math;

public class singleResponsibilityExample {
    double radius = 0.0;

    public singleResponsibilityExample(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double areaOfCircle() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumferenceOfCircle() {
        return Math.PI * (2 * radius);
    }
}