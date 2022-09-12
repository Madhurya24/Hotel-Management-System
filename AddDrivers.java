package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddDrivers extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4, t5;
    private JComboBox comboBox, comboBox_1;
    JButton b1,b2;
    Choice c1;

    public static void main(String[] args) {
        new AddDrivers().setVisible(true);
    }


    public AddDrivers() {
        setBounds(300, 150, 1000, 520);
	contentPane = new JPanel();
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/eleven.jpg"));
                Image i3 = i1.getImage().getScaledInstance(700, 700,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l15 = new JLabel(i2);
                l15.setBounds(380,15,560,440);
                add(l15);
        
        JLabel l10 = new JLabel("ADD DRIVERS");
        l10.setFont(new Font("Cambria", Font.BOLD, 30));
	l10.setBounds(100, 05, 200, 40);
	contentPane.add(l10);
        
	
        
	JLabel l1 = new JLabel("NAME");
	l1.setForeground(Color.BLACK);
	l1.setFont(new Font("Cambria", Font.BOLD, 17));
	l1.setBounds(50, 70, 120, 30);
	contentPane.add(l1);
        
        
        t1 = new JTextField();
	t1.setBounds(185, 70, 160, 30);
	contentPane.add(t1);
        

	JLabel l2 = new JLabel("AGE");
	l2.setForeground(Color.BLACK);
	l2.setFont(new Font("Cambria", Font.BOLD, 17));
	l2.setBounds(50, 120, 120, 30);
	contentPane.add(l2);
        
        t2 = new JTextField();
	t2.setBounds(185, 120, 160, 30);
	contentPane.add(t2);


	JLabel l3 = new JLabel("GENDER");
	l3.setForeground(Color.BLACK);
	l3.setFont(new Font("Cambria", Font.BOLD, 17));
	l3.setBounds(50, 170, 120, 30);
	contentPane.add(l3);
        
        comboBox = new JComboBox(new String[] { "Male", "Female" });
	comboBox.setBounds(185, 170, 160, 30);
        comboBox.setBackground(Color.white);
	contentPane.add(comboBox);

	JLabel l4 = new JLabel("CAR COMPANY");
	l4.setForeground(Color.BLACK);
	l4.setFont(new Font("Cambria", Font.BOLD, 17));
	l4.setBounds(50, 220, 120, 30);
	contentPane.add(l4);
        
        t3 = new JTextField();
	t3.setBounds(185, 220, 160, 30);
	contentPane.add(t3);

        JLabel l5 = new JLabel("CAR BRAND");
	l5.setForeground(Color.BLACK);
	l5.setFont(new Font("Cambria", Font.BOLD, 17));
	l5.setBounds(50, 270, 120, 30);
	contentPane.add(l5);


        t4 = new JTextField();
	t4.setBounds(185, 270, 160, 30);
	contentPane.add(t4);

	
        JLabel l6 = new JLabel("AVAILABILITY");
	l6.setForeground(Color.BLACK);
	l6.setFont(new Font("Cambria", Font.BOLD, 17));
	l6.setBounds(50, 320, 120, 30);
	contentPane.add(l6);


        comboBox_1 = new JComboBox(new String[] { "Yes", "No" });
	comboBox_1.setBounds(185, 320, 160, 30);
        comboBox_1.setBackground(Color.white);
	contentPane.add(comboBox_1);

        
        JLabel l7 = new JLabel("LOCATION");
	l7.setForeground(Color.BLACK);
	l7.setFont(new Font("Cambria", Font.BOLD, 17));
	l7.setBounds(50, 370, 120, 30);
	contentPane.add(l7);


        t5 = new JTextField();
	t5.setBounds(185, 370, 160, 30);
	contentPane.add(t5);
        
	

	b1 = new JButton("ADD");
	b1.addActionListener(this);
	b1.setBounds(50, 420, 120, 30);
        b1.setFont(new Font("Cambria", Font.BOLD ,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("BACK");
	b2.addActionListener(this);
	b2.setBounds(210, 420, 120, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Cambria", Font.BOLD ,15));
	contentPane.add(b2);

	
        contentPane.setBackground(Color.WHITE);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                Conn c = new Conn();
                String name = t1.getText();
                String age = t2.getText();
                String gender = (String)comboBox.getSelectedItem();
                String company  = t3.getText();
                String brand = t4.getText();
                String available = (String)comboBox_1.getSelectedItem();
                String location = t5.getText();
                String str = "INSERT INTO driver values( '"+name+"', '"+age+"', '"+gender+"','"+company+"', '"+brand+"', '"+available+"','"+location+"')";
              
                
		c.s.executeUpdate(str);
		JOptionPane.showMessageDialog(null, "Driver Successfully Added");
                this.setVisible(false);
               
                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
            else if(ae.getSource() == b2){
                this.setVisible(false);
                new Dashboard().setVisible(true);
            }
        }catch(Exception eee){
            
        }
    }
}