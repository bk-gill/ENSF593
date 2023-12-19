/**
 * This class represents a Rectangle shape.
 * Rectangle is a subclass of Shape2D and implements IShapePoints interface.
 * 
 * @author Balkarn Gill 
 */
public class Rectangle extends Shape2D implements IShapePoints {

    /**
     * The reference point of the rectangle (usually the lower left corner).
     */
    private Point2D referencePoint;

    /**
     * Default constructor that initializes the rectangle with a width of 1 and a height of 2.
     */
    public Rectangle() {
        this(1.0, 2.0);
    }

    /**
     * Constructor that initializes the rectangle with the provided width and height.
     *
     * @param w the width of the rectangle.
     * @param h the height of the rectangle.
     */
    public Rectangle(double w, double h) {
        super(w, h);
        referencePoint = new Point2D();
    }

    /**
     * Gets the circumference of the rectangle.
     *
     * @return the circumference of the rectangle.
     */
    @Override
    public double getCircumference() {
        return 2 * (getHeight() + getWidth());
    }

    /**
     * Gets the area of the rectangle.
     *
     * @return the area of the rectangle.
     */
    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    /**
     * Gets the reference point of the rectangle.
     *
     * @return a new point representing the reference point of the rectangle.
     */
    @Override
    public Point2D getReferencePoint() {
        return new Point2D(referencePoint);
    }

    /**
     * Sets the reference point of the rectangle to a new point.
     *
     * @param p the new point to set as the reference point.
     */
    @Override
    public void setReferencePoint(Point2D p) {
        referencePoint = new Point2D(p);
    }

    /**
     * Gets all points of the rectangle.
     *
     * @return an array of points representing the corners of the rectangle.
     */
    @Override
    public Point2D[] getAllShapePoints() {
        double x = referencePoint.x;
        double y = referencePoint.y;
        double width = getWidth();
        double height = getHeight();

        Point2D lowerLeft = new Point2D(x, y);
        Point2D upperLeft = new Point2D(x, y + height);
        Point2D lowerRight = new Point2D(x + width, y);
        Point2D upperRight = new Point2D(x + width, y + height);

        return new Point2D[]{lowerLeft, lowerRight, upperRight, upperLeft};
    }
}
