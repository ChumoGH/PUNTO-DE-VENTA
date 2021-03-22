/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Angel-Alcv
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/alcine";
    String user="root";
    String pass="root";
          
    public Connection Conectar(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,user,pass);
       } catch (Exception e){
           System.err.println("Error");
       }
    return con;
    }
}
