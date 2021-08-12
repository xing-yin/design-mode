package com.beauty_design_mode.lecture18.demo3.bad;

import com.beauty_design_mode.lecture18.demo3.good.Viewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Alan Yin
 * @date 2021/8/12
 */

public class SimpleHttpServer {

    private String host;

    private int port;

    private Map<String, List<Config>> configs = new HashMap<>();

    public SimpleHttpServer(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void addViewers(String urlDirector, Config config) {
        if (!configs.containsKey(urlDirector)) {
            configs.put(urlDirector, new ArrayList<>());
        }
        this.configs.get(urlDirector).add(config);
    }

    public void run() {
    }

}
