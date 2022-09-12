
package hotelmanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{
    
    JButton b1,b2;
    JLabel l1,l2;
    JMenuBar mb;
    JMenu m1;
    JMenuItem i1,i2;
    
    HotelManagementSystem() {
        
        mb = new JMenuBar();
        add(mb);
        
        m1 = new JMenu("LOGIN");
        m1.setForeground(Color.white);        
        m1.setBackground(Color.DARK_GRAY);
        m1.setFont(new Font("cambria", Font.BOLD ,17));
        m1.setBounds(0, 10, 100, 20);
        m1.setOpaque(true);
        mb.add(m1);
        
        i1 = new JMenuItem("ADMIN LOGIN");
        i1.addActionListener(this);
        i1.setFont(new Font("cambria", Font.BOLD ,15));
        m1.add(i1);
        
        i2 = new JMenuItem("USER LOGIN");
        i2.addActionListener(this);
        i2.setFont(new Font("cambria", Font.BOLD ,15));
        m1.add(i2);
        
        mb.setBounds(0, 0, 1500, 30);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1366, 565, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1= new JLabel(i3);
        l1.setBounds(0, 0, 1366, 565);
        add(l1);
        
        JLabel l2= new JLabel("HOTEL MANAGEMENT SYSTEM");
        l2.setBounds(400, 15, 600, 100);
        l2.setForeground(Color.lightGray);
        l2.setFont(new Font("serif", Font.PLAIN,40));
        l1.add(l2);
   
        setLayout(null);
        setVisible(true);  
        setBounds(100,100,1366,565);        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("ADMIN LOGIN")){
            new Login().setVisible(true);
            this.setVisible(false);
        }else if(ae.getActionCommand().equals("USER LOGIN")){
            new UserLogin().setVisible(true);
            this.setVisible(false);
        }
             
    }
    public static void main(String[] args) {       
       new HotelManagementSystem();         
    }   
}
