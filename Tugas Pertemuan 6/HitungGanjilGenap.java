/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan6;

/**
 *
 * @author iilha
 */
public class HitungGanjilGenap {
    public static void cetakGanjilDanGenap(int awal, int akhir) {
        System.out.println("\nB. Bilangan Ganjil dan Genap dari " + awal + " hingga " + akhir);
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
    }
}