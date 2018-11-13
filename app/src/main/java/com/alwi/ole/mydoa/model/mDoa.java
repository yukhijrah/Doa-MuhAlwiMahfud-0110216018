package com.alwi.ole.mydoa.model;

/**
 * Created by ole on 11/13/18.
 */

public class mDoa {
    private String judul;
    private String ayat;
    private String arti;

    public mDoa(String judul, String ayat, String arti) {
        this.judul = judul;
        this.ayat = ayat;
        this.arti = arti;
    }

    public String getNama() {
        return judul;
    }

    public String getSurah() {
        return ayat;
    }

    public String getArti() {
        return arti;
    }
}
