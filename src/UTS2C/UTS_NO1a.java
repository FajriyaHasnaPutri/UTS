package UTS2C;

public class UTS_NO1a {
    public static void BubbleSort(int[] Y){
        int x=1, p, i = Y.length;
        int temp;
        while (x<i){
            p = i-1 ;
            while (p>=x){
                if (Y [p-1] > Y[p]){
                    temp = Y[p];
                    Y[p] = Y[p-1];
                    Y[p-1] = temp;
                }
                p = p-1;
            }
            x = x+1;
        }
    }
    public static void tampil (int Data []){
        for (int x = 0; x < Data.length; x++){
            System.out.print(Data[x] + " ");
        }
        
        System.out.println();
    }
    public static void main (String[] args){
        int Y[] = {3, 10, 4, 2, 8, 13};
        UTS_NO1a.tampil(Y);
        UTS_NO1a.BubbleSort(Y);
        UTS_NO1a.tampil(Y);
        
        
        System.out.println ("FAJRIYA HASNA PUTRI");
    }
}
    
    
    
