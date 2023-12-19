/**
 * This abstract class represents a shape in two-dimensional space using its width and height.
 * Subclasses are required to implement two abstract methods:
 *   - getCircumference()
 *   - getArea()
 * 
 * @author Balkarn Gill 
 */
public abstract class Shape2D {
	
    // Width of the shape
    private double width;

    // Height of the shape
    private double height;
	
    /**
     * Default constructor initializing the shape with width and height equal to 1.
     */
    public Shape2D() {
        this(1.0, 1.0);
    }
	
    /**
     * Constructor initializing the shape with given width and height.
     *
     * @param w width of the shape
     * @param h height of the shape
     */
    public Shape2D(double w, double h) {
        this.width = w;
        this.height = h;
    }
	
    /**
     * Returns the width of the shape.
     *
     * @return width of the shape
     */
    public double getWidth() {
        return width;
    }
	
    /**
     * Sets the width of the shape.
     *
     * @param w new width to be set
     */
    public void setWidth(double w) {
        this.width = w;
    }

    /**
     * Returns the height of the shape.
     *
     * @return height of the shape
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the shape.
     *
     * @param h new height to be set
     */
    public void setHeight(double h) {
        this.height = h;
    }
	
    /**
     * Returns a string representation of the shape dimensions (width x height).
     *
     * @return a string representation of the shape
     */
    @Override
    public String toString() {
        return width+" x "+height;
    }
	
    /**
     * Abstract method to calculate and return the circumference of the shape.
     * To be implemented in subclasses.
     *
     * @return circumference of the shape
     */
    public abstract double getCircumference();
	
    /**
     * Abstract method to calculate and return the area of the shape.
     * To be implemented in subclasses.
     *
     * @return area of the shape
     */
    public abstract double getArea();
	
}
