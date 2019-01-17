package com.dias.daniel.mycollectionapp;


public final class MyCollectionAppDatabaseContract {

    private MyCollectionAppDatabaseContract() {}

    public static final class PlatformEntry implements BaseColumns {
        
        public static final String TABLE_NAME = "Platform";
        public static final String COLUMN_NAME = "Name";

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + 
        _ID + " INTEGER PRIMARY KEY, " + 
        COLUMN_NAME + " TEXT NOT NULL" +")";
    }

    public static final class FormEntry {
        
        public static final String TABLE_NAME = "Form";
        public static final String COLUMN_NAME = "Name";

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + 
        _ID + " INTEGER PRIMARY KEY, " + 
        COLUMN_NAME + " TEXT NOT NULL"+ ")";
    }

    public static final class VideoGameEntry {
        
        public static final String TABLE_NAME = "VideoGame";
        public static final String COLUMN_NAME = "Name";
        public static final String COLUMN_PLATFORM_ID = "PlatformId";
        public static final String COLUMN_FORM_ID = "FormId"

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
         _ID + " INTEGER PRIMARY KEY, " + 
         COLUMN_NAME + " TEXT NOT NULL, " + 
         COLUMN_PLATFORM_ID + " INTEGER NOT NULL, " + 
         COLUMN_FORM_ID + " INTEGER NOT NULL" + ")";
    }

}