import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner aImput=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        double aImp= aImput.nextDouble();
        System.out.println("Bir sayı giriniz : ");
        double bImp= aImput.nextDouble();
        System.out.println("Bir sayı giriniz : ");
        double cImp= aImput.nextDouble();

        double sonuc = aImp+bImp*cImp-bImp;
        System.out.println("Sonuç : " + sonuc);

        }
    }
