/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jovana Mitrovic
 */

@Entity
public class Kredit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifraKredita;
    private String status;
    private double iznos;
    @ManyToOne
    private Klijent klijent;
    private int sifraVrsteKredita;

    public Kredit() {
    }

    public Kredit(int sifraKredita, String status, double iznos, Klijent klijent, int sifraVrsteKredita) {
        this.sifraKredita = sifraKredita;
        this.status = status;
        this.iznos = iznos;
        this.klijent = klijent;
        this.sifraVrsteKredita = sifraVrsteKredita;
    }

    public int getSifraVrsteKredita() {
        return sifraVrsteKredita;
    }

    public void setSifraVrsteKredita(int sifraVrsteKredita) {
        this.sifraVrsteKredita = sifraVrsteKredita;
    }

    public int getSifraKredita() {
        return sifraKredita;
    }

    public void setSifraKredita(int sifraKredita) {
        this.sifraKredita = sifraKredita;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }
    
    
    
    
}
