
package Tugas4;

public class No7_Insertion_Sort {
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
        int B [] = {-2, 4, 3, 2, 10, 25};
        No7_Insertion_Sort.tampil(B);
        No7_Insertion_Sort.InsertionSort(B);
        No7_Insertion_Sort.tampil(B);
        System.out.println("DESTY NURUL ANITSA 20090134");
    }  
}

