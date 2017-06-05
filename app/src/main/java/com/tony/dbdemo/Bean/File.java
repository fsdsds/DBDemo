package com.tony.dbdemo.Bean;

import com.tony.dbdemo.db.annotion.DbField;
import com.tony.dbdemo.db.annotion.DbTable;

/**
 * Created by Tony on 2017/6/5.
 */

@DbTable("tb_file")
public class File {

    @DbField("time")
    public String time;
    @DbField("path")
    public String path;
    @DbField("decription")
    public String decription;

    public File() {
    }

    public File(String time, String path, String decription) {
        this.time = time;
        this.path = path;
        this.decription = decription;
    }
}
