class test
{
 public static void test1()
 {
  System.out.println("hello");
 }
}
class test1
{
 public static void test11()
 {
  System.out.println("java");
 }
}
class p1
{
 public static void main(String[]R)
 {
  test ob = new test();
  test1 ob1 = new test1();
  test.test1();
  test1.test11();
 }
}