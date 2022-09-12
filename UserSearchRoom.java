package hotelmanagementsystem;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import net.proteanit.sql.*;

public class UserSearchRoom extends JFrame implements ActionListener{
    
    JComboBox c1;
    JCheckBox c2;
    JButton b1,b2;
    JTable t1;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    
    UserSearchRoom(){
        t1 = new JTable();
        t1.setBounds(10, 180, 865, 340);
        add(t1);
        
        JLabel l1 = new JLabel("SEARCH FOR ROOM");
        l1.setFont(new Font("Cambria",Font.BOLD,30));
        l1.setForeground(Color.black);
        l1.setBounds(330, 20, 300, 30);
        add(l1);
        
        JLabel l2 = new JLabel("ROOM BED TYPE");
        l2.setFont(new Font("Cambria",Font.BOLD,17));
        l2.setBounds(60, 80, 150, 30);
        add(l2);
        
        c1 = new JComboBox(new String[]{"Single Bed","Double Bed"});
        c1.setBounds(200,80,150,30);
        c1.setBackground(Color.white);
        c1.setFont(new Font("Cambria",Font.BOLD,17));
        add(c1);
        
        c2 = new JCheckBox("Only Display Available");
        c2.setBounds(500,80,200,30);
        c2.setBackground(Color.white);
        c2.setFont(new Font("Cambria",Font.BOLD,17));
        add(c2);
        
        b1 = new JButton("SEARCH");
        b1.setBounds(250, 520, 120, 30);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);       
        
        b2 = new JButton("BACK");
        b2.setBounds(500, 520, 120, 30);
        b2.setFont(new Font("Cambria",Font.BOLD,17));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        JLabel l3 = new JLabel("ROOM NO");
        l3.setBounds(50,145, 90, 30);
        l3.setFont(new Font("Cambria",Font.BOLD,17));
        add(l3);
        
        JLabel l4 = new JLabel("AVAILABILITY");
        l4.setBounds(215, 145, 120, 30);
        l4.setFont(new Font("Cambria",Font.BOLD,17));
        add(l4);
        
        JLabel l5 = new JLabel("STATUS");
        l5.setBounds(410, 145, 70, 30);
        l5.setFont(new Font("Cambria",Font.BOLD,17));
        add(l5);
        
        JLabel l6 = new JLabel("PRICE");
        l6.setBounds(600, 145, 70, 30);
        l6.setFont(new Font("Cambria",Font.BOLD,17));
        add(l6);
        
        JLabel l7 = new JLabel("BED TYPE");
        l7.setBounds(740, 145, 100, 30);
        l7.setFont(new Font("Cambria",Font.BOLD,17));
        add(l7);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(300,100,900,630);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                String str = "select * from room where type = '"+c1.getSelectedItem()+"'";
                String str2 = "select * from room where available = 'Available' AND type = '"+c1.getSelectedItem()+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                
                if(c2.isSelected()){
                    ResultSet rs2 = c.s.executeQuery(str2);
                    t1.setModel(DbUtils.resultSetToTableModel(rs2));
                }
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b2){
            new UserLogin().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new UserSearchRoom().setVisible(true);
    }
}