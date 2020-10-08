// Searches a string for a specified value, and returns a new string
//  where the specified values are replaced
class Replace
{
 public static void main(String[]R)
 {
  String str = "Hello@there";
  String str1 = str.replace('H', 'h');
  String str2 = str.replace("@", " you ");

  System.out.println(str1);
  System.out.println(str2);
 }
}