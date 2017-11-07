package net.lr.tutorial.karaf.db.examplejpa.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.camel.Body;
import org.apache.camel.Exchange;

import com.sedesol.catalogo.programas.model.pojo.Usuario;

import net.lr.tutorial.karaf.db.examplejpa.Person;
import net.lr.tutorial.karaf.db.examplejpa.PersonService;

public class PersonServiceImpl implements PersonService {
    private EntityManager em;
    public void setEntityManager(EntityManager em) { 
        this.em = em;
    }

    @Override
    public void add(Person person) {
        em.persist(person);
        em.flush();
    }
    
    
    @Override
    public void addUser(Usuario usuario) {
        em.persist(usuario);
        em.flush();
    }
    
    public void deleteAll() {
        em.createQuery("delete from Person").executeUpdate();
        em.flush();
    }

    @Override
    public List<Person> getAll() {
        return em.createQuery("select p from Person p", Person.class).getResultList();
    }
    
    public String saveEntityJpa(@Body String mensaje,Exchange exchange){
    	
            if(em != null){
	    		//em.getTransaction().begin();
	            this.deleteAll();
	            this.add(new Person("Christian Schneider", "@schneider_chris"));
	            Usuario usuario = new Usuario();
	            usuario.setChrNombre("Daniel");
	            usuario.setChrEmail("doswaldo74@gmail.com");
	            this.addUser(usuario);
	            //em.getTransaction().commit();
            }
    	
        return mensaje;
    }

}
