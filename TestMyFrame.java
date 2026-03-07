import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
    TextField t1, t2, t3;
    Label l1, l2, l3;
    Button b1, b2, b3,b4,b5;
    int i1, i2, i3;
    String s1, s2, s3;

    public MyFrame(String ar){
      super(ar);
      t1 = new TextField(20);
      t2 = new TextField(20);
      t3 = new TextField(20);

      l1 = new Label("First Number:");
      l2 = new Label("Second Number:");
      l3 = new Label("Result:");

      b1 = new Button("Add");
      b2 = new Button("Clear");
      b3 = new Button("Subtract");
      b4 = new Button("Multiply");
      b5 = new Button("Devide");

      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);

      Container con = getContentPane();
      con.setLayout(new FlowLayout());
      con.add(l1); //adding components on the frame
      con.add(t1);
      con.add(l2);
      con.add(t2);
      con.add(l3);
      con.add(t3);
      con.add(b1);
      con.add(b3);
      con.add(b4);
      con.add(b5);
      con.add(b2);
    }

    public void actionPerformed(ActionEvent ae){
     if(ae.getSource() == b1){
      i1 = Integer.parseInt(t1.getText());
      i2 = Integer.parseInt(t2.getText());
      i3 = i1+i2;
      t3.setText(""+i3);//(""+t3)
     }
     if(ae.getSource() == b2){
      t1.setText("");
      t2.setText("");
      t3.setText("");
     }
     if(ae.getSource() == b3){
        i1 = Integer.parseInt(t1.getText());
        i2 = Integer.parseInt(t2.getText());
        i3 = i1-i2;
        t3.setText(""+i3);
     }
      if(ae.getSource() == b4){
        i1 = Integer.parseInt(t1.getText());
        i2 = Integer.parseInt(t2.getText());
        i3 = i1*i2;
        t3.setText(""+i3);
     }
    }

}

class TestMyFrame{
    public static void main(String[] args){
    MyFrame obj = new MyFrame("Calculator");
    obj.setDefaultCloseOperation(3);
    obj.setSize(400, 500);
    obj.setVisible(true); 
    
    }
} 