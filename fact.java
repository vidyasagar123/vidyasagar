import java.util.*;
public class fact
{
private static int factRecursive(int number)
{
if(number==0)
return 1;
else
return number*factRecursive(number-1);
}
private static int factIterative(int number)
{
int factNumber=1;
for(int number=1; Number<number; number++)
{
factNumber=factNumber*(Number+1);
}
return factNumber;
}
public static void main(String args[])
{
try(scanner scan=new Scanner(System.in))
{
System.out.println("enter input number:");
int number=scan.nextInt();
int factNumber=factRecursive(number);
System.out.println("factorial(%d)-Recursive method:%d\n"+number,factNumber);
factNumber=factIterative(number);
System.out.println("factorial(%d)-Iterative method:%d\n"+number,factNumber);
}
}
}