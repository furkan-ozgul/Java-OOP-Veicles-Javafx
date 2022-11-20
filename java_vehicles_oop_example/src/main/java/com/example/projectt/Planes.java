package com.example.projectt;

public class Planes extends Parent {
    private final String ulke ;
    private final int yukKapasitesi;
    private final int kanatAcikligi ;

    Planes(int yolcu , String model , String ulke , int yil,String maxSpeed,int yukKapasitesi,int kanatAcikligi, String agirlik,String fiyat){
        this.yolcu=yolcu;
        this.model=model;
        this.ulke=ulke;
        this.yil=yil;
        this.maxSpeed=maxSpeed;
        this.yukKapasitesi=yukKapasitesi;
        this.kanatAcikligi=kanatAcikligi;
        this.agirlik=agirlik;
        this.fiyat=fiyat;
    }



    public String getUlke() {
        return ulke ;
    }


    public int getYukKapasitesi(){
        return yukKapasitesi;
    }


    public int getKanatAcikligi(){
        return kanatAcikligi;
    }



}
