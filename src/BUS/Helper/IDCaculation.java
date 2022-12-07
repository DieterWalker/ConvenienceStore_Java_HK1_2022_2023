package BUS.Helper;

import javax.swing.JTable;
import javax.swing.JTextField;

    public class IDCaculation {
        // Hàm nhập tự động ID
        // Đầu vào: JTabel và JTextField
        public static void FindID(JTable Table, JTextField Text){
        int i = 0;
        int MaxID = 0;
        int IDRow = 0;
        while (i < Table.getRowCount()){
            IDRow = Integer.parseInt(Table.getValueAt( i , 0).toString());
            System.out.println(IDRow);
            if (MaxID < IDRow){
                MaxID = IDRow;
            }
            i++;
            System.out.println(MaxID);
        }
            Text.setText(Integer.toString(MaxID + 1));
        }
}
