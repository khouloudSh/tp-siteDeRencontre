/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.Utilisateur;
import java.util.List;
import mappers.UtilisateurMapper;
import services.ConnexionBd;

/**
 *
 * @author kshabou
 */

public class UtilisateurManager {
    
    public static Utilisateur getById(int id){
        UtilisateurMapper userM = ConnexionBd.getSession().getMapper(UtilisateurMapper.class);
        return userM.getById(id);
    }
    
    public static List<Utilisateur> getAll(){
       UtilisateurMapper userM = ConnexionBd.getSession().getMapper(UtilisateurMapper.class);
        return userM.getAll();
    }
    
     public static Utilisateur getByUsernamePsw(Utilisateur user){
        UtilisateurMapper userM = ConnexionBd.getSession().getMapper(UtilisateurMapper.class);
        return userM.getByUsernamePsw(user);
    }
    
}
