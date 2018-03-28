import java.lang.*;
public class temp
{
public static void main(String a[])
{
 double array [][]= {{24,27,21,24,18,16,12,18,25,21,22,23},{23,31,20,21,26,27,20,17,26,29,27,10},{21,22,23,20,24,26,23,28,23,21,21,25},{23,30,31,25,26,24,23,27,26,29,27,30}, {21,29,23,20,28,26,21,22,29,24,24,29}};
 int i,j;
 double max;
System.out.println("jan  feb  mar  apr  may  jun  jul  aug  sep  oct  nov  dec ");
 for(i=0;i<5;i++)
 {
  for(j=0;j<12;j++)
 {
 System.out.print(array [i][j]+" ");
 }
 System.out.println();
 }
  max=array[0][3];
 for(i=0;i<5;i++)
 {
  for(j=0;j<12;j++)
 {
  if(j==3)
  {
   if(array[i][j]>max)
   {
    max=array[i][j];
    }
   }
 }
 }
System.out.println("max temp in april="+max);

  max=array[0][4];
 for(i=0;i<5;i++)
 {
  for(j=0;j<12;j++)
 {
  if(j==11)
  {
   if(array[i][j]>max)
   {
    max=array[i][j];
    }
   }
 }
 }
 System.out.println("max temp in may="+max);

  max=array[0][0];
 for(i=0;i<5;i++)
 {
  for(j=0;j<12;j++)
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
System.out.println("min temp in january="+max);

  max=array[0][11];
 for(i=0;i<5;i++)
 {
  for(j=0;j<12;j++)
 {
  if(j==11)
  {
   if(array[i][j]<max)
   {
    max=array[i][j];
    }
   }
 }
 }
 System.out.println("min temp in dec="+max);

}
}
