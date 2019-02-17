package com.yq.design.principle.liskowsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class Child extends Base {
//    @Override  //重写
//    public void method(HashMap map) {
//        System.out.println("子类被执行");
//    }
    //重载
    public void method(Map map) {
        System.out.println("子类被执行");
    }
}
