package com.luo.command;/**
 *
 *@Author ANGEL
 *@Date 2021/12/9 20:07
 *
 */
public class LightOnCommand implements Command {

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
