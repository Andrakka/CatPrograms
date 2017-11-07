package com.sedesol.catProgramas.soap.dataService;

import java.util.HashMap;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "BusinessEntityService")
public interface BusinessEntityRouter {
	public String saveEntity(@WebParam(name="id") HashMap<String,String> info);
	public String insertEntity(@WebParam(name="id") HashMap<String,String> info);
	public String deleteEntity(@WebParam(name="id") HashMap<String,String> info);
	public String getEntity(@WebParam(name="id") HashMap<String,String> info);
	public String queryEntity(@WebParam(name="id") HashMap<String,String> info);
	public String queryCatalog(@WebParam(name="id") HashMap<String,String> info);
	public String queryCatalogPaging(@WebParam(name="id") HashMap<String,String> info);
}