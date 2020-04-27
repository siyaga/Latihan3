package com.ananda.latihan3;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/*
Tanggal Pengerjaan      : Senin, 27 April 2020
Deskripsi Pengerjaan    : activity ini membuat Databasenya untuk room database
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    //
    public abstract AktivisDao aktivisDao();
}
