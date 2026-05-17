import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger {
    public static void main(String[] args) {
        // Creating a frame
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a panel where the color will change
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 250);
        frame.add(panel);

        // Creating buttons
        JButton redBtn = new JButton("Red");
        redBtn.setBounds(50, 200, 80, 30);

        JButton blueBtn = new JButton("Blue");
        blueBtn.setBounds(150, 200, 80, 30);

        JButton rgbBtn = new JButton("RGB");
        rgbBtn.setBounds(250, 200, 80, 30);

        // Adding action listeners
        redBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });

        blueBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        });

        rgbBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Generate random RGB color
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);
                panel.setBackground(new Color(r, g, b));
            }
        });

        // Adding buttons to frame
        frame.add(redBtn);
        frame.add(blueBtn);
        frame.add(rgbBtn);

        // Making frame visible
        frame.setVisible(true);
    }
}
