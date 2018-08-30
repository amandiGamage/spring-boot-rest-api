package com.wearit.service.custom.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wearit.service.custom.JsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by Amandi on 8/31/2018.
 */
@Service
public class JsonServiceImpl  implements JsonService{
    @Autowired
    ObjectMapper objectMapper;
    @Override
    public JsonNode toJsonNode(Object object) throws IOException {
        JsonNode jsonNode = objectMapper.convertValue(object, JsonNode.class);
        return jsonNode;
    }
}
