import java.lang.*;

interface infacex

{
	
 int reverse(int s);

}


public class rev implements infacex

{

	int reverse(int s)

	{

		int temp,rem,r=0;
	
	while(s>0)
	
	{

			rem=s%10;
	
		r=r*10+rem;
	
		s/=10;
	 
	}
	
 }

}

public class rs

{
	
 public static void main(String a[])
	
{
	
	 rev r1=new rev();
		
 infacex=i;
 i=r1;
		
 System.out.println(i.reverse(45678));

	}

}
