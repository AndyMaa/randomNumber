package main;

import listeners.ClickListener;

import javax.swing.*;
import java.awt.*;

public class ui extends JFrame {
    public static final JTextField t1= new JTextField(5);
    public static final JTextField t2= new JTextField(5);
    public static final JLabel l1=new JLabel("到");

    public static final JButton b= new JButton("点击开始");

    public static final Font f =new Font("宋体",Font.BOLD,32);
    public ui(){
        setSize(400,200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Random number generator");
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEADING,40, 30));

        add(t1);
        add(l1);
        add(t2);

        b.setBackground(Color.WHITE);
        b.setPreferredSize(new Dimension(300, 75));

        b.setFont(f);
        b.addActionListener(new ClickListener());
        add(b);
    }
}
