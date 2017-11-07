package com.sedesol.catalogo.programas.model.serializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class JsonDateDeserializer extends JsonDeserializer<Date> {
    
    @Override
    public Date deserialize(JsonParser jsonparser,
                            DeserializationContext deserializationcontext) 
                            throws IOException, JsonProcessingException {
                            
                            String date = jsonparser.getText();
                            try {
                                Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(date);
                                Calendar cal = Calendar.getInstance();
                                int anioAct = cal.get(Calendar.YEAR);
                                cal.setTime(fecha);
                                int anio = cal.get(Calendar.YEAR);
                                if(anio <1900){
                                    cal.set(Calendar.YEAR, anioAct);
                                }
                                return cal.getTime();
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }

                        }
}
