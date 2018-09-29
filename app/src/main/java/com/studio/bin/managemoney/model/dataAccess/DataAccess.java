package com.studio.bin.managemoney.model.dataAccess;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataAccess extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "ManageMoney";
    // Table WORK_MONTH
    private static final String TABLE_WORK_MONTH = "WORK_MONTH";
    private static final String COLUNM_ID_WORK = "ID_WORK";
    private static final String COLUNM_NAME_WORK = "NAME_WORK";
    private static final String COLUNM_MONEY_GOAL_OF_MONTH = "MONEY_GOAL_OF_MONTH";
    private static final String COLUNM_DATE_OF_GOAL = "DATE_OF_GOAL";
    // Table WORK_DATE
    private static final String TABLE_WORK_DATE = "WORK_DATE";
    private static final String COLUNM_ID_WORK_DATE = "ID_WORK_DATE";
    private static final String COLUNM_ID_WORK_FT = "ID_WORK";
    private static final String COLUNM_MONEY_GOAL_OF_DATE = "MONEY_GOAL_OF_DATE";
    private static final String COLUNM_ACTION_DATE = "ACTION_DATE";
    private static final String COLUNM_STATUS = "STATUS";

    public DataAccess(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreateTABLE_WORK_MONTH = "CREATE TABLE " + TABLE_WORK_MONTH + "("
                + COLUNM_ID_WORK + " INT NOT NULL PRIMARY KEY AUTOINCREMENT,"
                + COLUNM_NAME_WORK + " TEXT NOT NULL ,"
                + COLUNM_MONEY_GOAL_OF_MONTH + " DOUBLE NOT NULL,"
                + COLUNM_DATE_OF_GOAL + " DATE NOT NULL)";

        String sqlCreateTABLE_WORK_DATE = "CREATE TABLE " + TABLE_WORK_DATE + "("
                + COLUNM_ID_WORK_DATE + " INT NOT NULL PRIMARY KEY AUTOINCREMENT,"
                + COLUNM_ID_WORK_FT + " INT NOT NULL,"
                + COLUNM_STATUS + " INT NOT NULL ,"
                + COLUNM_MONEY_GOAL_OF_DATE + " DOUBLE NOT NULL,"
                + COLUNM_ACTION_DATE + " DATE NOT NULL,"
                +" CONSTRAINT FK_ID_WORK FOREIGN KEY("
                + COLUNM_ID_WORK_FT + ") REFERENCES "
                + TABLE_WORK_MONTH + "("
                + COLUNM_ID_WORK + ") ON DELETE CASCADE)";

        db.execSQL(sqlCreateTABLE_WORK_MONTH);
        db.execSQL(sqlCreateTABLE_WORK_DATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
