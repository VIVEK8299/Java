class Point2D
{
 int x, y;
 Point2D(int a, int b)
 {
  x = a; y = b;
 }
 void display()
 {
  System.out.println("x = "+x+"y = "+y);
 }
}

class Point3D extends Point2D
{
 int z;
 Point3D(int c)
 {
  z = c;
 }
 void display()
 {
  System.out.println("x = "+x+"y = "+y+"z = "+z);
 }
}

class MOT
{
 public static void main(String[]R)
 {
  Point2D p = new Point2D(3, -4);
  p.display();

  Point3D q = new Point3D(0);
  q.display();

  Point2D x = (Point2D) q;
  x.display();
 }
}