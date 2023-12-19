/**
 * This class represents a Square shape.
 * Square is a subclass of Shape2D.
 * 
 * @author Balkarn Gill 
 */
public class Square extends Shape2D {

    /**
     * Default constructor that initializes the square with a side length of 1.
     */
    public Square() {
        this(1.0);
    }

    /**
     * Constructor that initializes the square with the provided side length.
     *
     * @param sideLength the length of the sides of the square.
     */
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    /**
     * Gets the perimeter of the square.
     * The perimeter is calculated as four times the side length.
     *
     * @return the circumference of the square.
     */
    @Override
    public double getCircumference() {
        return 4 * getWidth();
    }

    /**
     * Gets the area of the square.
     * The area is calculated as the side length squared.
     *
     * @return the area of the square.
     */
    @Override
    public double getArea() {
        return getWidth() * getWidth();
    }

    /**
     * Sets the width of the square, and adjusts the height to maintain the square property.
     *
     * @param w the new width and height to set.
     */
    @Override
    public void setWidth(double w) {
        super.setWidth(w);
        super.setHeight(w);
    }

    /**
     * Sets the height of the square, and adjusts the width to maintain the square property.
     *
     * @param h the new height and width to set.
     */
    @Override
    public void setHeight(double h) {
        super.setHeight(h);
        super.setWidth(h);
    }
}
