package hotelmanagementsystem;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class UserLogin extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    
    UserLogin(){
        
        b1 = new JButton("ROOM");
        b1.setBounds(30, 30, 170, 30);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("PICK UP SERVICE");
        b2.setBounds(30, 80, 170, 30);
        b2.setFont(new Font("Cambria",Font.BOLD,17));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("SEARCH ROOM");
        b3.setBounds(30, 130, 170, 30);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Cambria",Font.BOLD,17));
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("ABOUT");
        b4.setBounds(30, 180, 170, 30);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.setFont(new Font("Cambria",Font.BOLD,17));
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton("PHOTOS");
        b5.setBounds(30, 230, 170, 30);
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b5.setFont(new Font("Cambria",Font.BOLD,17));
        b5.addActionListener(this);
        add(b5);
        
        b6 = new JButton("REVIEWS");
        b6.setBounds(30, 280, 170, 30);
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        b6.setFont(new Font("Cambria",Font.BOLD,17));
        b6.addActionListener(this);
        add(b6);
        
        b7 = new JButton("FAQs");
        b7.setBounds(30, 330, 170, 30);
        b7.setBackground(Color.black);
        b7.setForeground(Color.white);
        b7.setFont(new Font("Cambria",Font.BOLD,17));
        b7.addActionListener(this);
        add(b7);
        
        b8 = new JButton("BACK");
        b8.setBounds(30, 380, 170, 30);
        b8.setBackground(Color.black);
        b8.setForeground(Color.white);
        b8.setFont(new Font("Cambria",Font.BOLD,17));
        b8.addActionListener(this);
        add(b8);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/8.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(220, 15,380, 420);
        add(l1);
        
        setLayout(null);
        setBounds(500,200,600,480);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new UserRoom().setVisible(true);
            this.setVisible(false);
            new HotelManagementSystem().setVisible(false);
        }else if(ae.getSource()==b2){
            new UserPickUp().setVisible(true);
            this.setVisible(false);
            new HotelManagementSystem().setVisible(false);
        }else if(ae.getSource()==b3){
            new UserSearchRoom().setVisible(true);
            this.setVisible(false);
            new HotelManagementSystem().setVisible(false);
        }else if(ae.getSource()==b4){
            new About().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b5){
            new Photos().setVisible(true);
            this.setVisible(false);
            new HotelManagementSystem().setVisible(false);
        }else if(ae.getSource()==b6){
            new Reviews().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b7){
            new FAQs().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b8){
            new HotelManagementSystem().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new UserLogin().setVisible(true);
    }
}
