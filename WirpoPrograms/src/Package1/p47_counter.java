/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class counter{
	private static int count=0;
	public counter() {
		count++;
	}
	public static int  getCount() {
		return count;
	}
}
public class p47_counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter c1 = new counter();
		counter c2 = new counter();
		counter c3 = new counter();
		System.out.println(counter.getCount());
	}

}
