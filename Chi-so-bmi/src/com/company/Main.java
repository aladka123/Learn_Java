package com.company;

public class Main {

    public static void main(String[] args) {
    BMI m = new BMI();
        m.chiso(52, 1.70);
        double y2 = m.chiso1();
        System.out.println("Bài Tập 2 - Ý 2");
        System.out.println("Chỉ số BMI: " + y2);
        System.out.println("******");
        double y3 = m.chiso2(70,1.82);
        System.out.println("Bài Tập 2 - Ý 3");
        System.out.println("Chỉ số BMI: " + y3);


    }
}
