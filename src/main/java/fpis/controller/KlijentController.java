/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.controller;

import fpis.controller.dto.KlijentDTO;
import fpis.entitiy.Klijent;
import fpis.service.KlijentService;
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
@RequestMapping("/klijent")
@CrossOrigin
public class KlijentController {
    
    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private KlijentService klijentService;
    
    
    @GetMapping("/{jmbg}")
    public KlijentDTO findKlijent(@PathVariable String jmbg) {
        Klijent klijent = klijentService.findKlijent(jmbg);
        
        return modelMapper.map(klijent, KlijentDTO.class);
    }
}
