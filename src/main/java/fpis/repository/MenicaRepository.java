/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpis.repository;

import fpis.entitiy.Menica;
import fpis.entitiy.MenicaID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jovana Mitrovic
 */

@Repository
public interface MenicaRepository extends JpaRepository<Menica, MenicaID>{
    
}
