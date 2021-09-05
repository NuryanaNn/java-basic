
package fungsi;

import java.util.Scanner;


public class Fungsi {

    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int pilihan = 9;
        do{
            System.out.println("\nMenu\n");
            System.out.println("1.Menghitung Luas Persegi panjang");
            System.out.println("2.Menghhitug Luas LIngkaran");
            System.out.println("0.Keluar");
            System.out.println("Masukan Pilihan Anda");
            pilihan = masukan.nextInt();
            switch(pilihan){
                case 1: LuasPersegiPanjang();break;
                case 2: LuasLingkaran();break;  
            }   
        }while (pilihan !=0);            
    }
   private static void LuasPersegiPanjang(){
        Scanner masukan = new Scanner (System.in);
        float panjang, lebar, luas;
        System.out.print ("Masukan Nilai panjang :");
        panjang = masukan.nextFloat();
        System.out.print ("Masukan Nilai Lebar:");
        lebar = masukan.nextFloat();
        luas = panjang * lebar;
        System.out.println ("Luas Persegi Panjang : "+luas);       
    }
   private static void LuasLingkaran() { 
       Scanner masukan = new Scanner (System.in);
       float jarijari, luas;
       System.out.print ("Masukan Nilai Jari-Jari:");
       jarijari = masukan.nextFloat();
       luas =3.14f * jarijari *jarijari;
       System.out.println ("Luas lingkaran "+luas);
       
   }
}
