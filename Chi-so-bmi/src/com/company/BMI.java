package com.company;

public class BMI {
    public void chiso(double cannang, double chieucao) {
        /* Bài 2 - Ý 1 */
        System.out.println("Bài Tâp 2 - Ý 1:");
        System.out.println("Cân nặng: " + cannang + " (kg)");
        System.out.println("Chiều cao: " + chieucao + " (m)");
        System.out.println("Chỉ số BMI: " + (cannang / (chieucao * chieucao)));
        System.out.println("******");
    }

    /* Bài 2 - ý 2 */
    public double chiso1(){
        double cannang = 52;
        double chieucao = 1.70;
        double bmi = cannang/(chieucao * chieucao);
        return bmi;
    }
    /* Bài 3 - Ý 3 */
    public double chiso2(double cannang, double chieucao){
        return cannang/(chieucao * chieucao);
    }

}
