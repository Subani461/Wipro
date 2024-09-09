/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

public class p70_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("Learning Java");
		sb.append(" for the First Time");
		System.out.println(sb);
		
		sb.replace(22, 27,"second");
		System.out.println(sb);
		
		sb.delete(9, 13);
		System.out.println(sb);
	}
}
