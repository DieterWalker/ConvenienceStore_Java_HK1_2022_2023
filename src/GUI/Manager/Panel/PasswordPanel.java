package GUI.Manager.Panel;

import GUI.Manager.ManagerScreen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class PasswordPanel extends MyPanel {
    JLabel labPassword, labAttention, labOldKey, labNewKey, labTitle, labPictrue;
    JTextField txtOld, txtNew;
    JButton btnComfirm;
    Icon Image;
    ManagerScreen manager; 

    public PasswordPanel(){
        super();
        GUI();
    }
    
    public void GUI(){ 
        this.setBounds(0,0,1350,800);
        this.setVisible(true);
        this.setLayout(null);
        this.setBackground(Color.DARK_GRAY);
        try {
                Image = new ImageIcon(new File("src/GUI/Icons/Key.png").toURI().toURL());
            } catch (MalformedURLException ex) {
                System.out.print("False");
            }
        
        labPassword = new JLabel("CHANGE KEY PASSWORD");
            labPassword.setForeground(Color.white);
            labPassword.setBounds( 5 , 5 , 240 , 30 );
            labPassword.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            
        labTitle = new JLabel("This is an important security key, please consider carefully before changing!", SwingConstants.CENTER);
            labTitle.setForeground(new Color(222, 23 ,56));
            labTitle.setBounds( 0 , 360 , 1350 , 30 );
            labTitle.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            
        labOldKey = new JLabel("Input Old Key", SwingConstants.CENTER);
            labOldKey.setForeground(Color.white);
            labOldKey.setBounds( 0 , 400 , 1350 , 30 );
            labOldKey.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
        
        txtNew = new JTextField();
            txtNew = new JTextField();
            txtNew.setBounds( 525 , 430 , 300 , 30 );
            txtNew.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtNew.setForeground(Color.black);
            txtNew.setHorizontalAlignment(JTextField.CENTER);
            
        txtOld = new JTextField();
            txtOld = new JTextField();
            txtOld.setBounds( 525 , 530 , 300 , 30 );
            txtOld.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtOld.setForeground(Color.black);
            txtOld.setHorizontalAlignment(JTextField.CENTER);
            
        labNewKey = new JLabel("Input New Key", SwingConstants.CENTER);
            labNewKey.setForeground(Color.white);
            labNewKey.setBounds( 0 , 500 , 1350 , 30 );
            labNewKey.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            
        btnComfirm = new JButton("Confirm");
            btnComfirm.setBackground(Color.white);
            btnComfirm.setForeground(Color.black);
            btnComfirm.setBorder(null);
            btnComfirm.setFocusable(false);
            btnComfirm.setBounds( 525 , 600 , 300 , 30 );
            btnComfirm.setFont(new Font( "Jaldi" , Font.BOLD ,16 )); 
        
        labPictrue = new JLabel(Image);
            labPictrue.setBounds( 575, 150 , 200 , 200 );
            labPictrue.setBackground(null);
            
        this.add(labPassword);
        this.add(labNewKey);
        this.add(labOldKey);
        this.add(labTitle);
        this.add(txtNew);
        this.add(txtOld);
        this.add(btnComfirm);
        this.add(labPictrue);
        
        btnComfirm.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        
                    }
            });
    }
    
    private void Clear(){
    
    } 
}
