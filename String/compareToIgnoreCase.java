// Compares two strings lexicographically, ignoring case differences
class CompareToIgnoreCase
{
 public static void main(String[]R)
 {
  String str = "hello@there";
  String btr = "HELLO@THEREbitch";
  System.out.println(str.compareToIgnoreCase(btr));
 }
}