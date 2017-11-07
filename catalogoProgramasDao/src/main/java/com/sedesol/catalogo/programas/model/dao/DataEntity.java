package com.sedesol.catalogo.programas.model.dao;

import java.util.HashMap;

import org.apache.camel.Body;
import org.apache.camel.Exchange;

public interface DataEntity {
	void add(Object entity);
    public String  saveEntityJpa(@Body HashMap<String,String> info, Exchange exchange);
    public String  insertEntityJpa(@Body HashMap<String,String> info, Exchange exchange);
    public String  getJpaEntity(@Body HashMap<String,String> info, Exchange exchange);
    public String  queryJpaEntity(@Body HashMap<String,String> info, Exchange exchange);
    public String  queryJpaCatalog(@Body HashMap<String,String> info, Exchange exchange);
    public String  queryJpaCatalogPaging(@Body HashMap<String,String> info, Exchange exchange);
}
