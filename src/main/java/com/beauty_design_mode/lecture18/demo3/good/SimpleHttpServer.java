package com.beauty_design_mode.lecture18.demo3.good;

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

    private Map<String, List<Viewer>> viewers = new HashMap<>();

    public SimpleHttpServer(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void addViewers(String urlDirector, Viewer viewer) {
        if (!viewers.containsKey(urlDirector)) {
            viewers.put(urlDirector, new ArrayList<>());
        }
        this.viewers.get(urlDirector).add(viewer);
    }

    public void run(){}

}
