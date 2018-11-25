/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author kshabou
 */
public class ConnexionBd {
 
    private final static String ressource ="services/myBatis.xml"; 
    
    
    
    public static SqlSession getSession(){
        SqlSession session = null;
      
            //permet de récupérer le fichier xml dans un objet(en gros)
            InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(ressource);
        } catch (IOException ex) {
            Logger.getLogger(ConnexionBd.class.getName()).log(Level.SEVERE, null, ex);
        }
            //généré notre objet SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //généré notre objet SqlSession
            session = sqlSessionFactory.openSession();
            session.getConfiguration().addMappers("mappers");
            return session;
    }
    
}
