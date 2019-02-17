package com.yq.design.principle.compositionaggeregation;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class PostgreSQLConnection implements DBConnection{
    public String getConnection() {
        return "PostgreSQL数据连接";
    }
}
