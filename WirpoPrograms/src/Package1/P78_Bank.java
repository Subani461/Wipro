/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class bankEmp{
	String Name;
	int accNum;
	int balance;
	bankEmp(String N,int N1,int N2){
		this.Name=N;
		this.accNum=N1;
		this.balance=N2;
	}
	public void display() {
		System.out.println("Amount in bank account : "+balance);
	}
	public void addMoney(int A) {
		if(A>0) {
			balance+=A;
			System.out.println("The Current Balance is : "+balance);
		}
	}
	public void withdrawMoney(int B){
		if(balance>B) {
			balance=balance-B;
			System.out.println("After withdraw tha balance amount is : "+balance);
		}
	}
}
public class P78_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankEmp BM = new bankEmp("Asifkhan",123456,1000);
		BM.display();
		BM.addMoney(5000);
		BM.withdrawMoney(3000);
	}

}
