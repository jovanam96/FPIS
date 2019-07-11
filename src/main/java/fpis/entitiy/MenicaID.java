/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.entitiy;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 *
 * @author Jovana Mitrovic
 */

@Embeddable
public class MenicaID implements Serializable {
    private String jmbg;
    private int brojMenice;

    public MenicaID() {
    }

    public MenicaID(String jmbg, int brojMenice) {
        this.jmbg = jmbg;
        this.brojMenice = brojMenice;
    }

    public int getBrojMenice() {
        return brojMenice;
    }

    public void setBrojMenice(int brojMenice) {
        this.brojMenice = brojMenice;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    
    
}
