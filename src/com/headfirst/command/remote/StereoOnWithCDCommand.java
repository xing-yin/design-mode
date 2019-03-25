package com.headfirst.command.remote;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    /**
     * 如同LightOnCommand的做法一样，传入音响的实例，
     * 然后将其存储在局部实例变量中
     *
     * @param stereo
     */
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
