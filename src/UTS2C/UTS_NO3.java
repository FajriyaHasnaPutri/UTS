package UTS2C;
import java.util.Scanner;

public class UTS_NO3 {
    public static void main(String[] args){
        int k, l, m, n = 0;
        int matriks [][]= new int [10][10];
        int transpose[][] = new int [10][10];
        Scanner scan = new Scanner (System.in);
        System.out.print("Maukkan jumlah baris matriks: ");
        m = scan.nextInt();
        System.out.print("Maukkan jumlah kolom matriks: ");
        for (k = 0; k < m; k++){
            for (l = 0; l< n; l++) {
                matriks[k][l]= scan.nextInt();                
                
            }
        }
        for (k =0; k <m; k++){
            for (l = 0; l< n; l++) {
                transpose[k][l]= matriks[k][l];  
        }
    }
    System.out.println ("Hasil transpose matriks: ");
    for (k =0; k <m; k++){
    for (l = 0; l< n; l++) 
        System.out.print(transpose [k][l] + "\t");
    }
    System.out.println();
        }
    }   
        
 