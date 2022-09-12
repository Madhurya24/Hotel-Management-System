package hotelmanagementsystem;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import net.proteanit.sql.*;

public class Department extends JFrame implements ActionListener{
    
    JButton b1,b2;
    JTable t1;
    JLabel l1,l2,l3,l4;
    
    Department(){
        t1 = new JTable();
        t1.setBounds(20, 110, 400, 400);
        t1.setFont(new Font("Cambria",Font.PLAIN,15));
        add(t1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/6.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 520, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(450, 25, 400, 520);
        add(icon);
        
        JLabel l1 = new JLabel("DEPARTMENT");
        l1.setFont(new Font("Cambria",Font.BOLD,30));
        l1.setForeground(Color.black);
        l1.setBounds(120, 20, 200, 30);
        add(l1);
        
        
        b1 = new JButton("SEARCH");
        b1.setBounds(50, 530, 120, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        add(b1);       
        
        b2 = new JButton("BACK");
        b2.setBounds(240, 530, 120, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setFont(new Font("Cambria",Font.BOLD,17));
        add(b2);
        
        JLabel l3 = new JLabel("DEPARTMENT");
        l3.setBounds(60,70, 210, 30);
        l3.setFont(new Font("Cambria",Font.BOLD,17));
        add(l3);
        
        JLabel l4 = new JLabel("BUDGET");
        l4.setBounds(280, 70, 120, 30);
        l4.setFont(new Font("Cambria",Font.BOLD,17));
        add(l4);
        
        
        setLayout(null);
        setBounds(300,100,900,630);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                String str = "select * from department";
                Conn c = new Conn();
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
        new Department().setVisible(true);
    }
}