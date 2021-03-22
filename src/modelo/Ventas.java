/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angel-Alcv
 */
public class Ventas {
    int idv;
   String nuse;
   int idC;
   String FeV;
   double mo;

    public Ventas() {
    }

    public Ventas(int idv, String nuse, int idC, String FeV, double mo) {
        this.idv = idv;
        this.nuse = nuse;
        this.idC = idC;
        this.FeV = FeV;
        this.mo = mo;
 }

    public int getIdv() {
        return idv;
    }

    public void setIdv(int idv) {
        this.idv = idv;
    }

    public String getNuse() {
        return nuse;
    }

    public void setNuse(String nuse) {
        this.nuse = nuse;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getFeV() {
        return FeV;
    }

    public void setFeV(String FeV) {
        this.FeV = FeV;
    }

    public double getMo() {
        return mo;
    }

    public void setMo(double mo) {
        this.mo = mo;
    }
         
}
