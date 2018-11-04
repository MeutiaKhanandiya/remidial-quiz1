/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEUTIA KHANANDIYA
 */
public class Suspensi {

    private String idSuspensi, jenisSuspensi, merkSuspensi;
    private Motor idRangka;

    public Suspensi(String id, String jenis, String merk, Motor idRang) {
        idSuspensi = id;
        jenisSuspensi = jenis;
        merkSuspensi = merk;
        idRangka = idRang;
    }

    public void setIDSuspensi(String id) {
        idSuspensi = id;
    }

    public String getIDSuspensi() {
        return idSuspensi;
    }

    public void setJenisSuspensi(String jenis) {
        jenisSuspensi = jenis;
    }

    public String getJenisSuspensi() {
        return jenisSuspensi;
    }

    public void setMerkSuspensi(String merk) {
        merkSuspensi = merk;
    }

    public String getMerkSuspensi() {
        return merkSuspensi;
    }

    public void setIDRangka(Motor idRang) {
        idRangka = idRang;
    }

    public Motor getIDRangka() {
        return idRangka;
    }

    public void info() {
        System.out.println("Data Suspensi");
        System.out.println("");
        System.out.println("No.Seri Suspensi : " + getIDSuspensi());
        System.out.println("Jenis Suspensi : " + getJenisSuspensi());
        System.out.println("Merk Suspensi : " + getMerkSuspensi());
        System.out.println("Suspensi Untuk Rangka : " + idRangka.getIDRangka());
    }
}
