/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.controller;

import fpis.controller.dto.KreditniDosijeDTO;
import fpis.entitiy.KreditniDosije;
import fpis.service.KreditniDosijeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jovana Mitrovic
 */

@RestController
@RequestMapping("/kreditniDosije")
@CrossOrigin
public class KreditniDosijeController {
    
    @Autowired
    private KreditniDosijeService kreditniDosijeService;
    
    @Autowired
    private ModelMapper modelMapper;
    
    
    @PostMapping
    public KreditniDosije save(@RequestBody KreditniDosijeDTO dto) {
        KreditniDosije kd = modelMapper.map(dto, KreditniDosije.class);
        return kreditniDosijeService.saveKreditniDosije(kd);
    }
    
}
