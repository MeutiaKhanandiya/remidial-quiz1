/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEUTIA KHANANDIYA
 */
public class RemidiKuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil mo = new Mobil( "Sport", "Ferrari","458");
        Mesin ms = new Mesin("456KHUA", "4.4999cc", 563, mo);
        Suspensi s = new Suspensi("KSRU678", "Sport", "Berlinetta",mo);
        Roda r = new Roda("R14-R17", "Horsepower", "Spider", 540, mo);
        
        mo.info();
        System.out.println("");
        ms.info();
        System.out.println("");
        s.info();
        System.out.println("");
        r.info();
    } 
}