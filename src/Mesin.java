/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEUTIA KHANANDIYA
 */
public class Mesin {

    private String idMesin, tipeMesin;
    private int kapasitasMesin;
    private Motor idRangka;

    Mesin(String id, String tipe, int kapasitas, Motor idRang) {
        idMesin = id;
        tipeMesin = tipe;
        kapasitasMesin = kapasitas;
        idRangka = idRang;
    }

    public void setIDMesin(String id) {
        idMesin = id;
    }

    public String getIDMesin() {
        return idMesin;
    }

    public void setTipeMesin(String tipe) {
        tipeMesin = tipe;
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    public void setKapasitasMesin(int kapasitas) {
        kapasitasMesin = kapasitas;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setIDRangka(Motor idRang) {
        idRangka = idRang;
    }

    public Motor getIDRangka() {
        return idRangka;
    }

    public void info() {
        System.out.println("Data Mesin");
        System.out.println("");
        System.out.println("No.Mesin : " + getIDMesin());
        System.out.println("Tipe Mesin : " + getTipeMesin());
        System.out.println("Kapasitas Silinder : " + getKapasitasMesin() + " CC");
        System.out.println("Mesin Untuk Rangka : " + idRangka.getIDRangka());
    }
}
