import java.util.*;
class p111
{
 public static void main(String[]R)
 {
  int n=0,i=0,m,v=0,l=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter no. of inputs");
  n=sc.nextInt();

  System.out.println("enter a number");
  m=sc.nextInt();
  l=m;
  v=m;
  while(i<=n-1)
  {
   System.out.println("enter a number");
   m=sc.nextInt();
   if(m>l)
   {
      l=m;
   } 
   else  if(m<v)
      {
          v=m;
      }
    i++; 
  }
  System.out.println("lowest="+v);
  System.out.println("highest="+l);
 }
}