//applet program to print hello
//always extend applet class


/*<html>
   <body>
    <applet code= "hello.class" width="900" height="500">
    </applet>
   </body>
</html>*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class hello extends Applet
{
 public void init()
 {
  //initialisation method of applet
  resize(500,500);
  setBackground(Color.YELLOW);
 }

  public void paint(Graphics g)
  {
   g.drawString("hello world",100,100);
  }
}