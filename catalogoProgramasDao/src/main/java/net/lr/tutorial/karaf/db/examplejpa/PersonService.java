package net.lr.tutorial.karaf.db.examplejpa;

import java.util.List;

import org.apache.camel.Body;
import org.apache.camel.Exchange;

import com.sedesol.catalogo.programas.model.pojo.Usuario;

public interface PersonService {
    void add(Person person);
    public void addUser(Usuario usuario);
    void deleteAll();
    List<Person> getAll();
    public String saveEntityJpa(@Body String mensaje,Exchange exchange);
}
