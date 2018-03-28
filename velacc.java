import java.lang.*;

interface infacea

{
	
 double u=3.986004418;

	 double getvelocity(double r);

}


public class velocity implements infacea

{
	
 double getvelocity(double r)

	 {
		
  return Math.sqrt(u/r);
	 
 }

}


interface infaceb

{
	
 double u=3.986004418;
	
 double getacceleration(double r);

}


public class acceleration implements infaceb

{

	 double getacceleration(double r)
	
 {
	
	   return u/(r*r);

	 }

}


public class velacc

{	

	public static void main(String a[])
	
{
		
velocity v=new velocity();
		
acceleration a=new acceleration();

		infacea=i1;

		v=i1;
		
System.out.println("velocity="+i1.getvelocity(500)+"x10^5");

		infaceb=i2;
		
a=i2;
		
System.out.println("acceleration="+i2.getacceleration(500)+"x10^5");

	}

}
