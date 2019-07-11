/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.entitiy;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jovana Mitrovic
 */

@Entity
public class StavkaKreditnogDosijea implements Serializable{
    
    @EmbeddedId
    private StavkaKreditnogDosijeaID stavkaKreditnogDosijeaID;
    private String nazivDokumenta;
    @Temporal(TemporalType.DATE)
    private Date datum;
    private String odgovornoLice;
    private String odgovornoLicePoslovniPartner;
    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("sifraKreditnogDosijea")
    @JoinColumn
    private KreditniDosije kreditniDosije;

    public StavkaKreditnogDosijea() {
    }

    public StavkaKreditnogDosijea(StavkaKreditnogDosijeaID stavkaKreditnogDosijeaID, String nazivDokumenta, Date datum, String odgovornoLice, String odgovornoLicePoslovniPartner, KreditniDosije kreditniDosije) {
        this.stavkaKreditnogDosijeaID = stavkaKreditnogDosijeaID;
        this.nazivDokumenta = nazivDokumenta;
        this.datum = datum;
        this.odgovornoLice = odgovornoLice;
        this.odgovornoLicePoslovniPartner = odgovornoLicePoslovniPartner;
        this.kreditniDosije = kreditniDosije;
    }

    public KreditniDosije getKreditniDosije() {
        return kreditniDosije;
    }

    public void setKreditniDosije(KreditniDosije kreditniDosije) {
        this.kreditniDosije = kreditniDosije;
    }

    public StavkaKreditnogDosijeaID getStavkaKreditnogDosijeaID() {
        return stavkaKreditnogDosijeaID;
    }

    public void setStavkaKreditnogDosijeaID(StavkaKreditnogDosijeaID stavkaKreditnogDosijeaID) {
        this.stavkaKreditnogDosijeaID = stavkaKreditnogDosijeaID;
    }

    public String getNazivDokumenta() {
        return nazivDokumenta;
    }

    public void setNazivDokumenta(String nazivDokumenta) {
        this.nazivDokumenta = nazivDokumenta;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getOdgovornoLice() {
        return odgovornoLice;
    }

    public void setOdgovornoLice(String odgovornoLice) {
        this.odgovornoLice = odgovornoLice;
    }

    public String getOdgovornoLicePoslovniPartner() {
        return odgovornoLicePoslovniPartner;
    }

    public void setOdgovornoLicePoslovniPartner(String odgovornoLicePoslovniPartner) {
        this.odgovornoLicePoslovniPartner = odgovornoLicePoslovniPartner;
    }
    
    
    
}
