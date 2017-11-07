package com.sedesol.catProgramas.soap.dataService;

import java.util.HashMap;

import org.apache.camel.Body;
import org.apache.camel.Exchange;

public class CatalogsService {
	public void init(){}
	
	public HashMap<String, String> queryCatalog(@Body HashMap<String,String> info, Exchange exchange){
    	try{
    		
    		
    	}catch(Exception ex){
            ex.printStackTrace();
        }
        return info;
    }
	
}
