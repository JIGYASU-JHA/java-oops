import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class SampleForm{
        // Declare static variables for form components
    static JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    static JTextField t1, t2, t3, t4, t5, t6, t7;
    static JCheckBox cB1, cB2, cB3;
    static JComboBox<String> cb;
    static JSpinner spinner, spinner1, spinner2;
    static JRadioButton rb1, rb2, rb3;
    
    public static void main(String[] args){
        JFrame f = new JFrame("Sample Form"); //Creating instance of JFrame
// COLOR of the form
       f.getContentPane().setBackground(Color.MAGENTA);


// Name
        l1=new JLabel("Name");
        l1.setBounds(50,50,100,30);
        f.add(l1);
        t1= new JTextField("First Name");
        t1.setBounds(200,50,100,30);
        f.add(t1);
        t2= new JTextField("Middle Name");
        t2.setBounds(310,50,100,30);
        f.add(t2);
        t3= new JTextField("Last Name");
        t3.setBounds(420,50,100,30);
        f.add(t3);

// Course
        l2 = new JLabel("Course");
        l2.setBounds(50,110,100,30);
        f.add(l2);
        cB1 = new JCheckBox("B.Tech");
        cB1.setBounds(200,100,80,50);
        f.add(cB1);
        cB2 = new JCheckBox("M.Tech");
        cB2.setBounds(280,100,80,50);
        f.add(cB2);
        cB3 = new JCheckBox("Ph.D");
        cB3.setBounds(360,100,100,50);
        f.add(cB3);

// Branch
        l3=new JLabel("Branch");
        l3.setBounds(50,170,100,30);
        f.add(l3);
        String branch[]={"CSE / IT / CSCE / CSSE / ECSE","Mechanical","Electrical","Aerospace","Civil"};
        cb = new JComboBox<String>(branch);
        cb.setBounds(200,175,240,30);
        f.add(cb);

// Roll Number
        l4=new JLabel("Roll Number");
        l4.setBounds(50,230,100,30);
        f.add(l4);
        t4 = new JTextField( );
        t4.setBounds(200,230,200,30);
        f.add(t4);

// DOB
        l5=new JLabel("Date Of Birth");
        l5.setBounds(50,290,100,30);
        f.add(l5);
        SpinnerModel value = new SpinnerNumberModel(1,
        1,
        31,
        1);
        spinner = new JSpinner(value);
        spinner.setBounds(200,290,50,30);
        f.add(spinner);
        SpinnerModel value1 = new SpinnerNumberModel(1,
        1,
        12,
        1);
        spinner1 = new JSpinner(value1);
        spinner1.setBounds(270,290,50,30);
        f.add(spinner1);
        SpinnerModel value2 = new SpinnerNumberModel(1995,
        1995,
        2008,
        1);
        spinner2 = new JSpinner(value2);
        spinner2.setBounds(340,290,80,30);
        f.add(spinner2);

// Gender
        l6=new JLabel("Gender");
        l6.setBounds(50,350,100,30);
        f.add(l6);
        ButtonGroup BG1 = new ButtonGroup();
        rb1 = new JRadioButton("MALE");
        rb1.setBounds(195,345,60,40);
        f.add(rb1);
        rb2 = new JRadioButton("FEMALE");
        rb2.setBounds(252,345,80,40);
        f.add(rb2);
        rb3 = new JRadioButton("Prefer Not to Say");
        rb3.setBounds(332,345,200,40);
        f.add(rb3);
        BG1.add(rb1);
        BG1.add(rb2);
        BG1.add(rb3);

// Address
        l7=new JLabel("Address");
        l7.setBounds(50,410,100,30);// (xaxis, yaxis, length, width)
        f.add(l7);
        t4= new JTextField("Address Line 1");
        t4.setBounds(200,410,500,30);
        f.add(t4);
        t5= new JTextField("Address Line 2");
        t5.setBounds(200,450,500,30);
        f.add(t5);

// Email
        l8=new JLabel("E-mail");
        l8.setBounds(50,500,70,30);
        f.add(l8);
        t6= new JTextField("Enter E-mail");
        t6.setBounds(200,500,300,30);
        f.add(t6);
        
// Contact
        l9=new JLabel("Contact");
        l9.setBounds(50,550,100,30);
        f.add(l9);
        t7= new JTextField("+91 ");
        t7.setBounds(200,550,200,30);
        f.add(t7);


// SUBMIT button
        JButton b = new JButton("SUBMIT"); // Creating instance of button
        b.setBounds(500,600,100,40);// x axis, y axis, width, height
         // Adding button in JFrame
        b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            if (isFormFilled()){
                JOptionPane.showMessageDialog(f, "Form Submitted Successfully");
            }  
            else {
                JOptionPane.showMessageDialog(f, "Please fill the form completely first");
            }
        }  
        });  
        f.add(b);     
        f.setSize(700, 700); //400 width and 500 height
        f.setLayout(null); // using no layout managers
        f.setVisible(true); // making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

        public static boolean isFormFilled(){
                return !t1.getText().isEmpty() && !t2.getText().isEmpty() && !t3.getText().isEmpty() &&
                       (cB1.isSelected() || cB2.isSelected() || cB3.isSelected()) &&
                       cb.getSelectedIndex() != -1 && !t4.getText().isEmpty() && 
                       spinner.getValue() != null &&
                       spinner1.getValue() != null &&
                       spinner2.getValue() != null &&
                       (rb1.isSelected() || rb2.isSelected() || rb3.isSelected()) &&
                       !t5.getText().isEmpty() && !t6.getText().isEmpty() && !t7.getText().isEmpty();
        }

}