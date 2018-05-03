package com.example.ertugrul.med.Modal;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ERTUGRUL on 03.05.2018.
 */

public class MyDataBaseClass {

    private static MyDataBaseClass INSTANCE;
    private static Context context;

    private static SQLiteDatabase database;
    private static MySQLiteHelper myhelper;


    public MyDataBaseClass() {

        myhelper = new MySQLiteHelper(context);
    }

    public static MyDataBaseClass getInstance(Context context) {

        MyDataBaseClass.context = context;

        if(INSTANCE == null){
            INSTANCE = new MyDataBaseClass();
        }
        return INSTANCE;
    }


    public List<Medicine> getAllMedsData() {
        List<Medicine> MedList = new ArrayList<Medicine>();

        openDB();

        String sql = "SELECT * FROM Medicine";

        Medicine med;

        Cursor cr = database.rawQuery(sql,null);

        if(cr != null && cr.getCount()!= 0){

            //cr.moveToFirst();
            while (cr.moveToNext()){
                med = new Medicine();
                med.setId(cr.getInt(0));
                med.setName(cr.getString(cr.getColumnIndex("name")));
                med.setPrice(cr.getString(cr.getColumnIndex("price")));

                MedList.add(med);
            }
        }


        closeDB();


        return MedList;
    }

    private void closeDB() {
        database.close();
    }

    private void openDB() throws SQLException {
        database = myhelper.getWritableDatabase();
    }
}
