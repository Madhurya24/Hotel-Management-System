package hotelmanagementsystem;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddRoom extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;
    Choice c1;

    public static void main(String[] args) {
        new AddRoom().setVisible(true);
    }


    public AddRoom() {
        setBounds(300, 200, 1000, 450);
	contentPane = new JPanel();
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/twelve.jpg"));
        Image i3 = i1.getImage().getScaledInstance(600, 400,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l15 = new JLabel(i2);
        l15.setBounds(380,15,570,370);
        add(l15);
        
        JLabel l10 = new JLabel("ADD ROOMS");
        l10.setFont(new Font("Cambria", Font.BOLD, 30));
	l10.setBounds(100, 10, 200, 40);
	contentPane.add(l10);
        
	
        
	JLabel l1 = new JLabel("ROOM NO");
	l1.setForeground( Color.BLACK);
	l1.setFont(new Font("Cambria", Font.BOLD, 17));
	l1.setBounds(50, 70, 120, 30);
	contentPane.add(l1);
               
        t4 = new JTextField();
	t4.setBounds(185, 70, 160, 30);
        l1.setFont(new Font("Cambria", Font.BOLD, 17));
	contentPane.add(t4);
        

	JLabel l2 = new JLabel("AVAILABILITY");
	l2.setForeground(Color.BLACK);
	l2.setFont(new Font("Cambria", Font.BOLD, 17));
	l2.setBounds(50, 120, 120, 30);
	contentPane.add(l2);
        
        comboBox = new JComboBox(new String[] { "Available", "Occupied" });
	comboBox.setBounds(185, 120, 160, 30);
        comboBox.setBackground(Color.white);
	contentPane.add(comboBox);


	JLabel l3 = new JLabel("STATUS");
	l3.setForeground(Color.BLACK);
	l3.setFont(new Font("Cambria", Font.BOLD, 17));
	l3.setBounds(50, 170, 120, 30);
	contentPane.add(l3);
        
        comboBox_2 = new JComboBox(new String[] { "Cleaned", "Dirty" });
	comboBox_2.setBounds(185, 170, 160, 30);
        comboBox_2.setBackground(Color.white);
	contentPane.add(comboBox_2);

	JLabel l4 = new JLabel("Price");
	l4.setForeground(Color.BLACK);
	l4.setFont(new Font("Cambria", Font.BOLD, 17));
	l4.setBounds(50, 220, 120, 30);
	contentPane.add(l4);
        
        t2 = new JTextField();
	t2.setBounds(185, 220, 160, 30);
	contentPane.add(t2);

        JLabel l5 = new JLabel("Bed Type");
	l5.setForeground(Color.BLACK);
	l5.setFont(new Font("Cambria", Font.BOLD, 17));
	l5.setBounds(50, 270, 120, 30);
	contentPane.add(l5);


        comboBox_3 = new JComboBox(new String[] { "Single Bed", "Double Bed"});
	comboBox_3.setBounds(185, 270, 160, 30);
        comboBox_3.setBackground(Color.white);
	contentPane.add(comboBox_3);

	

	

	b1 = new JButton("ADD");
	b1.addActionListener(this);
	b1.setBounds(50, 330, 120, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Cambria", Font.BOLD ,15));
	contentPane.add(b1);

	b2 = new JButton("BACK");
	b2.addActionListener(this);
	b2.setBounds(210, 330, 120, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Cambria", Font.BOLD ,15));
	contentPane.add(b2);

	
        contentPane.setBackground(Color.WHITE);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                Conn c = new Conn();
                String room = t4.getText();
                String available = (String)comboBox.getSelectedItem();
                String status = (String)comboBox_2.getSelectedItem();
                String price  = t2.getText();
                String type = (String)comboBox_3.getSelectedItem();
                String str = "INSERT INTO room values( '"+room+"', '"+available+"', '"+status+"','"+price+"', '"+type+"')";
              
                
		c.s.executeUpdate(str);
		JOptionPane.showMessageDialog(null, "Room Successfully Added");
                this.setVisible(false);
               
                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
            else if(ae.getSource() == b2){
                this.setVisible(false);
                new Dashboard().setVisible(true);
            }
        }catch(Exception eee){
            
        }
    }
}