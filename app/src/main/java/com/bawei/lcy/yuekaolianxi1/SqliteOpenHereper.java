package com.bawei.lcy.yuekaolianxi1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by LCY on 2017/9/20.
 */

public class SqliteOpenHereper extends SQLiteOpenHelper{
    public SqliteOpenHereper(Context context) {
        super(context, "user.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table person(id integer primary key autoincrement,createdAt varchar(50),desc varchar(50),publishedAt varchar(50),source varchar(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
