import java.util.*;
class Person
{
 String name;
 Date dob;
 int mobileNo;
 void readData(String n, Date d, int m)
 {
  name = n;
  dob = d;
  mobileNo = m;
 }
 void printData()
 {
  System.out.println("Name : "+name);
  dob.getDate();
  System.out.println("Mobile : "+mobileNo);
 }
}

class Student extends Person
{
 String institution;
 int[] qualif = new int[20];
 int rollNo;
 int marks[] = new int[50];
 
 void printBioData()
 {
  printData();
  System.out.println("Institution : "+institution);
  System.out.println("Roll : "+rollNo);
  for(int q=0;q<qualif.length;q++)
  {
   System.out.println("Marks "+q+": "+qualif[q]);
  }
  for(int m=0;m<marks.length;m++)
  {
   System.out.println("Result "+m+": "+marks[m]);
  }
 }
}

class Employee extends Person
{
 int empNo;
 int salaryHistory[] = new int[12];
 String organisation; 
 String designation;
 Date doj;
 void printSalary()
 {
  for(int s=0;s<salaryHistory.length;s++)
  {
   System.out.println("Salary "+s+": "+salaryHistory[s]);
  }
 }
}