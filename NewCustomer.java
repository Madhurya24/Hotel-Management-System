package hotelmanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class NewCustomer extends JFrame implements ActionListener{
	
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t2,t3,t4,t5;
    JComboBox c1,c3;
    Choice c2;
    JButton b1,b2;
    
    NewCustomer(){
        
        JLabel l1 = new JLabel("NEW CUSTOMER FORM");
        l1.setBounds(60, 10, 330, 40);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Cambria",Font.BOLD,30));
        add(l1);
        
        JLabel l2 = new JLabel("ID PROOF");
        l2.setBounds(35, 80, 120, 30);
        l2.setFont(new Font("Cambria",Font.BOLD,17));
        add(l2);
        
        c1 = new JComboBox(new String[]{"Passport","Voter-id card","Driving License","Aadhar Card"});
        c1.setBounds(250,80,160,30);
        c1.setFont(new Font("Cambria",Font.BOLD,17));
        c1.setBackground(Color.white);
        add(c1);
        
        JLabel l3 = new JLabel("NUMBER");
        l3.setBounds(35, 130, 120, 30);
        l3.setFont(new Font("Cambria",Font.BOLD,17));
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(250,130,160,30);
        add(t1);
        
        JLabel l4 = new JLabel("NAME");
        l4.setBounds(35, 180, 120, 30);
        l4.setFont(new Font("Cambria",Font.BOLD,17));
        add(l4);
        
        t2 = new JTextField();
        t2.setBounds(250,180,160,30);
        add(t2);
        
        JLabel l5 = new JLabel("GENDER");
        l5.setBounds(35, 230, 120, 30);
        l5.setFont(new Font("Cambria",Font.BOLD,17));
        add(l5);
        
        c3 = new JComboBox(new String[] { "Male", "Female" });
	c3.setBounds(250, 230, 160, 30);
        c3.setBackground(Color.white);
        c3.setFont(new Font("Cambria",Font.BOLD,17));
	add(c3);
        
        JLabel l6 = new JLabel("COUNTRY");
        l6.setBounds(35, 280, 120, 30);
        l6.setFont(new Font("Cambria",Font.BOLD,17));
        add(l6);
        
        t3 = new JTextField();
        t3.setBounds(250,280,160,30);
        add(t3);
        
        JLabel l7 = new JLabel("ALLOCATED ROOM NO");
        l7.setBounds(35, 330, 200, 30);
        l7.setFont(new Font("Cambria",Font.BOLD,17));
        add(l7);
        
        c2 = new Choice();
        try{
            Conn c = new Conn();
            String str = "select * from room where available = 'Available'";
            ResultSet rs = c.s.executeQuery(str);
            while(rs.next()){
                c2.add(rs.getString("room"));
            }
        }catch(Exception e){
            
        }
        c2.setBounds(250,330,160,40);
        add(c2);
        
        JLabel l8 = new JLabel("CHECKED-IN");
        l8.setBounds(35, 380, 120, 30);
        l8.setFont(new Font("Cambria",Font.BOLD,17));
        add(l8);
        
        t4 = new JTextField();
        t4.setBounds(250,380,160,30);
        add(t4);
        
        JLabel l9 = new JLabel("DEPOSIT");
        l9.setBounds(35, 430, 120, 30);
        l9.setFont(new Font("Cambria",Font.BOLD,17));
        add(l9);
        
        t5 = new JTextField();
        t5.setBounds(250,430,160,30);
        add(t5);
        
        b1 = new JButton("ADD CUSTOMER");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(40,500,160,35);
        b1.addActionListener(this);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        add(b1);
        
        b2 = new JButton("BACK");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(250,500,150,35);
        b2.addActionListener(this);
        b2.setFont(new Font("Cambria",Font.BOLD,17));
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/5.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(450,30,400,500);
        add(l10);
        
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setBounds(350,100,900,620);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){

            String id = (String) c1.getSelectedItem();
            String number = t1.getText();
            String name = t2.getText();
            String gender = null;
            
            String country = t3.getText();
            String room_number = c2.getSelectedItem();
            String status = t4.getText();
            String deposit = t5.getText();
        
            String str = "insert into customer values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room_number+"','"+status+"','"+deposit+"')";
            String str2 = "update room set available = 'occupied' where room = '"+room_number+"'";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(str);
            
                JOptionPane.showMessageDialog(null, "New Customer Added");
                new Reception().setVisible(true);
                this.setVisible(false);
            
            }catch(Exception e){}
        }else if(ae.getSource()==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new NewCustomer().setVisible(true);
    }
}