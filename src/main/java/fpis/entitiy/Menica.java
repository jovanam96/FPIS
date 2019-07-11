/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.entitiy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jovana Mitrovic
 */

@Entity
public class Menica implements Serializable {
    
    @EmbeddedId
    private MenicaID menicaId;
    @Temporal(TemporalType.DATE)
    private Date datum;
    private double iznos;
    private String mesto;
    private int sifraOvlascenja;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("jmbg")
    @JoinColumn
    @JsonBackReference
    private Klijent klijent;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "menica")
    @JsonManagedReference
    private List<ObavestenjeOPustanjuMenice> obavestenja;

    public Menica() {
    }

    public Menica(MenicaID menicaId, Date datum, double iznos, String mesto, int sifraOvlascenja, Klijent klijent, List<ObavestenjeOPustanjuMenice> obavestenja) {
        this.menicaId = menicaId;
        this.datum = datum;
        this.iznos = iznos;
        this.mesto = mesto;
        this.sifraOvlascenja = sifraOvlascenja;
        this.klijent = klijent;
        this.obavestenja = obavestenja;
    }


    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public MenicaID getMenicaId() {
        return menicaId;
    }

    public void setMenicaId(MenicaID menicaId) {
        this.menicaId = menicaId;
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

    public int getSifraOvlascenja() {
        return sifraOvlascenja;
    }

    public void setSifraOvlascenja(int sifraOvlascenja) {
        this.sifraOvlascenja = sifraOvlascenja;
    }

    public List<ObavestenjeOPustanjuMenice> getObavestenja() {
        return obavestenja;
    }

    public void setObavestenja(List<ObavestenjeOPustanjuMenice> obavestenja) {
        this.obavestenja = obavestenja;
    }
    
    
    
    
}
