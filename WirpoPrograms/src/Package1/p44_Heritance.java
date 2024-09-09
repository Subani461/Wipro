/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class one{
	
	void print() {
		System.out.println("Method 1 is Running...");
	}
}
class two extends one{
	void print() {
		super.print();
		System.out.println("Method 2 is Running...");
	}
}
public class p44_Heritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two t = new two();
		t.print();
	}

}
