/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class perimeter{
	double len,bred,Perimeter;
	perimeter(){
		len=10;
		bred=10;
	}
	void findPerimeter() {
		Perimeter=len+bred;
		System.out.println("Perimeter of Rectangle is : "+Perimeter);
	}
}
class Area extends perimeter{
	double area;
	void findArea() {
		area=len*bred;
		System.out.println("Area of Rectangle is : "+area);
	}
}
class volume extends Area{
	double volume ;
	double height;
	volume(){
		height=10;
	}
	void findVolume() {
		volume=area*height;
		System.out.println("Volume of Cuboid is : "+volume);
	}
}
public class p42_Mulinheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volume V = new volume();
		V.findPerimeter();
		V.findArea();
		V.findVolume();
	}

}
