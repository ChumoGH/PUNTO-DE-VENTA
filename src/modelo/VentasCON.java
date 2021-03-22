/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Angel-Alcv
 */
public class VentasCON {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    public String IdVentasPeliculas(){
    String idv="";
    String sql="select max(IdVentas) from ventaspeli";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
               idv=rs.getString(1);        
            }
        } catch (Exception e) {
       }
        return idv;
    }
    
    public int GuardarVe(Ventas v){
  
    String sql="insert into ventaspeli(NumSerie,idCliente,FechaVenta,Monto) values (?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString (1, v.getNuse());
            ps.setInt    (2, v.getIdC());
            ps.setString (3, v.getFeV());
            ps.setDouble (4, v.getMo());         
            
           ps.executeUpdate();
        } catch (Exception e) {
        }
    
    return r;
    }
    
     public int GuardarDetalleV(InforVenta Iv){
         String sql="insert into info_ventas(Ventas_idVentas,Peliculas_IdPeli,Cantidad,PrecioVenta) values (?,?,?,?)";
         try {
           con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, Iv.getVidv());
            ps.setInt(2, Iv.getPlid());
            ps.setInt(3, Iv.getCan());
            ps.setDouble(4, Iv.getPre());
                        
            ps.executeUpdate();
             
         } catch (Exception e) {
         }
         return r;
    }
    
     public String NoSerie(){
     String serie="";
     String sql="select max(NumSerie) from ventaspeli";
         try {
             con=cn.Conectar();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while (rs.next()) {
              serie=rs.getString(1);
                 
             }
             
         } catch (Exception e) {
         }
     return serie;
     }
     
}
