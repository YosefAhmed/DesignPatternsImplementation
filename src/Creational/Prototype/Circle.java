package Creational.Prototype;

public class Circle extends Shape {
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle() {
        type = "Circle";
    }
}
