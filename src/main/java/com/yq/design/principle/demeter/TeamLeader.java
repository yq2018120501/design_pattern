package com.yq.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public class TeamLeader {
    public void checkNumberOfCourses(){
        List<Course> courses = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("在线课程数量：" + courses.size());
    }
}
