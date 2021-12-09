package com.luo.command;

/**
 * @Author ANGEL
 * @Date 2021/12/9 21:08
 */
public class Test {

    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

//        remoteController.onButtonWasPushed(0);
//        remoteController.undoButton();
//        remoteController.offButtonWasPushed(0);
//        remoteController.undoButton();


        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        remoteController.setCommand(1,tvOnCommand,tvOffCommand);
        remoteController.onButtonWasPushed(1);


    }

}
