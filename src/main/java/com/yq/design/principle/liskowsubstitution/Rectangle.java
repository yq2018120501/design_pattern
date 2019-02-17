package com.yq.design.principle.liskowsubstitution;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class Rectangle extends Quadrangle{
    private long length;
    private long width;

    long getWidth() {
        return width;
    }

    long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

//    public long getWidth() {
//        return width;
//    }
//
//    public void setWidth(long width) {
//        this.width = width;
//    }
//
//    public long getLength() {
//        return length;
//    }
//
//    public void setLength(long length) {
//        this.length = length;
//    }
}
