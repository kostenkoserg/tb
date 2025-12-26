package org.tradebeans.gateway.core.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import io.quarkus.jackson.ObjectMapperCustomizer;
import jakarta.inject.Singleton;
import org.tradebeans.gateway.api.ApiMessage;
import org.tradebeans.gateway.api.TestMessage;

@Singleton
public class ApiMessageCustomizer implements ObjectMapperCustomizer {

    @Override
    public void customize(ObjectMapper mapper) {

        register(mapper, TestMessage.class);
//        register(mapper, TestMessage1.class);
//        register(mapper, TestMessage2.class);
//        register(mapper, TestMessage3.class);
//        register(mapper, TestMessage4.class);
    }

    private void register(ObjectMapper mapper, Class<? extends ApiMessage> type) {
        mapper.registerSubtypes(
                new NamedType(type, type.getSimpleName())
        );
    }
}
