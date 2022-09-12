package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
        
public class RestaurantPhotos extends JFrame implements ActionListener{
    JButton b1;
    
    RestaurantPhotos(){
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/r1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(20, 20, 350, 200);
        add(l3);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/r5.jpg"));
        Image i5 = i4.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l4 = new JLabel(i6);
        l4.setBounds(390, 20, 350, 200);
        add(l4);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/r2.jpg"));
        Image i8 = i7.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l5 = new JLabel(i9);
        l5.setBounds(760, 20, 350, 200);
        add(l5);
        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/r6.jpg"));
        Image i11 = i10.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel l6 = new JLabel(i12);
        l6.setBounds(20, 235, 350, 200);
        add(l6);
        
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/r3.jpg"));
        Image i14 = i13.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel l7 = new JLabel(i15);
        l7.setBounds(390, 235, 350, 200);
        add(l7);
        
        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/r4.jpg"));
        Image i17 = i16.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        JLabel l8 = new JLabel(i18);
        l8.setBounds(760, 235, 350, 200);
        add(l8);
        
        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/r9.jpg"));
        Image i20 = i19.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        JLabel l9 = new JLabel(i21);
        l9.setBounds(20, 455, 350, 200);
        add(l9);
        
        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/r8.jpg"));
        Image i23 = i22.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        JLabel l10 = new JLabel(i24);
        l10.setBounds(390, 455, 350, 200);
        add(l10);
        
        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/r7.jpg"));
        Image i26 = i25.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        JLabel l11 = new JLabel(i27);
        l11.setBounds(760, 455, 350, 200);
        add(l11);
        
        b1 = new JButton("BACK");
        b1.setBounds(490, 670, 150, 30);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        setBackground(Color.LIGHT_GRAY);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(250,10,1150,750);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        new Photos().setVisible(true);
        this.setVisible(false);
    }
    public static void main(String[] args){
        new RestaurantPhotos();
    }
}