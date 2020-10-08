import java.awt.*;
import java.awt.event.*;

public class F
{
 public static void  main(String arg[])
 {
  Button b;
  Button C;
  TextField tf;
  final Frame f=new Frame();
  tf=new TextField();
  tf.setBounds(30,40,150,20);

  b=new Button("Click");
  b.setBounds(80,150,60,50);

  f.add(b); f.add(tf);
  b.addActionListener(new ActionListener ()
 {
  public void actionPerformed(ActionEvent e)
 {
  tf.setText("Welcome");
 }
});

 C=new Button("CLick Her To Close");
 C.setBounds(250,250,100,45);
 f.add(C);

 C.addActionListener(new ActionListener ()
 {
  public void actionPerformed(ActionEvent e)
  {
   f.dispose();
  }
 });
  f.setSize(400,400);
  f.setLayout(null);
  f.setVisible(true);}

 
}