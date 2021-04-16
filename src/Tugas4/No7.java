
package Tugas4;


public class No7 {
    public static void InsertionSort(int A []){
        for (int i = 1; i < A.length; i++){ 
            int key = A[i]; 
            int j = i - 1; 
            while ((j >= 0) && (A[j] > key)){ 
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key; 
        }
    }
    //membuat fungsi tampil untuk menampilkan data
    public static void tampil (int data []){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    
    public static void main(String[]args){
        int A[] =  {25, 7, 9 , 13, 3};
       
        No7.tampil(A);
        No7.InsertionSort(A);
        No7.tampil(A);
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
            
        System.out.print("Data yang dicari ");
        cari = 13;
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
