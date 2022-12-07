package DAL;

import DTO.DTO;
import DTO.ProductDTO;
import java.util.ArrayList;
import java.sql.SQLException;


public class ProductDAO extends DAO{
    public ProductDAO(){
        getAllSQL = "select ProductID, ProductName, ProductImage, CategoryID, ProductBrand, ProductWarranties, ProductStorage, ProductPrice " +
                    "from PRODUCT ";
        insertSQL = "insert into PRODUCT(ProductID, ProductName, ProductImage, CategoryID, ProductBrand, ProductWarranties, ProductStorage, ProductPrice) " +
                    "values (?, ?, ?, ?, ?, ?, ?, ?)";
        updateSQL = "update PRODUCT "   +
                    "set ProductName, " +   
                    "    ProductImage, "   +
                    "    CategoryID, " +
                    "    ProductBrand, " +
                    "    ProductWarranties," +
                    "    ProductStorage, " +
                    "    ProductPrice" +
                    "where ProductID = ?";
        deleteSQL = "delete PRODUCT " +
                    "where ProductID = ?";
    }

    @Override
    public ArrayList<ProductDTO> getAllData() {
        ArrayList<ProductDTO> list = new ArrayList<>();
        try {
            pstm = DAO.con.prepareStatement(getAllSQL);
            pstm.execute();
            rs = pstm.getResultSet();
            while (super.rs.next()){
                ProductDTO dto = new ProductDTO();
                dto.retriveData(super.rs);
                list.add(dto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public boolean insertItem(DTO dto) {
        boolean flag;
        try {
            pstm = DAO.con.prepareStatement(insertSQL);
            pstm.setInt(1,((ProductDTO) dto).getProductID());
            pstm.setString(2,((ProductDTO) dto).getProductName());
            pstm.setString(3,((ProductDTO) dto).getProductImage());
            pstm.setInt(4,((ProductDTO) dto).getCategoryID());
            pstm.setString(5,((ProductDTO) dto).getProductBrand());
            pstm.setString(6,((ProductDTO) dto).getProductWarranty());
            pstm.setInt(7,((ProductDTO) dto).getProductStorage());
            pstm.setInt(8,((ProductDTO) dto).getProductPrice());
            flag = pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    @Override
    public boolean updateItem(DTO dto) {
        boolean flag;
        try {
            pstm = DAO.con.prepareStatement(updateSQL);
            pstm.setString(1,((ProductDTO) dto).getProductName());
            pstm.setString(2,((ProductDTO) dto).getProductImage());
            pstm.setInt(3,((ProductDTO) dto).getCategoryID());
            pstm.setString(4,((ProductDTO) dto).getProductBrand());
            pstm.setString(5,((ProductDTO) dto).getProductWarranty());
            pstm.setInt(6,((ProductDTO) dto).getProductStorage());
            pstm.setInt(7,((ProductDTO) dto).getProductPrice());
            pstm.setInt(8,((ProductDTO) dto).getProductID());
            flag = pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return flag;
    }

    @Override
    public boolean deleteItem(DTO dto) {
        boolean flag;
        try {
            pstm = DAO.con.prepareStatement(deleteSQL);
            pstm.setInt(1,((ProductDTO) dto).getProductID());
            flag = pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
