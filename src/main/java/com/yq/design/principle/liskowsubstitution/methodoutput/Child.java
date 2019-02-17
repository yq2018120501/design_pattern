package com.yq.design.principle.liskowsubstitution.methodoutput;

import com.yq.design.principle.liskowsubstitution.methodoutput.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class Child extends Base {
    HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}
