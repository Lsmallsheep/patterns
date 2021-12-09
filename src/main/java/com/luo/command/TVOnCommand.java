package com.luo.command;

/**
 *
 *@Author ANGEL
 *@Date 2021/12/9 20:07
 *
 */
public class TVOnCommand implements Command {

    TVReceiver lightReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.lightReceiver = tvReceiver;
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
