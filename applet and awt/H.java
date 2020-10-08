import java.awt.*;
import java.awt.event.*;

public class H extends Frame
{
 public H(String title){
  super(title);
  setLayout(new BorderLayout());
  Button B = new Button("Test Button");
  add(B);
  B.setBounds(50,100,120,30);

  Checkbox C = new Checkbox("Test Checkbox");
  add(C);
  C.setBounds(200,200,50,50);

  Choice choice = new Choice();
  choice.setBounds(550,550,550,550);
  choice.add("Choice Item 1");
  choice.add("Choice Item 2");
  choice.add("Choice Item 3");
  add(choice);

  Button b2 = new Button("CLOSE");
  add(b2,BorderLayout.PAGE_END);
  b2.setBounds(150,150,450,450);
  setVisible(true);
  b2.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {dispose();}
  });

  Label l = new Label("Test Label");
  add(l);
  final TextField t = new TextField("Test TextField",30);
  t.setBounds(250,250,250,250);
  add(t);

 setSize(500,500);
 setVisible(true);}

public static void main(String arg[])
{
  H screen = new H("Border Lyaout - beginner");
  screen.setSize(500,250);
  screen.setVisible(true); 
}
}