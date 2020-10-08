import java.util.*;
class Main
{
 public static void main(String[]R)
 {
  String s;
  String s1;
  int t;
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter no. of inputs");
  t = sc.nextInt();

  while(t>0)
  {
   s = sc.nextLine();
   for(int j=0;j<(s.length()-1);j++)
   {
    for(int k=j+1;k<s.length();k++)
    {
     if(s.charAt(j)==s.charAt(k))
     {
      s1 = s.substring(j+1,k);
      System.out.println(s1.length());
     }
    }
   }
   t--;
  }

 }
}