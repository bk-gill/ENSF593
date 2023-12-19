public class Point2D{
	protected double x, y;
	
	Point2D(){
		this(0.0, 0.0);
	}
	
	Point2D(Point2D p){
		this(p.x, p.y);
	}
	
	Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)return false;
		if(!(o instanceof Point2D)) return false;
		
		Point2D that = (Point2D)o;
		return (this.x == that.x) && (this.y == that.y);
	}
}