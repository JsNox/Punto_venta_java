
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class resurtido extends javax.swing.JFrame {

    /**
     * Creates new form resurtido
     */
    public resurtido() {
        initComponents();
        lista_prove();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nue_exi = new javax.swing.JTextField();
        cmb_pr = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("id_producto");

        jLabel3.setText("piezas a ingresar");

        cmb_pr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_prActionPerformed(evt);
            }
        });

        jLabel4.setText("proveedor");

        jButton3.setText("Generar fecha");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 28)); // NOI18N
        jLabel1.setText("Resurtido de productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("generar factura");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(106, 106, 106)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nue_exi, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addComponent(cmb_pr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nue_exi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_pr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/p_venta", "root", "");
            String sql="Select * from productos where id_pro=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,id.getText());
            ResultSet rs= pst.executeQuery();
            if(rs.next()){
                int exss=rs.getInt("existencia");
                Double caas=rs.getDouble("costo");
                Double gan=rs.getDouble("ganancia");
                
                String ident= id.getText();
                String exis= nue_exi.getText();
                String cli=cmb_pr.getSelectedItem().toString();
                int cliente=Integer.parseInt(cli);
                String fec=fecha.getText();
                
                int exisf=Integer.parseInt(exis);
                double montf=exisf*caas;
                double ganf=gan-montf;
                
                int e=exisf+exss;
                //Double u=caas+montf;
               
           if(montf<gan){
                String sq= "UPDATE productos SET existencia='"+e+"',ganancia='"+ganf+"' WHERE id_pro='"+ident+"'";
                Statement res= con.createStatement();
            
                res.executeUpdate(sq);
            
            
                JOptionPane.showMessageDialog(null,"registro actualizado correctamente, el monto del movimiento es de: "+montf);
            
                String sqll= "INSERT INTO resurtido (fecha,id_pro,piezas,monto,id_prov) VALUES ('"+fec+"','"+ident+"','"+exisf+"','"+montf+"','"+cliente+"')";
                Statement resu= con.createStatement();
                resu.executeUpdate(sqll);
                
                con.close();

            }
           else{
                JOptionPane.showMessageDialog(null,"saldo insuficiente para realizar la tranzaccion");
            }
            }
            else{
                JOptionPane.showMessageDialog(null,"Usuario NO encontrado");
            }
          
            
                    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu menu1=new menu();
        menu1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmb_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_prActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Calendar c;
        c=Calendar.getInstance();
        int d=c.get(Calendar.DATE), m=1+(c.get(Calendar.MONTH)), a=c.get(Calendar.YEAR);
        fecha.setText(d+"-"+m+"-"+a);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Document document=new Document();
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/p_venta", "root", "");
            String sql="Select * from productos where id_pro=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,id.getText());
            ResultSet rs= pst.executeQuery();
           
            
                                                                                                      
                if(rs.next()){
                    
                    
                    String ident= id.getText();
                    String exis= nue_exi.getText();
                    double caas=rs.getDouble("costo");
                    int exisf=Integer.parseInt(exis);
                    double montf=exisf*caas;
                    String caasf=Double.toString(caas);
                    String montfi=Double.toString(montf);
                    
                    try{
                    String sql2= "Select * from proveedor where id_prov=?";
                    PreparedStatement pst2= con.prepareStatement(sql2);
                    pst2.setString(1,cmb_pr.getSelectedItem().toString());
                    ResultSet rss= pst2.executeQuery();
                    
                    if(rss.next()){

                        String nom=rss.getString("nombre");
                        String dir=rss.getString("direccion");
                        String tel=rss.getString("telefono");
                        String mai=rss.getString("mail");
                        String cont=rss.getString("contacto");
                       
           
                        PdfWriter.getInstance(document, new FileOutputStream("resurtido.pdf"));
                        document.open();
                        Image imagen= Image.getInstance("D:\\User\\Imagenes\\header.jpg");      
                        imagen.scaleAbsolute(500,100);
                        document.add(imagen);
                        
                        document.add(new Paragraph(" "));
                        document.add(new Paragraph(" "));
                        document.add(new Paragraph(" "));
                        
                       PdfPTable table=new PdfPTable(3);
            
                        PdfPCell celdaP2 = new PdfPCell(new Paragraph("Nombre del proveedor: "+nom));            
                        celdaP2.setColspan(3);
                        table.addCell(celdaP2);
            
                        PdfPCell celdaP3 = new PdfPCell(new Paragraph("Direccion del proveedor: "+dir));            
                        celdaP3.setColspan(3);
                        table.addCell(celdaP3);
            
                        PdfPCell celdaP4 = new PdfPCell(new Paragraph("Telefono del proveedor: "+tel));            
                        celdaP4.setColspan(3);
                        table.addCell(celdaP4);
            
                        PdfPCell celdaP5 = new PdfPCell(new Paragraph("E-mail del proveedor: "+mai));            
                        celdaP5.setColspan(3);
                        table.addCell(celdaP5);
            
                        PdfPCell celdaP6 = new PdfPCell(new Paragraph("Nombre de contacto con el proveedor: "+cont));            
                        celdaP6.setColspan(3);
                        table.addCell(celdaP6);
            
                        PdfPCell celdaP = new PdfPCell(new Paragraph("Tabla del producto "+ident));
                        celdaP.setColspan(3);
                        table.addCell(celdaP);
            
            
                        table.addCell("numero de piezas");
                        table.addCell("costo");
                        table.addCell("monto");
                
            
                        table.addCell(exis);
                        table.addCell(caasf);
                        table.addCell(montfi);
                
                                                                 
                        document.add(table);
            
                        document.close();
                        con.close();
                    
              
                                                                                                                                                                                                                 
        }
                    }
                    catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
           
                }
                }
                
          
        }
        catch(Exception e){
            System.err.println("ocurrio un error al crear el archivo");
            System.exit(-1); //detiene la ejecucion del programa
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(resurtido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resurtido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resurtido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resurtido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resurtido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cmb_pr;
    private javax.swing.JLabel fecha;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nue_exi;
    // End of variables declaration//GEN-END:variables

    public void lista_prove() {
        try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/p_venta", "root", "");
            String sql= "SELECT * FROM proveedor";
            PreparedStatement pst= con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            cmb_pr.removeAllItems();
            while(rs.next()){
                cmb_pr.addItem(rs.getString(1));
            }
           
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
           
       }
        
    }
}