
package variabelcounter;

import java.util.Scanner;


public class VariabelCounter {

    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukan batas bilangannya:");
        int batas = masukan.nextInt();
        int hasil =0;
        for (int  i=1; i<=batas; i++)
            hasil +=i;
        System.out.println("Total Jumlahnya adalah:"+hasil);
        
    }
    
}
