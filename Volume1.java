import java.lang.*;
 abstract class volume
{
 abstract double compute(double l, double h);
 }

class cone extends volume
{
 double compute(double l, double h)
  {
	double pi=3.14;
	
	return pi*l*h;
  }
}

 class squareprism extends volume
{
  double compute(double l, double h)
   {
	
	return l*h;
   }
}

public class Volume1
{
public static void main(String a[])
{
  cone c=new cone();
  squareprism s=new squareprism();
  
  System.out.println(c.compute(12.20,21.02));

  System.out.println(s.compute(14.21,23.21));

 }
}
