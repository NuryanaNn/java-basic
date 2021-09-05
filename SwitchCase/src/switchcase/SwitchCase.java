
package switchcase;

import java.util.Scanner;


public class SwitchCase {

   
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.print("Masukan angka 1-3:");
        int bil = masukan.nextInt();
        switch (bil){
            case 1 :System.out.println ("satu"); break;
            case 2 :System.out.println ("dua"); break;
            case 3 :System.out.println ("tiga");
            default :System.out.println ("Bilangan Diluar range");
        }
    }
    
}
