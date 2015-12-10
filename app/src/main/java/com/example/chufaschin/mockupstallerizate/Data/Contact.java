package com.example.chufaschin.mockupstallerizate.Data;

import android.graphics.Bitmap;
import android.provider.BaseColumns;

/**
 * Created by CHUFASCHIN on 29/01/2015.
 */
public class Contact{

    public Contact() {
    }

    public static abstract class CarsEntry implements
            BaseColumns {
//        public static final String COLUMN_ID = BaseColumns._ID;
        public static final String BRAND = "brand";
        public static final String MODEL="model";
        public static final String MOTOR_NUMBER = "motor_number";
        public static final String OWNER="owner";
        public static final String PLATE= "plate";
        public static final String TASK= "task";
        public static final String TABLE_NAME = "cars";
    }

    public static abstract class ClientsEntry implements
            BaseColumns {
//        public static final String COLUMN_ID = BaseColumns._ID;
        public static final String ID_THEME = "id_theme";
        public static final String FK_ID_COURSE = "id_course";
        public static final String NAME = "name";
        public static final int ACCURACY=0;
        public static final String TABLE_NAME = "clients";
    }
}