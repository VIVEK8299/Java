import java.util.Scanner;
class p6
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],i=0,n=0,d,e,c;
  Scanner sc=new Scanner(System.in);

  System.out.println("1.Insertion");
  System.out.println("2.Deletion");
  System.out.println("3.Updation");
  System.out.println("4.Print");
  System.out.println("5.Search");
  System.out.println("6.Exit");

  while(true)
  {
   System.out.println("Enter input");
   c=sc.nextInt();
   switch(c)
   {
    case 1:
    System.out.println("enter a no.");
    ar[i]=sc.nextInt();
    i++;
    n++;
    break;

    case 2:
    System.out.println("enter the data to be deleted:");
    d=sc.nextInt();
    for(i=0;i<n;i++)
    {
     if(ar[i]==d)
     {for(i=i;i<n-1;i++)
	ar[i]=ar[i+1];
	n--;
	break;
	}
    }
    break;

    case 3:
    System.out.println("Enter the data to update:");
    d=sc.nextInt();
    System.out.println("Enter the new data:");
    e=sc.nextInt();
    for(i=0;i<n;i++)
      if(ar[i]==d)
      ar[i]=e;
    break;

    case 4:
    System.out.println("the array is:");
    for(i=0;i<n;i++)
    {
     System.out.print("["+ar[i]+"]");
    }
    System.out.println("");
    break;

    case 5:
    System.out.println("enter the data to search:");
    d=sc.nextInt();
    for(i=0;i<n;i++)
    {
     if(ar[i]==d)
     System.out.println("the index is="+i);
    }
    break;

    case 6:
    System.exit(0);
   }
  }
 }
}