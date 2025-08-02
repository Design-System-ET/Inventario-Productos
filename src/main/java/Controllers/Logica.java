package Controllers;

import DAO.Products_Request_DAO;
import SQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Logica implements Products_Request_DAO{
    
    //establezco coneccion con la BD
    Conectar conn = new Conectar();
    //la conexion se almacena en la variable
    Connection conection = conn.conectar();
    
    //defino las consultas del CRUD
    private final String sql_create = "INSERT INTO productos (nombre, descripcion, stock) VALUES (?, ?, ?)";
    private final String sql_read   = "SELECT * FROM productos";
    private final String sql_update = "UPDATE productos SET nombre = ?, descripcion = ?, stock = ? WHERE id = ?";
    private final String sql_delete = "DELETE FROM productos WHERE id = ?";
    
    

    @Override
    public boolean create_product(String nombre, String descripcion, int stock) {
        
        try(
                //variable de peticion y seguridad
                //AYUDA A PREVENIR ATAQUES DE INYECCION SQL
                PreparedStatement preparedStatement = conection.prepareStatement(sql_create)){
            
            //Estableciendo valores
            // 1 y 2 significan las posiciones de los valores de como se
            //definieron en la variable sql con la sentencia del INSERT
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, descripcion);
            preparedStatement.setInt(3, stock);
            
            //ejecuto la consulta
            preparedStatement.executeUpdate();
            
            return true;
            
        
        }catch(SQLException e){
            System.out.println("Error - no se puede crear el registro: " + e.getMessage());
            
            return false;
        }
    }

    @Override
    public void read_product(JTable viewDatos) {
        //asignamos variable que tendra el modelo por default de la tabla
        DefaultTableModel model = new DefaultTableModel();
        
        //obtiene datos segun las columnas
        TableRowSorter<TableModel> order_Table = new TableRowSorter<TableModel>(model);
        
        viewDatos.setRowSorter(order_Table);
        
        //definimos las columnas del JTable
        model.addColumn("id");
        model.addColumn("Producto");
        model.addColumn("Descripcion");
        model.addColumn("Stock");
        
        //anadimos columnas
        viewDatos.setModel(model);
        
        //almacenamos los datos de forma temporal
        String[] datos = new String[4];
        
        try(
            //objeto que utiliza la conexion para ejecutar sentencias sql simples
            Statement statement = conection.createStatement();){
        
            //ejecuto la sentencia sql y guardo el resultado en un resultset
            ResultSet rs = statement.executeQuery(sql_read);
            
            //recorro el result set
            while(rs.next()){
                
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                
                //clone() evita que se sobre escriban las filas
                //se agrega cada fila al modelo
                model.addRow(datos.clone());
            }
        
        }catch(SQLException e){
            System.out.println("Error - no se pudo obtener los datos: " + e.getMessage());
        }
    }

    @Override
    public boolean update_product(String nombre, String descripcion, int stock, int id) {
        
        try(
                //variable de peticion y seguridad
                //AYUDA A PREVENIR ATAQUES DE INYECCION SQL
                PreparedStatement preparedStatement = conection.prepareStatement(sql_update)){
            
            //Estableciendo valores
            // 1 y 2 significan las posiciones de los valores de como se
            //definieron en la variable sql con la sentencia del UPDATE
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, descripcion);
            preparedStatement.setInt(3, stock);
            preparedStatement.setInt(4, id);
            
            //ejecuto la consulta
            preparedStatement.executeUpdate();
            
            return true;
        
        }catch(SQLException e){
        
            System.out.println("Error - No se puede actualizar el registro: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete_product(int id) {
        
        try(
                //variable de peticion y seguridad
                //AYUDA A PREVENIR ATAQUES DE INYECCION SQL
                PreparedStatement preparedStatement = conection.prepareStatement(sql_delete)){
            
            //Estableciendo valores
            // 1 significan las posiciones de los valores de como se
            //definieron en la variable sql con la sentencia del DELETE
            preparedStatement.setInt(1, id);
            
            //ejecuto la consulta
            preparedStatement.executeUpdate();
            
            return true;
        
        }catch(SQLException e){
        
            System.out.println("Error - No se puede eliminar el registro: " + e.getMessage());
            return false;
        }
    }
    
    public void prueba(){
        System.out.println("Hola mundo");
    }
    
}
 