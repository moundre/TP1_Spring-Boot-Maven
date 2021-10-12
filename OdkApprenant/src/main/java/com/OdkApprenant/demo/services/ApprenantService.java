/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.services;
import com.OdkApprenant.demo.model.Apprenant;
import java.util.List;




/**
 *
 * @author modibo.samake
 */
public interface ApprenantService {
public abstract Apprenant Ajouter_Apprenant(Apprenant apprenant);
public abstract Apprenant Modifier_Apprenant(Long id, Apprenant apprenant);
List<Apprenant> list_Apprenant();
public abstract Apprenant Afficher_Apprenant_by_id(Long id);
void Supprimer_Apprenant(Long id);

public abstract boolean authentification(String login, String password);
       
}
