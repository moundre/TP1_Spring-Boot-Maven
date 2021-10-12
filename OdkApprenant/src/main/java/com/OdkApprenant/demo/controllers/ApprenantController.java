/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.controllers;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.services.ApprenantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author modibo.samake
 */
@RestController
@CrossOrigin
@RequestMapping("/api")
public class ApprenantController {
      @Autowired
      ApprenantService apprenantServiceImp;
    @GetMapping("/all")
    public List<Apprenant> getApprenantList(){
    return  apprenantServiceImp.list_Apprenant();

    }
    
    @PostMapping(value="/apprenant")
    public Apprenant save(@RequestBody Apprenant apprenant) {
        return apprenantServiceImp.Ajouter_Apprenant(apprenant);
    }
   
    /*@GetMapping("/listeApprenants")
    public List<Apprenant> listeApprenant(){
        List<Apprenant> apprenantListe = new ArrayList<Apprenant>();
        
        Iterable<Apprenant> iterable = apprenantServiceImp.list_Apprenant();
        iterable.forEach(apprenantListe::add);
        
        return apprenantServiceImp.list_Apprenant();
        
    }*/
    @PutMapping(path = "/apprenant/{id}")
    public Apprenant update(@RequestBody Apprenant apprenant, @PathVariable Long id){
        return apprenantServiceImp.Modifier_Apprenant(id, apprenant);
    }
    @GetMapping(path = "/apprenant/{id}")
    public Apprenant getOne (@PathVariable Long id){
        return apprenantServiceImp.Afficher_Apprenant_by_id(id);
    }
    @DeleteMapping(value="/apprenant/{id}")
    public void delete(@PathVariable("id") Long id) {
        apprenantServiceImp.Supprimer_Apprenant(id);
    }
    @GetMapping("/auth")
    public boolean verification(@RequestParam String login,@RequestParam String password)
    {
        return apprenantServiceImp.authentification(login, password);
    }
}




    