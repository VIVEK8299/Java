import java.io.*;
import java.util.*;

class Data
{
 public static void main(String[]R) throws IOException
 {
  Float principalAmount = new Float(0);
  Float rateOfInterest = new Float(0);
  int numberOfYears = 0;

  DataInputStream in = new DataInputStream(System.in);
  String tempString;

  System.out.println("Enter principal Amount: ");
  System.out.flush();
  tempString = in.readLine();
  principalAmount = Float.valueOf(tempString);

  System.out.println("Enter rate of interest: ");
  System.out.flush();
  tempString = in.readLine();
  rateOfInterest = Float.valueOf(tempString);

  System.out.println("Enter number of years:");
  System.out.flush();
  tempString = in.readLine();
  numberOfYears = Integer.parseInt(tempString);

  //Input is over: calculate the interest

  float interestTotal = (principalAmount*rateOfInterest*numberOfYears)/100;
  System.out.println("Total interest = "+interestTotal);
 }
}