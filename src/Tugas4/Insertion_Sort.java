
package Tugas4;
public class Insertion_Sort {
    // membuat fungsi inserttion sort atau pengurutan data
    public static void InsertionSort(int B []){
        for (int i = 1; i < B.length; i++){ 
            int key = B[i]; 
            int j = i - 1; 
            while ((j >= 0) && (B[j] > key)){ 
                B[j + 1] = B[j];
                j--;
            }
            B[j + 1] = key; 
        }
    }
    //membuat fungsi tampil untuk menampilkan data
    public static void tampil (int data []){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    
    public static void main(String[] args){
        int B [] = {25, 7, 9, 13, 3};
        Insertion_Sort.tampil(B);
        Insertion_Sort.InsertionSort(B);
        Insertion_Sort.tampil(B);
        System.out.println("DESTY NURUL ANITSA 20090134");
    }  
}
