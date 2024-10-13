package TugasPertemuan6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iilha
 */
public class LaguAnakAyam {
    public static void nyanyikanAnakAyam(int n) {
        System.out.println("\nD. Lagu Anak Ayam Turun " + n);
        for (int i = n; i > 0; i--) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }
        System.out.println("Anak ayam turun 0, habis semua anak ayam!");
    }
}
