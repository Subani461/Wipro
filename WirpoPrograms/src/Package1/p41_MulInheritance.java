/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class easy{
	int A;
	easy(){
		A=10;
	}
}
class medium extends easy{
	int B;
	medium(){
		B=20;
	}
}
class Hard extends medium{
	int result;
	void print() {
		result=A*B;
		System.out.println(result);
	}
}
public class p41_MulInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hard H = new Hard();
		H.print();
	}

}
