package hotelmanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    
    Login() {
        
        l1=new JLabel("Username");
        l1.setBounds(30, 50, 100, 30);
        l1.setFont(new Font("serif", Font.BOLD ,15));
        add(l1);
       
        l2=new JLabel("Password");
        l2.setBounds(30, 100, 100, 30);
        l2.setFont(new Font("serif", Font.BOLD ,15));
        add(l2);
        
        t1=new JTextField();
        t1.setBounds(110, 50, 180, 30);
        add(t1);
        
        t2=new JPasswordField();
        t2.setBounds(110, 100, 180, 30);
        add(t2);
        
        b1=new JButton("LOGIN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(30,200,100,40);
        b1.addActionListener(this);
        b1.setFont(new Font("serif", Font.BOLD ,15));
        add(b1);
        
        b2=new JButton("CANCEL");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(190,200,100,40);
        b2.addActionListener(this);
        b2.setFont(new Font("serif", Font.BOLD ,15));
        add(b2);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/second.jpg"));
        Image i2 =i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3= new JLabel(i3);
        l3.setBounds(310, 30, 250, 250);
        add(l3);
        
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setBounds(500,200,580,330);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            
            String username=t1.getText();
            String password=t2.getText();
            Conn c=new Conn();
            
            String str = "select * from login where username='"+username+"' and password='"+password+"'";
            try{
                ResultSet rs = c.s.executeQuery(str);
                if(rs.next()){
                    new HotelManagementSystem().setVisible(false);
                    new Dashboard().setVisible(true);                    
                    this.setVisible(false);                   
                 }else{
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    this.setVisible(true);
                    
                }
            }catch(Exception e){
                
            }
        }else if(ae.getSource()==b2){
            new HotelManagementSystem().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        
        new Login();
    }
}