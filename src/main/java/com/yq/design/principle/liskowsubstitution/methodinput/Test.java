package com.yq.design.principle.liskowsubstitution.methodinput;

import java.util.HashMap;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
