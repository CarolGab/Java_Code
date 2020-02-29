package bus;

import com.sun.prism.paint.Color;

public class Square extends Shape {

    public Square()
    {
        super();
    }
    public Square(Point point, String name, String color, float width, float length, ShapeType shapeType) {
        super(point, name, color="Black", width, length, shapeType = ShapeType.Square);
    }

    @Override
    public void setPoint(float x, float y) {

    }

    @Override
    public float getSurfaceArea() {
        return this.width*this.width;
    }

    @Override
    public float getPerimeter() {
        return (this.width)*4;
    }

    public String toString() { return super.toString() + "Surface area: " + getSurfaceArea() + " Perimeter: " + getPerimeter();}
}
