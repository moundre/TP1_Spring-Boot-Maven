/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.repositories;

import com.OdkApprenant.demo.model.Apprenant;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author modibo.samake
 */
public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {
    
    @Query("select a from Apprenant a where a.login=?1 and a.password=?2")
    Optional<Apprenant> verifierconnexion(String login, String password);
    
}
