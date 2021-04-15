
package Tugas4;

public class Selection_Sort {
    
    @SuppressWarnings("empty-statement")
    public static void Selection_Sort( int B[]){
        int smallIndex;
        int i, j, n = B.length;
        int temp;
        
        for (i = 0; i< n - 1; i++){
            smallIndex = i;
            for (j = i + 1; j < n; j++){
               if (B[j]<B[smallIndex]){
                   smallIndex = j;
                }
            }
            
            temp = B[i];
            B[i] = B[smallIndex];
            B[smallIndex] = temp ;
            
        }
    }
    
    public static void tampil(int data[]){
        for( int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main( String[] args){
        int B[] = {25, 7, 9 , 13, 3};
        Selection_Sort.tampil(B);
        Selection_Sort.Selection_Sort(B);
        Selection_Sort.tampil(B);
        System.out.println("DESTY NURUL ANITSA 20090134");
    }
    
}
