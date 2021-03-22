/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angel-Alcv
 */
public class EntPeliculas {
    int idp;
   String co;
   String nop;
   double pre;
   int stok;
  

    public EntPeliculas() {
    }

    public EntPeliculas(int idp, String co, String nop, double pre, int stok) {
        this.idp = idp;
        this.co = co;
        this.nop = nop;
        this.pre = pre;
        this.stok = stok;
        
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }
    
    public String getNop() {
        return nop;
    }

    public void setNop(String nop) {
        this.nop = nop;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

       
}
