/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.entitiy;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Jovana Mitrovic
 */

@Entity
public class Klijent implements Serializable {
    
    @Id
    private String jmbg;
    private String imeImeRoditeljaPrezime;
    private String brojLicneKarte;
    private String telefon;
    private String osnov;
    private String mesto;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "klijent")
    @JsonManagedReference
    private List<Menica> menice;

    public Klijent() {
    }

    public Klijent(String jmbg, String imeImeRoditeljaPrezime, String brojLicneKarte, String telefon, String osnov, String mesto, List<Menica> menice) {
        this.jmbg = jmbg;
        this.imeImeRoditeljaPrezime = imeImeRoditeljaPrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.telefon = telefon;
        this.osnov = osnov;
        this.mesto = mesto;
        this.menice = menice;
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

    
    public List<Menica> getMenice() {
        return menice;
    }

    public void setMenice(List<Menica> menice) {
        this.menice = menice;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }
    
}
