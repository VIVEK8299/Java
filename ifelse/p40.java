import java.util.*;
class p40
{
 public static void main(String[]R)
 {
  char c;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any character");
  c=sc.next().charAt(0);

  if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
  {
   System.out.println("vowel");
  }
  else
  {
   System.out.println("consonant");
  }
 }
}