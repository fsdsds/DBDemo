package com.tony.dbdemo.Dao;

import com.tony.dbdemo.db.BaseDao;

/**
 * Created by Tony on 2017/6/4.
 */

public class UserDao extends BaseDao {
    @Override
    public String createTable() {
        return "create table if not exists tb_user(userId integer(4),name varchar(20),password varchar(10))";
    }
}
