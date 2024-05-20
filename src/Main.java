import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Listeler{
     String[]  tckim= {"12345665432","98765567892","13579975311","65465432113"};
     String [] adi = {"Aslı","Mehmet","Derya","Sedat"};
     String [] soyadi = {"KARA","UZUN","DEMİR","SERT"};
     String [] email= {"aslikara@msn.com","muzun@google.com.tr","demirderya@yahoo.com","sedatsert@hotmail.com"};
     String [] telefon = {"532 544 89 99","505 325 44 70","537 888 23 00","541 777 54 29"};
     String [] bolum= {"Bilgisayar", "Makina","YBS","Tıp"};
     String [] dyeri={"İstanbul","Artvin", "Aydın","Denizli"};
     int [] vize = {44,76,61,84};
     int [] finsinav = {40,30,50,95};
 }
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");

        try {
            Scanner input = new Scanner(System.in);
            int islem,vize,finsinav;
            long aranan,number;
            double ortalama = 0;
            Listeler listeler = new Listeler();
            ArrayList tckim= new ArrayList<>(List.of(listeler.tckim));
            ArrayList adi= new ArrayList<>(List.of(listeler.adi));
            ArrayList soyadi= new ArrayList<>(List.of(listeler.soyadi));
            ArrayList emaili= new ArrayList<>(List.of(listeler.email));
            ArrayList telefoni= new ArrayList<>(List.of(listeler.telefon));
            ArrayList dyeri= new ArrayList<>(List.of(listeler.dyeri));
            ArrayList bolumi= new ArrayList<>(List.of(listeler.bolum));
            ArrayList<Integer> vizei= new ArrayList<Integer>();
            ArrayList<Integer> finsinavi = new ArrayList<Integer>();
            for(int i = 0; i < listeler.tckim.length;i++){
                vizei.add(listeler.vize[i]);
                finsinavi.add(listeler.finsinav[i]);
            }
            boolean durum = true;
            String tc,ad,soyad,email,telefon,bolum,dyer;
            while (durum){
                System.out.println("");
                System.out.println("[1] Tüm öğrencilerin listelenmesi");
                System.out.println("[2] İstenilen bir öğrencinin listelenmesi");
                System.out.println("[3] “0 - sıfır” indise bir veri eklenmesi");
                System.out.println("[0] Çıkış Yap");
                System.out.print("İşlem seçiniz = ");
                System.out.print("");
                islem = input.nextInt();
                switch (islem){
                    case 1:
                        for (int i = 0; i < tckim.size(); i++) {

                            ortalama = (vizei.get(i) * 0.4) + (finsinavi.get(i) * 0.6);
                            if (ortalama < 50) {
                                System.out.println("  Tc: " + tckim.get(i) + " | Adı : " + adi.get(i) + " | Soyadı : " + soyadi.get(i) + " | Email : " + emaili.get(i) + " | Telefon : " + telefoni.get(i) + " | Bölüm : " + bolumi.get(i) + " | Doğum Yeri : " + dyeri.get(i) + " | Vize : " + vizei.get(i) + " | Final : " + finsinavi.get(i) + " | ÜZGÜNÜM KALDINIZ Ortalama : " + ortalama);
                            } else {
                                System.out.println("  Tc: " + tckim.get(i) + " | Adı : " + adi.get(i) + " | Soyadı : " + soyadi.get(i) + " | Email : " + emaili.get(i) + " | Telefon : " + telefoni.get(i) + " | Bölüm : " + bolumi.get(i) + " | Doğum Yeri : " + dyeri.get(i) + " | Vize : " + vizei.get(i) + " | Final : " + finsinavi.get(i) + " | TEBRİKLER GEÇTİNİZ Ortalama : " + ortalama);
                            }
                        }
                        break;
                    case 2:

                        System.out.print("Lütfen aradığınız tcyi giriniz = ");
                        aranan = input.nextLong();
                        for(int i = 0; i<4; i++){
                            ortalama = (vizei.get(i) * 0.4) + (finsinavi.get(i) * 0.6);
                            number = Long.parseLong(tckim.get(i).toString());
                            if(aranan == number && ortalama < 50){
                                System.out.println("  Tc: " + tckim.get(i) + " | Adı : " + adi.get(i) + " | Soyadı : " + soyadi.get(i) + " | Email : " + emaili.get(i) + " | Telefon : " + telefoni.get(i) + " | Bölüm : " + bolumi.get(i) + " | Doğum Yeri : " + dyeri.get(i) + " | Vize : " + vizei.get(i) + " | Final : " + finsinavi.get(i) + " | ÜZGÜNÜM KALDINIZ Ortalama : " + ortalama);
                            }
                            else if(aranan == number && ortalama > 50){
                                System.out.println("  Tc: " + tckim.get(i) + " | Adı : " + adi.get(i) + " | Soyadı : " + soyadi.get(i) + " | Email : " + emaili.get(i) + " | Telefon : " + telefoni.get(i) + " | Bölüm : " + bolumi.get(i) + " | Doğum Yeri : " + dyeri.get(i) + " | Vize : " + vizei.get(i) + " | Final : " + finsinavi.get(i) + " | TEBRİKLER GEÇTİNİZ Ortalama : " + ortalama);
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Tc Kimlik Girin  =");
                        tc = input.next();
                        System.out.print("İsim Girin = ");
                        ad = input.next();
                        System.out.print("Soyisim Girin = ");
                        soyad = input.next();
                        System.out.print("Bölüm Girin = ");
                        bolum = input.next();
                        System.out.print("Email Girin = ");
                        email = input.next();
                        System.out.print("Telefon Girin = ");
                        telefon = input.next();
                        System.out.print("Doğum Yeri Girin = ");
                        dyer = input.next();
                        System.out.print("Vize Notu Girin = ");
                        vize = input.nextInt();
                        System.out.print("Final Notu Girin = ");
                        finsinav = input.nextInt();


                        tckim.add(0,tc);
                        adi.add(0,ad);
                        soyadi.add(0,soyad);
                        bolumi.add(0,bolum);
                        emaili.add(0,email);
                        telefoni.add(0,telefon);
                        dyeri.add(0,dyer);
                        vizei.add(0,vize);
                        finsinavi.add(0,finsinav);

                        for(int i = 0 ; i< tckim.size(); i++) {
                            ortalama = (vizei.get(i) * 0.4) + (finsinavi.get(i) * 0.6);
                            if (ortalama < 50) {
                                System.out.println("  Tc: " + tckim.get(i) + " | Adı : " + adi.get(i) + " | Soyadı : " + soyadi.get(i) + " | Email : " + emaili.get(i) + " | Telefon : " + telefoni.get(i) + " | Bölüm : " + bolumi.get(i) + " | Doğum Yeri : " + dyeri.get(i) + " | Vize : " + vizei.get(i) + " | Final : " + finsinavi.get(i) + " | ÜZGÜNÜM KALDINIZ Ortalama : " + ortalama);
                            } else {
                                System.out.println("  Tc: " + tckim.get(i) + " | Adı : " + adi.get(i) + " | Soyadı : " + soyadi.get(i) + " | Email : " + emaili.get(i) + " | Telefon : " + telefoni.get(i) + " | Bölüm : " + bolumi.get(i) + " | Doğum Yeri : " + dyeri.get(i) + " | Vize : " + vizei.get(i) + " | Final : " + finsinavi.get(i) + " | TEBRİKLER GEÇTİNİZ Ortalama : " + ortalama);
                            }
                        }
                        break;
                    case 0:
                        durum = false;
                        break;
                }
            }
        }
        catch (Exception e){
            System.out.println("HATALI İŞLEM");
        }

    }
}

