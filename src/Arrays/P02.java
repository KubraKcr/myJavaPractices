package Arrays;

import java.util.Arrays;

public class P02 {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        //        sonucu bize donduren bir method yaziniz.

        int[] arr = {3,4,-1,-7,9,-4,1,3,-9};
        int toplam =0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0){
                toplam+=arr[i];

            }

        }
        System.out.println("pozitif sayilarin toplami : " + toplam);
    }
}
