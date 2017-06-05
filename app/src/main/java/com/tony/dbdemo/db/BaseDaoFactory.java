package com.tony.dbdemo.db;

import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

/**
 * Created by Tony on 2017/6/4.
 */

public class BaseDaoFactory {
    private String sqliteDatabasePath;
    private SQLiteDatabase sqLiteDatabase;

    private static BaseDaoFactory Instence = new BaseDaoFactory();

    public static BaseDaoFactory getInstence(){
        return Instence;
    }

    public BaseDaoFactory(){
        sqliteDatabasePath = Environment.getExternalStorageDirectory().getAbsolutePath()+"/teacher.db";
        openDatabase();
    }

    private void openDatabase() {
        this.sqLiteDatabase = SQLiteDatabase.openOrCreateDatabase(sqliteDatabasePath,null);
    }

    public synchronized <T extends BaseDao<M>,M> T getDataHelper(Class<T> clazz, Class<M> entityClass){
        BaseDao baseDao = null;
        try {
            baseDao = clazz.newInstance();
            baseDao.init(entityClass,sqLiteDatabase);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) baseDao;
    }


}
