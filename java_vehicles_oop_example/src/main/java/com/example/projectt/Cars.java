package com.example.projectt;

public class Cars extends Parent  {
    private final String marka ;
    private final String renk ;
    private final double motor ;
    private final String vites ;
    private final int kapi ;


    Cars(int yil , String model, String marka , double motor,String vites,String renk,String maxSpeed,int yolcu,int kapi,String agirlik,String fiyat){
        this.yil=yil;
        this.model=model;
        this.marka=marka;
        this.motor=motor;
        this.vites=vites;
        this.renk=renk;
        this.maxSpeed = maxSpeed;
        this.yolcu=yolcu;
        this.kapi=kapi;
        this.agirlik=agirlik;
        this.fiyat = fiyat ;
    }

    public String getMarka(){
        return marka ;
    }
    public String getRenk(){
        return renk ;
    }
    public double getMotor(){
        return motor;
    }
    public String getVites (){
        return vites;
    }
    public int getKapi(){
        return kapi;
    }


}

