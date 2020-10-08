import java.applet.*;
import java.awt.*;

public class B extends Applet
{
 public void init()
 {
  System.out.println("Applet Initiated");
 }

 public void start()
 {
  System.out.println("Applet Started");
 }

 public void paint(Graphics g)
 {
  System.out.println("Paint Called");
 }

 public void stop()
 {
  System.out.println("Applet stopped");
 }
public void destroy()
{
 System.out.println("Applet Destroyed");
}
}