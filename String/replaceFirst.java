// Replaces the first occurrence of a substring that matches the given
// regular expression with the given replacement
class ReplaceFirst
{
 public static void main(String[]R)
 {
  String str = "abbabbacdcd";
  String str1;

  str1 = str.replaceFirst("bb", "bc");
  System.out.println(str1);
 }
}