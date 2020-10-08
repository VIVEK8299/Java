// program for making a rectangle on the applet viewer
//using the the drawRect method to do it
//changed the java file name from rectangle to Rect

/*<html>
   <body>
    <applet code="Rect.class" height="150" width="150">
    <param name = wvalue value = 30>
    <param name = xvalue value = 30>
    <param name = yvalue value = 30>
    <param name = zvalue value = 30>
    </applet>
   </body>
  </html>
*/
  
import java.applet.*;
import java.awt.*;

public class Rect extends Applet
{
 int w, x, y, z;

 public void init()
 {
  w=Integer.parseInt(getParameter ("wvalue"));
  x=Integer.parseInt(getParameter ("xvalue"));
  y=Integer.parseInt(getParameter ("yvalue"));
  z=Integer.parseInt(getParameter ("zvalue"));
 }

 public void paint(Graphics g)
 {
  g.drawRect(w, x, y, z);
 }
}