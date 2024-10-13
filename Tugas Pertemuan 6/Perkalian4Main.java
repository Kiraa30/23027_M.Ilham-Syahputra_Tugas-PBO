/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan6;
import java.util.Scanner;
/**
 *
 * @author iilha
 */
class Perkalian4 {
    int n;

    // Konstruktor untuk inisialisasi nilai n
    public Perkalian4(int n) {
        if (n <= 10) {
            this.n = n;
        } else {
            System.out.println("Nilai n harus kurang dari atau sama dengan 10.");
            this.n = 10;  // Batas maksimum 10
        }
    }

    // Metode untuk menampilkan tabel perkalian
    public void cetakTabel() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}

public class Perkalian4Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai n (maksimum 10): ");
        int n = scanner.nextInt();

        // Membuat objek dari kelas Perkalian4
        Perkalian4 tabel = new Perkalian4(n);

        // Memanggil metode untuk mencetak tabel
        tabel.cetakTabel();

        scanner.close();
    }
}
