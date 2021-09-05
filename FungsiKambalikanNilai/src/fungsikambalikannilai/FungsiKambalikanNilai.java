
package fungsikambalikannilai;

import java.util.Scanner;


public class FungsiKambalikanNilai {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bil1, bil2, bil3;
        System.out.println ("Program Menjumlahkan Dua Bilangan");
        System.out.println ("Masukan Bilangan 1:" );
        bil1 = masukan.nextInt();
        System.out.println ("Masukan Bilangan 2:");
        bil2 = masukan.nextInt();
        System.out.println ("Masukan Bilangan 3:");
        bil3 = masukan.nextInt();
        System.out.println();
        System.out.println ("Jumlah bil1+bil2 : "+( jumlah(bil1,bil2)));
        System.out.println ("Jumlah bil2+bil3 : "+( jumlah(bil2,bil3)));
        System.out.println ("jumlah bil1+bil3 : "+( jumlah(bil1,bil3)));
    }  
    private static int jumlah(int a, int b){
        int hasil = a +b;
        return hasil;
    }
}

