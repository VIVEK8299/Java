class Bike
{
 void run()
 {
  System.out.println("Running");
 }
}
class Splendor extends Bike
{
 void run()
 {
  System.out.println("Running with silence");
 }
 public static void main(String[]R)
 {
  Splendor b1 = new Splendor();
  b1.run();
  Bike b2 = new Bike();
  b2.run();
  Bike b3 = new Splendor();
  b3.run();
 }
}