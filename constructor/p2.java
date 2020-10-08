class test 
{
 int a,b;
 test()
 {
  System.out.println("Default Constructor"); 
  a=10;b=20;
 }
 void disp()
 {
  System.out.println("value of A = "+a);
  System.out.println("value of B = "+b);
 }
}
class p2
{
 public static void main(String[]R)
 {
  test ob=new test();
  ob.disp();
 }
}
 