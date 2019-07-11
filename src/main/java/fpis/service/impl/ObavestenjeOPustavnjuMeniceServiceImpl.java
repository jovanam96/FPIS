/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.service.impl;

import fpis.entitiy.MenicaID;
import fpis.entitiy.ObavestenjeOPustanjuMenice;
import fpis.entitiy.ObavestenjeOPustanjuMeniceID;
import fpis.repository.ObavestenjeOPustanjuMeniceRepository;
import fpis.service.ObavestenjeOPustanjuMeniceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jovana Mitrovic
 */
@Service
public class ObavestenjeOPustavnjuMeniceServiceImpl implements ObavestenjeOPustanjuMeniceService {

    @Autowired
    private ObavestenjeOPustanjuMeniceRepository obavestenjeOPustanjuMeniceRepository;

    @Override
    public ObavestenjeOPustanjuMenice saveOrUpdateObavestenje(ObavestenjeOPustanjuMenice obavestenje) {
        return obavestenjeOPustanjuMeniceRepository.save(obavestenje);
    }

    @Override
    public void deleteObavestenje(String jmbg, int brojMenice, int sifraObavestenja) {
        obavestenjeOPustanjuMeniceRepository.deleteById(new ObavestenjeOPustanjuMeniceID(new MenicaID(jmbg, brojMenice), sifraObavestenja));
    }

    @Override
    public List<ObavestenjeOPustanjuMenice> getAll() {
        return obavestenjeOPustanjuMeniceRepository.findAll();
    }

}
