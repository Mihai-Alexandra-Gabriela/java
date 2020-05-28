package interfaces;

public interface Centrat {
	void Shift(int dx, int dy);
	void Shift(Point p);
}
 // tema rotatia unui punct

//x' = xcos(alf) + ysin(alf)
//y' = -xsin(alf) + ycos(alf)
//public interface Point{
//	public void Rotaie;
//}

//clasa GeometricPlane:
//	pentru a putea afisa : system.out.println(plane);
//	undeva pe la final trebuie sa scriem:
//		public String toString(){
//			String str = " ";
//			for(Point p : points){
//				str += p.toString();
//			}
//			
//			return str:
//		}