package Arrays;

public class P05 {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki
        //        en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        //        ayni uzunluktaki isimler varsa, herhangi biri yazdirilabilir


        String[] isimler = {"Sedat","Kenan","Mustafa","Ramazan","Eren","Ali"};

       isimlerArray(isimler);
    }
    public static void  isimlerArray(String[]isimler) {
        String enKisaIsim = isimler[0];
        String enUzunIsim = isimler[0];


          for (int i = 1; i < isimler.length; i++) {
            if (isimler[i].length() >enUzunIsim.length()){


                enUzunIsim = isimler[i];}


        if (isimler[i].length() < enKisaIsim.length()){
            enKisaIsim = isimler[i];

    }}
        System.out.println(enUzunIsim);
        System.out.println(enKisaIsim);
    }}
