package com.beauty_design_mode.lecture39_40.v4;

import com.beauty_design_mode.lecture39_40.v3.*;

import java.util.*;

/**
 * 继承后的重构优化
 *
 * @author Alan Yin
 * @date 2020/10/19
 */

public class EmailReporter extends ScheduledReporter {

    private static final Long DAY_HOURS_IN_SECONDS = 86400L;

    // 兼顾灵活性和代码的可测试性，这个构造函数继续保留
    public EmailReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer statViewer) {
        super(metricsStorage, aggregator, statViewer);
    }

    public EmailReporter(List<String> emailToAddress) {
        this(new RedisMetricsStorage(), new Aggregator(), new EmailViewer(emailToAddress));
    }

    public void startDailyReport() {
        Date firstTime = trimTimeFieldsToZeroOfNextDayV1();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                long durationInMillis = DAY_HOURS_IN_SECONDS * 1000;
                long endTimeInMillis = System.currentTimeMillis();
                long startTimeInMillis = endTimeInMillis - durationInMillis;
                doStartAndReport(startTimeInMillis, endTimeInMillis);
            }
        }, firstTime, DAY_HOURS_IN_SECONDS * 1000);
    }

    /**
     * 设置成protected而非private是为了方便写单元测试
     * <p>
     * 但我们发现这个函数的可测试性仍然不好，因为它强依赖当前的系统时间。
     * 一般的解决方法是，将强依赖的部分通过参数传递进来，这有点类似我们之前讲的依赖注入。(见 trimTimeFieldsToZeroOfNextDayV2)
     */
    protected Date trimTimeFieldsToZeroOfNextDayV1() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 不再强依赖当前的系统时间，所以非常容易对其编写单元测试
     *
     * @param date
     * @return
     */
    protected Date trimTimeFieldsToZeroOfNextDayV2(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // 重新设置时间
        calendar.add(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }


}
