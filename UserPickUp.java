package hotelmanagementsystem;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import net.proteanit.sql.*;

public class UserPickUp extends JFrame implements ActionListener{
    
    Choice c1;
    JButton b1,b2;
    JCheckBox c2;
    JTable t1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    
    UserPickUp(){
        t1 = new JTable();
        t1.setBounds(10, 180, 865, 340);
        add(t1);
        
        JLabel l1 = new JLabel("PICK UP SERVICE");
        l1.setFont(new Font("Cambria",Font.BOLD,30));
        l1.setForeground(Color.black);
        l1.setBounds(320, 20, 300, 30);
        add(l1);
        
        JLabel l2 = new JLabel("CAR TYPE");
        l2.setFont(new Font("Cambria",Font.BOLD,17));
        l2.setBounds(100, 80, 120, 30);
        add(l2);
        
        c1 = new Choice();
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from driver");
            while(rs.next()){
                c1.add(rs.getString("brand"));
            }
        }catch(Exception e){}
        c1.setBounds(230, 80, 150, 30);
        c1.setFont(new Font("Cambria",Font.BOLD,17));
        add(c1);
        
        b1 = new JButton("SEARCH");
        b1.setBounds(250, 540, 120, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        add(b1);       
        
        b2 = new JButton("BACK");
        b2.setBounds(500, 540, 120, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setFont(new Font("Cambria",Font.BOLD,17));
        add(b2);
        
        JLabel l3 = new JLabel("NAME");
        l3.setBounds(50,145, 70, 30);
        l3.setFont(new Font("Cambria",Font.BOLD,17));
        add(l3);
        
        JLabel l4 = new JLabel("AGE");
        l4.setBounds(180, 145, 70, 30);
        l4.setFont(new Font("Cambria",Font.BOLD,17));
        add(l4);
        
        JLabel l5 = new JLabel("GENDER");
        l5.setBounds(290, 145, 70, 30);
        l5.setFont(new Font("Cambria",Font.BOLD,17));
        add(l5);
        
        JLabel l6 = new JLabel("COMPANY");
        l6.setBounds(400, 145, 90, 30);
        l6.setFont(new Font("Cambria",Font.BOLD,17));
        add(l6);
        
        JLabel l7 = new JLabel("BRAND");
        l7.setBounds(540, 145, 70, 30);
        l7.setFont(new Font("Cambria",Font.BOLD,17));
        add(l7);
        
        JLabel l8 = new JLabel("AVAILABILITY");
        l8.setBounds(630, 145, 130, 30);
        l8.setFont(new Font("Cambria",Font.BOLD,17));
        add(l8);
        
        JLabel l9 = new JLabel("LOCATION");
        l9.setBounds(770, 145, 90, 30);
        l9.setFont(new Font("Cambria",Font.BOLD,17));
        add(l9);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(300,100,900,630);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                String str = "select * from driver where brand = '"+c1.getSelectedItem()+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                
                
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b2){
            new UserLogin().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new UserPickUp().setVisible(true);
    }
}