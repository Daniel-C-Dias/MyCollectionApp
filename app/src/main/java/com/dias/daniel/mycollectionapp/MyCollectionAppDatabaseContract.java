package com.dias.daniel.mycollectionapp;


public final class MyCollectionAppDatabaseContract {

    private MyCollectionAppDatabaseContract() {}

    public static final class PlatformEntry {
        
        public static final String TABLE_NAME = "Platform";
        public static final String COLUMN_ID = "Id";
        public static final String COLUMN_NAME = "Name";

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " , " + COLUMN_NAME + ")";
    }

    public static final class FormEntry {
        
        public static final String TABLE_NAME = "Form";
        public static final String COLUMN_ID = "Id";
        public static final String COLUMN_NAME = "Name";

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " , " + COLUMN_NAME + ")";
    }

    public static final class VideoGameEntry {
        
        public static final String TABLE_NAME = "VideoGame";
        public static final String COLUMN_ID = "Id";
        public static final String COLUMN_NAME = "Name";
        public static final String COLUMN_PLATFORM_ID = "PlatformId";
        public static final String COLUMN_FORM_ID = "FormId"

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " , " + COLUMN_NAME + " , " + COLUMN_PLATFORM_ID + " , " + COLUMN_FORM_ID + ")";
    }

}