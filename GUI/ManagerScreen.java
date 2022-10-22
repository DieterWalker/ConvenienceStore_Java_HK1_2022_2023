package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ManagerScreen extends JPanel {
    JButton btnDeleteData, btnAddData, btnRewriteData;
    JPanel pnlControl;
    public ManagerScreen(){
        this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setBackground(new Color( 250, 250, 250 ));
        initGUI();
    }
    
    public void initGUI (){
        createControlPnl();
    }
    private void createControlPnl(){
        pnlControl = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        
        btnAddData = new JButton("Add");
            btnAddData.setBackground(Color.black);
            btnAddData.setForeground(new Color( 250 , 250 , 250 ));
            btnAddData.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
                    
        btnDeleteData = new JButton("Delete");
            btnDeleteData.setBackground(Color.black);
            btnDeleteData.setForeground(new Color( 250 , 250 , 250 ));
            btnDeleteData.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            
        btnRewriteData = new JButton("Change");
            btnRewriteData.setBackground(Color.black);
            btnRewriteData.setForeground(new Color( 250 , 250 , 250 ));
            btnRewriteData.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            
        pnlControl.add(btnAddData);
        pnlControl.add(btnDeleteData);
        pnlControl.add(btnRewriteData);
        
        this.add(pnlControl,BorderLayout.SOUTH);
    }
}
