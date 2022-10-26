package GUI.InputFrom;

import BLL.EmployeeManagerLogic;
import DTO.EmployeeDTO;
import GUI.ManagerScreen;
import GUI.Table.EmployeeTable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.*;

public class EmployeeInput extends JFrame {
    String filename = null;
    byte[] person_image = null;
    
    JPanel pnlTitle;
    JLabel labEmployeeID, labEmployeeName, labEmployeeGender, labEmployeePhone,
           labEmployeeWage, labEmployeeAndress, labTitle, labImage, labPicture;
    JTextField txtEmployeeID, txtEmployeeName, txtEmployeePhone,
               txtEmployeeWage, txtEmployeeAddress;
    JButton btnConfirm, btnImage;
    JRadioButton radMale, radFemale;
    ButtonGroup radgroupGender;
    
    ManagerScreen manager = new ManagerScreen();
    
    private EmployeeManagerLogic employeeManager;
    
    public EmployeeInput(EmployeeManagerLogic employeeManager
    ){
        this.employeeManager = employeeManager;
        this.setPreferredSize(new Dimension(650,520));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setAlwaysOnTop(true);
        
        initGUI();
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    public void initGUI(){
        this.getContentPane().setBackground(new Color( 250 ,250 , 250 ));

        labTitle = new JLabel("Employee Information");
            labTitle.setForeground(new Color( 250 , 250 , 250 ));
            labTitle.setFont(new Font( "Jaldi" , Font.BOLD , 30 ));
            labTitle.setBounds( 10, 10 , 600 , 30 );
        
        labImage = new JLabel("Image");
            labImage.setForeground(Color.black);
            labImage.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labImage.setBounds( 425 , 60 , 400 , 18 );
            
        labEmployeeID = new JLabel("Employee ID");
            labEmployeeID.setForeground(Color.black);
            labEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeeID.setBounds( 15, 60 , 400 , 18 );
            
        txtEmployeeID = new JTextField();
            txtEmployeeID.setForeground(new Color ( 60 , 60 , 60 ));
            txtEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeID.setBounds( 10 , 80 , 400 , 30 );
        
        labEmployeeName = new JLabel("Name");
            labEmployeeName.setForeground(Color.black);
            labEmployeeName.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeeName.setBounds( 15, 120 , 400 , 18 );
        
        txtEmployeeName = new JTextField();
            txtEmployeeName.setForeground(new Color ( 60 , 60 , 60 ));
            txtEmployeeName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeName.setBounds( 10 , 140 , 400 , 30 );
            
        labEmployeeGender = new JLabel("Gender");
            labEmployeeGender.setForeground(Color.black);
            labEmployeeGender.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeeGender.setBounds( 15, 180 , 400 , 18 );
            
        radMale = new JRadioButton("Male");
            radMale.setForeground(new Color ( 64 , 64 , 64 ));
            radMale.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radMale.setBounds( 15, 200 , 70 , 30 );
            radMale.setBackground(null);
            
        radFemale = new JRadioButton("Female");
            radFemale.setForeground(new Color ( 64 , 64 , 64 ));
            radFemale.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radFemale.setBounds( 100, 200 , 70 , 30 );
            radFemale.setBackground(null);
            
        labEmployeePhone = new JLabel("Phone Number");
            labEmployeePhone.setForeground(Color.black);
            labEmployeePhone.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeePhone.setBounds( 15, 240 , 400 , 18 );
            
        txtEmployeePhone  = new JTextField();
            txtEmployeePhone.setForeground(new Color ( 60 , 60 , 60 ));
            txtEmployeePhone.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeePhone.setBounds( 10 , 260 , 400 , 30 );
        
        labEmployeeWage = new JLabel("Wage");
            labEmployeeWage.setForeground(Color.black);
            labEmployeeWage.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeeWage.setBounds( 15, 300 , 400 , 18 );
        
        txtEmployeeWage = new JTextField();
            txtEmployeeWage.setForeground(new Color ( 60 , 60 , 60 ));
            txtEmployeeWage.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeWage.setBounds( 10 , 320 , 400 , 30 );    
            
        labEmployeeAndress = new JLabel("Andress");
            labEmployeeAndress.setForeground(Color.black);
            labEmployeeAndress.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeeAndress.setBounds( 15, 360 , 400 , 18 );
            
        txtEmployeeAddress = new JTextField();
            txtEmployeeAddress.setForeground(new Color ( 60 , 60 , 60 ));
            txtEmployeeAddress.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeAddress.setBounds( 10 , 380 , 400 , 30 );
            
        labPicture = new JLabel();
            labPicture.setBounds( 420 , 80 , 200 , 250 );
            //labPicture.setBorder((Border) Color.black);
        
        pnlTitle = new JPanel();
            pnlTitle.setBounds( 0 , 0, 650 ,50 );
            pnlTitle.setBackground(Color.black);
            
        btnImage = new JButton("Choose Image");
            btnImage.setBackground(Color.black);
            btnImage.setForeground(new Color ( 250 , 250 , 250 ));
            btnImage.setBorder(null);
            btnImage.setFocusable(false);
            btnImage.setBounds( 420 , 340 , 200 , 40 );
            btnImage.setFont(new Font( "Jaldi" , Font.BOLD , 25 ));
            
            btnImage.addActionListener(new ActionListener() {
                    @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(rootPane, labImage);
                            JFileChooser chooser = new JFileChooser();
                                chooser.showOpenDialog(pnlTitle);
                            File f = chooser.getSelectedFile();
                            filename = f.getAbsolutePath();
                            ImageIcon image = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(labPicture.getWidth(), labPicture.getHeight(),Image.SCALE_SMOOTH));
                            labPicture.setIcon(image);
                            try{
                                File Image = new File(filename);
                                FileInputStream fis = new FileInputStream(Image);
                                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                                byte[] buf= new byte[1024];
                                for(int readNum;(readNum=fis.read(buf))!=-1;){
                                    bos.write(buf, 0 , readNum);
                                }
                                person_image = bos.toByteArray();
                            } 
                            catch(Exception a){
                                JOptionPane.showMessageDialog(null, a);
                            }
                        }
                    });
        
        btnConfirm = new JButton("Confirm");
            btnConfirm.setBackground(Color.black);
            btnConfirm.setForeground(new Color ( 250 , 250 , 250 ));
            btnConfirm.setBorder(null);
            btnConfirm.setFocusable(false);
            btnConfirm.setBounds( 225 , 430 , 200 , 40 );
            btnConfirm.setFont(new Font( "Jaldi" , Font.BOLD , 25 ));
            
            btnConfirm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    if(checkInput()){
                        employeeManager.setCurrentEmployee(getData());
                        dispose();
                    }else{
                       
                        JOptionPane.showMessageDialog(rootPane, "Error!");
                    }              
            }});
        
        radgroupGender = new ButtonGroup();
            radgroupGender.add(radFemale);
            radgroupGender.add(radMale);
            
        this.add(labTitle);
        this.add(labEmployeeID);
        this.add(labEmployeeName);
        this.add(labEmployeeGender);
        this.add(labEmployeePhone);
        this.add(labEmployeeWage);
        this.add(labEmployeeAndress);
        this.add(labImage);
        this.add(labPicture);
        
        
        this.add(txtEmployeeID);
        this.add(txtEmployeeName);
        this.add(txtEmployeePhone);
        this.add(txtEmployeeWage);
        this.add(txtEmployeeAddress);
        
        this.add(pnlTitle);

        this.add(btnImage);
        this.add(btnConfirm);
        
        this.add(radFemale);
        this.add(radMale);
        
    }
    
    private boolean checkInput(){
        return true;
    }
    
    public EmployeeDTO getData() {
        EmployeeDTO tmp = new EmployeeDTO();
        if(!txtEmployeeID.equals("")){
            tmp.setEmployeeID(Integer.parseInt(txtEmployeeID.getText()));
        }
            tmp.setEmployeeName(txtEmployeeName.getText());
            tmp.setEmployeeImage(person_image);
            if (radMale.isSelected()){
                tmp.setEmployeeGender("Male");
            }
            if (radFemale.isSelected()){
                tmp.setEmployeeGender("Female");
            }
            tmp.setEmployeeAddress(txtEmployeeAddress.getText());
            tmp.setEmployeePhone(txtEmployeePhone.getText());
            tmp.setEmployeeWage(Integer.parseInt(txtEmployeeWage.getText()));
        return tmp;
    }
    
    public void setData(EmployeeDTO dto){
        //DateFormat fm = new SimpleDateFormat("yyyy-MMM-dd");
        txtEmployeeID.setText(Integer.toString(dto.getEmployeeID()));
        txtEmployeeName.setText(dto.getEmployeeName());
        String Gender = dto.getEmployeeGender();
        if(Gender == "Male"){
            radMale.isSelected();
        } else {
            radFemale.isSelected();
        }
       
        txtEmployeeAddress.setText(dto.getEmployeeAddress());
        txtEmployeePhone.setText(dto.getEmployeePhone());
        txtEmployeeWage.setText(Integer.toString(dto.getEmployeeWage()));
    }
}
