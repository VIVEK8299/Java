// Encodes this String into a sequence of bytes using the named 
// charset, storing the result into a new byte array
// this codes gives op:-ascii code of each of the element of array barr
class GetBytes
{
 public static void main(String[]R)
 {
  String str = "abcdef";
  byte[] barr = str.getBytes();
  for(int i=0;i<barr.length;i++)
  {
   System.out.println(barr[i]);
  }
 }
}