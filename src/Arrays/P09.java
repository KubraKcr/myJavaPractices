package Arrays;

public class P09 {
    public static void main(String[] args) {

// verilen bir metni tersine cevirip
// bize donduren bir method olusturun
// "Java ile kod yaz" cumlesini tersten yazdirin
        String metin = "Java çok güzeldir ama ben daha güzelim";

        String tersMetin ="";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin += metin.charAt(i);
        }

        System.out.println(tersMetin);

    }}
