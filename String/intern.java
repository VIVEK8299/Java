// Returns the index within this string of the first occurrence of the 
// specified character, starting the search at the specified index
class Intern
{
 public static void main(String[]R)
 {
  String s1 = "Hello";  
  String s2 = s1.intern();  
  String s3 = new String("Hello");  
  String s4 = s3.intern();          
  System.out.println(s1==s2); // True  
  System.out.println(s1==s3); // False  
  System.out.println(s1==s4); // True       
  System.out.println(s2==s3); // False  
  System.out.println(s2==s4); // True        
  System.out.println(s3==s4); // False 
 }
}