/*
  Name : Asifkhan
  Description : Printing Age and Name of persons.
  Date : 22/07/2024
 */
package Exercise1;
class Person{
	String Name;
	int Age;
	Person(String N,int A){
		this.Name=N;
		this.Age=A;
		System.out.println("Name of the person is : "+Name);
		System.out.println("Age of the Person is : "+Age);
	}
}
public class p86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Printing Name and Age of Person1 : ");
		Person P1 = new Person("Asif",24);
		System.out.println();
	System.out.println("Printing Name and Age of Person1 : ");
		Person P2 = new Person("Aashish",24);
	}

}
