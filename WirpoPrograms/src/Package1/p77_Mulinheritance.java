/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
interface shape{
	double getradius();
}
interface areaCal{
	double findArea();
}
class circcle implements shape,areaCal{
	private double radius;
	circcle(double R){
		this.radius=R;
	}

	@Override
	public double getradius() {
		// TODO Auto-generated method stub
		return radius;
	}
	
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
}
public class p77_Mulinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circcle c = new circcle(5.0);
		System.out.println(c.getradius());
		System.out.println(c.findArea());
	}

}
