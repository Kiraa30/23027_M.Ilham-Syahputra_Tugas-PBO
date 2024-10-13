/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan6;

/**
 *
 * @author iilha
 */
public class KelasUtamaPerulangan {
    public static void main(String[] args) {
        // a. Menghitung deret bilangan prima dan bukan prima dari 0-20
        CekBilPrima.cetakPrimaDanBukanPrima(0, 20);

        // b. Menghitung deret bilangan ganjil dan genap dari 0-20
        HitungGanjilGenap.cetakGanjilDanGenap(0, 20);

        // c. Menampilkan huruf Z - A
        CetakHurufAlfabet.cetakAlfabetTerbalik();

        // d. Menampilkan lagu "Anak Ayam Turun N"
        LaguAnakAyam.nyanyikanAnakAyam(5);
    }
}