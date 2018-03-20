package com.jefcorp.naimjeem.todoapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by naim on 3/20/18.
 */

public class DbFunctions extends SQLiteOpenHelper {

  private static final String DATABASE_NAME = "mydb";
  private static final String TABLE_NAME = "mytable";

  private static final String TAB_ID = "id";
  private static final String TAB_NAME = "name";
  private static final String TAB_PHONE = "phone";

  DbFunctions(Context c) {
    super(c, DATABASE_NAME, null, 1);
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
    String queryString = "CREATE TABLE " + TABLE_NAME + " (" + TAB_ID + " INTEGER PRIMARY KEY, " + TAB_NAME + " TEXT, " + TAB_PHONE + " TEXT)";
    db.execSQL(queryString);
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int i, int i1) {

  }

  // Insert Data to DB
  public void addData(DataTemp dt) {
    SQLiteDatabase sqd = this.getWritableDatabase();
    ContentValues cv = new ContentValues();

    cv.put(TAB_NAME, dt.getName());
    cv.put(TAB_PHONE, dt.getPhone());

    sqd.insert(TABLE_NAME, null, cv);
    sqd.close();
  }
}
