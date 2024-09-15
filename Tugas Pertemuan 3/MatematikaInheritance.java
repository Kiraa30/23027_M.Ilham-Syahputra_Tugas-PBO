/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasMatematika;

/**
 *
 * @author iilha
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();

        int tambahResult = mtk.tambah(50, 25);
        int kurangResult = mtk.kurang(40, 20);
        int kaliResult = mtk.kali(30, 15);
        int bagiResult = mtk.bagi(20, 10);

        int modulusResult = mtk.modulus(10, 5);
        
        System.out.println("Hasil Tambah: " + tambahResult);
        System.out.println("Hasil Kurang: " + kurangResult);
        System.out.println("Hasil Kali: " + kaliResult);
        System.out.println("Hasil Bagi: " + bagiResult);
        System.out.println("Hasil Modulus: " + modulusResult);
    }
}