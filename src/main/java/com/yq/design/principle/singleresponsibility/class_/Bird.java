package com.yq.design.principle.singleresponsibility.class_;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName + "用脚走");
        }else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
