/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class circle{
	private double radius;
	public circle(double r) {
		radius=r;
	}
	public double getradius() {
		return radius;
	}
	public void setradius(double R) {
		radius=R;
	}
	public double area() {
		return 3.14*radius*radius;
	}
}
public class p49_CricleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle(5.0);
		System.out.println(c.area());
		//c.setradius(10.0);
		System.out.println(c.area());
		System.out.println(c.getradius());
	}

}
