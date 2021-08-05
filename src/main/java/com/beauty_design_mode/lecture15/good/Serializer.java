package com.beauty_design_mode.lecture15.good;


import com.google.gson.Gson;

import java.util.Collections;
import java.util.Map;

/**
 * @author Alan Yin
 * @date 2021/8/5
 */

public class Serializer {

    private final String IDENTIFIER_STRING = "UEUEUE:";

    private Gson gson;

    public Serializer() {
        this.gson = new Gson();
    }

    public String serialize(Map<String, String> object) {
        StringBuilder textBuilder = new StringBuilder();
        textBuilder.append(IDENTIFIER_STRING);
        textBuilder.append(gson.toJson(object));
        return textBuilder.toString();
    }

    public Map<String, String> deserialize(String text) {
        if (!text.startsWith(IDENTIFIER_STRING)) {
            return Collections.emptyMap();
        }
        String gsonStr = text.substring(IDENTIFIER_STRING.length());
        return gson.fromJson(gsonStr, Map.class);
    }

}
