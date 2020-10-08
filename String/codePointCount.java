// This method returns int value representing the number of Unicode code points
// in the specified text range.
class CodePointCount
{
 public static void main(String[]R)
 {
  String str = "hello@there";
  System.out.print(str.codePointCount(2, 5));//(int beginIndex,int endIndex)
 }
}