/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteCON;
import modelo.EntPeliculas;
import modelo.InforVenta;
import modelo.Ventas;
import modelo.VentasCON;

/**
 *
 * @author Angel-Alcv
 */
public class VentasForm extends javax.swing.JInternalFrame {
    ClienteCON ccn=new ClienteCON();
    EntPeliculas pe=new EntPeliculas();
    InforVenta inv=new InforVenta();
    VentasCON vecn=new VentasCON();
    Ventas ve=new Ventas();
    Cliente cli=new Cliente();
    
    DefaultTableModel modelo=new DefaultTableModel();
    int idp;
    int cop;
    int c;
    int e;
    int can;
    double precio;
    double tap;
    /**
     * Creates new form VentasForm
     */
    public VentasForm() {
        initComponents();
        generarSerie();
        fecha(); 
    }
    
   void fecha(){
   Calendar calendar=new GregorianCalendar();
   txtFecha.setText(""+calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH));
   }
 
   
    void generarSerie(){
    String serie=vecn.NoSerie();
    if(serie==null){
    txtNumeSerie.setText("0000001");
    }else{
    int inc=Integer.parseInt(serie);
    inc=inc+1;
    txtNumeSerie.setText("000000"+inc);
    }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNumeSerie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCoCliente = new javax.swing.JTextField();
        txtNoPelicula = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnBuscarCli = new javax.swing.JButton();
        btnBuscarPeli = new javax.swing.JButton();
        txtAgregar = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPelicula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btncancelar = new javax.swing.JButton();
        CalcularGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTotalPa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setTitle("Sistema de ventas");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Generar Ventas");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("N.SERIE");

        txtNumeSerie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNumeSerie.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Capturau_1.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("CD.CLIENTE:");

        jLabel3.setText("ID.PRODUCTO:");

        jLabel4.setText("PRECIO:");

        jLabel5.setText("CANTIDAD:");

        btnBuscarCli.setBackground(new java.awt.Color(11, 127, 70));
        btnBuscarCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarCli.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/buscar.png"))); // NOI18N
        btnBuscarCli.setText("Buscar");
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });

        btnBuscarPeli.setBackground(new java.awt.Color(11, 122, 66));
        btnBuscarPeli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarPeli.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/buscar.png"))); // NOI18N
        btnBuscarPeli.setText("Buscar");
        btnBuscarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPeliActionPerformed(evt);
            }
        });

        txtAgregar.setBackground(new java.awt.Color(0, 153, 255));
        txtAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        txtAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/agregar.jpg"))); // NOI18N
        txtAgregar.setText("Agregar");
        txtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregarActionPerformed(evt);
            }
        });

        jLabel6.setText("ClLIENTE:");

        jLabel7.setText("PRODUCTO:");

        jLabel8.setText("STOK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(txtCoCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio)
                            .addComponent(txtNoPelicula)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarPeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txtStok)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCli)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPeli)
                    .addComponent(jLabel7)
                    .addComponent(txtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NMR", "IDPRODUCTO", "PRODUCTO", "CANTIDAD", "PREC.UNI", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TablaDetalle);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btncancelar.setBackground(new java.awt.Color(255, 43, 43));
        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cance.png"))); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        CalcularGuardar.setBackground(new java.awt.Color(11, 127, 70));
        CalcularGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CalcularGuardar.setForeground(new java.awt.Color(255, 255, 255));
        CalcularGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/dinero.png"))); // NOI18N
        CalcularGuardar.setText("CALCULAR");
        CalcularGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularGuardarActionPerformed(evt);
            }
        });

        jLabel10.setText("Total a Pagar");

        jButton1.setBackground(new java.awt.Color(255, 43, 43));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/sal.png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancelar)
                .addGap(24, 24, 24)
                .addComponent(CalcularGuardar)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtTotalPa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTotalPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CalcularGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgregarActionPerformed
        // TODO add your handling code here:
        agregarPelicula();
    }//GEN-LAST:event_txtAgregarActionPerformed

    private void btnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliActionPerformed
        // TODO add your handling code here:
        BuscarCliente();
    }//GEN-LAST:event_btnBuscarCliActionPerformed

    private void btnBuscarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPeliActionPerformed
        // TODO add your handling code here:
        BuscarPelicula();
    }//GEN-LAST:event_btnBuscarPeliActionPerformed

    private void CalcularGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularGuardarActionPerformed
        // TODO add your handling code here:
        if (txtTotalPa.getText().equals("")) {
             JOptionPane.showMessageDialog(this,"Porfavor ingrese los datos correspondientes");
        }else{
        guardarV();
        guardarD();
        actualizarSK();
         JOptionPane.showMessageDialog(this,"Tarea realizada con exito");
        nuevo();
        generarSerie();
        fecha();
        }
                
    }//GEN-LAST:event_CalcularGuardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
       nuevo();
       fecha();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    void guardarV(){
     int em=1;
     String serie=txtNumeSerie.getText();
     String fecha=txtFecha.getText();
     double monto=tap;
     ve.setNuse(serie);
     ve.setIdC(c);
     ve.setFeV(fecha);
     ve.setMo(monto);
     vecn.GuardarVe(ve); 
    }
    
    void guardarD(){
    String idv=vecn.IdVentasPeliculas();
     int idvc=Integer.parseInt(idv);
     for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            int idpm=Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            int ca=Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            double pre=Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            inv.setVidv(idvc);
            inv.setPlid(idpm);
            inv.setCan(ca);
            inv.setPre(pre);
            vecn.GuardarDetalleV(inv);
        }
    }
    
    void limpiar(){
        for (int i = 0; i <modelo.getRowCount(); i++) {
           modelo.removeRow(i);
           i=i-1;
        }
    }
    
    void BuscarPelicula(){
    int id=Integer.parseInt(txtNoPelicula.getText());
        if (txtNoPelicula.getText().equals("")) {
         JOptionPane.showMessageDialog(this,"Por favor ingrese el codigo del Producto");
        }else{
            EntPeliculas pe=ccn.listarIdPeli(id);
            if (pe.getIdp()!=0) {
                cop=pe.getIdp();
                txtPelicula.setText(pe.getNop());
                txtPrecio.setText(""+pe.getPre());
                txtStok.setText(""+pe.getStok());
           }else{
            JOptionPane.showMessageDialog(this,"Producto no registrado");   
            txtNoPelicula.requestFocus();
            }
        }
    }
    
    void BuscarCliente(){
   int re;
    String co=txtCoCliente.getText();
    if (txtCoCliente.getText().equals("")) {
        JOptionPane.showMessageDialog(this,"Por favor ingrese su codigo");
    }else{
    Cliente cliente=ccn.listarID(co);
        if (cliente.getCd()!=null) {
            c=cliente.getId();
            txtCliente.setText(cliente.getNom());
            txtNoPelicula.requestFocus();
        }else{
        re=JOptionPane.showConfirmDialog(this,"El cliente no se encuentra en la base de datos, por favor registrelo y vuelva a intentar");
         
        if (re==0) {
                ClienteForm cf=new ClienteForm();
                Cprincipal.VentanaPrincipal.add(cf);
                cf.setVisible(true);
            }
        }
    }
}

    void agregarPelicula(){
   double total;
    int item=0;
    modelo=(DefaultTableModel)TablaDetalle.getModel();
    item=item+1;
    String nop=txtPelicula.getText();
    double pre=Double.parseDouble(txtPrecio.getText());
    int cant=Integer.parseInt(txtCantidad.getValue().toString());
    int stk=Integer.parseInt(txtStok.getText());
    total=cant*pre;
        ArrayList lista=new ArrayList();
        if(stk>0){
          lista.add(item);
          lista.add(cop);
          lista.add(nop);
          lista.add(cant);
          lista.add(pre);
          lista.add(total);
          Object[] ob=new Object[6];
          ob[0]=lista.get(0);
          ob[1]=lista.get(1);
          ob[2]=lista.get(2);
          ob[3]=lista.get(3);
          ob[4]=lista.get(4);
          ob[5]=lista.get(5);
          modelo.addRow(ob);
          TablaDetalle.setModel(modelo);
          calcularT();
        }else{
        JOptionPane.showMessageDialog(this, "Stock de Productos no disponible");
        }
  }
    
    void calcularT(){
      tap=0;
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            can=Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            precio=Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            tap=tap+(can*precio);
        }
        txtTotalPa.setText(""+tap);
    } 
    
    void actualizarSK(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            EntPeliculas ent=new EntPeliculas();
            idp=Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            can=Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            ent=ccn.listarIdPeli(idp);
            int sa=ent.getStok()-can;
            ccn.actStock(sa, idp);
        }         
    }
    
    void nuevo(){
     limpiar();
    txtCoCliente.setText("");
    txtNoPelicula.setText("");
    txtPrecio.setText("");
    txtCantidad.setValue(0);
    txtFecha.setText("");
    txtPelicula.setText("");
   txtCliente.setText("");
    txtStok.setText("");
    txtTotalPa.setText("");
    txtCoCliente.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularGuardar;
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnBuscarPeli;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtAgregar;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCoCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNoPelicula;
    private javax.swing.JTextField txtNumeSerie;
    private javax.swing.JTextField txtPelicula;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtTotalPa;
    // End of variables declaration//GEN-END:variables
}
