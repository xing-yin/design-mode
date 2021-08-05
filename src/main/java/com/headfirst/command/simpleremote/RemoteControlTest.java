package com.headfirst.command.simpleremote;

public class RemoteControlTest {

    public static void main(String[] args) {
        // 遥控器就是调用者
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 创建电灯对象，就是请求的接受者
        Light light = new Light();
        // 创建一个命令，然后将接收者传给它
        LightOnCommand lightOn = new LightOnCommand(light);

        // 把命令传给调用者
        remote.setCommand(lightOn);
        // 模拟按下按钮
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen =
                new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }

}
