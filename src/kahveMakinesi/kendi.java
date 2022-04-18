package kahveMakinesi;


import java.util.Scanner;

public class kendi {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        sekerBardakSecimi();
    }

    public static void sekerBardakSecimi() {
        System.out.println("Hos geldiniz");
        System.out.println("Kahvenize seker ister misiniz evet ya da hayir diye cevap giriniz:");
        String cevap = scan.next();
        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("Kac seker istersiniz?");
            int seker = scan.nextInt();
            System.out.println(seker+"adet seker hazirlaniyor");
        } else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.println("Sekersiz kahveniz hazirlaniyor");
            System.out.println("Lutfen bardak secimine geciniz");
        } else {
            System.out.println("Lutfen gecerli bir cevap veriniz");
        }

        System.out.println("secmek istediginiz bardagi giriniz \nbuyuk boy bardak icin=1\n kucuk boy bardak icin =2\n orta boy bardak icin=3 giriniz:");
        int bardak = scan.nextInt();
        switch(bardak){
            case 1:
            System.out.println("Kahveniz buyuk boy brdakta hazirlaniyor...");break;
            case 2:
            System.out.println("Kahveniz kucuk boy bardakta hazirlaniyor...");break;
            case 3:
                System.out.println("Kahveniz orta boy bardakta hazirlaniyor");break;
            default:
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }

        }

    }

