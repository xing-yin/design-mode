package com.beauty_design_mode.lecture18.demo3.good;

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

    private Updater updater;

    public ScheduledUpdater(Updater updater, long initialDelayInSeconds, long periodInSeconds) {
        this.initialDelayInSeconds = initialDelayInSeconds;
        this.periodInSeconds = periodInSeconds;
        this.updater = updater;
    }

    public void run() {
        executorService.scheduleAtFixedRate(() -> {
            updater.update();
        }, this.initialDelayInSeconds, this.periodInSeconds, TimeUnit.SECONDS);
    }

}
