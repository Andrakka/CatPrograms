package com.sedesol.catProgramas.soap.dataService;

import java.util.HashMap;

import org.apache.camel.Body;
import org.apache.camel.Exchange;

public class BusinessEntityService {
	
    public void init(){}

    public HashMap<String, String> saveEntity(@Body HashMap<String,String> info,  Exchange exchange){
    	HashMap<String, String> mapa = new HashMap<String, String> ();
    	try{
    		
    	}catch(Exception ex){
            ex.printStackTrace();
            
        }
        return info;
    }
    
    
    public HashMap<String, String> insertEntity(@Body HashMap<String,String> info, Exchange exchange){
    	
    	try{
    		
    		
    	}catch(Exception ex){
            ex.printStackTrace();
            
        }
        return info;
    }
    
    public HashMap<String, String> deleteEntity(@Body HashMap<String,String> info, Exchange exchange){
    	try{
            
    	}catch(Exception ex){
            ex.printStackTrace();
            
        }
        return info;
    }
    
    
    public HashMap<String, String> getEntity(@Body HashMap<String,String> info, Exchange exchange){
    	
    	try{
    		
    		
    	}catch(Exception ex){
            ex.printStackTrace();
            
        }
        return info;
    }
    
    public HashMap<String, String> queryEntity(@Body HashMap<String,String> info, Exchange exchange){
    	
    	try{
    		
    		
    	}catch(Exception ex){
            ex.printStackTrace();
            
        }
        return info;
    }
    public HashMap<String, String> queryCatalogPaging(@Body HashMap<String,String> info, Exchange exchange){
    	
    	try{
    		
    		
    	}catch(Exception ex){
            ex.printStackTrace();
            
        }
        return info;
    }
}
