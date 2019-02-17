package com.yq.design.principle.compositionaggeregation;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class Test {
    public static void main(String[] args) {
        ProduceDao produceDao = new ProduceDao();
        produceDao.setDbConnection(new PostgreSQLConnection());
        produceDao.addProduct();
    }
}

