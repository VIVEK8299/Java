import java.util.*;
class p30
{
 public static void main(String[]R)
 {
  int x;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter any character");
  x=sc.next().charAt(0);

  String y=((x=='a'||x=='A')?"vowel":(x=='e'||x=='E')?"vowel":(x=='i'||x=='I')?"vowel":(x=='o'||x=='O')?"vowel":(x=='u'||x=='U')?"vowel":"consonant");

  System.out.println("the input character is a "+y);
 }
}