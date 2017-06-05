package com.tony.dbdemo.db;

import java.util.List;

/**
 * Created by Tony on 2017/6/4.
 */

public interface IBaseDao<T> {
    /**
     * 插入对象到数据库
     * @param entity
     * @return
             */
    Long insert(T entity);

    /**
     * 修改数据
     * @param entity
     * @param where
     * @return
     */
    int update(T entity,T where);

    /**
     * 删除数据
     * @param where
     * @return
     */
    int delete(T where);

    /**
     * 查询数据
     */
    List<T> query(T where);

    List<T> query(T where,String orderBy,Integer startIndex,Integer limit);





}
