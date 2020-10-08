public class RecursiveFactorial
{
 static int n;
 int factorial(int n)
 {
  if(n==0)
   return (1);
  else
   return(n*factorial(n-1));
 }

public static void main(String[]R)
{
 RecursiveFactorial x = new RecursiveFactorial();
 x.n = Integer.parseInt(R[0]);
 System.out.println("Factorial of "+n+":"+x.factorial(x.n));
}}