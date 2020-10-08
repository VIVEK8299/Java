// Converts this string to a new character array
class ToCharArray
{
 public static void main(String[]R)
 {
  String str = "abbabbacdcd";

  char [] ch = str.toCharArray();
  for(int i=0;i<ch.length;i++)
  {
   System.out.println(ch[i]);
  }
 }
}