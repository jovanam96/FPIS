/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.repository;

import fpis.entitiy.ObavestenjeOPustanjuMenice;
import fpis.entitiy.ObavestenjeOPustanjuMeniceID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jovana Mitrovic
 */

@Repository
public interface ObavestenjeOPustanjuMeniceRepository extends JpaRepository<ObavestenjeOPustanjuMenice, ObavestenjeOPustanjuMeniceID>{
    
}
