/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author modibo.samake
 */
@Service
public class ApprenantServiceImp implements ApprenantService {
    @Autowired  
    ApprenantRepository apprenantRepository;

    @Override
    public Apprenant Ajouter_Apprenant(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    @Override
    public Apprenant Modifier_Apprenant(Long id, Apprenant apprenant) {
        Apprenant apprenants = apprenantRepository.findById(id).orElseThrow();
        apprenants.setNom(apprenant.getNom());
        apprenant.setPrenom(apprenant.getPrenom());
        apprenant.setAge(apprenant.getAge());
        apprenant.setLogin(apprenant.getLogin());
        apprenant.setEmail(apprenant.getEmail());
        apprenant.setLogin(apprenant.getLogin());
        apprenant.setPassword(apprenant.getPassword());
        apprenant.setGenre(apprenant.getGenre());
        apprenant.setApprenantStatus(apprenant.getApprenantStatus());
        apprenant.setDateCreation(apprenant.getDateCreation());
        apprenant.setDateModification(apprenant.getDateModification());
        return apprenantRepository.save(apprenant);
     }

    @Override
    public List list_Apprenant() {
        return apprenantRepository.findAll();
    }

    @Override
    public Apprenant Afficher_Apprenant_by_id(Long id) {
        return apprenantRepository.findById(id).get();
    }

    @Override
    public void Supprimer_Apprenant(Long id) {
        apprenantRepository.deleteById(id);
    }

    @Override
    public boolean authentification(String login, String password) {
        Optional<Apprenant> auth=apprenantRepository.verifierconnexion(login, password);
        
        if(auth.isPresent()){
            return true;
        }
        else{
            return false;
        }
    }

    
    }

    

    
    
  

    
   
   
    
    

