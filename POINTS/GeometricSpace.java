package interfaces;
import java.util.*;

public class GeometricSpace extends GeometricPlane{
	public GeometricSpace(LinkedList<Point> pts) {
		super(pts);
	}

	public static Point3D[] points;
	
	public static Point3D GetCenter() {
		if(points == null) {
			return null;
		}
		if(points.length == 0) {
			return null;
		}
		Point3D  p = new Point3D(0);
		for(int i = 0; i < points.length; i++) {
			p.setZ( points[i].getZ() + p.getZ() );
		}
		p.setZ( p.getZ() / points.length );
		return p;
	}
}
