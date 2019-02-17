package com.yq.design.principle.liskowsubstitution;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class Test {
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+ rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("resize方法结束==》" + "width:"+ rectangle.getWidth() + " length:" + rectangle.getLength());
    }

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);

        Square square = new Square();
//        square.setLength(20);
//        resize(square);
    }
}
