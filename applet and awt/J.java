import java.awt.*;
import java.awt.event.*;

public class J extends Frame
{
 public J(String title)
 {
  super(title);
  setLayout(new BorderLayout());

  Button b1 = new Button("PAGE START");
  add(b1,BorderLayout.PAGE_START);

  Button b2 = new Button("CENTER CLOSE");
  add(b2,BorderLayout.CENTER);
  setVisible(true);
  b2.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {dispose();}
  });

  Button b3 = new Button("LINE START");
  add(b3,BorderLayout.LINE_START);

  Button b4 = new Button("PAGE END");
  add(b4,BorderLayout.PAGE_END);

  Button b5 = new Button("LINE END");
  add(b5,BorderLayout.LINE_END);

 }

public static void main(String[]R)
{ 
 J screen = new J("Border Layout - Beginner");
 screen.setSize(500,250);
 screen.setVisible(true);
}
}