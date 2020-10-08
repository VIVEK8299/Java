// Returns a String that represents the characters of the character array
class CopyValueOf
{
 public static void main(String[]R)
 {
  char[] str = {'h', 'e', 'l', 'l', 'o'};
  String btr = "";
  btr = btr.copyValueOf(str, 0, 5);
  System.out.println("Return string : "+btr);
 }
}