package com.sds.study.sqliteapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/*
   안드로이드에서는 SQLite 데이터베이스의 위치가 이미
    /data/data/앱패키지/databases 로 정해져 있기 때문에
    오직 SQLiteOpenHelper 라는 클래스를 통해 접근 및 제어
    해야 한다... ( 즉 임의로 개발자가 디렉토리에 접근 불가)
    String name : 생성할  db 파일명
    int version : 최초의 버전 넘버
 */
public class MyHelper extends SQLiteOpenHelper{
    String TAG;

    public MyHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        TAG=this.getClass().getName();
    }

    /*
    데이터베이스가 최초에 생성될때 호출...
    즉 파일이 존재하지 않을때 이 메서드가 호출..
    */
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d(TAG, "onCreate 호출");
        /*어플리케이션에 필요한 테이블은 이 시점에 구축하자!*/
        StringBuffer sql= new StringBuffer();
        sql.append("create  table member(");
        sql.append("member_id integer primary key autoincrement");
        sql.append(", id varchar(20)");
        sql.append(", password varchar(20)");
        sql.append(");");

        sqLiteDatabase.execSQL(sql.toString());
        Log.d(TAG, "데이터베이스 구축");
    }

    /*
     파일이 이미 존재하나, 버전 숫자가 틀린 경우
     개발자가 무언가를 db 에 변경하겠다는 의도로 생각하고,
     아래의 메서드를 호출한다..
     */
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Log.d(TAG, "onUpgrade 호출");
    }
}
