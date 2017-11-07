package com.sedesol.catalogo.programas.model.dao.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import com.sedesol.catalogo.programas.model.dao.DataEntity;
import com.sedesol.catalogo.programas.model.pojo.Convenio;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.persistence.Query;

public class DataEntityImpl implements DataEntity {
	private EntityManager em;
    public void setEntityManager(EntityManager em) { 
        this.em = em;
    }

    @Override
    public void add(Object entity) {
        em.persist(entity);
        em.flush();
    }
    
    public void save(Object entity) {
        em.merge(entity);
        em.flush();
    }
    
  
    
	public String  saveEntityJpa(@Body HashMap<String,String> info, Exchange exchange){
		String strReturn = "OK";
        if(em != null){
			ObjectMapper mapper = new ObjectMapper();
			try{
				String clase = info.get("CLASS");
				String mensaje = info.get("DATA");
				strReturn = clase;
				Object entity = null;
				mapper.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
				entity = mapper.readValue(mensaje, Class.forName("com.sedesol.catalogo.programas.model.pojo." + clase));
				
				if (entity!=null) this.save(entity);
			}catch(Exception ex){
				ex.printStackTrace();
				strReturn = " Error Jpa " +  ex.getMessage();
			}
        }
        return strReturn;
	}
	
	public String insertEntityJpa(@Body HashMap<String,String> info, Exchange exchange){
    	
		String strReturn = "OK";
        if(em != null){
			ObjectMapper mapper = new ObjectMapper();
			try{
				String clase = info.get("CLASS");
				String mensaje = info.get("DATA");
				strReturn = clase;
				Object entity = null;
				mapper.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
				entity = mapper.readValue(mensaje, Class.forName("com.sedesol.catalogo.programas.model.pojo." + clase));
				
				if (entity!=null) this.add(entity);
			}catch(Exception ex){
				strReturn = " Error Jpa " +  ex.getMessage();
			}
        }
        return strReturn;
	}
	
	public String  getJpaEntity(@Body HashMap<String,String> info, Exchange exchange){
		String json = "{}";
        if(em != null){
			try{
				String clase = info.get("CLASS");
				String clave = info.get("ID");
				Long id = new Long(clave);
				long idLong = id.longValue();
				Object entity = null;
				
				ObjectMapper mapper = new ObjectMapper();
				/*DateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy");
				mapper.getSerializationConfig().with(myDateFormat); 
				mapper.getDeserializationConfig().with(myDateFormat); 
				mapper.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));*/
				//ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
				
				entity = em.find(Class.forName("com.sedesol.catalogo.programas.model.pojo." + clase), idLong);
				json = mapper.writeValueAsString(entity);
				//json = ow.writeValueAsString(entity);
			}catch(JsonMappingException jEx){
				json = "{ \"error\": \"" + jEx.toString() + "\" }" ;
			}catch(Exception ex){
				json = "{ \"error\": \"" + ex.toString() + "\" }" ;
			}
        }
        return json;
	}
	
	public String  queryJpaEntity(@Body HashMap<String,String> info, Exchange exchange){
		String json = "{}";
        if(em != null){
			try{
				String query = info.get("QUERY");
				
				ObjectMapper mapper = new ObjectMapper();
				/*DateFormat myDateFormat = new SimpleDateFormat("dd-MM-yyyy");
				mapper.getSerializationConfig().with(myDateFormat); 
				mapper.getDeserializationConfig().with(myDateFormat); 
				mapper.setDateFormat(new SimpleDateFormat("dd-MM-yyyy"));*/
				//ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
				
				Query queryObj = em.createQuery(query);
			    @SuppressWarnings("rawtypes")
				List list= queryObj.getResultList();
			    json = mapper.writeValueAsString(list);
			    //json = ow.writeValueAsString(list);
			}catch(JsonMappingException jEx){
				json = "{ \"error\": \"" + jEx.toString() + "\" }" ;
			}catch(Exception ex){
				json = "{ \"error\": \"" + ex.toString() + "\" }" ;
			}
        }
        return json;
	}
	
	public String  queryJpaCatalog(@Body HashMap<String,String> info, Exchange exchange){
		String json = "{}";
        if(em != null){
			try{
				String query = info.get("QUERY");
				
				ObjectMapper mapper = new ObjectMapper();
				/*DateFormat myDateFormat = new SimpleDateFormat("dd-MM-yyyy");
				mapper.getSerializationConfig().with(myDateFormat); 
				mapper.getDeserializationConfig().with(myDateFormat); 
				mapper.setDateFormat(new SimpleDateFormat("dd-MM-yyyy"));*/
				
				//ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
				
				Query queryObj = em.createQuery(query);
			    @SuppressWarnings("rawtypes")
				List list= queryObj.getResultList();
			    json = mapper.writeValueAsString(list);
			    
			    //json = ow.writeValueAsString(list);
			}catch(JsonMappingException jEx){
				json = "{ \"error\": \"" + jEx.toString() + "\" }" ;
			}catch(Exception ex){
				json = "{ \"error\": \"" + ex.toString() + "\" }" ;
			}
        }
        return json;
	}
	/*
	 * 
	 */
	public String  queryJpaCatalogPaging(@Body HashMap<String,String> info, Exchange exchange){
		String json = "{}";
        if(em != null){
			try{
				String query = info.get("QUERY");
				String strStart = info.get("START");
				String limit = info.get("LIMIT");
				String where = info.get("WHERE");
				String orderBy = info.get("ORDER_BY");
				String clase =  info.get("CLASS");
				orderBy = orderBy!=null?orderBy.trim():"";
				if(!orderBy.equals("")){
					if(!orderBy.contains("order by")){
						orderBy = " order by "+orderBy;
					}				
				}
				Integer start= new Integer(strStart);
				ObjectMapper mapper = new ObjectMapper();
				Query queryObj = em.createQuery("Select count(e) from "+clase+" e "+where);
				Long count = (Long)queryObj.getSingleResult();
				queryObj = em.createQuery(query+" "+where+" "+orderBy);
			    @SuppressWarnings("rawtypes")
				List list= queryObj.setFirstResult(start).setMaxResults(new Integer(limit))
						.getResultList();
			    String registros ="";
			    registros = mapper.writeValueAsString(list);
			    json = "{ \"total\": \"" + count + "\","
			    		+ "\"registros\":"+registros+" }" ;
			    //json = ow.writeValueAsString(list);
			}catch(JsonMappingException jEx){
				json = "{ \"error\": \"" + jEx.toString() + "\" }" ;
			}catch(Exception ex){
				json = "{ \"error\": \"" + ex.toString() + "\" }" ;
			}
        }
        return json;
	}
}
