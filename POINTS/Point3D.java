package interfaces;
public class Point3D extends Point{
	private int z; // members
	
//constructors 
	public Point3D(int x, int y) {
		super(x,y);
	}
	
	public Point3D(int z){
		this.z = 0;
	}
	
//public functions
	public void setZ(int z){
		this.z = 0;
	}
	
	public int getZ() {
		return z;
	}
}
	