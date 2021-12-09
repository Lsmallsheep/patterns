package com.luo.command;

/**
 *
 *@Author ANGEL
 *@Date 2021/12/9 20:07
 *
 */
public class TVOffCommand implements Command {

    TVReceiver lightReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.lightReceiver = tvReceiver;
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
