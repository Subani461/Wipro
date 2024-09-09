/*
  Name : Asifkhan
  Description : Finding sum of An Array.
  Date : 22/07/2024
 */
package Exercise1;
import java.util.Scanner;
public class p83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        for(int i=0;i<2*N;i++) {
        	if(i%2!=0) {
        		sum=sum+i;
        	}
        }
        System.out.println(sum);
	}

}
