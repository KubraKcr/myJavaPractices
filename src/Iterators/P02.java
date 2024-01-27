package Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class P02 {
    public static void main(String[] args) {
        // tum elementleri gozden gecirip
        // 5'den buyuk olanlari silin

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(3);

        System.out.println(sayilar); // [5, 1, 7, 3]
   ListIterator lit = sayilar.listIterator();

    lit=sayilar.listIterator();

     while (lit.hasNext()){
      if ((Integer) lit.next() >5){
          lit.remove();
      }

     }
        System.out.println(sayilar);
        // listedeki sayilari kontrol edip
        // 0'dan buyuk olanlara 7 ekleyin

        lit= sayilar.listIterator();

        while ( lit.hasNext()){

           int sayi = (Integer)lit.next();
           if (sayi>0){

                lit.set(sayi+7);
            }
        }

        System.out.println(sayilar);

}}


