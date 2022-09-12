package hotelmanagementsystem;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;

public class ManagerInfo extends JFrame implements ActionListener{
    
    JTable t1;
    JButton b1,b2;
    
    ManagerInfo(){
        
        t1 = new JTable();
        t1.setBounds(15, 100, 950, 450);
        add(t1);
        
        JLabel l9 = new JLabel("MANAGER INFO");
        l9.setFont(new Font("Cambria", Font.BOLD, 30));
	l9.setBounds(375, 05, 300, 40);
	add(l9);
        
        JLabel l1 = new JLabel("NAME");
        l1.setBounds(40, 60, 120, 30);
        l1.setFont(new Font("Cambria", Font.BOLD, 17));
        add(l1);
        
        JLabel l2 = new JLabel("AGE");
        l2.setBounds(170, 60, 120, 30);
        l2.setFont(new Font("Cambria", Font.BOLD, 17));
        add(l2);
        
        JLabel l3 = new JLabel("GENDER");
        l3.setBounds(285, 60, 120, 30);
        l3.setFont(new Font("Cambria", Font.BOLD, 17));
        add(l3);
        
        JLabel l4 = new JLabel("DEPT");
        l4.setBounds(410, 60, 120, 30);
        l4.setFont(new Font("Cambria", Font.BOLD, 17));
        add(l4);
        
        JLabel l5 = new JLabel("SALARY");
        l5.setBounds(520, 60, 120, 30);
        l5.setFont(new Font("Cambria", Font.BOLD, 17));
        add(l5);
        
        JLabel l6 = new JLabel("PHONE");
        l6.setBounds(630, 60, 120, 30);
        l6.setFont(new Font("Cambria", Font.BOLD, 17));
        add(l6);
        
        JLabel l7 = new JLabel("AADHAR");
        l7.setBounds(750, 60, 120, 30);
        l7.setFont(new Font("Cambria", Font.BOLD, 17));
        add(l7);
        
        JLabel l8 = new JLabel("EMAIL");
        l8.setBounds(870, 60, 120, 30);
        l8.setFont(new Font("Cambria", Font.BOLD, 17));
        add(l8);
        
        b1 = new JButton("LOAD DATA");
        b1.setBounds(300, 560, 150, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setFont(new Font("Cambria", Font.BOLD, 17));
        add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(530, 560, 150, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setFont(new Font("Cambria", Font.BOLD, 17));
        add(b2);
        
        getContentPane().setBackground(Color.white);

        
        setLayout(null);
        setBounds(300,80,1000,650);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == b1){
            
            try{
                Conn c = new Conn();
                String str = "select * from Employee where job = 'Manager'";
                ResultSet rs = c.s.executeQuery(str);
                
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new ManagerInfo().setVisible(true);
    }
}