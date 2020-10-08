// Checks whether a string ends with the specified character(s)	
class EndsWith
{
 public static void main(String[]R)
 {
  String str = "Hello";
  System.out.println(str.endsWith("Hel"));   // false
  System.out.println(str.endsWith("llo"));   // true
  System.out.println(str.endsWith("o"));     // true
 }
}