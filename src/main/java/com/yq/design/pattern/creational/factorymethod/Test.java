package com.yq.design.pattern.creational.factorymethod;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
