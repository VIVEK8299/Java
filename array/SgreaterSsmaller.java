import java.util.*;
class p122
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],g,sg=0,ss,s=0,j;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the limit");
  j=sc.nextInt();

  for(int i=0;i<j;i++)
  {
   System.out.print("enter a no.");
   ar[i]=sc.nextInt();
  }

  g=ar[0];
  ss=ar[0];  
  for(int i=0;i<j;i++)
  {
   System.out.print(ar[i]);
  }

  for(int i=1;i<j;i++)
  {
   if(g<ar[i] && sg<g)
   {
    sg=g;
    g=ar[i];
   }
   if(s>ar[i] && ss>s)
   {
    ss=s;
    s=ar[i];
   }
  }
  System.out.println(ar[0]);
  System.out.println("the second greater is="+sg);
  System.out.println("the second smaller is="+ss);
 }
}