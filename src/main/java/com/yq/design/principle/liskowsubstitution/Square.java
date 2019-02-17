package com.yq.design.principle.liskowsubstitution;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class Square extends Quadrangle{
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    long getWidth() {
        return sideLength;
    }

    long getLength() {
        return sideLength;
    }

    //    public long getSideLength() {
//        return sideLength;
//    }
//
//    public void setSideLength(long sideLength) {
//        this.sideLength = sideLength;
//    }
//
//    @Override
//    public long getWidth() {
//        return getSideLength();
//    }
//
//    @Override
//    public void setLength(long length) {
//        setSideLength(length);
//    }
//
//    @Override
//    public void setWidth(long width) {
//        setSideLength(width);
//    }
//
//    @Override
//    public long getLength() {
//        return getSideLength();
//    }
}
