/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5;

/**
 *
 * @author iilha
 */
public class KategoriBadan {
    private double beratBadan; 
    private double tinggiBadan; 
    private double imt;

    public KategoriBadan(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public void hitungIMT() {
        if (tinggiBadan > 0) {
            this.imt = beratBadan / (tinggiBadan * tinggiBadan);
        } else {
            System.out.println("Tinggi badan tidak valid!");
        }
    }

    public void tampilkanKategori() {
        System.out.printf("Nilai IMT: %.2f\n", imt);
        if (imt < 18.5) {
            System.out.println("Kategori: Berat Badan Kurang");
        } else if (imt >= 18.5 && imt <= 24.9) {
            System.out.println("Kategori: Berat Badan Ideal");
        } else if (imt >= 25 && imt <= 29.9) {
            System.out.println("Kategori: Berat Badan Lebih");
        } else if (imt >= 30 && imt <= 39.9) {
            System.out.println("Kategori: Gemuk");
        } else if (imt >= 40) {
            System.out.println("Kategori: Sangat Gemuk");
        } else {
            System.out.println("Kategori tidak valid.");
        }
    }
}