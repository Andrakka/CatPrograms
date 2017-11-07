package com.sedesol.catProgramas.soap.client;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sedesol.catProgramas.soap.dataService.BusinessEntityRouter;
import com.sedesol.catProgramas.soap.model.Entity;

import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

@SuppressWarnings({ "restriction", "unused" })
public class Client {
	
    private BusinessEntityRouter businessEntityRouter;
    private static final QName SERVICE_NAME = new QName("http://dataService.soap.catProgramas.sedesol.com/", "BusinessEntityService");
    private static final String wsdlLocation = "http://localhost:8989/soapas/?wsdl";

    @SuppressWarnings("restriction")
	public Client() throws MalformedURLException {
        URL wsdlURL = new URL(wsdlLocation);
        Service service = Service.create(wsdlURL,SERVICE_NAME);
        businessEntityRouter = service.getPort(BusinessEntityRouter.class);
    }

    public void saveEntity(String json, String clase ) throws Exception{
        System.out.println("\n### GET ENTITY WITH ID " + json);
        HashMap<String, String> mapa = new HashMap<String, String> ();
		mapa.put("DATA", json);
		mapa.put("CLASS", clase);
        String result = businessEntityRouter.saveEntity(mapa) ;
        System.out.println("\n### GET ENTITY RESPONSE " + result);
    }
    
    public void insertEntity(String json, String clase) throws Exception{
        System.out.println("\n### GET ENTITY WITH ID " + json);
        HashMap<String, String> mapa = new HashMap<String, String> ();
        mapa.put("DATA", json);
		mapa.put("CLASS", clase);
        String result = businessEntityRouter.insertEntity(mapa) ;
        System.out.println("\n### GET ENTITY RESPONSE " + result);
        
    }
    
    public void getEntity(String id, String clase) throws Exception{
        System.out.println("\n### GET ENTITY WITH ID " + id);
        HashMap<String, String> mapa = new HashMap<String, String> ();
        mapa.put("ID", id);
		mapa.put("CLASS", clase);
        String result = businessEntityRouter.getEntity(mapa) ;
        System.out.println("\n### GET ENTITY RESPONSE " + result);
    }
    
    public void queryEntity(String query, String clase) throws Exception{
        System.out.println("\n### GET ENTITY WITH ID " + query);
        HashMap<String, String> mapa = new HashMap<String, String> ();
        mapa.put("QUERY", query);
		mapa.put("CLASS", clase);
        String result = businessEntityRouter.queryEntity(mapa) ;
        System.out.println("\n### GET ENTITY RESPONSE " + result);
    }
    
    public void queryCatalog(String query, String clase) throws Exception{
        System.out.println("\n### GET ENTITY WITH ID " + query);
        HashMap<String, String> mapa = new HashMap<String, String> ();
        mapa.put("QUERY", query);
		mapa.put("CLASS", clase);
        String result = businessEntityRouter.queryCatalog(mapa) ;
        System.out.println("\n### GET ENTITY RESPONSE " + result);
    }
    
    public static void main(String[] args) throws MalformedURLException {
        Client client = new Client();
        try {
        	/*Mensaje mensaje = new Mensaje();
        	mensaje.setData("{}");
        	mensaje.setEntityName("Cuaps");
        	mensaje.setOperation("INSERT");
        	*/
        	StringBuffer buffer = new StringBuffer();
        	
        	/*buffer.append( "{");
        	buffer.append("	\"cscUsuario\": 1, ");
        	buffer.append("	\"chrNombre\":\"Pedro\", ");
			buffer.append("	\"chrAmaterno\":\"Infante\", ");
			buffer.append("	\"chrApaterno\":\"Garcia\", ");
			buffer.append("	\"chrEmail\":\"doswaldo74@gmail.com\", ");
			buffer.append("	\"cDependencia\": {"
					+ "  \"cscDependencia\" : 1 "
					+ "}  "
					+ "");
			buffer.append("	} ");*/
		
			/*ObjectMapper mapper = new ObjectMapper();
			try {
				JsonNode node = mapper.readTree(new File( "/home/develop/Desktop/Develop/Software/Sedesol/catalogoProgramasService/catalogoProgramasCliente/src/main/java/com/sedesol/catProgramas/soap/client/jsonTest/convenio.json"));
				buffer.append(node.toString());
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}*/
			
			/*
			buffer.append( "{");
        	buffer.append("	\"chrDescripcion\":\"Otra Dependencia\" ");
			buffer.append("	} ");*/
			
            //client.insertEntity(buffer.toString(), "ConvenioDocumento");
            //client.saveEntity(buffer.toString(), "Convenio");
			//client.getEntity("1", "Convenio");
			/*String queryStr =  "Select e from ProgramasSociale e where e.chrNombrePrograma like '%PROG 1%'" ; 
            client.queryEntity(queryStr, "ProgramasSociale");*/
          
			/*String queryStr =  "Select c from ConvenioDocumento c where c.convenio.cscConvenio = 1 " ;
			client.queryCatalog(queryStr, "ConvenioDocumento");*/
			
			/*String queryStr =  "SELECT c FROM Usuario c" ;
			client.queryCatalog(queryStr, "Usuario");*/
            
       
			/*String queryStr =  "SELECT c FROM CDerSocialBieEco c" ;
			client.queryCatalog(queryStr, "CDerSocialBieEco");*/
			
			/*String queryStr =  "SELECT c FROM CInciProyecto c" ;
			client.queryCatalog(queryStr, "CInciProyecto");*/
			
        	
        	/*String queryStr =  "SELECT c FROM CCriterioSeleccionPoblacion c" ;
			client.queryCatalog(queryStr, "CCriterioSeleccionPoblacion");*/
        	
			/*String queryStr =  "SELECT c FROM CPeriodicidad c" ;
			client.queryCatalog(queryStr, "CPeriodicidad");*/
			
			/*String queryStr =  "SELECT c FROM CCarenciasSociale c" ;
			client.queryCatalog(queryStr, "CCarenciasSociale");*/
			
			/*queryStr =  "SELECT c FROM CIdentificadorEjecutorFondo c" ;
			client.queryCatalog(queryStr, "CIdentificadorEjecutorFondo");*/
			
			/*String queryStr =  "SELECT c FROM CDescripcionFondo c" ;
			client.queryCatalog(queryStr, "CDescripcionFondo");*/
			
			/*queryStr =  "SELECT c FROM CVertiente c" ;
			client.queryCatalog(queryStr, "CVertiente");
			
			queryStr =  "SELECT c FROM CTipoApoyoVertiente c" ;
			client.queryCatalog(queryStr, "CTipoApoyoVertiente");
			
            /*
            String queryStr =  "SELECT c FROM CDescripcionFondo c " ;
            client.queryEntity(queryStr, "CDescripcionFondo");*/
            
        	String queryStr =  "SELECT c FROM Proyecto c" ;
			client.queryCatalog(queryStr, "Proyecto");
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }

}
