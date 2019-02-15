package com.yq.design.principle.dependenceinversion;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public class Geely {

    private ICourse iCourse;

// 3   public Geely(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }

//4
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
// 2   public void studyImoocCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }
}
