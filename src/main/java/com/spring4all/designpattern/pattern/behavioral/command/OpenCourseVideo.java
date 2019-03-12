package com.spring4all.designpattern.pattern.behavioral.command;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-12 13:18
 */
public class OpenCourseVideo implements Command {


    private CourceVideo courceVideo;

    public OpenCourseVideo(CourceVideo courceVideo) {
        this.courceVideo = courceVideo;
    }

    @Override
    public void execute() {
        this.courceVideo.open();
    }
}