package com.spring4all.designpattern.principle.singleresponsibility;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-18 20:57
 **/
public class BirdTest {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMod("大雁");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMod("大雁");

        RunBird runBird = new RunBird();
        runBird.mainMoveMod("企鹅");

    }
}
