package com.sedesol.catalogo.programas.model.serializer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.util.StdConverter;

public class MyDateConverter extends StdConverter<String, Date> {
    @Override
    public Date convert(final String value) {
        if (value == null || value.equals("NULL")) {
            return null;
        }
        try {
            return new SimpleDateFormat("dd-MMM-yyyy").parse(value);
        } catch (ParseException e) {
            throw new IllegalStateException("Unable to parse date", e);
        }
    }
}
