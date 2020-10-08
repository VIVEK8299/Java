//program of ArrayList with Integer elements
//hasNextInt is a method which check whether any next element is present or not
//nextInt takes the control to the next element

import java.util.*;
class Circlo
{
 public static void main(String[]R)
 {
  int sum=0;  float avg=0;
  ArrayList <Integer> I = new ArrayList <Integer>();
  System.out.println("Enter input");
  Scanner sc=new Scanner(System.in);
  while(sc.hasNextInt())
  {
   I.add(sc.nextInt());
  }

  for(int i=0;i<I.size();i++)
  {
   sum+=(I.get(i));
  }
  avg=(float)sum/I.size();
  System.out.println(avg);
 }
}