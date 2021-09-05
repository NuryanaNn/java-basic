
package pernnyataanfor2;

import java.util.Scanner;

public class PernnyataanFor2 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukan batas bilangannya :");
        int batas = masukan.nextInt();
        System.out.println ("Bilangan genap dari 2 sampai bilangan tsb:");
        for (int i=2; i<=batas; i=i+2)
            System.out.print(i +"");
        
        
    }
    
}
