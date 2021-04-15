
package Tugas4;

public class Shell_Sort {
    
    public static void ShellSort(int B[]){
        int n ;
        n = B.length;
        int C,M ;
        int jarak, i, j, kondisi;
        boolean sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        
        while (jarak >= 1){
            jarak = jarak/2;
            sudah = true;
            while(sudah){
                sudah = false;
                for (j = 0; j< n- jarak; j++){
                    i = j+jarak;
                    C++;
                    if (B[j]>B[i]){
                        temp = B[j];
                        B[j] = B[i];
                        B[i] = temp;
                        sudah = true;
                    }
                }
            }
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
        Shell_Sort.tampil(B);
        Shell_Sort.ShellSort(B);
        Shell_Sort.tampil(B);
        System.out.println("DESTY NURUL ANITSA 20090134");
    }
    
}
