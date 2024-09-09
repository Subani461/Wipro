/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
interface i1{
	void display1();
}
interface i2 extends i1{
	void display2();
}
class demo implements i1,i2{

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Display2");
		
	}
	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Display1");
	}	
}
public class p76_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new demo();
		d.display1();
		d.display2();
	}
}
