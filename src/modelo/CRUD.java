/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Angel-Alcv
 */
public interface CRUD {
    public List listar();
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(int id);
       
    public List listarPeli();
    public int addPeli(Object[] obt);
    public int actualizarPeli(Object[] obt);
    public void eliminarPeli(int idp);
}
