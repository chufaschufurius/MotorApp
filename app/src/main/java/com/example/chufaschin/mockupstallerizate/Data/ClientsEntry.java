package com.example.chufaschin.mockupstallerizate.Data;

import java.io.Serializable;

/**
 * Created by CHUFASCHIN on 04/03/2015.
 */
public class ClientsEntry implements Serializable {

//    private int id;
        //        public static final String COLUMN_ID = BaseColumns._ID;
    public static final String TABLE_NAME = "CLIENTS";
    public static final String DNI = "dni";
    public static final String FK_PLATE = "fk_plate";
    public static final String NAME = "name";
    public static final int PHONE =0;
    public static final String SURNAME="surname";

    public static String getDNI() {
        return DNI;
    }

    public static String getFkPlate() {
        return FK_PLATE;
    }

    public static String getNAME() {
        return NAME;
    }

    public static int getPHONE() {
        return PHONE;
    }

    public static String getSURNAME() {
        return SURNAME;
    }

    @Override
        public String toString() {
            return "ClientsEntry{" +
                    "QUESTIONS='" + TABLE_NAME + '\'' +
                    ", DNI='" + DNI + '\'' +
                    ", FK_PLATE='" + FK_PLATE + '\'' +
                    ", NAME='" + NAME + '\'' +
                    ", PHONE='" + PHONE + '\'' +
                    ", SURNAME='" + SURNAME + '\'' +
                    '}';
        }

        public String getTableName() {
            return TABLE_NAME;
        }
//
//
//        public String getDNI() {
//            return DNI;
//        }
//        public void setDNI(int DNI) {ClientsEntry.DNI=DNI;}
//
//        public void setMOTOR_NUMBER(int MOTOR_NUMBER) {
//        CarsEntry.MOTOR_NUMBER = MOTOR_NUMBER;
//    }
//
//        public String getFK_PLATE() {
//            return FK_PLATE;
//        }
//        public void setFK_PLATE(String FK_PLATE){CarsEntry.PLATE;}
//
//        public String getNAME() {
//            return NAME;
//        }
//        public void setNAME(String NAME) {
//            ClientsEntry.NAME=NAME;
//        }
//
//        public int getPHONE() {
//            return PHONE;
//        }
//
//        public String getSURNAME() {
//        return SURNAME;
//    }
//
//        public void setRIGHT(int RIGHT) {
//            ClientsEntry.RIGHT = RIGHT;
//        }
//
//        public int getWRONG() {
//            return WRONG;
//        }
//
//        public void setWRONG(int WRONG) {
//            ClientsEntry.WRONG = WRONG;
//        }
    }


