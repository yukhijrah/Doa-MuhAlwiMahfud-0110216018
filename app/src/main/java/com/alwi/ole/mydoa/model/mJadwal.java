package com.alwi.ole.mydoa.model;

/**
 * Created by ole on 11/13/18.
 */

public class mJadwal {
    private String waktu;
    private  String jam;

    public mJadwal(String waktu, String jam){
        this.waktu=waktu;
        this.jam=jam;
    }

    public String getWaktu(){
        return waktu;
    }
    public String getJam(){
        return jam;
    }

}
