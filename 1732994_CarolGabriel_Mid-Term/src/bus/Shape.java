package bus;

import com.sun.prism.paint.Color;
import com.sun.prism.paint.Paint;
import jdk.nashorn.internal.runtime.Undefined;

public abstract class Shape implements IShape2D
{
    Point point;
    String name;
    String color;
    float width;
    float length;
    ShapeType shapeType;

    public Shape() {
        this.point = new Point(0,0);
        this.name = "Undefined";
        this.color = null;
        this.width = 0;
        this.length = 0;
        this.shapeType = ShapeType.Undefined;
    }

    public Shape(Point point, String name, String color, float width, float length, ShapeType shapeType) {
        this.point = point;
        this.name = name;
        this.color = color;
        this.width = width;
        this.length = length;
        this.shapeType = shapeType;
    }
    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }


    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public String toString()
    {
        return this.shapeType.toString() + " Coordinates (" + this.point + ") " + "Name: " + this.name + " Color: " + this.color + " Width: " +  this.width + " Length: " + this.length;
    }

    public abstract void setPoint(float x, float y);
}
