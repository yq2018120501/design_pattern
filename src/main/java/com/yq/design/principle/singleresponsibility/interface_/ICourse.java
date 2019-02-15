package com.yq.design.principle.singleresponsibility.interface_;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
