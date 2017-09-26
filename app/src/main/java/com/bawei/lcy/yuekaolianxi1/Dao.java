package com.bawei.lcy.yuekaolianxi1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 *
 * Created by LCY on 2017/9/20.
 */

public class Dao {
    SqliteOpenHereper hereper;
    SQLiteDatabase database;
    public Dao(Context context){
        hereper = new SqliteOpenHereper(context);
        database = hereper.getWritableDatabase();
    }

    public boolean add(String createdAt,String desc,String publishedAt,String source){
        ContentValues values = new ContentValues();
        values.put("createdAt",createdAt);
        values.put("desc",desc);
        values.put("publishdAt",publishedAt);
        values.put("source",source);
        long i = database.insert("person", null, values);
        if(i!=-1){
            return true;
        }else{
            return false;
        }



    }
}
