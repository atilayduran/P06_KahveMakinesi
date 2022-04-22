package KahveFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KahveMakinesi {
    static Scanner scan = new Scanner(System.in);
    static String hangiKahve;
    static String sutEkleme;
    static String sekerAdedi;


    static List<depo> list = new ArrayList<>();

    depo kahve = new depo(hangiKahve);
    depo sut = new depo(sutEkleme);
    depo seker = new depo(sekerAdedi);

    public void kahveCesidi() throws InterruptedException {

        System.out.println("************************");
        System.out.println("-----Kahve Makinesi-----");
        System.out.println("************************");
        System.out.println("Hangi Kahveyi istersiniz? Lutfen tuslayiniz- \n1.Turk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso\n");

        String hangiKahve = scan.nextLine();
        switch (hangiKahve) {
            case "1":
                hangiKahve = "Turk Kahvesi";
                System.out.println("Turk Kahvesi hazırlanıyor...");
                break;

            case "2":
                hangiKahve = "Filtre Kahve";
                System.out.println("Filtre Kahve hazırlanıyor...");
                break;

            case "3":
                hangiKahve = "Espresso";
                System.out.println("Espresso hazırlanıyor...");
                break;

            default:
                System.out.println("Hatalı giris yaptınız.Tekrar deneyiniz...");
                kahveCesidi();
                break;

        }


        kahve.setKahveTuru(hangiKahve);


        sutEkle();


    }

    public void sutEkle() throws InterruptedException {

        System.out.println("************************");
        System.out.println("Sut eklememizi ister misiniz? \nEvet veya Hayir olarak cevaplayiniz");
        String sutEkleme = scan.next();


        if (sutEkleme.equalsIgnoreCase("Evet")) {
            System.out.println("Sut ekleniyor");
            sut.setSut("Sutlu");
        } else if (sutEkleme.equalsIgnoreCase("Hayir")) {
            System.out.println("Sut eklenmiyor");
            sut.setSut("Sutsuz");
        }else{
            System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz.");
            sutEkle();
        }
      //  list.add(sut);  silip deneme yapicaz

        System.out.println("************************");
        sekerSecimi();
    }

    public void sekerSecimi() throws InterruptedException {

        System.out.println("Kahvenize seker ister misiniz evet ya da hayir diye cevap giriniz:");
        String cevap = scan.next();
        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("Kac seker istersiniz?");
            sekerAdedi = scan.next();
            System.out.println(sekerAdedi + " adet sekerli kahveniz hazirlaniyor...");
            Thread.sleep(3000);
            seker.setSeker(sekerAdedi + " sekerli");
        } else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.println("Sekersiz kahveniz hazirlaniyor...");
            Thread.sleep(3000);
            seker.setSeker("Sekersiz");
        } else {
            System.out.println("Lutfen gecerli bir cevap veriniz");
            sekerSecimi();
        }
        System.out.print("Lutfen bardak secimine geciniz");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
        }
        // list.add(seker);
        bardakSecimi();

    }

    private void bardakSecimi() throws InterruptedException {
        System.out.println();
        System.out.println("************************");
        System.out.println("buyuk boy bardak icin 1");
        System.out.println("kucuk boy bardak icin 2");
        System.out.println("orta boy bardak icin 3 tuslayiniz.");
        int bardak = 0;
        while (true) {
            try {
                bardak = scan.nextInt();
                if (bardak < 1 || bardak > 3) {
                    System.out.println("tercihler 1, 2, ya da 3 olmalidir.");
                } else break;
            } catch (Exception e) {
                //e.printStackTrace();
                String srt = scan.nextLine(); //gerekli mi ??? gerekli!!!
                System.out.println("Hatali giris yaptiniz.");
                break;
            }
        }
        switch (bardak) {
            case 1:
                System.out.println("Kahveniz buyuk boy bardakta hazirlaniyor...");
                Thread.sleep(3000);
                break;
            case 2:
                System.out.println("Kahveniz kucuk boy bardakta hazirlaniyor...");
                Thread.sleep(3000);
                break;
            case 3:
                System.out.println("Kahveniz orta boy bardakta hazirlaniyor...");
                Thread.sleep(3000);
                break;
            default:
                System.out.println("Lutfen gecerli bir sayi giriniz");
                bardakSecimi();
                break;

        }
        cikis();
    }

    private void cikis() {
        System.out.println("************************");
        System.out.println(seker.getSeker() + " " + sut.getSut() + " " + kahve.getKahveTuru() + " hazirdir" + "\nBizi tercih ettiginiz icin tesekkur ederiz");
        ////baska siparsis icin basa dondurulebilir...

    }

}
