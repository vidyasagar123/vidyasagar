import java.lang.*;
public class wgt
{
public static void main(String a[])
{
 int array [][]= {{50,160},{58,168},{45,161},{44,163},{42,138},{32,122},{30,119},{48,169},{50,110},{45,120}};
 int i,j;
 int max;
System.out.println("wgt  hgt ");
 for(i=0;i<10;i++)
 {
  for(j=0;j<2;j++)
 {
 System.out.print(array [i][j]+" ");
 }
System.out.println();
 }
  max=array[0][0];
 for(i=0;i<10;i++)
 {
  for(j=0;j<2;j++)
 {
  if(j==0)
  {
   if(array[i][j]>max)
   {
    max=array[i][j];
    }
   }
}
}
  System.out.println("highest weight="+max);

 max=array[0][0];
 for(i=0;i<10;i++)
 {
  for(j=0;j<2;j++)
 {
  if(j==0)
  {
   if(array[i][j]<max)
   {
    max=array[i][j];
    }
   }
  }
  }
  System.out.println("lowest weight="+max);

 max=array[0][1];
 for(i=0;i<10;i++)
 {
  for(j=0;j<2;j++)
 {
  if(j==1)
  {
   if(array[i][j]>max)
   {
    max=array[i][j];
    }
   }
   }
   }
  System.out.println("highest height="+max);

 max=array[0][1];
 for(i=0;i<10;i++)
 {
  for(j=0;j<2;j++)
 {
  if(j==1)
  {
   if(array[i][j]<max)
   {
    max=array[i][j];
    }
   }
   }
   }
  System.out.println("lowest height="+max);

 }
 }

