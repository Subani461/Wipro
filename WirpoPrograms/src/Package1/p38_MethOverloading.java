/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class utilities{
	int add(int X,int Y) {
		return X+Y;
	}
	String add(String str1,String str2) {
		String result;
		result=str1+" "+str2;
		return result;
	}
}
public class p38_MethOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utilities u =  new utilities();
		System.out.println(u.add(10,20));
		System.out.println(u.add("Asif","Khan"));
	}

}
