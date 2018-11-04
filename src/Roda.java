/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEUTIA KHANANDIYA
 */
public class Roda {

    private int diameterVelg;
    private String tipeBan,merkBan,diameterBan;
    private Motor idRangka;

    public Roda(String dBan, String tipe, String merk, int dVelg, Motor idRang) {
        this.diameterBan = dBan;
        this.tipeBan = tipe;
        this.merkBan = merk;
        this.diameterVelg = dVelg;
        this.idRangka = idRang;
    }
    
    public void setIDRangka(Motor idRang){
        this.idRangka=idRang;
    }
    
    public Motor getIDRangka(){
        return idRangka;
    }
    
    public void setDiameterBan(String dBan){
        this.diameterBan=dBan;
    }
    
    public String getDiameterBan(){
        return diameterBan;
    }
    
    public void setTipeBan(String type){
        this.tipeBan=type;
    }
    
    public String getTipeBan(){
        return tipeBan;
    }
    
    public void setMerkBan(String merk){
        this.merkBan=merk;
    }
    
    public String getMerkBan(){
        return merkBan;
    }
    
    public void setDiameterVelg(int dVelg){
        this.diameterVelg=dVelg;
    }
    
    public int getDiameterVelg(){
        return diameterVelg;
    }
    
    public void info(){
        System.out.println("Data Roda");
        System.out.println("");
        System.out.println("Diameter Ban : "+getDiameterBan());
        System.out.println("Tipe Ban : "+getTipeBan());
        System.out.println("Merk Ban : "+getMerkBan());
        System.out.println("Diameter Velg : "+getDiameterVelg());
        System.out.println("Roda Untuk Rangka : "+idRangka.getIDRangka());
    }
}
