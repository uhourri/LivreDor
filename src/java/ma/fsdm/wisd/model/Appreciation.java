/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.fsdm.wisd.model;

import java.io.Serializable;

/**
 *
 * @author UNES
 */
public class Appreciation implements Serializable{
    private int id;
    private String auteur, email, contenu, date;

    public String getAuteur() {
        return auteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Appreciation(String auteur, String email, String contenu) {
        this.auteur = auteur;
        this.email = email;
        this.contenu = contenu;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Appreciation() {
    }

    @Override
    public String toString() {
        return "Appreciation{" + "auteur=" + auteur + ", email=" + email + ", contenu=" + contenu + '}';
    }
    
    
}
