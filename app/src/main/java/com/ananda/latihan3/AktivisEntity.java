package com.ananda.latihan3;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
/*
Tanggal Pengerjaan      : Senin, 27 April 2020
Deskripsi Pengerjaan    : activity ini membuat inisiasi data dari nama,emal dan zona tugas dengan membuatkan set dan getnya
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */

@Entity
public class AktivisEntity {


    //
    @PrimaryKey(autoGenerate = true)
    private int idAktivis;
    @ColumnInfo(name = "namaAktivis")
    private String namaAktivis;
    @ColumnInfo(name = "emailAktivis")
    private String emailAktivis;
    @ColumnInfo(name = "zonaTugas")
    private String zonaTugas;

    public int getIdAktivis() {
        return idAktivis;
    }

    public void setIdAktivis(int idAktivis) {
        this.idAktivis = idAktivis;
    }

    public String getNamaAktivis() {
        return namaAktivis;
    }

    public void setNamaAktivis(String namaAktivis) {
        this.namaAktivis = namaAktivis;
    }

    public String getEmailAktivis() {
        return emailAktivis;
    }

    public void setEmailAktivis(String emailAktivis) {
        this.emailAktivis = emailAktivis;
    }

    public String getZonaTugas() {
        return zonaTugas;
    }

    public void setZonaTugas(String zonaTugas) {
        this.zonaTugas = zonaTugas;
    }
}
