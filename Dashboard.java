package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{

    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4,i5;
    JButton b1;
    
    Dashboard() {
        
        mb = new JMenuBar();
        add(mb);
        
        m1 = new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.white);        
        m1.setBackground(Color.DARK_GRAY);
        m1.setFont(new Font("cambria", Font.BOLD ,15));
        m1.setBounds(0, 10, 100, 20);
        m1.setOpaque(true);
        mb.add(m1);
        
        m2 = new JMenu("ADMIN");
        m2.setForeground(Color.white);
        m2.setBackground(Color.DARK_GRAY);
        m2.setBounds(300, 10, 80, 20);
        m2.setFont(new Font("cambria", Font.BOLD ,15));
        m2.setOpaque(true);
        mb.add(m2);
        
        i1 = new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        i1.setFont(new Font("cambria", Font.BOLD ,15));
        m1.add(i1);
        
        i5 = new JMenuItem("LOG OUT");
        i5.addActionListener(this);
        i5.setFont(new Font("cambria", Font.BOLD ,15));
        m1.add(i5);
        
        i2 = new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
        i2.setFont(new Font("cambria", Font.BOLD ,15));
        m2.add(i2);
        
        i3 = new JMenuItem("ADD ROOMS");
        i3.addActionListener(this);
        i3.setFont(new Font("cambria", Font.BOLD ,15));
        m2.add(i3);
        
        i4 = new JMenuItem("ADD DRIVERS");
        i4.addActionListener(this);
        i4.setFont(new Font("cambria", Font.BOLD ,15));
        m2.add(i4);
        
        mb.setBounds(0, 0, 1500, 30);
        
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource ("hotelmanagementsystem/icons/3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0, 900, 600);
        add(l1);
     
        setLayout(null);
        setBounds(310,110,900,600);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("RECEPTION")){
            new Reception().setVisible(true);
            this.setVisible(false);
        }else if(ae.getActionCommand().equals("ADD EMPLOYEE")){
            new AddEmployee().setVisible(true);
            this.setVisible(false);
        }else if(ae.getActionCommand().equals("ADD ROOMS")){
            new AddRoom().setVisible(true);
            this.setVisible(false);
        }else if(ae.getActionCommand().equals("ADD DRIVERS")){
            new AddDrivers().setVisible(true);
            this.setVisible(false);
        }else if(ae.getActionCommand().equals("LOG OUT")){
            new HotelManagementSystem().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        
        new Dashboard().setVisible(true);
    }
}