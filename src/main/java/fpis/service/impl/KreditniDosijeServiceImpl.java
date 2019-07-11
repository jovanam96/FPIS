/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.service.impl;

import fpis.entitiy.KreditniDosije;
import fpis.entitiy.StavkaKreditnogDosijea;
import fpis.repository.KreditniDosijeRepository;
import fpis.repository.StavkaKreditnogDosijeaRepository;
import fpis.service.KreditniDosijeService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jovana Mitrovic
 */
@Service
@Transactional
public class KreditniDosijeServiceImpl implements KreditniDosijeService {
    
    @Autowired
    private KreditniDosijeRepository kreditniDosijeRepository;
    
    @Autowired
    private StavkaKreditnogDosijeaRepository stavkaKreditnogDosijeaRepository;

    @Override
    public KreditniDosije saveKreditniDosije(KreditniDosije kd) {
        KreditniDosije savedKd = kreditniDosijeRepository.save(kd);
        for(StavkaKreditnogDosijea skd : kd.getStavke()) {
            skd.setKreditniDosije(savedKd);
        }
        stavkaKreditnogDosijeaRepository.saveAll(kd.getStavke());
        return savedKd;
    }

}
