package com.challengerocket.app.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class CustomDateDeserializer extends JsonDeserializer<Date> {
    private static final String[] DATE_FORMATS = new String[]{
            "yyyy-MM-dd",
            "dd-MM-yyyy"
    };

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException {
        String date = jsonParser.getText();
        for (String format : DATE_FORMATS) {
            try {
                return new SimpleDateFormat(format).parse(date);
            } catch (ParseException e) {
                // Ignorar excepción y probar el siguiente formato
            }
        }
        throw new IOException("Unparseable date: " + date);
    }
}
