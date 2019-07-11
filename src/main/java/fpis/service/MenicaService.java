/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.service;

import fpis.entitiy.Menica;

/**
 *
 * @author Jovana Mitrovic
 */
public interface MenicaService {
    
    public Menica findMenica(String jmbg, int brojMenice);
}
