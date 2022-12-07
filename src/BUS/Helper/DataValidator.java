package BUS.Helper;


import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DataValidator {
    public static void validateTextEmpty(JTextField field, StringBuilder sb, String errorMessage){
      if (field.getText().equals("")){
          sb.append(errorMessage).append("\n");
          field.setBackground(new Color(226,110,110));
          field.requestFocus();
      }else{
          field.setBackground(Color.white);
      }
    }
    public static void validatePassmpty(JPasswordField field, StringBuilder sb,String errorMessage){
        String password = new String(field.getPassword());
        if (password.equals("")){
          sb.append(errorMessage).append("\n");
          field.setBackground(new Color(226,110,110));
          field.requestFocus();
      }else{
          field.setBackground(Color.white);
      }
    }

}
