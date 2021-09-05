/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabelglobal;

/**
 *
 * @author Namikaze Yanz
 */
class VariabelGlobal {

    //ini variabel global
    static String nama = "programku";
    static String version = "1.0.0";
    
    static void help(){
        //ini variabel lokal
        String nama ="Nuryana";
        
        //mengakses variabel global di dalam fungsi help()
        System.out.println ("Nama: "+nama);
        System.out.println ("Versi: "+version);
    }
    public static void main(String args[]){
        
        //panggil fungsi help()
        help();
        
        System.out.println ("Nama: "+nama);
        System.out.println ("Versi: "+version);
        
    }
    
}
