package com.yq.design.principle.openclose;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by Mr.Yang on 2019/2/15 0015.
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOrignPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        BigDecimal bigDecimal = new BigDecimal(super.getPrice());
        BigDecimal bigDecimal2 = new BigDecimal(0.8);
        BigDecimal result = bigDecimal.multiply(bigDecimal2);
        DecimalFormat df = new DecimalFormat("#.00");
        String str = df.format(result);

        return Double.valueOf(str);
    }
}
