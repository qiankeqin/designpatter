package com.spring4all.designpattern.pattern.behavioral.command;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-13 19:59
 */
public class Test {
    public static void main(String[] args) {
        CourceVideo courceVideo = new CourceVideo();
        courceVideo.setName("Java开发");

        Command command = new OpenCourseVideo(courceVideo);
        Command command1 = new CloseCourseVideo(courceVideo);
        Stack stack = new Stack();
        stack.addCommand(command);
        stack.addCommand(command1);

        stack.executeCommand();

    }
}