package com.tony.dbdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tony.dbdemo.Bean.File;
import com.tony.dbdemo.Bean.User;
import com.tony.dbdemo.Dao.FileDao;
import com.tony.dbdemo.Dao.UserDao;
import com.tony.dbdemo.db.BaseDaoFactory;
import com.tony.dbdemo.db.IBaseDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    IBaseDao<User> baseDao;
    IBaseDao<File> fileDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseDao = BaseDaoFactory.getInstence().getDataHelper(UserDao.class,User.class);
        //fileDao = BaseDaoFactory.getInstence().getDataHelper(FileDao.class,File.class);

    }

    public void save(View v){
        for (int i = 0; i < 10; i++) {
            User user = new User(i+1,"Tony"+i,"123456");
            baseDao.insert(user);
        }


        /*File file = new File("2017-6-5","data/data/path","插入文件操作记录");
        fileDao.insert(file);*/

    }

    public void update(View v){
        User where = new User();
        where.userId=1;

        User user = new User(2,"David","123456789");
        baseDao.update(user,where);
    }

    public void delete(View v){
        User user = new User();
        user.name="David";
        baseDao.delete(user);
    }

    public void query(View v){
        User where = new User();
        where.name="David";
        where.userId=1;
        List<User> list = baseDao.query(where);
        Log.i(MainActivity.class.getName(),"查询到 "+list.size()+" 条数据");
        for (User user : list){
            Log.i(MainActivity.class.getName(),user.toString());
        }
    }

}
