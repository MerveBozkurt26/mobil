package com.example.uygulama1;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Mevcut Maaş Gir");

        double maas,yeni_maas;

        System.out.print("Maaşa Girin");
        maas=oku.nextDouble();

        yeni_maas=maas+(maas*0.43);

        System.out.println("Yeni Maaş"+yeni_maas);

    }
}
