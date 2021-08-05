package com.practice.Adapter;

import com.practice.Adapter.src.Turkey;
import com.practice.Adapter.src.TurkeyApapter;
import com.practice.Adapter.src.WildTurkey;

/**
 * @author yinxing
 * @date 2019/6/26
 */

public class AdapterTest {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        TurkeyApapter apapter = new TurkeyApapter(turkey);
        apapter.quack();
    }
}
