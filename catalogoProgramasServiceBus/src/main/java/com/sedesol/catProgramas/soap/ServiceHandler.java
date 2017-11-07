package com.sedesol.catProgramas.soap;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import com.sedesol.catProgramas.soap.model.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceHandler {

    public static final String ERR_PERSON_X_NOT_FOUND = "Entity %s no encontrada";

    Map<Integer,Entity> persons = new HashMap<Integer,Entity>();

    public void init(){
        Entity person = new Entity("test");
        
    }

    public Entity getEntity(@Body Entity entidad,Exchange exchange){
    	Entity entidadReturn = new Entity("test");
        return entidadReturn;
    }

    public Entity putEntity(Entity mensaje){
        
        return mensaje;
    }

    public void deleteEntity(@Body Entity entidad,Exchange exchange){
        
    }


}