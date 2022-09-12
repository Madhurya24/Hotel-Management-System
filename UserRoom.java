package hotelmanagementsystem;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import net.proteanit.sql.DbUtils;

public class UserRoom extends JFrame implements ActionListener{
	
    JTable t1;
    JButton b1,b2;
        
    UserRoom(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/eight.jpg"));
        Image i2 = i1.getImage().getScaledInstance(550, 520, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(600, 20, 550, 520);
        add(icon);
        
        JLabel l1 = new JLabel("ROOM NO");
        l1.setBounds(40, 05, 100, 30);
        l1.setFont(new Font("Cambria",Font.BOLD,15));
        add(l1);
        
        JLabel l2 = new JLabel("AVAILABILITY");
        l2.setBounds(140, 05, 100, 30);
        l2.setFont(new Font("Cambria",Font.BOLD,15));
        add(l2);
        
        JLabel l3 = new JLabel("STATUS");
        l3.setBounds(270, 05, 100, 30);
        l3.setFont(new Font("Cambria",Font.BOLD,15));
        add(l3);
        
        JLabel l4 = new JLabel("PRICE");
        l4.setBounds(380, 05, 100, 30);
        l4.setFont(new Font("Cambria",Font.BOLD,15));
        add(l4);
        
        JLabel l5 = new JLabel("BED TYPE");
        l5.setBounds(480, 05, 100, 30);
        l5.setFont(new Font("Cambria",Font.BOLD,15));
        add(l5);
        
        t1 = new JTable();
        t1.setBounds(15, 40, 560, 480);
        add(t1);
        
        b1 = new JButton("LOAD DATA");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(90, 520, 150, 30);
        b1.addActionListener(this);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        add(b1);
        
        b2 = new JButton("BACK");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(330, 520, 150, 30);
        b2.addActionListener(this);
        b2.setFont(new Font("Cambria",Font.BOLD,17));
        add(b2);
        
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setBounds(280,100,1200,650);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == b1){
            try{
                Conn c = new Conn();
                String str = "select * from Room";
                ResultSet rs = c.s.executeQuery(str);
                
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                
            }catch(Exception e){
                
            }
        }else if(ae.getSource()== b2){
            new UserLogin().setVisible(true);
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new UserRoom().setVisible(true);
    }
}