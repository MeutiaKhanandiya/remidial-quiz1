/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEUTIA KHANANDIYA
 */

class Motor {
private String jenisMotor,merkMotor,idRangka;

    Motor(String jenisMotor,String merkMotor, String idRangka){
        
        this.jenisMotor = jenisMotor;
        this.merkMotor = merkMotor;
        this.idRangka = idRangka;
    }
    
    public void setIDRangka(String idRangka){
        this.idRangka = idRangka;
    }
    public String getIDRangka(){
        return idRangka;
    }
    
    public void setJenisMotor(String jenisMotor){
        this.jenisMotor = jenisMotor;
    }
    
    public String getJenisMotor(){
        return jenisMotor;
    }
    
    public void setMerkMotor(String merkMotor){
        this.merkMotor = merkMotor;
    }
    
    public String getMerkMotor(){
        return merkMotor;
    }
    
    public void info(){
        System.out.println("Data Umum Motor");
        System.out.println("");
        System.out.println("No.Seri Rangka : "+getIDRangka());
        System.out.println("Jenis Motor : "+getJenisMotor());
        System.out.println("Merk Motor : "+getMerkMotor());
    }
}
