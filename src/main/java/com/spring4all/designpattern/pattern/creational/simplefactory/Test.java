package com.spring4all.designpattern.pattern.creational.simplefactory;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 22:26
 **/
public class Test {
    public static void main(String[] args) {
//        Video javaVideo = new JavaVideo();
//        javaVideo.produce();
//
//        Video pythonVideo = new PythonVideo();
//        pythonVideo.produce();

//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        video.produce();
//        video = videoFactory.getVideo("python");
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        video.produce();

    }
}
