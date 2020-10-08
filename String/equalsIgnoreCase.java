// Compares two strings, ignoring case considerations
class EqualsIgnoreCase
{
 public static void main(String[]R)
 {
  String str = "hello";
  String btr = "HellO";
  String bts = "henlo";
  System.out.println(str.equalsIgnoreCase(btr));
  System.out.println(str.equalsIgnoreCase(bts));
  System.out.println(str.equalsIgnoreCase("hii"));
 }
}