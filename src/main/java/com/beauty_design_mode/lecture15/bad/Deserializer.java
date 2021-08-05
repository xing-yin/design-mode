package com.beauty_design_mode.lecture15.bad;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.Map;

/**
 * @author Alan Yin
 * @date 2021/8/5
 */

public class Deserializer {

    private final String IDENTIFIER_STRING = "UEUEUE:";
    private Gson gson;

    public Deserializer() {
        this.gson = new Gson();
    }

    public Map<String, String> deserialize(String text) {
        if (!text.startsWith(IDENTIFIER_STRING)) {
            return Collections.emptyMap();
        }
        String gsonStr = text.substring(IDENTIFIER_STRING.length());
        return gson.fromJson(gsonStr, Map.class);
    }

}
