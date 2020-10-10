package com.beauty_design_mode.lecture76.demo1;

import sun.util.BuddhistCalendar;
import sun.util.locale.provider.LocaleProviderAdapter;
import sun.util.spi.CalendarProvider;

import java.util.*;

/**
 * 参考 jdk Calendar 使用工厂模式和构建者模式
 *
 * @author Alan Yin
 * @date 2020/9/10
 */

public class MyCalendar {

    /**
     * 工厂模式
     *
     * @return
     */
    public static MyCalendar getInstance() {
        return createCalendar(TimeZone.getDefault(), Locale.getDefault(Locale.Category.FORMAT));
    }

    private static MyCalendar createCalendar(TimeZone zone,
                                             Locale aLocale) {
        /// do something
        return null;
    }

    // ------------------------------------------------------------------------------------------------------------------------

    private long instant;
    private int nextStamp;
    private String type;
    private boolean lenient = true;

    public void setInstant(long instant) {
        this.instant = instant;
    }

    public void setNextStamp(int nextStamp) {
        this.nextStamp = nextStamp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLenient(boolean lenient) {
        this.lenient = lenient;
    }

    /**
     * 构建者模式
     */
    public static class Builder {
        private long instant;
        private int nextStamp;
        private String type;
        private boolean lenient = true;

        public Builder() {
        }

        public Builder setInstant(long instant) {
            this.instant = instant;
            return this;
        }

        public Builder setNextStamp(int nextStamp) {
            this.nextStamp = nextStamp;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setLenient(boolean lenient) {
            this.lenient = lenient;
            return this;
        }

        public MyCalendar build() {
            MyCalendar calendar = new MyCalendar();
            /// do something
            return calendar;
        }
    }
}
