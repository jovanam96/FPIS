/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jovana Mitrovic
 */
public class MenicaDTO implements Serializable{
    
    private String jmbg;
    private int brojMenice;
    private Date datum;
    private double iznos;
    private String mesto;
    private int sifraOvlascenja;
    private KlijentDTO klijent;

    public MenicaDTO() {
    }

    public MenicaDTO(String jmbg, int brojMenice, Date datum, double iznos, String mesto, int sifraOvlascenja, KlijentDTO klijent) {
        this.jmbg = jmbg;
        this.brojMenice = brojMenice;
        this.datum = datum;
        this.iznos = iznos;
        this.mesto = mesto;
        this.sifraOvlascenja = sifraOvlascenja;
        this.klijent = klijent;
    }

    
    public int getSifraOvlascenja() {
        return sifraOvlascenja;
    }

    public void setSifraOvlascenja(int sifraOvlascenja) {
        this.sifraOvlascenja = sifraOvlascenja;
    }

    

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public KlijentDTO getKlijent() {
        return klijent;
    }

    public void setKlijent(KlijentDTO klijent) {
        this.klijent = klijent;
    }

    public int getBrojMenice() {
        return brojMenice;
    }

    public void setBrojMenice(int brojMenice) {
        this.brojMenice = brojMenice;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    
    
}
