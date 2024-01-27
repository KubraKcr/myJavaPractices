package Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class P01 {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(3);

        System.out.println(sayilar); // [5, 1, 7, 3]

        // listedeki tum sayilari, index kullanmadan 2 artirin
        ListIterator lit =sayilar.listIterator();
        while(lit.hasNext()){

        Integer sayi= (Integer) lit.next();
         lit.set(sayi+2);

        }
        System.out.println(sayilar);
    }
}
