package KahveFinal;

import java.util.Scanner;

public class KahveMakinesi {
    Scanner scan = new Scanner(System.in);
    String hangiKahve;
    String sutEkleme;
    String sekerAdedi;


    Depo kahve = new Depo();
    Depo sut = new Depo();
    Depo seker = new Depo();



    public void kahveCesidi() throws InterruptedException {

        System.out.println("************************");
        System.out.println("-----Kahve Makinesi-----");
        System.out.println("************************");
        System.out.println("Hangi Kahveyi istersiniz? Lutfen tuslayiniz- \n1.Turk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso\n");

        hangiKahve = scan.nextLine();
        switch (hangiKahve) {
            case "1":
                hangiKahve = "Turk Kahvesi";
                System.out.print("Turk Kahvesi hazırlanıyor");
                for (int i = 0; i < 3; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                break;

            case "2":
                hangiKahve = "Filtre Kahve";

                System.out.print("Filtre Kahve hazırlanıyor");
                for (int i = 0; i < 3; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                break;

            case "3":
                hangiKahve = "Espresso";
                System.out.print("Espresso hazırlanıyor");
                for (int i = 0; i < 3; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
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
        System.out.println();
        System.out.println("****** SUT SECIMI ******");
        System.out.println("Sut eklememizi ister misiniz? \nEvet veya Hayir olarak cevaplayiniz");
        sutEkleme = scan.next();


        if (sutEkleme.equalsIgnoreCase("Evet")) {
            System.out.print("Sut ekleniyor");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            sut.setSut("Sutlu");
        } else if (sutEkleme.equalsIgnoreCase("Hayir")) {
            System.out.println("Sut eklenmiyor");
            sut.setSut("Sutsuz");
        } else {
            System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz.");
            sutEkle();
        }


        System.out.println();
        sekerSecimi();
    }

    public void sekerSecimi() throws InterruptedException {

        System.out.println("Kahvenize seker ister misiniz evet ya da hayir diye cevap giriniz:");
        String cevap = scan.next();
        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("Kac seker istersiniz?");
            sekerAdedi = scan.next();

            System.out.print(sekerAdedi + " adet sekerli kahveniz hazirlaniyor");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

            seker.setSeker(sekerAdedi + " sekerli");
        } else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.print("Sekersiz kahveniz hazirlaniyor");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(750);
                } catch (InterruptedException e) {
                }
            }
            seker.setSeker("Sekersiz");

        } else {
            System.out.println("Lutfen gecerli bir cevap veriniz");
            sekerSecimi();
        }
        System.out.print("Lutfen bardak secimine geciniz");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

        bardakSecimi();

    }

    private void bardakSecimi() throws InterruptedException {
        System.out.println();
        System.out.println("****** BARDAK SECIMI ******");
        System.out.println("Buyuk boy bardak icin 1");
        System.out.println("Kucuk boy bardak icin 2");
        System.out.println("Orta boy bardak icin 3 tuslayiniz.");
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

                break;
            case 2:
                System.out.println("Kahveniz kucuk boy bardakta hazirlaniyor...");

                break;
            case 3:
                System.out.println("Kahveniz orta boy bardakta hazirlaniyor...");

                break;
            default:
                System.out.println("Lutfen gecerli bir sayi giriniz");
                bardakSecimi();
                break;

        }
        cikis();
    }

    private void cikis() {
        System.out.println("****** KAHVENIZ HAZIR OLMAK UZERE ******");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
        System.out.println(seker.getSeker() + " " + sut.getSut() + " " + kahve.getKahveTuru() + " hazirdir" + "\nBizi tercih ettiginiz icin tesekkur ederiz :-)"+"\n<3<3<3");
        ////baska siparsis icin basa dondurulebilir...

    }

}
