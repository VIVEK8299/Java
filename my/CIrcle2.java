 // a class method and an instance method
public class Circle2
{
 public double x, y, r;
 static int circlecount = 0;
 //All constructors are here.
 //An instance method.return the bigger of two circles.
 public Circle2(double x, double y, double r)
 {
  this.x = x; this.y = y;  this.r = r;
 }

 public Circle2(double r)
  {
   this(0.0, 0.0, r);
    circlecount++;
  }

 public Circle2 bigger(Circle2 c)
 {
  if(c.r>r) return c;
  else return this;
 }
 //A class method : Return the bigger of two classes.
 public static Circle2 bigger(Circle2 a, Circle2 b)
 {
  if(a.r>b.r) return a;
  else return b;
 }

 public static void main(String[]R)
 {
  Circle2 a = new Circle2(2.0);
  Circle2 b = new Circle2(3.0);
  Circle2 c = Circle2.bigger(a, b);//call of instance method
  Circle2 d = Circle2.bigger(a, b);//call of class method
 }
}