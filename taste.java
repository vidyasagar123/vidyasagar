import java.io.*;
interface IntStack
{
	void push(int item);
	int pop();
}
class FixedStack implements IntStack
{
	private int stck[];
	private int tos;
	
	FixedStack(int size)
	{
		stck=new int[size];
		tos=-1;
	}
	public void push(int item)
	{
		if(tos==stck.length-1)
			System.out.print("Stack is full");
		else
			stck[++tos]=item;
	}
	public int pop()
	{
		if(tos<1)
		{
			System.out.print("Stack under flow");
			return(0);
		}
		else
			return(stck[tos--]);
	}
}
class taste
{
	public static void main(String args[])
	{
		FixedStack mystack1=new FixedStack(5);
		FixedStack mystack2=new FixedStack(8);
		for(int i=0;i<5;i++)
			mystack1.push(i);
		for(int i=0;i<8;i++)
			mystack2.push(i);
		System.out.print("Stack1");
		for(int i=0;i<5;i++)
			System.out.println(mystack1.pop());
		System.out.print("Stack2");
		for(int i=0;i<8;i++)
			System.out.println(mystack2.pop());
	}
}