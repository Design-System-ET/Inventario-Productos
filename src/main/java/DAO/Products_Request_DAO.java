package DAO;

import javax.swing.JTable;

public interface Products_Request_DAO {
    
    //create product
    boolean create_product(String nombre, String descripcion, int stock);
    
    //read produc
    void read_product(JTable tabla);
    
    //update product
    boolean update_product(String nombre, String descripcion, int stock, int id);
    
    //delete product
    boolean delete_product(int id);
    
}
