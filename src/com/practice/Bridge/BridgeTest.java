package com.practice.Bridge;

import com.practice.Bridge.src.*;

/**
 * @author yinxing
 * @date 2019/6/28
 */

public class BridgeTest {

    public static void main(String[] args) {
        TV sony = new Sony();
        AbstractRemoteControl remoteControl1 = new ConcreteRemoteControl1(sony);
        remoteControl1.on();
        remoteControl1.tuneChannel();
        remoteControl1.off();

        TV apple = new Sony();
        AbstractRemoteControl remoteControl2 = new ConcreteRemoteControl2(apple);
        remoteControl2.on();
        remoteControl2.tuneChannel();
        remoteControl2.off();

    }
}
