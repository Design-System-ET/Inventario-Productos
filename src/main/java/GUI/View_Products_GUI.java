package GUI;

import Controllers.Logica;
import javax.swing.JOptionPane;

public class View_Products_GUI extends javax.swing.JPanel {

    //instacia de logica
    Logica logica = new Logica();
    
    public View_Products_GUI() {
        initComponents();
        
        //cargo la tabla de forma dinamica
        logica.read_product(jTable1);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        b_select = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        v_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        v_descrip = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        v_stock = new javax.swing.JTextField();
        b_update = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        v_id = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("List Products");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        b_select.setText("Select Product");
        b_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_selectActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Product Name");

        v_name.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Description");

        v_descrip.setBackground(new java.awt.Color(255, 255, 255));
        v_descrip.setColumns(20);
        v_descrip.setRows(5);
        jScrollPane2.setViewportView(v_descrip);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Stock");

        v_stock.setBackground(new java.awt.Color(255, 255, 255));

        b_update.setText("Update Product");
        b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_action(evt);
            }
        });

        b_delete.setText("Delete Product");
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_action(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Id");

        v_id.setEditable(false);
        v_id.setBackground(new java.awt.Color(255, 255, 255));
        v_id.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        v_id.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(454, 454, 454))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(v_stock)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(v_id, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(v_name, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_select, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_update, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(v_name)
                            .addComponent(v_id, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(v_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(b_select, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_selectActionPerformed
        
        //variable para seleccionar una fila
        int selectRow = jTable1.getSelectedRow();
        
        //recorro los datos de la fila para asignar a variables individuales
        if(selectRow !=1){
            
            String id = jTable1.getValueAt(selectRow, 0).toString();
            String nombre = jTable1.getValueAt(selectRow, 1).toString();
            String descripcion = jTable1.getValueAt(selectRow, 2).toString();
            String stock = jTable1.getValueAt(selectRow, 3).toString();
            
            //asigno los valores de las variables a los view en pantalla
            v_id.setText(id);
            v_name.setText(nombre);
            v_descrip.setText(descripcion);
            v_stock.setText(stock);
            
        }else{
            
            System.out.println("Error - No se pudo seleccionar la linea");
        }
    }//GEN-LAST:event_b_selectActionPerformed

    private void update_action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_action
        
        //ejecuto la peticion asignando el resultado a una variable booleana
        boolean validacion = logica.update_product(v_name.getText(), v_descrip.getText(), Integer.parseInt(v_stock.getText()), Integer.parseInt(v_id.getText()));
        
        //evaluo la variable de respuesta para mostrar un mensaje si se ejecuto
        //correctamente o no la consulta
        if(validacion){
            
            JOptionPane.showMessageDialog(null, "Se agrego correctamente el nuevo registro");
            
            //borro los campos se el insert fue valido
            v_id.setText("");
            v_name.setText("");
            v_descrip.setText("");
            v_stock.setText("");
            
            //actualizo la tabla de forma dinamica
            logica.read_product(jTable1);
        }else{
                JOptionPane.showMessageDialog(null, "Error - no se pudo ingresar el registro");
        }
    }//GEN-LAST:event_update_action

    private void delete_action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_action
        
        //ejecuto la peticion asignando el resultado a una variable booleana
        boolean validacion = logica.delete_product(Integer.parseInt(v_id.getText()));
        
        if(validacion){
        
            JOptionPane.showMessageDialog(null, "Se elimino correctamente el nuevo registro");
            
            //borro los campos se el insert fue valido
            v_id.setText("");
            v_name.setText("");
            v_descrip.setText("");
            v_stock.setText("");
            
            //actualizo la tabla de forma dinamica
            logica.read_product(jTable1);
        
        }else{
            JOptionPane.showMessageDialog(null, "Error - no se pudo eliminar el registro");
        }
        
        
    }//GEN-LAST:event_delete_action


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_select;
    private javax.swing.JButton b_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea v_descrip;
    private javax.swing.JTextField v_id;
    private javax.swing.JTextField v_name;
    private javax.swing.JTextField v_stock;
    // End of variables declaration//GEN-END:variables
}
