import java.io.*;
class Supertest
{
	String ae = "Mathematics" ;
	public int i=25,exceed =0;
	void number(int a)
	{
		if(a>=25)
		{
			exceed =1;
		}
	}
	void display()
	{
		if(exceed == 1)
		{
			System.out.println(ae+" Course overfloated");
		}
		else
		{
			System.out.println(ae+" Course cannot overfloated");
		}
	}
}
class student
{
	public static void main(String[] args) 
	{
		Supertest sob = new Supertest();
		sob.number(23);
		sob.display();
		sob.number(26);
		sob.display();
	}

}
