package com.company;

import java.util.Scanner;

public class Product {
    public String id;
    public String name;
    public String description;
    public int quantity;
    public double price;
    public String type;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham : ");
        id = sc.nextLine();
        System.out.println("Nhap ten san pham : ");
        name = sc.nextLine();
        System.out.println("Nhap mo ta : ");
        description = sc.nextLine();
        System.out.println("Nhap so luong : ");
        quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia ca : ");
        price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap loai san pham : ");
        type = sc.nextLine();

        System.out.println();

    }

    @Override
    public String toString() {
        return "Mã sản phẩm : " + id + "\n"
                + "Tên sản phẩm : " + name + "\n"
                + "Mô tả : " + description + "\n"
                + "Số lượng : " + quantity + "\n"
                + "Giá bán : " + price + "\n"
                + "Loại : " + type + "\n";
    }
}
