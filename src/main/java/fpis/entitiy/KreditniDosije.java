/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.entitiy;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jovana Mitrovic
 */

@Entity
public class KreditniDosije implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifraKreditnogDosijea;
    @Temporal(TemporalType.DATE)
    private Date datumKreiranja;
    @ManyToOne
    private Kredit kredit;
    @ManyToOne
    private Klijent klijent;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "kreditniDosije")
    private List<StavkaKreditnogDosijea> stavke;

    public KreditniDosije() {
    }

    public KreditniDosije(int sifraKreditnogDosijea, Date datumKreiranja, Kredit kredit, Klijent klijent, List<StavkaKreditnogDosijea> stavke) {
        this.sifraKreditnogDosijea = sifraKreditnogDosijea;
        this.datumKreiranja = datumKreiranja;
        this.kredit = kredit;
        this.klijent = klijent;
        this.stavke = stavke;
    }

    public List<StavkaKreditnogDosijea> getStavke() {
        return stavke;
    }

    public void setStavke(List<StavkaKreditnogDosijea> stavke) {
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

    public Kredit getKredit() {
        return kredit;
    }

    public void setKredit(Kredit kredit) {
        this.kredit = kredit;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }
    
    
}
