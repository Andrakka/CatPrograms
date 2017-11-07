package com.sedesol.catProgramas.soap.notificationService;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import javax.mail.*;
import javax.mail.internet.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sedesol.catProgramas.soap.model.Entity;

public class EmailService {
	
	Session session = null; 
	
    public void init(){}

    public Entity sendEmail(@Body Entity entidad,Exchange exchange){
    	Entity entidadReturn = new Entity("test");
        return entidadReturn;
    }
    
    
    private void Conexion(){
		Properties props = new Properties();
		ResourceBundle recursos = ResourceBundle.getBundle("application");
		
	    props.put("mail.smtp.host", recursos.getString("mail.smtp.host"));
	    props.put("mail.smtp.auth", recursos.getString("mail.smtp.auth"));
	    props.put("mail.smtp.port", recursos.getString("mail.smtp.port")); 

	    this.session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
	                            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                ResourceBundle recursos = ResourceBundle.getBundle("application");
	                //return new PasswordAuthentication("doswaldo74@gmail.com","sierrasoft/()%!");
	                return new PasswordAuthentication(recursos.getString("mail.smtp.user"),recursos.getString("mail.smtp.password"));
	            }
	        });
	}
	
	public void sendMail(String document){
	    /*try {
	    	ObjectMapper mapper = new ObjectMapper();
	    	mapper.re .re .readValue(new File(Utils.getProperty("config.jsonPath")+ configuracion ), Estructura.class);
	    	JsonObject object = document.content();
	        Message message = new MimeMessage(this.session);
	        message.setFrom(new InternetAddress(object.getString("from")));
	        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(object.getString("to")));
	        message.setSubject(object.getString("subject"));
	        Plantillas template = new Plantillas(object);
	        String emailBody = template.getTemplate().toString();
	        
	        message.setContent(emailBody, "text/html");
	        //message.setText("Test Mail");
	        System.out.println("Antes");
	        Transport.send(message);
	        System.out.println("Done");
	    } catch (MessagingException e) {
	        //throw new RuntimeException(e);
	    	e.printStackTrace();
	    }*/
	}
	
	
	public static void main(String[] args) {
		EmailService email = new EmailService();
		/*JsonObject obj = JsonObject.create();
		
		obj.put("from", "dsierra@hopewellsystem.com");
    	obj.put("to", "doswaldo74@gmail.com");
    	obj.put("subject", "Prueba de Envio");  
    	obj.put("confirm", "123456788");  
    	
    	obj.put("url", "http://localhost:8080/citas/controlacceso/verificar/changePasswordEmail.do?email="+ obj.getString("to")+ "&confirm=" + obj.getString("confirm"));  
    	
		JsonDocument document = JsonDocument.create("id", obj);
		email.sendMail(document);*/
	}
	
   
}
