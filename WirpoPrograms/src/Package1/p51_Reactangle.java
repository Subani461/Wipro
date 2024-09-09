/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class rectangle{
	private int len;
	private int breadth;
	rectangle(){
		len=0;
		breadth=0;
	}
	rectangle(int L,int B){
		len=L;
		breadth=B;
	}
	public int area() {
		return len*breadth;
	}
}
public class p51_Reactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r1 = new rectangle();
		rectangle r2 = new rectangle(5,3);
		System.out.println(r1.area()+" "+r2.area());
	}

}
