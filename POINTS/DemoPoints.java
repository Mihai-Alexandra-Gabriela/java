package interfaces;

import java.util.*;

public class DemoPoints {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread mt1 = new MyThread("points1.txt");
		MyThread mt2 = new MyThread("points2.txt");
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		 
		Hashtable<Point, Integer> map2 = mt2.getMap();

		Enumeration<Point> en2 = map2.keys();
			while (en2.hasMoreElements()) {
				Point key = (Point) en2.nextElement();
				System.out.println(key + " : " + map2.get(key));
			}
	}	
		
}
