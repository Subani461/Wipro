/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:25 IST 2024
 */

package package6;
import java.util.Scanner;
public class lonngestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String Names[] = new String[length];
		for(int i=0;i<length;i++) {
			Names[i] = sc.nextLine();
		}
		for(String s:Names) {
			System.out.print(s+" ");
		}
		System.out.println();
		int LS = Names[0].length();
		int index=0;
		for(int j=1;j<length;j++) {
			int temp=0;
			temp=Names[j].length();
			if(temp>LS) {
				LS=temp;
				index=j;
			}
		}
		System.out.println("The longest String is present at "+index+" position : "+Names[index]);
	}

}
