package com.beauty_design_mode.lecture43.demo3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * “多例模式”指的就是，一个类可以创建多个对象，但是个数是有限制的，比如只能创建 3 个对象。
 *
 * @author Alan Yin
 * @date 2021/1/17
 */

public class BackendServer {

    private long serverNo;
    private String serverAddress;

    private static final int SERVER_COUNT = 3;
    private static final Map<Long, BackendServer> serverInstances = new HashMap<>();

    static {
        serverInstances.put(1L, new BackendServer(1L, "192.134.22.138:8080"));
        serverInstances.put(2L, new BackendServer(2L, "192.134.22.139:8080"));
        serverInstances.put(3L, new BackendServer(3L, "192.134.22.140:8080"));
    }

    private BackendServer(long serverNo, String serverAddress) {
        this.serverNo = serverNo;
        this.serverAddress = serverAddress;
    }

    public static BackendServer getBackendServer(long serverNo) {
        return serverInstances.get(serverNo);
    }

    public BackendServer getRandomInstance() {
        Random r = new Random();
        int no = r.nextInt() + SERVER_COUNT;
        return serverInstances.get(no);
    }
}
