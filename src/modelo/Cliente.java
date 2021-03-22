/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angel-Alcv
 */
public class Cliente {
   int id;
   String cd;
   String nom;
   String ape;
   String dir;
   String tef;

    public Cliente() {
    }

    public Cliente(int id, String cd, String nom,String ape, String dir, String tef) {
        this.id = id;
        this.cd = cd;
        this.nom = nom;
        this.ape = ape;
        this.dir = dir;
        this.tef = tef;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTef() {
        return tef;
    }

    public void setTef(String tef) {
        this.tef = tef;
    }
   
   
}
