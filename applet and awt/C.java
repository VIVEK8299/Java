import java.applet.Applet;
import java.awt.Graphics;

/*<html>
  <applet code="C.class" height="250" width="250">
  <param name="Name" value="vivek" />
  <param name="ID" value="245" />
  </applet>
  </html>*/

public class C extends Applet
{
 String name;
 int id;
 Integer i;
 public void init()
 {
  name = getParameter("Name");
  try
  {
   id = Integer.parseInt(getParameter("ID"));
  }
  catch(NumberFormatException e){}
 }

 public void start()
 {
  ++id;
  i=new Integer(id);
 }

 public void paint(Graphics g)
 {
  g.drawString(name,50,50);
  g.drawString(i.toString(),60,60);
 }
}