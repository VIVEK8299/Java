public class Circle
{
 static int circlecount = 0; //class variable
 public double x, y, r;  //instance variable
 public Circle(double x, double y, double r)
 {
  this.x = x;  this.y = y;  this.r = r;
  circlecount++;
 }
 public Circle(double r)
 {
  this(0.0, 0.0, r);
  circlecount++;
 }
 public Circle(Circle c)
 {
  this(c.x, c.y, c.r);
  circlecount++;
 }
 public Circle()
 {
  this(0.0, 0.0, 0.1);
  circlecount++;
 }

public double circumference()
{
 return (2*3.141459*r);
 }
public double area()
{
 return (3.14159*r*r);
}
public static void main(String[]R)
{
 Circle c1 = new Circle();
 Circle c2 = new Circle(5.0);
 Circle c3 = new Circle(c1);
 System.out.println(c1.circlecount);
}}