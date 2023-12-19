import java.util.Arrays;

/**
 * This class provides utility methods to print shape information and perform tests on shapes.
 * 
 * @author Balkarn Gill 
 */
public class TestShapes {

	/**
	 * Prints the information about a shape, including its dimensions, area, and circumference.
	 *
	 * @param s The shape to print information for.
	 */
	public static void printShapeInfo(Shape2D s) {
		System.out.println(s);

		System.out.println("area= " + s.getArea());
		System.out.println("circumference= " + s.getCircumference());
	}

	/**
	 * Prints the reference point and all points of a shape implementing the IShapePoints interface.
	 *
	 * @param shape The shape to print point information for.
	 */
	public static void printPointInformation(IShapePoints shape) {
		System.out.println("Reference point: " + shape.getReferencePoint());
		System.out.println("All points: " + Arrays.toString(shape.getAllShapePoints()));
	}

	/**
	 * Performs a reference point change test on a shape implementing the IShapePoints interface.
	 * It prints the initial point information, sets a new reference point, and prints the updated point information.
	 *
	 * @param shape The shape to perform the test on.
	 */
	public static void printReferencePointChangeTest(IShapePoints shape) {
		printPointInformation(shape);
		Point2D p = new Point2D(5.0, 10.0);
		System.out.println("\nSetting reference point to " + p);
		shape.setReferencePoint(p);
		printPointInformation(shape);
	}

	/**
	 * Performs a test to check the behavior of the getReferencePoint method of a shape implementing the IShapePoints interface.
	 * It gets the reference point, modifies the retrieved point, and compares it with the actual reference point.
	 *
	 * @param shape The shape to perform the test on.
	 */
	public static void printReferencePointGetTest(IShapePoints shape) {
		Point2D p = shape.getReferencePoint();
		System.out.println("Got point " + p);
		p.x = -10;
		System.out.println("Changed point to " + p);
		System.out.println("Shape reference is " + shape.getReferencePoint());
		System.out.println("Comparing points is " + p.equals(shape.getReferencePoint()) + " (should be false)");
	}

	/**
	 * Performs a test to check the behavior of the setReferencePoint method of a shape implementing the IShapePoints interface.
	 * It sets a new reference point, gets the reference point, modifies the retrieved point, and compares it with the actual reference point.
	 *
	 * @param shape The shape to perform the test on.
	 */
	public static void printReferencePointSetTest(IShapePoints shape) {
		Point2D p = new Point2D(-1, -1);
		System.out.println("Set reference to point " + p);
		shape.setReferencePoint(p);
		System.out.println("Shape reference is " + shape.getReferencePoint());
		p.x = 1;
		p.y = 1;
		System.out.println("Changed point to " + p);
		System.out.println("Shape reference is " + shape.getReferencePoint());
		System.out.println("Comparing points is " + p.equals(shape.getReferencePoint()) + " (should be false)");
	}

	/**
	 * Performs a test to check the behavior of setting the width and height of a square.
	 * It prints the dimensions before and after setting the width and height.
	 *
	 * @param s The square shape to perform the test on.
	 */
	public static void printSquareWidthTest(Shape2D s) {
		System.out.println("prior " + s);
		s.setWidth(5);
		System.out.println("after setWidth(5) " + s);
		s.setHeight(10);
		System.out.println("after setHeight(10) " + s);
	}

	public static void main(String[] args) {

		Shape2D[] shapes = {
				new RightTriangle(1.0, 2.0),
				new Rectangle(1.0, 2.0),
				new Square(2.0)
		};

		for (Shape2D shape : shapes) {
			System.out.println("\n*** " + shape.getClass().getSimpleName() + " ***");
			printShapeInfo(shape);
		}

		System.out.println("\n*** Reference point change ***");
		printReferencePointChangeTest(new Rectangle(1.0, 2.0));

		System.out.println("\n*** Change get reference point test ***");
		printReferencePointGetTest(new Rectangle(1.0, 2.0));

		System.out.println("\n*** Change set reference point test ***");
		printReferencePointSetTest(new Rectangle(1.0, 2.0));

		System.out.println("\n*** Square set width/height test *** ");
		printSquareWidthTest(new Square());

	}

}
