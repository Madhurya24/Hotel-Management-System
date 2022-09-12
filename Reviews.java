package hotelmanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

       
public class Reviews extends JFrame implements ActionListener{
    JButton b1;
    JTextArea t1;
    JScrollPane p1;
    
    Reviews(){
        
        b1 = new JButton("BACK");
        b1.setBounds(520, 670, 150, 30);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        JLabel l1 = new JLabel("REVIEWS");
        l1.setFont(new Font("Cambria",Font.BOLD,30));
        l1.setForeground(Color.black);
        l1.setBounds(520, 10, 150, 30);
        add(l1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/review.png"));
        Image i2 = i1.getImage().getScaledInstance(1210, 641, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(15, 40, 1210, 641);
        add(l3);
      
        setBackground(Color.LIGHT_GRAY);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(150,15,1250,760);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        new UserLogin().setVisible(true);
        this.setVisible(false);
    }
    public static void main(String[] args){
        new Reviews();
    }
}