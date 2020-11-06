package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class ageSerialize extends StdSerializer<Integer> {

    public ageSerialize() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer age, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (age == null) {
            gen.writeNumber(0);
        } else {
            gen.writeNumber(age);
        }
    }
}
