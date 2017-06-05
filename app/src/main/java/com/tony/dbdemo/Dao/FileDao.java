package com.tony.dbdemo.Dao;

import com.tony.dbdemo.db.BaseDao;

/**
 * Created by Tony on 2017/6/5.
 */

public class FileDao extends BaseDao{

    @Override
    protected String createTable() {
        return "create table if not exists tb_file(time varchar(20),path varchar(10),decription varchar(20))";
    }
}
