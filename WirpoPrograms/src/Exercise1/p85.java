/*
  Name : Asifkhan
  Description : Finding Area,Perimeter which are extedning from shape class.
  Date : 22/07/2024
 */
package Exercise1;
abstract class Shape{
	abstract void areaCal();
}
class ciRcle extends Shape{
	double radius;
	double Area;
	ciRcle(double R){
		this.radius=R;
	}
	public void areaCal() {
		Area=3.14*radius*radius;
		System.out.println("Area of Circle is : "+Area);
	}
}
class Rectangle extends Shape{
	double Len,Bred,R_Area;
	Rectangle(double l,double b){
		this.Len=l;
		this.Bred=b;
	}
	public void areaCal() {
		R_Area=Len*Bred;
		System.out.println("The Area of Rectangle is : "+R_Area);
	}
}
class Triangle extends Shape{
	double base,height,T_Area;
	Triangle(double b,double h){
		this.base=b;
		this.height=h;
	}
	public void areaCal() {
		T_Area=(0.5)*base*height;
		System.out.println("Area of Triangle is : "+T_Area);
	}
}
public class p85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ciRcle CR = new ciRcle(5.0);
		CR.areaCal();
		Rectangle RT = new Rectangle(5.0,10.0);
		RT.areaCal();
		Triangle TR = new Triangle(2.0,3.0);
		TR.areaCal();
	}

}
