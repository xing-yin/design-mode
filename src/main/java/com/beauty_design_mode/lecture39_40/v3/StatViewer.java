package com.beauty_design_mode.lecture39_40.v3;


import com.beauty_design_mode.lecture39_40.v3.model.RequestStat;

import java.util.Map;

/**
 * V3: 将统计数据显示到终端。
 * 我们将这部分逻辑剥离出来，设计成两个类：ConsoleViewer 类和 EmailViewer 类，分别负责将统计结果显示到命令行和邮件中。
 *
 * @author Alan Yin
 * @date 2020/10/19
 */

public interface StatViewer {

    /**
     * 显示输出
     *
     * @param requestStats
     * @param startTimeInMills
     * @param endTimeInMills
     */
    void output(Map<String, RequestStat> requestStats, long startTimeInMills, long endTimeInMills);

}
