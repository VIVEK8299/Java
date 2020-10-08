import java.util.*;
class P121
{
 public static void main(String[]R)
 {
  int ar[]=new int[100],j,i=0,d,a;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter limit");
  j=sc.nextInt();
  System.out.println("0.insertion");
  System.out.println("1.print array");
  System.out.println("2.update");
  System.out.println("3.delete");
  System.out.println("4.search");
  System.out.println("5.exit");

  while(true)
  {
   System.out.print("enter an option");
   a=sc.nextInt();
   switch(a)
   {
    case 0:
    System.out.println("enter a no. for insertion");
    ar[i]=sc.nextInt();
    if(i>=j)
    {
     System.out.println("overflow");
    }
    i++;
    break;

    
    case 1:
    System.out.println("Array is:");
    for(j=0;j<i;j++)
    {
     System.out.print(ar[j]);
    }
    break;
  
    case 2:
    System.out.println("enter the data to update");
    d=sc.nextInt();
    for(j=0;j<i;j++)
    {
     if(ar[j]==d)
     {
      System.out.println("enter new data");
      d=sc.nextInt();
      ar[j]=d;
    }
   } 
   if(ar[j]!=d)
   { 
     System.out.println("data not found");
    }  
    break;
 
    case 3:
    System.out.println("enter the data for deletion");
    d=sc.nextInt();
    for(j=0;j<i;j++)
    {
     if(ar[j]==d)
     {
      for(;j<i;j++)
      {
       ar[j]=ar[j+1];
      }
     break;
     }
    }
    i--;
    break;
    
 
    case 4:
    System.out.println("enter the index");
    i=sc.nextInt();
    System.out.println("the data is : "+ar[i]);
    break;

    case 5:
    System.exit(0);
   }
  }
 }
}