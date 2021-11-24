package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Bài 1

//        int a, b ;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhap vao so a :");
//        a = sc.nextInt();
//        System.out.println("Nhap vao so b :");
//        b = sc.nextInt();
//        System.out.println("Phuong trinh ban nhap vao la : " + a + "x + " + b + " = 0" );
//        if (a==0) {
//            if (b == 0) {
//                System.out.println("Phuong trinh nay co vo so nghiem");
//            } else {
//                System.out.println("Phuong trinh nay vo nghiem");
//            }
//        } else {
//            System.out.println("Phuong trinh co nghiem x = " +(-b/a) );
//        }


        //Bai 2

        Double a, b, c, x1, x2, delta;
        String ketQua = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai phuong trinh ax^2 + bx + c = 0");
        do {
            System.out.println("Nhap a : ");
            a = sc.nextDouble();
        } while (a==0);
        System.out.println("Nhap b :");
        b = sc.nextDouble();
        System.out.println("Nhap c :");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            ketQua = "Phuong trinh vo nghiem";

        } else if (delta == 0) {
            x1 = x2 = -b/(2*a);

        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            ketQua = "Phuong trinh co 2 nghiem x1 = " + x1 + "va x2" + x2;
        }
        System.out.println(ketQua);
    }
}
