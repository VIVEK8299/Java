import java.awt.*;
import java.applet.*;

/*<html>
  <applet code="G.class" height="500" width="500">
  </applet>
  </html>*/

public class G extends Applet
{
 public void init()
 {
  Button b=new Button("Test Button");
  this.add(b);

  Checkbox cb = new Checkbox("Test Checkbox");
  this.add(cb);

  CheckboxGroup cbg = new CheckboxGroup();
  this.add(new Checkbox("CB Item 1",cbg,false));
  this.add(new Checkbox("CB Item 2",cbg,false));
  this.add(new Checkbox("CB Item 3",cbg,true));

  Choice choice = new Choice();
  choice.add("Choice Item 1");
  choice.add("Choice Item 2");
  choice.add("Choice Item 3");
  this.add(choice);

  Label l = new Label("Test Label");
  this.add(l);
  TextField t = new TextField("Test TextField",30);
  this.add(t);
 }
}