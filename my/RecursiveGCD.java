public class RecursiveGCD
{
 static int m,n;
 int gcd(int m, int n)
 {
  if(m>n) return gcd(n,m);
  if(m==n) return m;
  if(m==0) return n;
  if(m==1) return m;
  return gcd(m,n%m);
 }
 public static void main(String[]R)
 {
  RecursiveGCD g = new RecursiveGCD();
  g.m = Integer.parseInt(R[0]);
  g.n = Integer.parseInt(R[1]);
  System.out.printf("GCD of %d and %d is %d.",g.m ,g.n ,g.gcd(g.m, g.n));
 }
}