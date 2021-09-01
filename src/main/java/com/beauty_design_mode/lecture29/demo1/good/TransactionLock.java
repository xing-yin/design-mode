package com.beauty_design_mode.lecture29.demo1.good;

import com.beauty_design_mode.lecture29.demo1.support.RedisDistributedLock;

/**
 * 演示：如何测试单例？（如第三方的单例）
 * 单例相当于一个全局变量，我们无法 mock（无法继承和重写方法），也无法通过依赖注入的方式来替换。
 *
 * @author Alan Yin
 * @date 2021/8/30
 */

public class TransactionLock {

    public boolean lock(String id) {
        return RedisDistributedLock.getSingletonIntance().lockTransction(id);
    }

    public void unlock(String id) {
        RedisDistributedLock.getSingletonIntance().unlockTransction(id);
    }
    
}
