package com.csnote.Bridge.src;

public class Client {

    public static void main(String[] args) {

        RemoteControl remoteControl1 = new ConcreteRemoteControl1(new RCA());

        remoteControl1.on();
        remoteControl1.off();

        remoteControl1.tuneChannel();
    }
}
