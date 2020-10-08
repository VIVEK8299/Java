// Replaces each substring of this string that matches the given
// regular expression with the given replacement
class ReplaceAll
{
 public static void main(String[]R)
 {
  String str = "abbabbacdcd";

  String str1 = str.replaceAll("bba", "bcd");
  System.out.println(str1);
 }
}