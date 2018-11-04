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
        Motor mo = new Motor( "Sport", "Kawasaki","123468");
        Mesin ms = new Mesin("MS982H1K0", "2-Tak", 150, mo);
        Suspensi s = new Suspensi("MH897Z9UK", "Sport", "Kawahara",mo);
        Roda r = new Roda("110-130", "On-Road", "Corsa R99", 17, mo);
        
        mo.info();
        System.out.println("");
        ms.info();
        System.out.println("");
        s.info();
        System.out.println("");
        r.info();
    } 
}