/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
public class p68_stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str[] = new String[5];
		for(int i=0;i<str.length;i++) {
			str[i]=sc.nextLine();
		}
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				String temp="";
				if(str[i].compareTo(str[j])>0){
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}

}
