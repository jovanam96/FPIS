/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.entitiy;

import java.io.Serializable;
import javax.persistence.Embeddable;
/**
 *
 * @author Jovana Mitrovic
 */

@Embeddable
public class ObavestenjeOPustanjuMeniceID implements Serializable{
    
    private MenicaID menicaID;
    private int sifraObavestenjaOPustanjuMenice;

    public ObavestenjeOPustanjuMeniceID() {
    }

    public ObavestenjeOPustanjuMeniceID(MenicaID menicaID, int sifraObavestenjaOPustanjuMenice) {
        this.menicaID = menicaID;
        this.sifraObavestenjaOPustanjuMenice = sifraObavestenjaOPustanjuMenice;
    }


    public int getSifraObavestenjaOPustanjuMenice() {
        return sifraObavestenjaOPustanjuMenice;
    }

    public void setSifraObavestenjaOPustanjuMenice(int sifraObavestenjaOPustanjuMenice) {
        this.sifraObavestenjaOPustanjuMenice = sifraObavestenjaOPustanjuMenice;
    }

    public MenicaID getMenicaID() {
        return menicaID;
    }

    public void setMenicaID(MenicaID menicaID) {
        this.menicaID = menicaID;
    }

    
}
