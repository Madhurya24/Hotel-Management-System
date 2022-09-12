package hotelmanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
        
public class RoomsPhotos extends JFrame implements ActionListener{
    JButton b1;
    
    RoomsPhotos(){
        
        JLabel l1 = new JLabel("SINGLE BED");
        l1.setFont(new Font("Cambria",Font.BOLD,17));
        l1.setForeground(Color.black);
        l1.setBounds(15, 10, 150, 30);
        add(l1);
        
        JLabel l2 = new JLabel("DOUBLE BED");
        l2.setFont(new Font("Cambria",Font.BOLD,17));
        l2.setForeground(Color.black);
        l2.setBounds(665, 10, 150, 30);
        add(l2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/sb6.jfif"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(20, 45, 300, 170);
        add(l3);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/sb2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l4 = new JLabel(i6);
        l4.setBounds(340, 45, 300, 170);
        add(l4);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/sb3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l5 = new JLabel(i9);
        l5.setBounds(20, 230, 300, 170);
        add(l5);
        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/sb4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel l6 = new JLabel(i12);
        l6.setBounds(340, 230, 300, 170);
        add(l6);
        
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/sb1.jpg"));
        Image i14 = i13.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel l7 = new JLabel(i15);
        l7.setBounds(20, 415, 300, 170);
        add(l7);
        
        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/sb5.jpg"));
        Image i17 = i16.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        JLabel l8 = new JLabel(i18);
        l8.setBounds(340, 415, 300, 170);
        add(l8);
        
        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/db1.jpg"));
        Image i20 = i19.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        JLabel l9 = new JLabel(i21);
        l9.setBounds(670, 45, 300, 170);
        add(l9);
        
        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/db2.jpg"));
        Image i23 = i22.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        JLabel l10 = new JLabel(i24);
        l10.setBounds(990, 45, 300, 170);
        add(l10);
        
        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/db4.jpg"));
        Image i26 = i25.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        JLabel l11 = new JLabel(i27);
        l11.setBounds(670, 230, 300, 170);
        add(l11);
        
        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/db3.jpg"));
        Image i29 = i28.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i30 = new ImageIcon(i29);
        JLabel l12 = new JLabel(i30);
        l12.setBounds(990, 230, 300, 170);
        add(l12);
        
        ImageIcon i31 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/db6.jpg"));
        Image i32 = i31.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i32);
        JLabel l13 = new JLabel(i33);
        l13.setBounds(670, 415, 300, 170);
        add(l13);
        
        ImageIcon i34 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/db5.jpg"));
        Image i35 = i34.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i36 = new ImageIcon(i35);
        JLabel l14 = new JLabel(i36);
        l14.setBounds(990, 415, 300, 170);
        add(l14);
        
        b1 = new JButton("BACK");
        b1.setBounds(580, 600, 150, 40);
        b1.setFont(new Font("Cambria",Font.BOLD,17));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        setBackground(Color.LIGHT_GRAY);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(120,50,1350,700);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        new Photos().setVisible(true);
        this.setVisible(false);
    }
    public static void main(String[] args){
        new RoomsPhotos();
    }
}