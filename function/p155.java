class p155
{
 static void prime()
 {
  int n=7,i;

  for(i=2;i<n;i++)
  {
   if(n%i==0)
   break;
  }
  if(n==i)
   System.out.println("prime no.");
  else
   System.out.println("not prime no.");
 }
 public static void main(String[]R)
 {
  prime();
 }
}