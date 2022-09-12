package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateRoom extends JFrame implements ActionListener{
    
    Choice c1;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3;
    JButton b1,b2,b3;
    
    UpdateRoom(){
        
        JLabel l1 = new JLabel("UPDATE ROOM STATUS");
        l1.setFont(new Font("Cambria",Font.BOLD,30));
        l1.setForeground(Color.black);
        l1.setBounds(30, 20, 350, 30);
        add(l1);
        
        JLabel l2 = new JLabel("GUEST ID");
        l2.setFont(new Font("Cambria",Font.BOLD,17));
        l2.setBounds(30, 80, 150, 30);
        add(l2);
        
        c1 = new Choice();
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from Customer");
            while(rs.next()){
                c1.add(rs.getString("number"));
            }
        }catch(Exception e){}
        c1.setBounds(200, 80, 150, 30);
        c1.setFont(new Font("Cambria",Font.BOLD,17));
        add(c1);
        
        JLabel l3 = new JLabel("ROOM NUMBER");
        l3.setFont(new Font("Cambria",Font.BOLD,17));
        l3.setBounds(30, 130, 150, 30);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(200,130,150,30);
        add(t1);
        
        JLabel l4 = new JLabel("AVAILABILITY");
        l4.setFont(new Font("Cambria",Font.BOLD,17));
        l4.setBounds(30, 180, 150, 30);
        add(l4);
        
        t2 = new JTextField();
        t2.setBounds(200,180,150,30);
        add(t2);
        
        JLabel l5 = new JLabel("CLEAN STATUS");
        l5.setFont(new Font("Cambria",Font.BOLD,17));
        l5.setBounds(30, 230, 150, 30);
        add(l5);
        
        t3 = new JTextField();
        t3.setBounds(200,230,150,30);
        add(t3);
        
        b1 = new JButton("CHECK");
        b1.setBounds(40, 300, 120, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        add(b1);
        
        b2 = new JButton("UPDATE");
        b2.setBounds(220, 300, 120, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setFont(new Font("Cambria",Font.BOLD,17));
        add(b2);
        
        b3 = new JButton("BACK");
        b3.setBounds(125, 360, 120, 30);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        b3.setFont(new Font("Cambria",Font.BOLD,17));
        add(b3);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/seventh.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(400,20,450,400);
        add(l6);
        
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setBounds(300,200,900,500);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String room_number = null;
            String s1 = c1.getSelectedItem();
            Conn c = new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from Customer where number = '"+s1+"'");
                while(rs.next()){
                    t1.setText(rs.getString("room_number"));
                    room_number = rs.getString("room_number");
                }
                ResultSet rs2 = c.s.executeQuery("select * from room where room = '"+room_number+"'");
                while(rs2.next()){
                    t2.setText(rs2.getString("available"));
                    t3.setText(rs2.getString("status"));
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
        }else if(ae.getSource() == b2){
            try{
                Conn c = new Conn();
                String room = t1.getText();
                String available = t2.getText();
                String status = t3.getText();
                
                String str = "update room set available = '"+available+"', status = '"+status+"' where room = '"+room+"'";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Room Updated Successfully");
                new Reception().setVisible(true);
                this.setVisible(false);
                
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b3){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new UpdateRoom().setVisible(true);
    }
}