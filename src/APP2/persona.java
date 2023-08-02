package APP2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



import java.sql.*;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Ronald Jmenez
 */
public class persona extends javax.swing.JFrame {
 
    public static final String URL = "jdbc:mysql://localhost:3306/moda";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1324";
    
    PreparedStatement ps;
    ResultSet rs;
    
     public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (Exception e) {
            System.err.println(e);

        }
        return con;
    }                                           

     private void limpiarCajas(){
         
         txtClave.setText(null);
         txtNombre.setText(null);
         txtApellido.setText(null);
         txtEdad.setText(null);
         txtDireccion.setText(null);
         txtCiudad.setText(null);
         cbxGenero.setSelectedIndex(0);
     
     }
  

 
    public persona() {
        initComponents();
        txtId.setVisible(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        BTNGuarda = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        BTNElimina = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CLAVE");

        jLabel3.setText("CIUDAD CLIENTE");

        jLabel5.setText("DIRECCION CLIENTE");

        jLabel6.setText("EDAD CLIENTE");

        jLabel7.setText("APELLIDO CLIENTE");

        jLabel8.setText("NOMBRE CLIENTE");

        BTNGuarda.setText("GUARDA");
        BTNGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGuardaActionPerformed(evt);
            }
        });

        btnModifica.setText("MODIFICA");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        BTNElimina.setText("ELIMINA");
        BTNElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtId.setEnabled(false);

        jLabel2.setText("GENERO");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtApellido)
                                .addComponent(txtDireccion)
                                .addComponent(txtCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(90, 90, 90)
                        .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNGuarda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModifica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNElimina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNGuarda)
                    .addComponent(btnModifica)
                    .addComponent(BTNElimina)
                    .addComponent(btnLimpiar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
    
         Connection con = null;
        try{
            
            con = getConnection();
            ps = con.prepareStatement("UPDATE CLIENTES SET clave=?, nombre_cliente=?, apellido_cliente=?, edad_cliente=?, direccion_cliente=?, ciudad_cliente=?, genero=? WHERE id_clientes=?");
            
            ps.setString(1, txtClave.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtApellido.getText());
            ps.setString(4, txtEdad.getText());
            ps.setString(5, txtDireccion.getText());
            ps.setString(6, txtCiudad.getText());
            ps.setString(7, cbxGenero.getSelectedItem().toString());
            ps.setString(8, txtId.getText());
                    
           int res = ps.executeUpdate();
           if(res > 0){
               JOptionPane.showMessageDialog(null,"Persona modificada");
               limpiarCajas();
               
           }else{
                 JOptionPane.showMessageDialog(null," Error al modificar persona");
                 limpiarCajas();
           }
           con.close();
                    
        }catch(Exception e){
            System.err.println(e);
            
            
        
        
    }                                         
        
    }//GEN-LAST:event_btnModificaActionPerformed

    private void BTNGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGuardaActionPerformed
       Connection con = null;
        try{
            
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO CLIENTES (clave, nombre_cliente, apellido_cliente, edad_cliente, direccion_cliente, ciudad_cliente, genero) VALUES(?,?,?,?,?,?,?) ");
            ps.setString(1, txtClave.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtApellido.getText());
            ps.setString(4, txtEdad.getText());
            ps.setString(5, txtDireccion.getText());
            ps.setString(6, txtCiudad.getText());
            ps.setString(7, cbxGenero.getSelectedItem().toString());
                    
           int res = ps.executeUpdate();
           if(res > 0){
               JOptionPane.showMessageDialog(null,"Persona guardada");
               limpiarCajas();
               
           }else{
                 JOptionPane.showMessageDialog(null," Error al guardar persona");
                 limpiarCajas();
           }
           con.close();
                    
        }catch(Exception e){
            System.err.println(e);
            
            
        }
        
    }//GEN-LAST:event_BTNGuardaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
         Connection con = null;
        try{
            
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM CLIENTES WHERE CLAVE = ?");
            ps.setString(1, txtClave.getText());
            
            rs = ps.executeQuery();
            if(rs.next()){
                
                txtId.setText(rs.getString( "ID_CLIENTES"));
                txtNombre.setText(rs.getString( "nombre_cliente"));
                txtApellido.setText(rs.getString( "apellido_cliente"));
                txtEdad.setText(rs.getString( "edad_cliente"));
                txtDireccion.setText(rs.getString( "direccion_cliente"));
                txtCiudad.setText(rs.getString( "ciudad_cliente"));
                cbxGenero.setSelectedItem(rs.getString("genero"));
                
      }else{
                JOptionPane.showMessageDialog(null,"No existe una persona con la clave" );
            }
            
            
    }//GEN-LAST:event_btnBuscarActionPerformed
catch (Exception e){
    System.err.println(e);
}
    }       
        
    private void BTNEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminaActionPerformed
      
         Connection con = null;
        try{
            
            con = getConnection();
            ps = con.prepareStatement("DELETE  FROM CLIENTES WHERE id_clientes=?");
          
            ps.setInt(1, Integer.parseInt(txtId.getText()));
                    
           int res = ps.executeUpdate();
           if(res > 0){
               JOptionPane.showMessageDialog(null,"Persona Eliminada");
               limpiarCajas();
               
           }else{
                 JOptionPane.showMessageDialog(null," Error al Eliminar persona");
                 limpiarCajas();
           }
           con.close();
                    
        }catch(Exception e){
            System.err.println(e);
            
            
        
        
    }                                         
        
                                        
        
    }//GEN-LAST:event_BTNEliminaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    
        limpiarCajas();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNElimina;
    private javax.swing.JButton BTNGuarda;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModifica;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
