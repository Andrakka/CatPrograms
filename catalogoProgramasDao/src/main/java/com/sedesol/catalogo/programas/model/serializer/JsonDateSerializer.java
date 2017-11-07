package com.sedesol.catalogo.programas.model.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JsonDateSerializer extends JsonSerializer<Date>{
                @Override
                public void serialize(Date date, JsonGenerator gen, SerializerProvider provider)
                                                throws IOException, JsonProcessingException {
                                                Calendar cal = Calendar.getInstance();
                                                int anioAct = cal.get(Calendar.YEAR);
                                                cal.setTime(date);
                                                int anio = cal.get(Calendar.YEAR);
                                                if(anio <1900){
                                                    cal.set(Calendar.YEAR, anioAct);
                                                }
                                                String formattedDate = new SimpleDateFormat("dd/MM/yyyy").format(cal.getTime());
                                                gen.writeString(formattedDate);
                 }
}