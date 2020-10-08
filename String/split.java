// Splits a string into an array of substrings
class Split
{
 public static void main(String[]R)
 {
  String str = "abbabbacdcd";

  String [] arr = str.split("ba", 5);

  for(int i=0;i<arr.length;i++)
  {
   System.out.println(arr[i]);
  }
 }
}