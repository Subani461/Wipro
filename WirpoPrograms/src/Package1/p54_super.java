/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class Super{
	int x=10;
}
class AA extends Super{
	int x=100;
	void print() {
		System.out.println("The value of x is : "+super.x);
	}
}
public class p54_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		a.print();
	}

}      
