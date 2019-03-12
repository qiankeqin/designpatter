package com.spring4all.designpattern.pattern.behavioral.command;

/**
 * @author qiankeqin
 * @Description: 关闭课程命令实现
 * @date 2019-03-12 13:19
 */
public class CloseCourseVideo implements Command {

    private CourceVideo courceVideo;

    public CloseCourseVideo(CourceVideo courceVideo) {
        this.courceVideo = courceVideo;
    }

    @Override
    public void execute() {
        this.courceVideo.close();
    }
}