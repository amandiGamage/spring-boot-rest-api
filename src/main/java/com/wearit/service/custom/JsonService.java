package com.wearit.service.custom;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

/**
 * Created by Amandi on 8/31/2018.
 */
public interface JsonService {
    public JsonNode toJsonNode(Object object)throws IOException;
}
