// Returns the index within this String that is offset from the given
// index by codePointOffset code points
class OffSetByCodePoints
{
 public static void main(String[] args)
 {
  String str = "Hello";
  int a = str.offsetByCodePoints(1, 2);
  int b = "Tutorial GateWay".offsetByCodePoints(1, 12);
  int c = "Free Java Tutorial at Tutorial GateWay".offsetByCodePoints(10, 22);
  int d = "Java Programming Language".offsetByCodePoints(5, 12);

  System.out.println("The New Index of a String Str = " + a);
  System.out.println("The New Index  = " + b);
  System.out.println("The New Index  = " + c);
  System.out.println("The New Index  = " + d);
 }
}