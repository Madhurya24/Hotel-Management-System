package hotelmanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Photos extends JFrame implements ActionListener{
    
    JButton b1,b2,b4,b5,b6;
   
    Photos(){
        
        b1 = new JButton("ROOMS");
        b1.setBounds(20, 20, 200, 30);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("AMENITIES");
        b2.setBounds(250, 20, 200, 30);
        b2.setFont(new Font("Cambria",Font.BOLD,17));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        b4 = new JButton("RESTAURANT");
        b4.setBounds(20, 70, 200, 30);
        b4.setFont(new Font("Cambria",Font.BOLD,17));
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton("RECEPTION & LOBBY");
        b5.setBounds(250, 70, 200, 30);
        b5.setFont(new Font("Cambria",Font.BOLD,17));
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        add(b5);
        
        b6 = new JButton("BACK");
        b6.setBounds(140, 120, 200, 30);
        b6.setFont(new Font("Cambria",Font.BOLD,17));
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        b6.addActionListener(this);
        add(b6);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(480,300,500,220);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new RoomsPhotos().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b2){
            new Amenities().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b4){
            new RestaurantPhotos().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b5){
            new HotelPhotos().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b6){
            new UserLogin().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new Photos();
    }
}