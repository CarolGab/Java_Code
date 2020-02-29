package bus;

public class Rectangle extends Shape
{
    public Rectangle()
    {
        super();
    }
    public Rectangle(Point point, String name, String color, float width, float length, ShapeType shapeType) {
        super(point, name, color="Red", width, length, shapeType = ShapeType.Rectangle);
    }

    @Override
    public void setPoint(float x, float y) {

    }

    @Override
    public float getSurfaceArea() {
        return this.width*this.length;
    }

    @Override
    public float getPerimeter() {
        return (this.width+this.length)*2;
    }

    public String toString() { return super.toString() + "Surface area: " + getSurfaceArea() + " Perimeter: " + getPerimeter();}
}

