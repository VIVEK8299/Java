import java.util.Scanner;
import java.lang.Math;
class sol
{
    public static void main(String[]R)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
         {
             try
             {
                long x=sc.nextLong();
            if(x>=-128 && x<=127)
               System.out.println("* byte");
            if(x>=-32768 && x<=32767)
               System.out.println("* short");
            if(x>=-(Math.pow(2,31)) && x<=Math.pow(2,31)-1)
               System.out.println("* int");
            if(x>=-(Math.pow(2,63)) && x<=Math.pow(2,63)-1)
               System.out.println("* long");
             }
             catch(Exception e)
            {
               System.out.println(" can't be fitted anywhere");
            }
         }
    }
}
