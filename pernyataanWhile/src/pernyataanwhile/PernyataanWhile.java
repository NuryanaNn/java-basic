
package pernyataanwhile;
import java.util.Scanner;

public class PernyataanWhile {


    public static void main(String[] args) {
        Scanner  masukan = new Scanner (System.in);
        int n=0, total=0, bil=9;
        while (bil !=0){
            n++;
            System.out.println("Masukan bilangan ke-"+n+" :");
            bil = masukan.nextInt();
            total +=bil;
        }
        System.out.println ("Total jumlah "+(n-1)+" bilangan tsb :");
        System.out.println(total);
    }
    
}
