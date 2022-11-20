package com.example.projectt;

public class Ships extends Parent{

    private final String type ;
    private final int aracYolcu;

    Ships(String model, int yil , String type, String maxSpeed , String agirlik , int yolcu, int aracYolcu, String fiyat){
        this.agirlik=agirlik;
        this.yil=yil;
        this.type=type;
        this.maxSpeed=maxSpeed;
        this.model=model;
        this.yolcu=yolcu;
        this.aracYolcu = aracYolcu;
        this.fiyat=fiyat;
    }

    public String getType(){
        return type ;
    }

    public int getAracYolcu(){
        return aracYolcu;
    }
}




