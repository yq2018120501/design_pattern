package com.yq.design.principle.compositionaggeregation;

import org.omg.CORBA.PUBLIC_MEMBER;
import sun.dc.pr.PRError;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class ProduceDao{

    private DBConnection dbConnection;
    //setter注入
    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public  void  addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
