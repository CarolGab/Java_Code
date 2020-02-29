package bus;

public class Triangle extends Shape
{
    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    float side1;
    float side2;

    public Triangle()
    {
        super();
        this.side1=0;
        this.side2=0;
    }

    @Override
    public void setPoint(float x, float y) {

    }

    public Triangle(Point point, String name, String color, float width, float length, ShapeType shapeType, float side1, float side2) {
        super(point, name, color="Blue", width, length, shapeType = ShapeType.Triangle);
        this.side1=side1;
        this.side2=side2;

    }

    @Override
    public float getSurfaceArea() {
        return (this.length*this.width)/2;
    }

    @Override
    public float getPerimeter() {
        return this.side1+this.side2+this.width;
    }

    public String toString() { return super.toString() + "Surface area: " + getSurfaceArea() + " Perimeter: " + getPerimeter();}
}
