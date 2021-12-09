package com.luo.facade;

/**
 * @Author ANGEL
 * @Date 2021/12/5 20:10
 */
public class Center {

    //todo 外观模式

    private Popcorn popcorn;
    private DVDPlayer dvdPlayer;
    private Project project;
    private Stereo stereo;
    private Screen screen;

    public Center() {
        this.popcorn = Popcorn.getPopcorn();
        this.dvdPlayer = DVDPlayer.getDVDPlayer();
        this.project = Project.getScreen();
        this.stereo = Stereo.getStereo();
        this.screen = Screen.getScreen();
    }
    public void ready(){
        popcorn.on();
        popcorn.working();
        screen.on();
        screen.down();
        project.on();
        project.focus();
        stereo.on();
        dvdPlayer.on();
    }
    public void play(){
        dvdPlayer.play();
    }
    public void pause(){
        dvdPlayer.pause();
    }
    public void over(){
        dvdPlayer.off();
        project.off();
        stereo.off();
        screen.up();
    }

}
