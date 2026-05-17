import javax.swing.*;  
import java.awt.*;
public class FirstSwingExample1 {  
public static void main(String[] args) {  
JFrame f=new JFrame("First Swing class");//creating instance of JFrame  
          
Button b=new Button("click");//creating instance of JButton  
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  

JRadioButton rb1=new JRadioButton("MALE");
rb1.setBounds(200,300,100, 40);
f.add(rb1);

          
f.add(b);//adding button in JFrame  
          
f.setSize(700,700);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
} 