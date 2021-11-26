package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //Cau 1

        for (int i = 0; i < 4; i++ ) {
            for (int j = 0; j < 4; j++){
                System.out.print("* \t");
            }
            System.out.println();
        }

        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Cau 2");
        //Cau 2

        String n = "You only live once, but if you do it right, once is enough";
        System.out.println(n);
        String[] words = n.split(" ");
        System.out.println("Số từ trong chuỗi là: " +words.length);

        int count = 0;

        char kyTu = 'o';
        for (int i = 0; i < n.length(); i++){
            if(n.charAt(i) == kyTu){
                System.out.println("Vi tri ky tu o :" + i);


            }
        }


        System.out.println("Cau 3");

        //Cau 3
        Random ran = new Random();
        int a = ran.nextInt();
        System.out.println("So ngau nhien : " + a);

        if(isPrimeNumber(a)){
            System.out.printf("%d la so nguyen to" , a);
        } else {
            System.out.printf("%d khong phai so nguyen to", a);
        }
        System.out.println();
        System.out.println("Cau 4");
    //Cau 4

        int m = 10;
        System.out.printf(" 10 số nguyên tố đầu tiên là: \n", m);
        int count1 = 0;
        int i = 2;
        while (count1 < m) {
            if (isPrimeNumber(i)) {
                System.out.print(i+ "\t");
                count1++;
            }
            i++;
        }
        System.out.printf("\n Tất cả các số nguyên tố nhỏ hơn %d là: \n", m);
        if (m >= 2) {
            System.out.print(2);
        }
        for (int k = 3; k < m; k += 2) {
            if (isPrimeNumber(k)) {
                System.out.print(" " + k);
            }
        }
        System.out.println();
        System.out.println("Bai 5");
        //bai 5
        System.out.println("Ten cua ban la :" );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        name.trim();
        String [] arr = name.split(" ");
        String result = "";
        for(int l = 0; l < arr.length; l++){
            result += String.valueOf(arr[l].charAt(0)).toUpperCase() + arr[l].substring(1).toLowerCase() + " ";
        }
        System.out.println(result);

        String chuoi;
        char kyTu1;
        Scanner scr = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scr.nextLine();

        for (int p = 0; p < chuoi.length(); p++) {
            kyTu1 = chuoi.charAt(chuoi.length() - p - 1);


            if (chuoi.charAt(p) == kyTu1) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }


        }
        System.out.println();
        System.out.println("Bai 6 :");
        //Bai 6

        System.out.print("Nhập số hàng và cột của ma trận : ");
        int row = Integer.parseInt(sc.nextLine());
        int array[][] = new int[row][row];
        for(int u = 0 ; u < row ; u++){
            for(int j = 0 ; j < row ; j++){
                System.out.print("Nhập phần tử : ");
                array[u][j] = sc.nextInt();
            }
        }

        for(int u = 0 ; u < row ; u++){
            for(int j = 0 ; j < row ; j++){
                System.out.print(array[u][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Đường chéo chính : ");
        for(int u = 0 ; u < row ; u++) {
            for (int j = 0; j < row; j++) {
                if (u == j) {
                    System.out.print(array[u][j] + " ");
                }
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
