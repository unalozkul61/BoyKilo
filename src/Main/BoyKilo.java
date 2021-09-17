package Main;

import java.util.Scanner;

public class BoyKilo {
    public static void main(String[] args) {

        double kilo,boy,vucutKitle;
        Scanner input = new Scanner(System.in);
        System.out.print("Lüten boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();
        vucutKitle = kilo / boy * boy ;
        System.out.println("Vücut Kitle İndesiniz  : " + vucutKitle);



    }
}
