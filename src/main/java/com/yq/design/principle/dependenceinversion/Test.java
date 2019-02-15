package com.yq.design.principle.dependenceinversion;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public class Test {
    public static void main(String[] args) {
         //v1
//        Geely geely = new Geely();
//        geely.studyFeCourse();
//        geely.studyJavaCourse();

        //v2 接口方法注入的方式
//        Geely geely = new Geely();
//        geely.studyImoocCourse(new JavaCourse());
//        geely.studyImoocCourse(new FECourse());
//        geely.studyImoocCourse(new PythonCourse());

        //v3构造器注入
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyImoocCourse();

        //v4使用setter注入的方式
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyImoocCourse();

        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();


    }
}
