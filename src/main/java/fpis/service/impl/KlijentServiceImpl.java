/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.service.impl;

import fpis.entitiy.Klijent;
import fpis.repository.KlijentRepository;
import fpis.service.KlijentService;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jovana Mitrovic
 */

@Service
@Transactional
public class KlijentServiceImpl implements KlijentService {

    @Autowired
    private KlijentRepository klijentRepository;
    
    @Override
    public Klijent findKlijent(String jmbg) {
        Optional<Klijent> klijent = klijentRepository.findById(jmbg);
        if(klijent.isPresent()) {
            return klijent.get();
        }
        return null;
    }
    
}
