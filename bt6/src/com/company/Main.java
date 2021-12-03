package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong san pham : ");
        int n = sc.nextInt();

        Product product[] = new Product[n];
        for (int i = 0; i < n; i++) {
            product[i] = new Product();
            product[i].input();
        }
        for (int i = 0; i < n; i++){
            System.out.println(product[i]);
        }
        sc.nextLine();

        System.out.println("Nhap ten san pham muon tim : ");
        String findName = sc.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (product[i].name.equals(findName)){
                System.out.println(product[i]);
                count++;
            }
        }
        if (count == 0){
            System.out.printf("Khong tim thay san pham co ten : %s", findName);
        }
    }
}
