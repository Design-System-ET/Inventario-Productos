package GUI;

import java.awt.BorderLayout;

public class Inicio_gui extends javax.swing.JFrame {

    public Inicio_gui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b_view = new javax.swing.JButton();
        b_insert = new javax.swing.JButton();
        content_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        panel_title.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventario de Productos");

        b_view.setText("Inventario");
        b_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_viewActionPerformed(evt);
            }
        });

        b_insert.setText("Add Product");
        b_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_titleLayout = new javax.swing.GroupLayout(panel_title);
        panel_title.setLayout(panel_titleLayout);
        panel_titleLayout.setHorizontalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titleLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                .addComponent(b_view, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_titleLayout.setVerticalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_view, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_titleLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        content_panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout content_panelLayout = new javax.swing.GroupLayout(content_panel);
        content_panel.setLayout(content_panelLayout);
        content_panelLayout.setHorizontalGroup(
            content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        content_panelLayout.setVerticalGroup(
            content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_insertActionPerformed
        //instancio el segundo jpanel
        Insert_Products_GUI insert = new Insert_Products_GUI();
        //redefino su tamano
        insert.setSize(1000,532);
        
        /*dentro del panel principal reasigno la ubicacion considerando la 
        posicion Y de la barra de titulo, esta opcion se puede obviar ya que toma
        la posicion actual del contenedor (o puedo dejarlo en 0,0 y usar el metodo 
        revalidate() posteriormente), tambien si el panel es mas chico entonce
        puedo definir una ubicacion final para mostrar*/
        content_panel.setLocation(0, 68);
        
        //remuevo todos los objetos que tenga el panel principal
        content_panel.removeAll();
        
        //inserto el nuevo diseno
        content_panel.add(insert, BorderLayout.CENTER);
        
        //valido la accion
        content_panel.validate();
        
        //redibujo la vista para mostrar
        content_panel.repaint();
        
    }//GEN-LAST:event_b_insertActionPerformed

    private void b_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_viewActionPerformed
        //instancio el panel
        View_Products_GUI view = new View_Products_GUI();
        
        //redefino el tamano
        view.setSize(1000, 532);
        
        /*dentro del panel principal reasigno la ubicacion considerando la 
        posicion Y de la barra de titulo, esta opcion se puede obviar ya que toma
        la posicion actual del contenedor (o puedo dejarlo en 0,0 y usar el metodo 
        revalidate() posteriormente), tambien si el panel es mas chico entonce
        puedo definir una ubicacion final para mostrar*/
        content_panel.setLocation(0, 68);
        
        //remuevo todos los objetos que tenga el panel principal
        content_panel.removeAll();
        
        //inserto el nuevo diseno
        content_panel.add(view, BorderLayout.CENTER);
        
        //valido la accion
        content_panel.validate();
        
        //redibujo la vista para mostrar
        content_panel.repaint();
        
        
    }//GEN-LAST:event_b_viewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_insert;
    private javax.swing.JButton b_view;
    private javax.swing.JPanel content_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel_title;
    // End of variables declaration//GEN-END:variables
}
