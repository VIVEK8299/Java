class p137
{
 static int sum(int x,int y)
 {
  int z;
  z=x+y;
  return(z);
 }
 static void table(int a)
 {
  int i;
  for(i=1;i<=10;i++)
  {
   System.out.println(a*i);
  }
 }
 public static void main(String[]R)
 {
  int x=sum(15,20);
  System.out.println("sum="+x);
  table(5);
 }
}