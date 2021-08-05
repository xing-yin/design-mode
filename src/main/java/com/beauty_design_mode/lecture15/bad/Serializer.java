package com.beauty_design_mode.lecture15.bad;


import com.google.gson.Gson;

import java.util.Collections;
import java.util.Map;

/**
 * [建议]不管是应用设计原则还是设计模式，最终的目的还是提高代码的可读性、可扩展性、复用性、可维护性等。
 * 我们在考虑应用某一个设计原则是否合理的时候，也可以以此作为最终的考量标准。
 *
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

    /**
     * 虽然经过拆分之后，Serializer 类和 Deserializer 类的职责更加单一了，但也随之带来了新的问题。
     * 如果我们修改了协议的格式，数据标识从“UEUEUE”改为“DFDFDF”，或者序列化方式从 JSON 改为了 XML，
     * 那 Serializer 类和 Deserializer 类都需要做相应的修改，代码的内聚性显然没有原来 Serialization 高了。
     *
     * 而且，如果我们仅仅对 Serializer 类做了协议修改，而忘记了修改 Deserializer 类的代码，那就会导致序列化、反序列化不匹配，程序运行出错。
     * 也就是说，拆分之后，代码的可维护性变差了。
     */

}
