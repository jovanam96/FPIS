/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.controller.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jovana Mitrovic
 */
public class KreditniDosijeDTO implements Serializable{
    private int sifraKreditnogDosijea;
    private Date datumKreiranja;
    private KreditDTO kredit;
    private KlijentDTO klijent;
    private List<StavkaKreditnogDosijeaDTO> stavke;

    public KreditniDosijeDTO() {
    }

    public KreditniDosijeDTO(int sifraKreditnogDosijea, Date datumKreiranja, KreditDTO kredit, KlijentDTO klijent, List<StavkaKreditnogDosijeaDTO> stavke) {
        this.sifraKreditnogDosijea = sifraKreditnogDosijea;
        this.datumKreiranja = datumKreiranja;
        this.kredit = kredit;
        this.klijent = klijent;
        this.stavke = stavke;
    }

    public int getSifraKreditnogDosijea() {
        return sifraKreditnogDosijea;
    }

    public void setSifraKreditnogDosijea(int sifraKreditnogDosijea) {
        this.sifraKreditnogDosijea = sifraKreditnogDosijea;
    }

    public Date getDatumKreiranja() {
        return datumKreiranja;
    }

    public void setDatumKreiranja(Date datumKreiranja) {
        this.datumKreiranja = datumKreiranja;
    }

    public KreditDTO getKredit() {
        return kredit;
    }

    public void setKredit(KreditDTO kredit) {
        this.kredit = kredit;
    }

    public KlijentDTO getKlijent() {
        return klijent;
    }

    public void setKlijent(KlijentDTO klijent) {
        this.klijent = klijent;
    }

    public List<StavkaKreditnogDosijeaDTO> getStavke() {
        return stavke;
    }

    public void setStavke(List<StavkaKreditnogDosijeaDTO> stavke) {
        this.stavke = stavke;
    }
    
    
}
