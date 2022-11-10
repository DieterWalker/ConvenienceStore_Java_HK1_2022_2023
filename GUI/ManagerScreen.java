package GUI;

import BLL.EmployeeManagerLogic;
import BLL.ManagerLogic;
import GUI.Element.MyButton;
import GUI.Table.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ManagerScreen extends JPanel {
    JButton btnDeleteData, btnAddData, btnRewriteData;
    JPanel pnlControl;
    String[] ButtonName = {"Employee"};
    ManagerLogic[] logics = {
            new EmployeeManagerLogic(),
//            new ProductManagerLogic(),
//            new CategoryManagerLogic(),
//            new SaleManagerLogic(),
//            new AccountManagerLogic()
    };

    JPanel controlPnl, DTOControlPnl;
    MyTable currentModel;
    MyTable[] models = {
               new EmployeeTable(),
//            new ProductTable(),
//            new CategoryTable(),
//            new SaleTable(),
//            new AccountTable()
    };
    JTable tabData;
    ManagerLogic managerLogic;
    public static int index;
    EmployeeTable table;
    
    public ManagerScreen(){
        this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setBackground(new Color( 250, 250, 250 ));
        initGUI();
    }
    
    public void initGUI (){
        createControlPnl();
        createDTOControlPnl();
        createTable();
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
            
        btnAddData.addActionListener(e->{
            managerLogic.createNew();
            currentModel.show();
        });

        btnRewriteData.addActionListener(e->{
             managerLogic.edit(index);
        });
        
        btnDeleteData.addActionListener(e->{
            managerLogic.remove(index);
        });

        pnlControl.add(btnAddData);
        pnlControl.add(btnDeleteData);
        pnlControl.add(btnRewriteData);
        
        this.add(pnlControl,BorderLayout.SOUTH);
    }
    
    private void createDTOControlPnl(){
        DTOControlPnl = new JPanel();
        DTOControlPnl.setPreferredSize(new Dimension(100,100));
        for(int i=0;i<ButtonName.length;i++){
            int index = i;
            MyButton tmp = new MyButton(ButtonName[i]);
            tmp.addActionListener(e->{
                managerLogic = logics[index];
                currentModel = models[index];
                tabData.setModel(currentModel);
                currentModel.show();
            });
            DTOControlPnl.add(tmp);
        }
        DTOControlPnl.setBackground(new Color(227,253,253));
        this.add(DTOControlPnl,BorderLayout.WEST);
    }
    
    private void createTable(){
        tabData = new JTable();
        tabData.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                index = tabData.getSelectedRow();
            }
        });
        this.add(new JScrollPane(tabData),BorderLayout.CENTER);
    }
}

