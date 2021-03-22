/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angel-Alcv
 */
public class InforVenta {
   int infv;
   int vidv;
   int plid;
   int can;
   double pre;

    public InforVenta() {
    }

    public InforVenta(int infv, int vidv, int plid, int can, double pre) {
        this.infv = infv;
        this.vidv = vidv;
        this.plid = plid;
        this.can = can;
        this.pre = pre;
    }

    public int getInfv() {
        return infv;
    }

    public void setInfv(int infv) {
        this.infv = infv;
    }

    public int getVidv() {
        return vidv;
    }

    public void setVidv(int vidv) {
        this.vidv = vidv;
    }

    public int getPlid() {
        return plid;
    }

    public void setPlid(int plid) {
        this.plid = plid;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

}
