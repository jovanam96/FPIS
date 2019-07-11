/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.controller;

import fpis.controller.dto.MenicaDTO;
import fpis.entitiy.Menica;
import fpis.service.MenicaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jovana Mitrovic
 */

@RestController
@RequestMapping("/menica")
@CrossOrigin
public class MenicaController {
    
    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private MenicaService menicaService;
    
    @GetMapping("/{jmbg}/{brojMenice}")
    public MenicaDTO findMenica(@PathVariable String jmbg, @PathVariable int brojMenice) {
        Menica menica = menicaService.findMenica(jmbg, brojMenice);
        
        return modelMapper.map(menica, MenicaDTO.class);
    }
    
}
