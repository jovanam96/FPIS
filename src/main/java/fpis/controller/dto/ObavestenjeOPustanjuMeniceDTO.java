/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Jovana Mitrovic
 */
public class ObavestenjeOPustanjuMeniceDTO implements Serializable{
    private int sifraObavestenjaOPustanjuMenice;
    private Date datum;
    private MenicaDTO menica;

    public ObavestenjeOPustanjuMeniceDTO() {
    }

    public ObavestenjeOPustanjuMeniceDTO(int sifraObavestenjaOPustanjuMenice, Date datum, MenicaDTO menica) {
        this.sifraObavestenjaOPustanjuMenice = sifraObavestenjaOPustanjuMenice;
        this.datum = datum;
        this.menica = menica;
    }

    
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }


    public int getSifraObavestenjaOPustanjuMenice() {
        return sifraObavestenjaOPustanjuMenice;
    }

    public void setSifraObavestenjaOPustanjuMenice(int sifraObavestenjaOPustanjuMenice) {
        this.sifraObavestenjaOPustanjuMenice = sifraObavestenjaOPustanjuMenice;
    }


    public MenicaDTO getMenica() {
        return menica;
    }

    public void setMenica(MenicaDTO menica) {
        this.menica = menica;
    }

   
}
