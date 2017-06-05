package com.tony.dbdemo.Bean;

import com.tony.dbdemo.db.annotion.DbField;
import com.tony.dbdemo.db.annotion.DbTable;

/**
 * Created by Tony on 2017/6/4.
 */

@DbTable("tb_user")
public class User {
    @DbField("userId")
    public Integer userId;
    @DbField("name")
    public String name;
    @DbField("password")
    public String password;

    public User(Integer userId, String name, String password) {
        this.userId = userId;
        this.name = name;
        this.password = password;
    }

    public User(){

    }

    @Override
    public String toString() {
        return "userId "+userId+" name "+name+" password "+password;
    }
}
