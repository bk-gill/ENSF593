/**
 * This class represents a Right Triangle shape.
 * RightTriangle is a subclass of Shape2D.
 * 
 * @author Balkarn Gill 
 */
public class RightTriangle extends Shape2D {

    /**
     * Default constructor that initializes the right triangle with a base and height of 1.
     */
    public RightTriangle() {
        this(1.0, 1.0);
    }

    /**
     * Constructor that initializes the right triangle with the provided base and height.
     *
     * @param w the base of the right triangle.
     * @param h the height of the right triangle.
     */
    public RightTriangle(double w, double h) {
        super(w, h);
    }

    /**
     * Gets the perimeter of the right triangle.
     * The perimeter is calculated as the sum of the base, height, and hypotenuse.
     *
     * @return the circumference of the right triangle.
     */
    @Override
    public double getCircumference() {
        double a = getWidth();
        double b = getHeight();
        double c = Math.sqrt(a * a + b * b);
        return a + b + c;
    }

    /**
     * Gets the area of the right triangle.
     * The area is calculated as half the product of the base and height.
     *
     * @return the area of the right triangle.
     */
    @Override
    public double getArea() {
        return 0.5 * getWidth() * getHeight();
    }
}
