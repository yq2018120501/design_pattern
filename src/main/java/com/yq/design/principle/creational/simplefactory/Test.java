package com.yq.design.principle.creational.simplefactory;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class Test {
    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null){
            return;
        }
        video.produce();
    }
}
