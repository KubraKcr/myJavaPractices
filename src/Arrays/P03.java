package Arrays;

public class P03 {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //        ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        String[] harfler = {"a","c","r","s","a","a","s","k","a"};

        String arananHarf = "a";
        int count =0;

        for (int i = 0; i < harfler.length ; i++) {
            if(harfler[i].toString().contains(arananHarf)){
                count++;
            }
        }
        System.out.println("istenilen harf, bu Array'de" + " " + count + " kere kullanılmıştır");
    }
}
