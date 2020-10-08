import java.util.Scanner;
class p7
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],i,n,ss,sg=0,s,g=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the limit of array");
  n=sc.nextInt();

  for(i=0;i<n;i++)
  {
   System.out.println("enter a no.");
   ar[i]=sc.nextInt();
  }ss=ar[0];s=ar[0];

  for(i=0;i<n;i++)
  {
   if(ar[i]>g)
   g=ar[i];
   if(ar[i]<s)
   s=ar[i];
  }

  System.out.println("Greatest="+g);
  System.out.println("Smallest="+s);

  for(i=1;i<n;i++)
  {
   if(ar[i]!=g && g>sg && sg<ar[i])
   sg=ar[i];
   if(ar[i]!=s && s<ss && ss>ar[i])
   ss=ar[i];
  }

  System.out.println("Second Greater is="+sg);
  System.out.println("Second Smaller is="+ss);
 }
}