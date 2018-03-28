import java.io.*;
abstract class area
{
 
  abstract double compute(double s);
}

 class circle extends area
{
 double pi=3.14;
 double compute(double s)
  {
	return pi*s*s;
  }
}

class square extends area
{
  double compute(double s)
   {
	return s*s;
   }
}

public class Area1
{
public static void main(String a[])
{
  circle c=new circle();
  square s=new square();
  
  System.out.println(c.compute(5.5));

  System.out.println(s.compute(2.5));

 }
}
