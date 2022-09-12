package hotelmanagementsystem;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class UpdateCheck extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b1,b2,b3;
    JTextField t1,t2,t3,t4,t5;
    Choice c1;
    
    UpdateCheck(){
        
        JLabel l1 = new JLabel("CHECK IN DETAILS");
        l1.setFont(new Font("Cambria",Font.BOLD,30));
        l1.setForeground(Color.black);
        l1.setBounds(80, 20, 300, 30);
        add(l1);
        
        JLabel l2 = new JLabel("CUSTOMER ID");
        l2.setFont(new Font("Cambria",Font.BOLD,17));
        l2.setBounds(30, 80, 150, 30);
        add(l2);
        
        c1 = new Choice();
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next()){
                c1.add(rs.getString("number"));
            }
        }catch(Exception e){}
        c1.setBounds(240, 80, 150, 30);
        c1.setFont(new Font("Cambria",Font.BOLD,17));
        add(c1);
        
        JLabel l3 = new JLabel("ROOM NUMBER");
        l3.setFont(new Font("Cambria",Font.BOLD,17));
        l3.setBounds(30, 130, 150, 30);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(240,130,150,30);
        add(t1);
        
        JLabel l4 = new JLabel("NAME");
        l4.setFont(new Font("Cambria",Font.BOLD,17));
        l4.setBounds(30, 180, 150, 30);
        add(l4);
        
        t2 = new JTextField();
        t2.setBounds(240,180,150,30);
        add(t2);
        
        JLabel l5 = new JLabel("CHECKED IN");
        l5.setFont(new Font("Cambria",Font.BOLD,17));
        l5.setBounds(30, 230, 150, 30);
        add(l5);
        
        t3 = new JTextField();
        t3.setBounds(240,230,150,30);
        add(t3);
        
        JLabel l6 = new JLabel("AMOUNT PAID(RS)");
        l6.setFont(new Font("Cambria",Font.BOLD,17));
        l6.setBounds(30, 280, 150, 30);
        add(l6);
        
        t4 = new JTextField();
        t4.setBounds(240,280,150,30);
        add(t4);
               
        JLabel l7 = new JLabel("PENDING AMOUNT(RS)");
        l7.setFont(new Font("Cambria",Font.BOLD,17));
        l7.setBounds(30, 330, 200, 30);
        add(l7);
        
        t5 = new JTextField();
        t5.setBounds(240,330,150,30);
        add(t5);
        
        b1 = new JButton("CHECK");
        b1.setBounds(40, 400, 120, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        add(b1);
        
        b2 = new JButton("UPDATE");
        b2.setBounds(250, 400, 120, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setFont(new Font("Cambria",Font.BOLD,17));
        add(b2);
        
        b3 = new JButton("BACK");
        b3.setBounds(140, 460, 120, 30);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        b3.setFont(new Font("Cambria",Font.BOLD,17));
        add(b3);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/nine.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l8 = new JLabel(i3);
        l8.setBounds(420,10,450,500);
        add(l8);
        
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setBounds(300,100,900,550);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                String room_number = null;
                String deposit = null;
                int pendingamount;
                String price = null;
                Conn c = new Conn();
                String id = c1.getSelectedItem();
                String str = "select * from Customer where number = '"+id+"'";
                ResultSet rs1 = c.s.executeQuery(str);
                while(rs1.next()){
                    t1.setText(rs1.getString("room_number"));
                    t2.setText(rs1.getString("name"));
                    t3.setText(rs1.getString("status"));
                    t4.setText(rs1.getString("deposit"));
                    room_number = rs1.getString("room_number");
                    deposit = rs1.getString("deposit");
                }
                ResultSet rs2 = c.s.executeQuery("select * from room where room = '"+room_number+"' ");
                while(rs2.next()){
                    price = rs2.getString("price");
                    pendingamount = Integer.parseInt(price)-Integer.parseInt(deposit);
                    t5.setText(Integer.toString(pendingamount));
                   
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource() == b2){
            
            try{
                Conn c = new Conn(); 
                int amt;
                String id = c1.getSelectedItem();
                String room_number = t1.getText(); //room_number; 
                String name = t2.getText(); //name
                String status = t3.getText(); //status;
                String deposit = t4.getText(); //deposit
                String str = "update customer set room_number = '"+room_number+"', name = '"+name+"', status = '"+status+"', deposit = '"+deposit+"' where number = '"+room_number+"'";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Data Updated Successfully"); 
                new Reception().setVisible(true);
                setVisible(false);
            }catch(Exception ee){
                System.out.println(ee);
            }
        }else if(ae.getSource() == b3){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new UpdateCheck().setVisible(true);
    }
}