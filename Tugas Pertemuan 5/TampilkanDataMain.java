/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan5;
import java.util.Scanner;
/**
 *
 * @author iilha
 */
public class TampilkanDataMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create Mahasiswa object
        DataNilaiUjian mahasiswa = new DataNilaiUjian();

        // Input data
        System.out.print("NPM: ");
        mahasiswa.masukkanNpm(input.nextLine());

        System.out.print("Nama Mahasiswa: ");
        mahasiswa.masukkanNama(input.nextLine());

        System.out.print("Nilai Kehadiran: ");
        mahasiswa.masukkanNilaiKehadiran(input.nextDouble());

        System.out.print("Nilai Tugas: ");
        mahasiswa.masukkanNilaiTugas(input.nextDouble());

        System.out.print("Nilai UTS: ");
        mahasiswa.masukkanNilaiUTS(input.nextDouble());

        System.out.print("Nilai UAS: ");
        mahasiswa.masukkanNilaiUAS(input.nextDouble());

        // Calculate final score
        mahasiswa.menghitungNilaiRataRata();

        // Output results (use getter methods here)
        System.out.println("\nTampilan Output:");
        System.out.println("NPM Mahasiswa: " + mahasiswa.tampilkanNpm());
        System.out.println("Nama Mahasiswa: " + mahasiswa.tampilkanNama());
        System.out.println("Nilai Rata-rata: " + mahasiswa.tampilkanNilaiRataRata());
        System.out.println("Grade: " + mahasiswa.tampilkanGrade());
        System.out.println("Keterangan: " + mahasiswa.tampilkanKeterangan());

        input.close();
    }
}