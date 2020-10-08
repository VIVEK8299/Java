import java.awt.*;
import java.awt.event.*;
public class I extends Frame implements ActionListener
{
 I()
 {
  Button b = new Button("New Button");
  b.setBounds(100,50,80,50);
  add(b);
  b.addActionListener(this);
  setSize(600,600);
  setTitle("This is my first Example");
  setLayout(null);
  setVisible(true);
 }
public void actionPerformed(ActionEvent e){dispose();}
  public static void main(String[]R)
  {
   I ob = new I();
  }
}