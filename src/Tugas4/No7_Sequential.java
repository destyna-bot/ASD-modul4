
package Tugas4;

import java.util.Scanner;

public class No7_Sequential {
    
    public static void main(String[]args){
        int A[] = {-2, 4, 13, 2, 10, 25};
        int ketemu = 0;
        int cari;
        
        //mencetak Data 
        System.out.println("Isi data A adalah: ");
            for (int i = 0; i <A.length; i++){ //panjang data 10; 0<10->T
                System.out.print(A[i]+ " ");
            }
        System.out.println("");
        System.out.println("");
            
        
        // mengambil input dari keyboard
        Scanner scan = new Scanner(System.in);        
        System.out.print("Data yang dicari ");
        cari = scan.nextInt(); 
        for (int i=0; i<A.length; i++){
            if (cari == A[i]){
            ketemu = 1;
            System.out.println("Data " + cari + " berada pada indeks ke-"+ i);
                    
            }
        }
        System.out.println("");
        System.out.println("");
            
        if (ketemu == 1) 
            System.out.println("Kesimpulan: Data ditemukan");
        else
            System.out.println("Kesimpulan: Data tidak ditemukan");
       
    System.out.println("Desty Nurul Anitsa");
    }
}
