package com.example.chufaschin.mockupstallerizate.Data;

import android.graphics.Bitmap;
import android.provider.BaseColumns;

/**
 * Created by CHUFASCHIN on 29/01/2015.
 */
public class Data {

    public Data() {
    }

    public static abstract class CarsEntry implements
            BaseColumns {
        //        public static final String COLUMN_ID = BaseColumns._ID;
        public static final String BRAND = "brand";
        public static final String MODEL = "model";
        public static final String MOTOR_NUMBER = "motor_number";
        public static final String OWNER = "owner";
        public static final String PLATE = "plate";
        public static final String TASK = "task";
        public static final String TABLE_NAME = "cars";
    }

    public static abstract class ClientsEntry implements
            BaseColumns {
        //        public static final String COLUMN_ID = BaseColumns._ID;
        public static final String SURNAME = "surname";
        public static final String FK_PLATE = "plate";
        public static final String NAME = "name";
        public static final String EMAIL = "email";
        public static final String DNI = "user";
        public static final String PHONE = "phone";
        public static final String TABLE_NAME = "clients";
    }
}