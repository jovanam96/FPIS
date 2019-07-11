/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.controller;

import fpis.controller.dto.ObavestenjeOPustanjuMeniceDTO;
import fpis.entitiy.MenicaID;
import fpis.entitiy.ObavestenjeOPustanjuMenice;
import fpis.entitiy.ObavestenjeOPustanjuMeniceID;
import fpis.service.ObavestenjeOPustanjuMeniceService;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jovana Mitrovic
 */

@RestController
@RequestMapping("/obavestenjeOPustanjuMenice")
@CrossOrigin
public class ObavestenjeOPustanjuMeniceController {
    
    @Autowired
    private ObavestenjeOPustanjuMeniceService obavestenjeOPustanjuMeniceService;
    
    @Autowired
    private ModelMapper modelMapper;
    
    @GetMapping("/all") 
    public List<ObavestenjeOPustanjuMeniceDTO> getAll() {
        List<ObavestenjeOPustanjuMenice> obavestenja = obavestenjeOPustanjuMeniceService.getAll();
        
        return obavestenja.stream()
                .map(ob -> modelMapper.map(ob, ObavestenjeOPustanjuMeniceDTO.class))
                .collect(Collectors.toList());
    }
    
    @PostMapping
    public ObavestenjeOPustanjuMenice save(@RequestBody ObavestenjeOPustanjuMeniceDTO dto) {
        ObavestenjeOPustanjuMenice obavestenje = modelMapper.map(dto, ObavestenjeOPustanjuMenice.class);
        obavestenje.getMenica().setMenicaId(new MenicaID(dto.getMenica().getKlijent().getJmbg(),dto.getMenica().getBrojMenice()));
        obavestenje.setObavestenjeOPustanjuMeniceID(new ObavestenjeOPustanjuMeniceID(new MenicaID(dto.getMenica().getKlijent().getJmbg(), dto.getMenica().getBrojMenice()), dto.getSifraObavestenjaOPustanjuMenice()));
        return obavestenjeOPustanjuMeniceService.saveOrUpdateObavestenje(obavestenje);
    }
    
    @PutMapping("/update")
    public void update(@RequestBody ObavestenjeOPustanjuMeniceDTO dto) {
        ObavestenjeOPustanjuMenice obavestenje = modelMapper.map(dto, ObavestenjeOPustanjuMenice.class);
        obavestenjeOPustanjuMeniceService.saveOrUpdateObavestenje(obavestenje);
    }
    
    @DeleteMapping("/delete/{jmbg}/{brojMenice}/{sifraObavestenjaOPustanjuMenice}")
    public void delete(@PathVariable String jmbg, @PathVariable int brojMenice, @PathVariable int sifraObavestenjaOPustanjuMenice) {
        obavestenjeOPustanjuMeniceService.deleteObavestenje(jmbg, brojMenice, sifraObavestenjaOPustanjuMenice);
    }

}
