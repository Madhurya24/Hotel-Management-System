package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CheckOut extends JFrame implements ActionListener{
	
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3;
    JTextField t1;
    Choice c1;
    
    CheckOut(){
        
        JLabel l1 = new JLabel("CHECK OUT");
        l1.setFont(new Font("Cambria",Font.BOLD,30));
        l1.setForeground(Color.black);
        l1.setBounds(100, 10, 250, 40);
        add(l1);
        
        JLabel l2 = new JLabel("NUMBER");
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
        c1.setBounds(200, 80, 120, 40);
        c1.setFont(new Font("Cambria",Font.BOLD,17));
        add(c1);
        
        JLabel l3 = new JLabel("ROOM NUMBER");
        l3.setFont(new Font("Cambria",Font.BOLD,17));
        l3.setBounds(30, 140, 150, 30);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(200,140,150,30);
        add(t1);
        
        b1 = new JButton("CHECK OUT");
        b1.setBounds(30, 230, 130, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(210, 230, 130, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setFont(new Font("Cambria",Font.BOLD,17));
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/sixth.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(375,10,460,310);
        add(l4);
        
        getContentPane().setBackground(Color.white);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/tick.png"));
        Image i5 = i4.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        b3 = new JButton(i6);
        b3.setBounds(330,80,25,25);
        b3.addActionListener(this);
        add(b3);
        
        setLayout(null);
        setBounds(300,100,880,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String id = c1.getSelectedItem();
            String room = t1.getText();
            String str = "delete from customer where number = '"+id+"'";
            String str2 = "update room set available = 'Available' where room = room";
            Conn c = new Conn();
            try{
                c.s.executeUpdate(str);
                c.s.executeUpdate(str2);
                JOptionPane.showMessageDialog(null, "Checked Out");
                new Reception().setVisible(true);
                this.setVisible(false);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource() == b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            Conn c = new Conn();
            String id = c1.getSelectedItem();
            try{
                ResultSet rs = c.s.executeQuery("select * from customer where number = '"+id+"'");
                while(rs.next()){
                    t1.setText(rs.getString("room_number"));
                }
            }catch(Exception e){
                
            }
        }
    }

    public static void main(String[] args){
        new CheckOut().setVisible(true);
    }
}
