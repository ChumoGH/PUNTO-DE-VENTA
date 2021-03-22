/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Angel-Alcv
 */
public class ClienteCON implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Cliente co=new Cliente();
    int rp;
    
   //*******************CLIENTE******************
    
    public Cliente listarID(String dni){
    Cliente c=new Cliente();
    String sql="select * from cliente where Cedula=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            
            while (rs.next()) {
             c.setId(rs.getInt(1));
             c.setCd(rs.getString(2));
             c.setNom(rs.getString(3));
             c.setApe(rs.getString(4));
             c.setDir(rs.getString(5));
             c.setTef(rs.getString(6));
            }
            
        } catch (Exception e) {
        }
        return c;
    }
    
    @Override
    public List listar() {
        List<Cliente> lista =new ArrayList<>();
        String sql="select * from cliente";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Cliente c=new Cliente();
                c.setId(rs.getInt(1));
                c.setCd(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setApe(rs.getString(4));
                c.setDir(rs.getString(5));
                c.setTef(rs.getString(6));
                lista.add(c);
            }
        
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into cliente(Cedula,Nombre,Apellido,Direccion,Telefono)values(?,?,?,?,?)";
        try {
         con=cn.Conectar();
         ps=con.prepareStatement(sql);
         ps.setObject(1, o[0]);
         ps.setObject(2, o[1]);
         ps.setObject(3, o[2]);
         ps.setObject(4, o[3]);
         ps.setObject(5, o[4]);
         r=ps.executeUpdate();
     }catch (Exception e) {
    }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update cliente set Cedula=?, Nombre=?, Apellido=?, Direccion=?, Telefono=? where idCliente=?";
        try {
         con=cn.Conectar();
         ps=con.prepareStatement(sql);
         ps.setObject(1, o[0]);
         ps.setObject(2, o[1]);
         ps.setObject(3, o[2]);
         ps.setObject(4, o[3]);
         ps.setObject(5, o[4]);
         ps.setObject(6, o[5]);
          r=ps.executeUpdate();
     }catch (Exception e) {
    }
        return r;
    }

    @Override
    public void eliminar(int id) {
        
        String sql="delete from cliente where idCliente=?";
        try {
         con=cn.Conectar();
         ps=con.prepareStatement(sql);
         ps.setInt(1, id);
         ps.executeUpdate();
        
     }catch (Exception e) {
    }
        
   }
      
    //***********************PRODUCTO**********************************
    
   
   public List listarPeli() {
        List<EntPeliculas> lista =new ArrayList<>();
        String sql="select * from pelicula";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                EntPeliculas p=new EntPeliculas();
                p.setIdp(rs.getInt(1));
                p.setCo(rs.getString(2));
                p.setNop(rs.getString(3));
                p.setPre(rs.getDouble(4));
                p.setStok(rs.getInt(5));
                lista.add(p);
            }
        
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int addPeli(Object[] o) {
        int r=0;
        String sql="insert into pelicula(CodigoPro,Nombre,Precio,stock)values(?,?,?,?)";
        try {
         con=cn.Conectar();
         ps=con.prepareStatement(sql);
         ps.setObject(1, o[0]);
         ps.setObject(2, o[1]);
         ps.setObject(3, o[2]);
         ps.setObject(4, o[3]);
         r=ps.executeUpdate();
     }catch (Exception e) {
    }
        return r;
    }

    @Override
    public int actualizarPeli(Object[] o) {
        int r=0;
        String sql="update pelicula set CodigoPro=?, Nombre=?, Precio=?, stock=? where idProducto=?";
        try {
         con=cn.Conectar();
         ps=con.prepareStatement(sql);
         ps.setObject(1, o[0]);
         ps.setObject(2, o[1]);
         ps.setObject(3, o[2]);
         ps.setObject(4, o[3]);
         ps.setObject(5, o[4]);
         r=ps.executeUpdate();
     }catch (Exception e) {
    }
        return r;
    }

    @Override
    public void eliminarPeli(int idp) {
        
        String sql="delete from pelicula where idProducto=?";
        try {
         con=cn.Conectar();
         ps=con.prepareStatement(sql);
         ps.setInt(1, idp);
         ps.executeUpdate();
        
     }catch (Exception e) {
    }
        
   }  
    
    public int actStock(int cant, int idp){
     String sql="update producto set stock=? where idProducto=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idp);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return rp;
    }
    
     public EntPeliculas listarIdPeli(int idpe){
   EntPeliculas ep=new EntPeliculas();
    String sql="select * from pelicula where idProducto=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idpe);
            rs=ps.executeQuery();
             while (rs.next()) {
             ep.setIdp(rs.getInt(1));
             ep.setCo(rs.getString(2));
             ep.setNop(rs.getString(3));
             ep.setPre(rs.getDouble(4));
             ep.setStok(rs.getInt(5));
            }
            
        } catch (Exception e) {
        }
        return ep;
    }
     
      public List listarRepor() {
        List<Ventas> lista =new ArrayList<>();
        String sql="select * from ventaspeli";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Ventas v=new Ventas();
                v.setIdv(rs.getInt(1));
                v.setNuse(rs.getString(2));
                v.setIdC(rs.getInt(3));
                v.setFeV(rs.getString(4));
                v.setMo(rs.getDouble(5));
                lista.add(v);
            }
        
        } catch (Exception e) {
        }
        return lista;
    }
    
}

