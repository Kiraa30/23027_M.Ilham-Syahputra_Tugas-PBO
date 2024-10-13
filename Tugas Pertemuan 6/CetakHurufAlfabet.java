/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan6;

/**
 *
 * @author iilha
 */
public class CetakHurufAlfabet {
    public static void cetakAlfabetTerbalik() {
        System.out.println("\nC. Huruf dari Z ke A:");
        for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
            System.out.print(huruf + " ");
        }
        System.out.println();
    }
}