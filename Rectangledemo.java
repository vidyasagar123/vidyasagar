import java.io.*;
class Rectangle
{
	int length;
	int width;
	Rectangle(int a,int b)
	{
		length = a;
		width = b;
	}
	int rectangleArea()
	{
		int area;
		area = length*width;
		return area;
	}
	int rectanglePerimeter()
	{
		int perimeter;
		perimeter =2*(length+width);
		return perimeter;
	}
}
class Rectangledemo
{
	public static void main(String args[])
	{
		Rectangle r1= new Rectangle(10,5);
		System.out.println("Area of rectangle="+ r1.rectangleArea());
		System.out.println("Perimeter of rectangle"+r1.rectanglePerimeter());
		Rectangle r2 = new Rectangle(7,4);
		System.out.println("Area of rectangle="+r2.rectangleArea());
		System.out.println("Perimeter of rectangle=="+r2.rectanglePerimeter());
	}
}
		 