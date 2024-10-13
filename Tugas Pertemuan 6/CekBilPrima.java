/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan6;

/**
 *
 * @author iilha
 */
public class CekBilPrima {
    public static boolean adalahPrima(int angka) {
        if (angka < 2) return false;
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) return false;
        }
        return true;
    }

    public static void cetakPrimaDanBukanPrima(int awal, int akhir) {
        System.out.println("A. Bilangan Prima dan Bukan Prima dari " + awal + " hingga " + akhir);
        for (int i = awal; i <= akhir; i++) {
            if (adalahPrima(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " adalah bukan bilangan prima");
            }
        }
    }
}