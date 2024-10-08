package com.example.uygulama1;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        double alan,cevre,sonuc;

        System.out.print("Alana Girin");

        alan=oku.nextDouble();

        System.out.print("Cevreye Girin");
        cevre=oku.nextDouble();

       double sqrt= Math.sqrt(4);
        System.out.println("Alan"+alan);
        System.out.println("Cevre"+cevre);
    }
}
