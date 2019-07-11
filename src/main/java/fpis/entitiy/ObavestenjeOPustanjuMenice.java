/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.entitiy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Jovana Mitrovic
 */

@Entity
public class ObavestenjeOPustanjuMenice implements Serializable{
    
    @EmbeddedId
    private ObavestenjeOPustanjuMeniceID obavestenjeOPustanjuMeniceID;
    @Temporal(TemporalType.DATE)
    private Date datum;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("menicaID")
    @JsonBackReference
    //@JoinColumns(value = {@JoinColumn("jmbg"),@JoinColumn("brojMenice")})
    private Menica menica;

    public ObavestenjeOPustanjuMenice() {
    }

    public ObavestenjeOPustanjuMenice(ObavestenjeOPustanjuMeniceID obavestenjeOPustanjuMeniceID, Date datum, Menica menica) {
        this.obavestenjeOPustanjuMeniceID = obavestenjeOPustanjuMeniceID;
        this.datum = datum;
        this.menica = menica;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public ObavestenjeOPustanjuMeniceID getObavestenjeOPustanjuMeniceID() {
        return obavestenjeOPustanjuMeniceID;
    }

    public void setObavestenjeOPustanjuMeniceID(ObavestenjeOPustanjuMeniceID obavestenjeOPustanjuMeniceID) {
        this.obavestenjeOPustanjuMeniceID = obavestenjeOPustanjuMeniceID;
    }

    public Menica getMenica() {
        return menica;
    }

    public void setMenica(Menica menica) {
        this.menica = menica;
    }

    
    
}
