package com.beauty_design_mode.lecture39_40.v3;

import com.beauty_design_mode.lecture39_40.support.Gson;
import com.beauty_design_mode.lecture39_40.v3.model.RequestStat;

import java.util.Map;

/**
 * @author Alan Yin
 * @date 2020/10/19
 */

public class ConsoleViewer implements StatViewer {

    @Override
    public void output(Map<String, RequestStat> requestStats, long startTimeInMills, long endTimeInMills) {
        System.out.println("Time span:[" + startTimeInMills + "," + endTimeInMills + "]");
        Gson gson = new Gson();
        System.out.println(gson.toJson2(requestStats));
    }

}
