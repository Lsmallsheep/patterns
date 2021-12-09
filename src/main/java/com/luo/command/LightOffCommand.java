package com.luo.command;

/**
 *
 *@Author ANGEL
 *@Date 2021/12/9 20:07
 *
 */
public class LightOffCommand implements Command {

    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
