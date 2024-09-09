/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

public class characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer salary = 40000;
		String str;
		str=Integer.toString(salary);
		if(str.length()>4) {
			System.out.println("No of characters are more than 4");
		}
		else {
			System.out.println("No of characters are not more than 4");
		}
	}

}
