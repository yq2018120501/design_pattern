package com.yq.design.principle.openclose;

import java.math.BigDecimal;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96,"java从零到企业级电商开发",348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName() + " 课程原价:" + javaCourse.getOrignPrice() + " 课程折后价格:" + javaCourse.getPrice());
    }
}
