package interfaces;

public class Point implements Comparable<Point>{
	private int x, y; //members
	private double dx,dy;
	
//constructor without parameters
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
//constructor with 2 parameters 
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//public functions
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setDX(double dx) {
		this.dx = dx;
	}
	
	public void setDY(double dy) {
		this.dy = dy;
	}
	
	public double getDX() {
		return dx;
	}
	
	public double getDY() {
		return dy;
	}
	
	public String toString(){
		return x + " " + y;
	}
	
	public double distance(Point a, Point b){
		return Math.sqrt(Math.pow(GeometricPlane.GetCenter().getX() - a.getX(), 2) + Math.pow(GeometricPlane.GetCenter().getY() - b.getY(), 2));
	}
	

	@Override
	public int compareTo(Point a) {
		// TODO Auto-generated method stub
		double d1 = distance(this, GeometricPlane.GetCenter());
		double d2 = distance(a, GeometricPlane.GetCenter());
		if(d1 > d2){
			return 1;
		}
		if(d1 == d2){
			return 0;
		}
		if(d1 < d2){
			return -1;
		}
		return 0;
	}
}
