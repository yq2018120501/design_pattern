package com.yq.design.principle.singleresponsibility;


import com.yq.design.principle.singleresponsibility.class_.FlyBird;
import com.yq.design.principle.singleresponsibility.class_.WalkBird;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
