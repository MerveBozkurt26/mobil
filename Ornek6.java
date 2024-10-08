package com.example.uygulama1;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        double zam,maas;

        System.out.print("Maaşa Girin");
        maas=oku.nextDouble();

        System.out.print("Zam Girin");
        zam=oku.nextDouble();

        maas=zam+(maas*zam/100);

        System.out.println("Yeni Zam"+ zam);
        System.out.println("Maas"+maas);




    }
}
