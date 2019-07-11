/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.service;

import fpis.entitiy.Klijent;

/**
 *
 * @author Jovana Mitrovic
 */
public interface KlijentService {
    
    public Klijent findKlijent(String jmbg);
}
