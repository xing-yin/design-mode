package com.beauty_design_mode.lecture18.demo3.bad;

import com.beauty_design_mode.lecture18.demo3.good.Updater;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Alan Yin
 * @date 2021/8/12
 */

public class ScheduledUpdater {

    private final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    private long initialDelayInSeconds;

    private long periodInSeconds;

    private Config config;

    public ScheduledUpdater(Config config, long initialDelayInSeconds, long periodInSeconds) {
        this.initialDelayInSeconds = initialDelayInSeconds;
        this.periodInSeconds = periodInSeconds;
        this.config = config;
    }

    public void run() {
        executorService.scheduleAtFixedRate(() -> {
            config.update();
        }, this.initialDelayInSeconds, this.periodInSeconds, TimeUnit.SECONDS);
    }

}
