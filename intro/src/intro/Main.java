package intro;

public class Main {

    public static void main(String[] args) {

        //camelCase
        //Don't repeat yourself 
        String internetSubeButonu ="internet �ubesi";

        double dolarDun = 8.20;
        double dolarBugun = 8.20;
        int vade = 36;
        Boolean dustuMu = false;

    //    System.out.println(internetSubeButonu);


        if(dolarBugun<dolarDun) {
            System.out.println("Dolar d��t� resmi");
        }else if(dolarBugun==dolarDun) {
            System.out.println("Dolar De�i�medi resmi");
        }else {
            System.out.println("Dolar Y�kseldi resmi");
        }


        String kredi1 = "H�zl� Kredi";
        String kredi2 = "H�ph�zl� Kredi";
        String kredi3 = "Orta h�zl� Kredi";
        String kredi4 = "�ok h�zl� Kredi";
        String[] krediler = {kredi1,kredi2,kredi3,kredi4};

        String[] krediler2 = {"H�zl� Kredi","H�ph�zl� Kredi","Orta h�zl� Kredi"};


        for (String kredi : krediler2) {
            System.out.println(kredi);
        }

        for (int i = 0; i < krediler2.length; i++) {
            System.out.println(krediler[0]);
        }
        
        System.out.println("");

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2=100;
        System.out.println(sayi1);

        int[] sayilar1 = {1,2,3,4,5 };
        int[] sayilar2 = {10,20,30,40,50 };
        sayilar1 = sayilar2;
        sayilar2[0] =100;
        System.out.println(sayilar1[0]);


        String sehir1 = "K�tahya";
        String sehir2 = "istanbul";
        sehir1 = sehir2;
        sehir2 = "Ankara";
        System.out.println(sehir2);
        
        System.out.println("");
        
        System.out.println("Ankara");
    }
}