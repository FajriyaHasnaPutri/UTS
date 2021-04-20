package UTS2C;

public class UTS_NO1b {
    public static void main(String []args){
        int K []= {3, 10, 4, 2, 8, 13};
        int search = 8;
        int IndeksAwal = 0;
        int IndeksAkhir = K.length-1;
        int ketemu = 0;
        int point =0 ;
        
        System.out.println("Berisi data ");
        for (int i= 0; i < K.length; i++){
            
            System.out.print(K[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)){
        point = (IndeksAwal + IndeksAkhir) / 2;
        System.out.println("indeks pointer: " + point);
            if (search == K[point]){
                ketemu = 1;
                System.out.println("Data " +
                        search + "telah ditemukan di indeks ke- " + point);
            }
            
            else if (search < K[point]){
                System.out.print("cari di kiri");
                IndeksAkhir = point-1;
            }
            else {
                IndeksAwal = point+1;
                System.out.println("cari dikanan");
            }
        }
        
        
     if (ketemu == 1)
         System.out.println("kesimpulan: data ditemukan ");
     else
         System.out.println("kesimpulan: data tidak ditrmukan");
     
     
     System.out.println("Fajriya Hasna Putri");
    }
}
