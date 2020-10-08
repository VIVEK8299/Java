// Tests if two string regions are equal
class RegionMatches
{
 public static void main(String[]R)
 {
  String str = "Hello@there are";
  String str1 = "there you are";
  
  boolean match1 = str.regionMatches(6, str1, 0, 5);
  boolean match2 = str.regionMatches(12, str1, 10, 3);

  //regionMatches(str(starting index, 2nd string, 2nd string starting index, 2nd string length)

  System.out.println(match1);
  System.out.println(match2);
 }
}