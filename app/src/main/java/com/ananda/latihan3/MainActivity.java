package com.ananda.latihan3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
/*
Tanggal Pengerjaan      : Senin, 27 April 2020
Deskripsi Pengerjaan    : activity ini Menampilkan Data
NIM                     : Ananda Marwanaya Putra
Nama                    : 10117157
Kelas                   : IF-4

 */

public class MainActivity extends AppCompatActivity {
    private AktivisEntity aktivisEntity;
    public static AppDatabase db;

    //Atribut untuk mendisplay hasil data
    List<AktivisEntity> aktivisEntities = new ArrayList<>();
    List<AktivisEntity> aktivisEntityListByZone = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "aktivis")
                .allowMainThreadQueries().build();

        //Tambah Data
        aktivisEntity = new AktivisEntity();
        aktivisEntity.setNamaAktivis("Ananda Marwanaya Putra");
        aktivisEntity.setEmailAktivis("ananda@gmail.com");
        aktivisEntity.setZonaTugas("Bandung");

        Log.d("TAMBAH", "Tambah Data Aktivis");
        Log.d("TAMBAH","====================");
        Log.d("TAMBAH","Nama : "+aktivisEntity.getNamaAktivis());
        Log.d("TAMBAH","Email : "+aktivisEntity.getEmailAktivis());
        Log.d("TAMBAH","Zona : "+aktivisEntity.getZonaTugas());

        db.aktivisDao().tambahAktivis(aktivisEntity);

        //Tampil Seluruh Data
        Log.d("TAMPIL","Tampil seluruh Data aktivis");
        Log.d("TAMPIL","===========================");

        aktivisEntities = db.aktivisDao().tampilSeluruhAktivitas();

        for (int i = 0; i<aktivisEntities.size(); i++){
            Log.d("TAMPIL","Data Ke-"+(i+1));
            Log.d("TAMPIL","Nama : "+aktivisEntities.get(i).getNamaAktivis());
            Log.d("TAMPIL","Email : "+aktivisEntities.get(i).getEmailAktivis());
            Log.d("TAMPIL","Zona : "+aktivisEntities.get(i).getZonaTugas());
            Log.d("TAMPIL","=========================");
        }

        //Tampil Berdasarkan Zona
        Log.e("ZONE","Data Aktivis berdasarkan Zona");
        Log.e("ZONE","===================");
        aktivisEntityListByZone = db.aktivisDao().findByZone("Bandung");
        for (int i = 0; i<aktivisEntityListByZone.size();i++){
            Log.e("ZONE","Data Aktivis ke="+(i+1));
            Log.e("ZONE",aktivisEntityListByZone.get(i).getNamaAktivis());
            Log.e("ZONE",aktivisEntityListByZone.get(i).getEmailAktivis());
            Log.e("ZONE",aktivisEntityListByZone.get(i).getZonaTugas());
            Log.e("ZONE","===================");
        }

    }
}
