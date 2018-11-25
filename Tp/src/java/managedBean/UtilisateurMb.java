/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entities.Utilisateur;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import managers.UtilisateurManager;

/**
 *
 * @author kshabou
 */
@ManagedBean
@SessionScoped
public class UtilisateurMb implements Serializable{
    
    private Utilisateur user;
    private List<Utilisateur> utilisateurs;

    @PostConstruct
    public void init(){
        
        user = new Utilisateur();
    }

    public String chekUser() {
        Utilisateur userRetour ;

        userRetour = UtilisateurManager.getByUsernamePsw(user);

        if (userRetour != null) {
            return ("acceuil");
        } else {
            return null;
        }

    }
    
    
    //getter and setter
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }
    
    
    
    
}
