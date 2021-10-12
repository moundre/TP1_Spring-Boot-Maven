/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author modibo.samake
 */
@Entity
public class Apprenant {
   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private int age;
    private int telephone;
    private String email;
    private String login;
    private String password;
    private String genre;
    private String ApprenantStatus;
    private Date dateCreation;
    private Date dateModification;

    public Apprenant() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getApprenantStatus() {
        return ApprenantStatus;
    }

    public void setApprenantStatus(String ApprenantStatus) {
        this.ApprenantStatus = ApprenantStatus;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Apprenant(String nom, String prenom, int age, int telephone, String email, String login, String password, String genre, String ApprenantStatus, Date dateCreation, Date dateModification) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.genre = genre;
        this.ApprenantStatus = ApprenantStatus;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
    }

    @Override
    public String toString() {
        return "Apprenant{" + 
                "id=" + id + 
                ", nom=" + nom + 
                ", prenom=" + prenom + 
                ", age=" + age + 
                ", telephone=" + telephone + 
                ", email=" + email + 
                ", login=" + login + 
                ", password=" + password + 
                ", genre=" + genre + 
                ", ApprenantStatus=" + ApprenantStatus + 
                ", dateCreation=" + dateCreation + 
                ", dateModification=" + dateModification + 
                '}';
    }
   
    
}
