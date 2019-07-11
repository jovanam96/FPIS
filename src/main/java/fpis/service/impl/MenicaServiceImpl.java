/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.service.impl;

import fpis.entitiy.Menica;
import fpis.entitiy.MenicaID;
import fpis.repository.MenicaRepository;
import fpis.service.MenicaService;
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
public class MenicaServiceImpl implements MenicaService {

    @Autowired
    private MenicaRepository menicaRepository;

    @Override
    public Menica findMenica(String jmbg, int brojMenice) {
        Optional<Menica> menica = menicaRepository.findById(new MenicaID(jmbg, brojMenice));
        if (menica.isPresent()) {
            return menica.get();
        }
        return null;
    }

}
