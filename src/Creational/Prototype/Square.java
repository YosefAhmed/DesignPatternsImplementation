package Creational.Prototype;

public class Square extends Shape{
    private float height, width;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public Square() {
        type = "Square";
    }
}
