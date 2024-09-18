abstract class Shape
{
    private String name;
    private String color;
    private boolean isFlat;
    
    public Shape(String name, String color, boolean isFlat)
    {
        this.name = name;
        this.color = color;
        this.isFlat = isFlat;
    }
    
    String getName()
    {
        return name;
    }
    
    String getColor()
    {
        return color;
    }
    
    boolean getIsFlat()
    {
        return isFlat;
    }
}

abstract class TwoDShape extends Shape
{
    private int numberOfSides;
    
    public TwoDShape(String name, String color, int numberOfSides)
    {
        super(name, color, true);
        this.numberOfSides = numberOfSides;
    }
    
    int getNumberOfSides()
    {
        return numberOfSides;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}

abstract class ThreeDShape extends Shape 
{
    public ThreeDShape(String name, String color)
    {
        super(name, color, false);
    }
    
    public abstract double getSurfaceArea();
    public abstract double getVolume();
}

class Square extends TwoDShape
{
    private double lengthOfSide;
    
    public Square(String color, double lengthOfSide)
    {
        super("Square", color, 4);
        this.lengthOfSide = lengthOfSide;
    }
    
    double getLengthOfSide()
    {
        return lengthOfSide;
    }
    
    public double getArea()
    {
        return lengthOfSide * lengthOfSide;
    }
    
    public double getPerimeter()
    {
        return (4 * lengthOfSide);
    }
}

class RectangularPrism extends ThreeDShape
{
    private double length;
    private double width;
    private double height;
    
    public RectangularPrism(String color, double length, double width, double height)
    {
        super("Rectangular Prism", color);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    double getLength()
    {
        return length;
    }
    
    double getWidth()
    {
        return width;
    }
    
    double getHeight()
    {
        return height;
    }
    
    public double getSurfaceArea()
    {
        return (2 * (width * length + height * length + height * width));
    }
    
    public double getVolume()
    {
        return (width * height * length);
    }
}
