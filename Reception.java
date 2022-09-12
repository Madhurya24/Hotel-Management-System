package hotelmanagementsystem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{

	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
        
        Reception(){
            
            b1 = new JButton("New Customer Form");
            b1.setBackground(Color.black);
            b1.setForeground(Color.white);
            b1.setBounds(40,30,200,30);
            b1.addActionListener(this);
            b1.setFont(new Font("Cambria",Font.BOLD,17));
            add(b1);
            
            b2 = new JButton("Room");
            b2.setBackground(Color.black);
            b2.setForeground(Color.white);
            b2.setBounds(40,70,200,30);
            b2.addActionListener(this);
            b2.setFont(new Font("Cambria",Font.BOLD,17));
            add(b2);
            
            b3 = new JButton("Department");
            b3.setBackground(Color.black);
            b3.setForeground(Color.white);
            b3.setBounds(40,110,200,30);
            b3.addActionListener(this);
            b3.setFont(new Font("Cambria",Font.BOLD,17));
            add(b3);
            
            b4 = new JButton("All Employee Info");
            b4.setBackground(Color.black);
            b4.setForeground(Color.white);
            b4.setBounds(40,150,200,30);
            b4.addActionListener(this);
            b4.setFont(new Font("Cambria",Font.BOLD,17));
            add(b4);
            
            b5 = new JButton("Customer Info");
            b5.setBackground(Color.black);
            b5.setForeground(Color.white);
            b5.setBounds(40,190,200,30);
            b5.addActionListener(this);
            b5.setFont(new Font("Cambria",Font.BOLD,17));
            add(b5);
            
            b6 = new JButton("Manager Info");
            b6.setBackground(Color.black);
            b6.setForeground(Color.white);
            b6.setBounds(40,230,200,30);
            b6.addActionListener(this);
            b6.setFont(new Font("Cambria",Font.BOLD,17));
            add(b6);
            
            b7 = new JButton("Check Out");
            b7.setBackground(Color.black);
            b7.setForeground(Color.white);
            b7.setBounds(40,270,200,30);
            b7.addActionListener(this);
            b7.setFont(new Font("Cambria",Font.BOLD,17));
            add(b7);
            
            b8 = new JButton("Update Check Status");
            b8.setBackground(Color.black);
            b8.setForeground(Color.white);
            b8.setBounds(40,310,200,30);
            b8.addActionListener(this);
            b8.setFont(new Font("Cambria",Font.BOLD,17));
            add(b8);
            
            b9 = new JButton("Update Room Status");
            b9.setBackground(Color.black);
            b9.setForeground(Color.white);
            b9.setBounds(40,350,200,30);
            b9.addActionListener(this);
            b9.setFont(new Font("Cambria",Font.BOLD,17));
            add(b9);
            
            b10 = new JButton("Pick Up Service");
            b10.setBackground(Color.black);
            b10.setForeground(Color.white);
            b10.setBounds(40,390,200,30);
            b10.addActionListener(this);
            b10.setFont(new Font("Cambria",Font.BOLD,17));
            add(b10);
            
            b11 = new JButton("Search Room");
            b11.setBackground(Color.black);
            b11.setForeground(Color.white);
            b11.setBounds(40,430,200,30);
            b11.addActionListener(this);
            b11.setFont(new Font("Cambria",Font.BOLD,17));
            add(b11);
            
            b12 = new JButton("Log Out");
            b12.setBackground(Color.black);
            b12.setForeground(Color.white);
            b12.setBounds(40,470,200,30);
            b12.addActionListener(this);
            b12.setFont(new Font("Cambria",Font.BOLD,17));
            add(b12);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/fourth.jpg"));
            JLabel l1 = new JLabel(i1);
            l1.setBounds(260,25,500,480);
            add(l1);
            
            getContentPane().setBackground(Color.white);
            
            setLayout(null);
            setBounds(350,150,800,580);
            setVisible(true);
        }
	
        public void actionPerformed(ActionEvent ae){
            
            if(ae.getSource() == b1){
                
                new NewCustomer().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b2){
                
                new Room().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b3){
                
                new Department().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b4){
                
                new EmployeeInfo().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b5){
                
                new CustomerInfo().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b6){
                
                new ManagerInfo().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b7){
                
                new CheckOut().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b8){
                
                new UpdateCheck().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b9){
                
                new UpdateRoom().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b10){
                
                new PickUp().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b11){
                
                new SearchRoom().setVisible(true);
                this.setVisible(false);
                
            }else if(ae.getSource() == b12){
                setVisible(false);
                new HotelManagementSystem().setVisible(true);
            }
        }
        public static void main(String[] args){
            new Reception().setVisible(true);
        }
}