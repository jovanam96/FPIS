/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.service;

import fpis.entitiy.ObavestenjeOPustanjuMenice;
import java.util.List;

/**
 *
 * @author Jovana Mitrovic
 */
public interface ObavestenjeOPustanjuMeniceService {

    public ObavestenjeOPustanjuMenice saveOrUpdateObavestenje(ObavestenjeOPustanjuMenice obavestenje);

    public List<ObavestenjeOPustanjuMenice> getAll();

    public void deleteObavestenje(String jmbg, int brojMenice, int sifraObavestenja);

}
