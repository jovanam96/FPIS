/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Jovana Mitrovic
 */
public class KlijentDTO implements Serializable {
    private String jmbg;
    private String imeImeRoditeljaPrezime;
    private String brojLicneKarte;
    private String telefon;
    private String osnov;
    private String mesto;
    
    public KlijentDTO() {
    }

    public KlijentDTO(String jmbg, String imeImeRoditeljaPrezime, String brojLicneKarte, String telefon, String osnov, String mesto) {
        this.jmbg = jmbg;
        this.imeImeRoditeljaPrezime = imeImeRoditeljaPrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.telefon = telefon;
        this.osnov = osnov;
        this.mesto = mesto;
    }

    
    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getImeImeRoditeljaPrezime() {
        return imeImeRoditeljaPrezime;
    }

    public void setImeImeRoditeljaPrezime(String imeImeRoditeljaPrezime) {
        this.imeImeRoditeljaPrezime = imeImeRoditeljaPrezime;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getOsnov() {
        return osnov;
    }

    public void setOsnov(String osnov) {
        this.osnov = osnov;
    }

    
    
}
