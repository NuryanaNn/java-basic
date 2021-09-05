
package pernyataanif;

import java.util.Scanner;

public class PernyataanIf {

    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int nilai;
        System.out.print ("Masukan nilai Akhir Mata Kuliah:");
        nilai = masukan.nextInt();
        if (nilai <55)
        System.out.println ("Mahasiswa tsb tdk lulus");
        else
            System.out.println ("Mahasiswa Lulus");
        
    }
    
}
