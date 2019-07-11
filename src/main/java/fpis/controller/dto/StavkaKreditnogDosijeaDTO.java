/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.controller.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Jovana Mitrovic
 */
public class StavkaKreditnogDosijeaDTO implements Serializable{
    private int rb;
    private String nazivDokumenta;
    private Date datum;
    private String odgovornoLice;
    private String odgovornoLicePoslovniPartner;
    private KreditniDosijeDTO kreditniDosije;

    public StavkaKreditnogDosijeaDTO() {
    }

    public StavkaKreditnogDosijeaDTO(int rb, String nazivDokumenta, Date datum, String odgovornoLice, String odgovornoLicePoslovniPartner, KreditniDosijeDTO kreditniDosije) {
        this.rb = rb;
        this.nazivDokumenta = nazivDokumenta;
        this.datum = datum;
        this.odgovornoLice = odgovornoLice;
        this.odgovornoLicePoslovniPartner = odgovornoLicePoslovniPartner;
        this.kreditniDosije = kreditniDosije;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
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

    public KreditniDosijeDTO getKreditniDosije() {
        return kreditniDosije;
    }

    public void setKreditniDosije(KreditniDosijeDTO kreditniDosije) {
        this.kreditniDosije = kreditniDosije;
    }
    
    
}
