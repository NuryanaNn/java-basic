
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Namikaze Yanz
 */
public class PemanggilanProsedur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Prosedur Prosedur = new Prosedur();
 
        System.out.println("PROSEDUR TANPA PARAMETER");
        Prosedur.tampilAngka();
        System.out.println("");
        try{
            System.out.println("PROSEDUR DENGAN PARAMETER");
            System.out.println("Masukan Angka: ");
            int angka = input.nextInt();
            Prosedur.tampilAngka(angka);
            System.out.println("");
            System.out.println("PROSEDUR DENGAN KATA KUNCI STATIC");
            System.out.println("Masukan Angka : ");
            int angka2 = input.nextInt();
            tampilAngkaStatic(angka2);
        }catch(Exception e){
            System.out.println("Terjadi Error!!: ");
            System.out.println("Masalah = "+e.getMessage());
            
        }
            
        }

    private static void tampilAngkaStatic(int angka2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
    

