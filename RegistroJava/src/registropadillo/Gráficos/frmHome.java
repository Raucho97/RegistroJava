/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropadillo.Gráficos;

import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registropadillo.DB.connect;

/**
 *
 * @author RaulO
 */
public class frmHome extends javax.swing.JFrame {
    
    DefaultTableModel model;
        
    /**
     * Creates new form frmHome
     */
    public frmHome() {
        initComponents();
        
        String[] titulo = {"Nombre", "Apellidos", "Edad", "Sexo", "Correo"};
        
        model = new DefaultTableModel(null, titulo);
        tblUser.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btnLog = new javax.swing.JButton();
        btnSign = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        btnLog.setText("Iniciar Sesion");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnSign.setText("Registrarse");
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Sexo", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUser);

        btnDelete.setText("Borrar Datos");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPrint.setText("Imprimir PDF");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUser)
                                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(btnLog)
                                        .addGap(35, 35, 35)
                                        .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnPrint)))
                        .addGap(0, 230, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLog)
                    .addComponent(btnSign))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnPrint))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        
       
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
      
      Statement ps;
      ResultSet rs;
      String user = txtUser.getText();
      String pass = String.valueOf(password.getPassword());
        
      String query = "SELECT * FROM users WHERE Password = '"+pass+"' AND Mail = '"+user+"';";
      
      try{          
          Connection con = connect.getConnection();
          
          ps = con.createStatement();
          
          rs = ps.executeQuery(query);
          
          
          System.out.println(query);
          if(rs.next())
          {
              
                int id = Integer.parseInt(rs.getString("ID"));
                
                 Object[] cUser = {rs.getString("Name"),
                                   rs.getString("Surname"),
                                   rs.getString("Age"),
                                   rs.getString("Sex"),
                                   rs.getString("Mail")};
                 
                 model.addRow(cUser);
                
             
          }
          else{
                JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos", "Login Failed", 2);
              }
          con.close();
         } catch (SQLException ex) {
            Logger.getLogger(frmHome.class.getName()).log(Level.SEVERE, null, ex);
         }

         
     
        
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        newUser sign = new newUser();
        
            sign.setVisible(true);
            sign.pack();
            sign.setLocationRelativeTo(null);
            sign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_btnSignActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        PreparedStatement ps;
        
        String user = (String) model.getValueAt(0, 4);
        String key = "DELETE FROM users WHERE Mail = '"+user+"';";
        
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
        
        
         try{
            ps = connect.getConnection().prepareStatement(key);
            ps.execute();
            
            
            System.out.println(key);
            ps.close();
        } catch (SQLException e){
            Logger.getLogger(newUser.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        
        System.out.println(user);
        
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed

        String nombre = (String)model.getValueAt(0, 0);
        String apellido = (String)model.getValueAt(0, 1);
        String edad = (String)model.getValueAt(0, 2);
        String correo = (String)model.getValueAt(0, 4);
        String sexo;
        if("M".equals((String)model.getValueAt(0, 3))){
             sexo = "Masculino";
        }else{
             sexo = "Femenino";
        }      
       try{
        
        File datos = new File("C:\\Users\\Public\\Documents", "DatosPadillo.txt");
        datos.createNewFile();
        
        FileWriter fw = new FileWriter(datos);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("Correo: " + correo + "\n\n");
        bw.write("Nombre: " + nombre + "\n\n");
        bw.write("Apellido: " + apellido + "\n\n");
        bw.write("Edad: " + edad + " años\n\n");
        bw.write("Sexo: " + sexo + "\n\n");
        
        
        bw.close();
        
       JOptionPane.showMessageDialog(null, "Sus datos se han gaurdado en la carpeta documentos");
        
       }catch (IOException e)
       {
           Logger.getLogger(newUser.class.getName()).log(Level.SEVERE, null, e);
       } 
    }//GEN-LAST:event_btnPrintActionPerformed
    
   
   
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
