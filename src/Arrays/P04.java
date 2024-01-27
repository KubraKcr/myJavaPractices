package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve tamsayi elementlerini alip
        //        array’i olusturan ve bize donduren bir method olusturun.
        System.out.println(Arrays.toString(arrayOlustur()));

    }

    public static int[] arrayOlustur ( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen olusturmak istediginiz Array için eleman sayisi girin");
        int elemanSayisi = scanner.nextInt();

        int [] arayOlusturuyorum = new int[elemanSayisi] ;
        for (int i = 0; i <arayOlusturuyorum.length ; i++) {

            System.out.println("lutfen Array için eleman girin :");
            arayOlusturuyorum[i] = scanner.nextInt();

        }
        return arayOlusturuyorum;

        }


    }