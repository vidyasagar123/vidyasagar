import java.io.*;
public class Ams
{
	public static void main(String args[])
	{
		int c=0,a,temp;
	
		int n=143;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
			if(temp==c)
			System.out.println("The given number is amstrong"+temp);
			else
			System.out.println("The given number is not amstrong"+temp);
	}
}	