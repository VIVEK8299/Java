// Checks whether a string contains the exact same sequence of characters of 
// the specified CharSequence or StringBuffer
class ContentEquals
{
 public static void main(String[]R)
 {
  String str = "hello";
  System.out.println(str.contentEquals("hello"));  // true
  System.out.println(str.contentEquals("e"));      // false
  System.out.println(str.contentEquals("Hi"));     // false
 }
}