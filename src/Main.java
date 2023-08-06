import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Kayit> kayits = new ArrayList<>();


        System.out.println("Okul Kayıt Sistemine Hoşgeldiniz");
        System.out.println("yapmak istediğini işlem Seçenekleri \n");
        System.out.println("1  Öğrenci kayıt");
        System.out.println("2  Tüm Öğrencileri listeleme");
        System.out.println("3  Öğrenci silme");
        System.out.println("4  Sistemi kapat\n");

        while (true) {
            System.out.println("İşlem numarasını seçiniz");
            int işlemNbr = scanner.nextInt();

            switch (işlemNbr) {

                case 1:
                    System.out.println("Öğrenci ismini giriniz");
                    String Name = scanner.next();

                    System.out.println("Öğrenci Soyadını giriniz");
                    String SurName = scanner.next();

                    System.out.println("Öğrencinin cinsiyetini giriniz");
                    String Cinsiyet = scanner.next();

                    System.out.println("Öğrenci numarası sistem tarafınfan otomatik atanır");
                    int Nbr = random.nextInt(1000);
                    System.out.println("Öğrenci Numarası : " + Nbr);

                    System.out.println("Öğrenci yaşını Giriniz ");
                    int age = scanner.nextInt();

                    Kayit kayit1 = new Kayit(Name, SurName, Cinsiyet, Nbr, age);
                    kayits.add(kayit1);

                    System.out.println("Öğrenci sisteme Başarılı bir şekilde eklendi");
                    break;

                case 2:

                    System.out.println("Tüm öğrenciler");
                    for (Kayit s : kayits) {
                        System.out.println("  İsim : " + s.getName() + "\n" + "  Soyadı : " + s.getSurname() + "\n" + "  Cinsiyeti : " + s.getCinsiyet() + "\n" + "  Öğrenci numarası : " + s.getStudentNumber() + "\n" + "  Yaşı : " + s.getAge());
                    }
                        

                case 3:
                    System.out.println("Öğrenci Numarasını  Giriniz");
                    int OgrNbr = scanner.nextInt();

                    for (Kayit s : kayits) {
                        if (s.getStudentNumber() == OgrNbr) {
                            kayits.remove(s);
                            System.out.println("Öğrenci Silindi");
                            break;
                        } else {
                            System.out.println("Kayıt bulunamadı");
                            break;
                        }
                    }
                    break;


                case 4:
                    System.exit(0);


                default:
                    System.out.println("Geçersiz İşlem Numarası");


            }


        }


    }
}