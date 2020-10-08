import java.awt.*;
import java.applet.*;

/*<html>
  <applet code="E.class" height="500" width="500">
  </applet>
  </html>*/

public class E extends Applet
{
  Image picture;

 public void init()
 {
  picture=getImage(getDocumentBase(),"mon.jpg");
 }

 public void paint(Graphics g)
 {
  g.drawImage(picture,30,30,this);
 }
}