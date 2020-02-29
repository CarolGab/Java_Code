package client;
import bus.*;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Shape> ShapeList = new ArrayList<>();
        boolean triangle=false;
        boolean rectangle=false;
        boolean square=false;

        Triangle t1 = new Triangle();
        t1.setPoint(0, 1);
        t1.setName("BB");
        t1.setSide1(5);
        t1.setSide2(10);
        t1.setWidth(4);
        t1.setLength(7);
        t1.setShapeType(ShapeType.Triangle);
        ShapeList.add(t1);

        Rectangle r1 = new Rectangle();
        r1.setName("NN");
        r1.setLength(4);
        r1.setPoint(1,5);
        r1.setWidth(7);
        r1.setShapeType(ShapeType.Rectangle);
        ShapeList.add(r1);

        Square s1 = new Square();
        s1.setName("JJ");
        s1.setWidth(5);
        s1.setPoint(8,8);
        s1.setShapeType(ShapeType.Square);
        ShapeList.add(s1);

        System.out.println("Menu\n1.Add Shape\n2.Display all shapes\n3.Remove a shape\n4.Search\n5.Sort Shapes\n6.Display Types");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("What type of shape is your shape? Triangle? Square? Rectangle? (T/S/R)");
                String input = scanner.nextLine();
                switch (input)
                {
                    case "T":
                        triangle=true;
                        rectangle=false;
                        square=false;
                        break;
                    case"S":
                        triangle=false;
                        rectangle=false;
                        square=true;
                        break;
                    case "R":
                        triangle=false;
                        rectangle=true;
                        square=false;
                        break;
                }
                System.out.println("What is the name of your shape?");
                String input1 = scanner.nextLine();
                if(triangle==true)
                {
                    System.out.println("Please enter the Coordinate x: ");
                    float x = scanner.nextFloat();
                    System.out.println("Please enter the Coordinate y: ");
                    float y = scanner.nextFloat();
                    System.out.println("Please enter side 1 measurement: ");
                    float side1 = scanner.nextFloat();
                    System.out.println("Please enter side 2 measurement: ");
                    float side2 = scanner.nextFloat();
                    System.out.println("Please enter side 3 measurement: ");
                    float side3 = scanner.nextFloat();
                    Triangle triangles = new Triangle();
                    triangles.setPoint(x, y);
                    triangles.setWidth(side3);
                    triangles.setSide1(side1);
                    triangles.setSide2(side2);
                    triangles.setName(input1);
                    ShapeList.add(triangles);
                }
                if(rectangle==true)
                {
                    System.out.println("Please enter the Coordinate x: ");
                    float x = scanner.nextFloat();
                    System.out.println("Please enter the Coordinate y: ");
                    float y = scanner.nextFloat();
                    System.out.println("Please enter width measurement: ");
                    float width = scanner.nextFloat();
                    System.out.println("Please enter length measurement: ");
                    float length = scanner.nextFloat();
                    Rectangle rectangles = new Rectangle();
                    rectangles.setPoint(x, y);
                    rectangles.setWidth(width);
                    rectangles.setLength(length);
                    rectangles.setName(input1);
                    ShapeList.add(rectangles);
                }
                if(square==true)
                {
                    System.out.println("Please enter the Coordinate x: ");
                    float x = scanner.nextFloat();
                    System.out.println("Please enter the Coordinate y: ");
                    float y = scanner.nextFloat();
                    System.out.println("Please enter side measurement: ");
                    float side = scanner.nextFloat();
                    Square squares = new Square();
                    squares.setPoint(x, y);
                    squares.setWidth(side);
                    squares.setName(input1);
                    ShapeList.add(squares);
                }
                break;
            case 2:
                for (Shape shape: ShapeList)
                {
                    System.out.println(shape);
                }
                break;
            case 3:
                System.out.println("Enter the name of the shape you wish to remove: ");
                String input2=scanner.nextLine();
                for (Shape shape: ShapeList)
                {
                    if(input2==shape.getName())
                    {
                        ShapeList.remove(shape);
                    }
                }
                break;
            case 4:
                System.out.println("Enter the name of the shape you wish to search: ");
                input=scanner.nextLine();
                for(Shape shape : ShapeList)
                {
                    if(input==shape.getName())
                    {
                        System.out.println(shape);
                    }
                }
                break;
            case 5:
                break;
            case 6:
                for (ShapeType type:ShapeType.values())
                {
                    System.out.println(type);
                }
        }
    }

}
