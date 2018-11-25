/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

import entities.Utilisateur;
import java.util.List;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author kshabou
 */
public interface UtilisateurMapper {
    @Select("select * from utilisateur")
    List<Utilisateur> getAll();
    
    @Select("select * from utilisateur where idutilisateur = #{username}")
    Utilisateur getById(int idutilisateur);
    
    @Select("select * from utilisateur where idutilisateur like #{username} and mot_de_passe like #{motPasse} ")
    Utilisateur getByUsernamePsw(Utilisateur user);
    
}
