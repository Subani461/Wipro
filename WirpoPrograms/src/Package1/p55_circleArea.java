/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class Circlee{
	final double Pi=3.14;
	 double radius;
	Circlee(double X){
		radius=X;
	}
	// Trying to change the Value of Pi through Method.
	/*
	 void changeValue(double Y) {
		Pi=Y;
	}
	*/
	double findArea() {
		return Pi*radius*radius;
	}
}
public class p55_circleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circlee c = new Circlee(5.0);
		//c.changeValue(4.34);
		System.out.println(c.findArea());
	}

}
