// Copies characters from a string to an array of chars
class GetChars
{
 public static void main(String[]R)
 {
  String str = "hello@There";
  char[] ch = new char[10];
  try{
      str.getChars(6, 11, ch, 0);
      System.out.println(ch);
     }catch(Exception ex){System.out.println(ex);}
 }
}