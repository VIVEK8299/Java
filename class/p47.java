class B implements Runnable
{
 public void run()
 {
  for(int i=0;i<=9;i++)
  {
   System.out.println(i);
  }
 }
}
class main
{
 public static void main(String[]R)
 {
  B ob = new B();
  Thread b = new Thread(ob);
  b.start();
 }
}