import java.applet.*;
import java.awt.*;

public class A extends Applet
{
 public void init()
  {setBackground(Color.red);}

 public void paint(Graphics g)
 {g.drawString("Hello World",25,50);}

 public void start()
 {System.out.println("Applet Started");}

 public void stop()
 {System.out.println("Applet stopped");}

 public void destroy()
 {System.out.println("Applet Destroyed");}
}