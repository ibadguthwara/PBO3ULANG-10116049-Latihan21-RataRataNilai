package pbo3ulang.pkg10116049.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Program Rata-Rata Nilai
 */
public class PBO3ULANG10116049Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n, jml, nilai[];
        double rata, jumlah = 0;
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();
         
        nilai = new int[n];
         
        for(int i=0;i<= n-1;i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = input.nextInt();  
        }
         
        for(int j=0;j<= n-1;j++){
            jumlah = jumlah + nilai[j];
        }
         
        rata = jumlah/n;
         System.out.println();
 
        System.out.println("Maka,Rata-rata Nilainya adalah : " + rata);
    }
}
        
    
    

