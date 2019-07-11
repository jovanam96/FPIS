/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.entitiy;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Jovana Mitrovic
 */

@Embeddable
public class StavkaKreditnogDosijeaID implements Serializable{
    
    private int sifraKreditnogDosijea;
    private int rb;

    public StavkaKreditnogDosijeaID() {
    }

    public StavkaKreditnogDosijeaID(int sifraKreditnogDosijea, int rb) {
        this.sifraKreditnogDosijea = sifraKreditnogDosijea;
        this.rb = rb;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public int getSifraKreditnogDosijea() {
        return sifraKreditnogDosijea;
    }

    public void setSifraKreditnogDosijea(int sifraKreditnogDosijea) {
        this.sifraKreditnogDosijea = sifraKreditnogDosijea;
    }
    
    
}
