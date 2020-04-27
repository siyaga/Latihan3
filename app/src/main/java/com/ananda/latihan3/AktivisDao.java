package com.ananda.latihan3;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

/*
Tanggal Pengerjaan      : Senin, 27 April 2020
Deskripsi Pengerjaan    : interface ini membuat query
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */
@Dao
public interface AktivisDao {
    //
    @Insert
    void tambahAktivis(AktivisEntity aktivisEntity);

    @Delete
    public void hapusAktivitas(AktivisEntity aktivisEntity);

    @Query("SELECT * FROM AktivisEntity")
    List<AktivisEntity> tampilSeluruhAktivitas();

    @Query("SELECT * FROM AktivisEntity WHERE zonaTugas Like :zona")
    List<AktivisEntity> findByZone(String zona);
}
