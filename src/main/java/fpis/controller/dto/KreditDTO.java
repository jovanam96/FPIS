/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.controller.dto;

import java.io.Serializable;

/**
 *
 * @author Jovana Mitrovic
 */
public class KreditDTO implements Serializable {
    private int sifraKredita;
    private String status;
    private double iznos;
    private KlijentDTO klijent;
    private int sifraVrsteKredita;

    public KreditDTO() {
    }

    public KreditDTO(int sifraKredita, String status, double iznos, KlijentDTO klijent, int sifraVrsteKredita) {
        this.sifraKredita = sifraKredita;
        this.status = status;
        this.iznos = iznos;
        this.klijent = klijent;
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

    public KlijentDTO getKlijent() {
        return klijent;
    }

    public void setKlijent(KlijentDTO klijent) {
        this.klijent = klijent;
    }

    public int getSifraVrsteKredita() {
        return sifraVrsteKredita;
    }

    public void setSifraVrsteKredita(int sifraVrsteKredita) {
        this.sifraVrsteKredita = sifraVrsteKredita;
    }
    
    
}
